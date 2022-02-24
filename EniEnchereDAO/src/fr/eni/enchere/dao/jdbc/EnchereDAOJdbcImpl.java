package fr.eni.enchere.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.EnchereDAO;
import fr.eni.enchere.dao.utils.EniDAOMapping;

public class EnchereDAOJdbcImpl implements EnchereDAO {

	private static final String sqlSelectBestEnchere = "SELECT TOP 1 *" +
			" FROM ENCHERES " 
			+"INNER JOIN ARTICLES_VENDUS ON (ENCHERES.no_article = ARTICLES_VENDUS.no_article) INNER JOIN UTILISATEURS ON"
		    +" (ENCHERES.no_utilisateur = UTILISATEURS.no_utilisateur) where no_article = ? ORDER BY montant_enchere DESC";
	
	private static final String sqlInsert = "INSERT INTO ENCHERES(no_utilisateur,no_article,date_enchere,montant_enchere,) VALUES (?,?,?,?";

	/**
	 * 
	 */
	
	@Override
	public boolean insert(Enchere enchere) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		boolean success =false;
		ResultSet rs = null;
		try {
			
			//convertir date enchere (format Date SQL) en string pour le mettre dans le valueof et le transformer
			//en datetime
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

			cnx = JdbcTools.getConnection();
			//cnx.setAutoCommit(false);
			rqt = cnx.prepareStatement(sqlSelectBestEnchere);
			rqt.setInt(1, enchere.getUser().getNoUtilisateur());
			rqt.setInt(2, enchere.getArt().getNoArticle());
			rqt.setDate(3, java.sql.Date.valueOf(formatter.format(enchere.getMontantEnchere())));
			rqt.setInt(4, enchere.getMontantEnchere());
			int result = rqt.executeUpdate();
			
		}catch(SQLException e){
			throw new DALException("Insert enchere failed", e);
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

/**
 * 
 */

	@Override
	public Enchere selectBestEnchere(ArticleVendu art) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Enchere enchere=null;

		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlSelectBestEnchere);
			rs = rqt.executeQuery();
			if (rs.next()){
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

				art = EniDAOMapping.mappingArticle(rs);
				Utilisateur user = EniDAOMapping.mappingUser(rs);
				enchere = EniDAOMapping.mappingEnchere(rs);

				//Associations
				enchere.setArt(art);
				enchere.setUser(user);
			}

		} catch (SQLException e) {
			throw new DALException("selectById failed - id = ", e);
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
		return enchere;
	}
}
