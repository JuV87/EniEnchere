package fr.eni.enchere.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.ArticleVendu.EtatVente;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.ArticleDAO;
import fr.eni.enchere.dao.DALException;

public class ArticleDAOJdbcImpl implements ArticleDAO {
	
	private static final String sqlSelectById = "SELECT no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente " +
			" FROM articles_vendus where no_article = ?";
	private static final String sqlSelectAll = "SELECT no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente " +  
			" FROM articles_vendus";
	private static final String sqlUpdate = "UPDATE articles_vendus SET nom_article=?,description=?,date_debut_encheres=?,date_fin_encheres=?,prix_initial=?,prix_vente=?, where no_article=?";
	private static final String sqlInsert = "INSERT INTO articles_vendus(pseudo,nom,prenom,email,telephone,rue,code_postal,ville, mot_de_passe, credit, administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String sqlDelete = "DELETE FROM articles_vendus WHERE no_article=?";
	
	@Override
	public List<ArticleVendu> selectAll() throws DALException, ParseException {
		Connection cnx = null;
		Statement rqt = null;
		ResultSet rs = null;
		Date dateDebut=null;
		Date dateFin=null;
		
		List<ArticleVendu> listeDeTousLesArticles = new ArrayList<ArticleVendu>();
		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.createStatement();
			rs = rqt.executeQuery(sqlSelectAll);
			ArticleVendu art = null;

			while (rs.next()) {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

				String dateFinSTR = rs.getString("date_fin_encheres");
				String dateDebutSTR = rs.getString("date_debut_encheres");
				
				Date dateF = formatter.parse(dateFinSTR);
				Date dateD =formatter.parse(dateDebutSTR);
			

					art = new ArticleVendu (rs.getInt("no_article"),
							rs.getString("nom_article"),
							rs.getString("description"),
							dateD,
							dateF,
							rs.getString("prix_initial"),
							rs.getInt("prix_vente"));
							
					listeDeTousLesArticles.add(art);
			}
		} catch (SQLException e) {
			throw new DALException("selectAll failed - " , e);
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listeDeTousLesArticles;
	}



	@Override
	public ArticleVendu selectBynoArticle(int id) throws DALException, ParseException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		ArticleVendu art = null;
		Date dateDebut=null;
		Date dateFin=null;
		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlSelectById);
			rqt.setInt(1, id);

			rs = rqt.executeQuery();
			if (rs.next()){
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

				String dateFinSTR = rs.getString("date_fin_encheres");
				String dateDebutSTR = rs.getString("date_debut_encheres");

				Date dateF = formatter.parse(dateFinSTR);
				Date dateD =formatter.parse(dateDebutSTR);

				art = new ArticleVendu (rs.getInt("no_article"),
						rs.getString("nom_article"),
						rs.getString("description"),
						dateD,
						dateF,
						rs.getString("prix_initial"),
						rs.getInt("prix_vente"));

			}

		} catch (SQLException e) {
			throw new DALException("selectById failed - id = " + id , e);
		} finally {
			try {
				if (rs != null){
					rs.close();
				}
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return art;
	}

	@Override
	public void update(ArticleVendu art) throws DALException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
	
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlUpdate);
			rqt.setInt(1, art.getNoArticle());
			rqt.setString(2, art.getNomArticle());
			rqt.setString(3, art.getDescription());
			rqt.setString(4, formatter.format(art.getDateDebutEnchere()));
			rqt.setString(5, formatter.format(art.getDateFinEnchere()));
			rqt.setString(6, art.getMiseAPrix());
			rqt.setInt(7, art.getPrixVente());
		
			rqt.executeUpdate();

		} catch (SQLException e) {
			throw new DALException("Update article failed - " + art, e);
		} finally {
			try {
				if (rqt != null){
					rqt.close();
				}
				if(cnx !=null){
					cnx.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean insert(ArticleVendu art) throws DALException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		boolean success =false;
		ResultSet rs = null;
		String dateDebut=null;
		String dateFin=null;
		try {
			
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

			
			cnx = JdbcTools.getConnection();
			//cnx.setAutoCommit(false);
			rqt = cnx.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);

			rqt.setInt(1, art.getNoArticle());
			rqt.setString(2, art.getNomArticle());
			rqt.setString(3, art.getDescription());
			rqt.setString(4, formatter.format(art.getDateDebutEnchere()));
			rqt.setString(5, formatter.format(art.getDateFinEnchere()));
			rqt.setString(6, art.getMiseAPrix());
			rqt.setInt(7, art.getPrixVente());

			int result = rqt.executeUpdate();
			if(result == 1){
				ResultSet resultset = rqt.getGeneratedKeys();
				if(resultset.next()){
					art.setNoArticle(resultset.getInt(1));

				}
				success=true;
			}


		}catch(SQLException e){
			throw new DALException("Insert article failed", e);
		}finally {
			try {
				if (rs != null){
					rs.close();
				}

				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
				}catch (SQLException e) {
					e.printStackTrace();
				} 

			}
		return success;

		}

	@Override
	public void delete(int id) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		try {		
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlDelete);
			rqt.setInt(1, id);
			rqt.executeUpdate();
		} catch (SQLException e) {
			throw new DALException("Delete article failed - id=" + id, e);
		} finally {
			try {
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				throw new DALException("close failed " , e);
			}

		}
	}
	
	public boolean findArticle(String i) throws DALException {  

		boolean status=false;  
		try{  

			Connection con=JdbcTools.getConnection();     
			PreparedStatement ps=con.prepareStatement(  
					"select * from articles_vendus where nom_article=?");  

			ps.setString(1,i);  
			ResultSet rs=ps.executeQuery();  
			if (rs.next()) {
				status = true;
			}

		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  

}
