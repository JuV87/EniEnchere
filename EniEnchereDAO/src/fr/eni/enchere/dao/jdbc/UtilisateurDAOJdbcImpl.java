/**
 * 
 */
package fr.eni.enchere.dao.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.UtilisateurDAO;


/**
 * @author Eni Ecole
 * 
 */


public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String sqlSelectById = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur " +
			" FROM utilisateurs where no_utilisateur = ?";
	private static final String sqlSelectAll = "SELECT no_utilisateur, pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur " +  
			" FROM utilisateurs";
	private static final String sqlUpdate = "UPDATE utilisateurs SET pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,code_postal=?, ville=?, mot_de_passe=?, credit=?, administrateur=? where no_utilisateur=?";
	private static final String sqlInsert = "INSERT INTO utilisateurs(pseudo,nom,prenom,email,telephone,rue,code_postal,ville, mot_de_passe, credit, administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String sqlDelete = "DELETE FROM utilisateurs WHERE no_utilisateur=?";
	private static final String sqlSelectByLogin = "SELECT no_utilisateur, pseudo, nom, prenom, email " + "FROM UTILISATEURS where email = ? AND mot_de_passe = ?";
	private static final String sqlSelectByEmail = "SELECT no_utilisateur, pseudo, nom, prenom, email " + "FROM UTILISATEURS where email = ?";

	

	@Override
	public List<Utilisateur> selectAll() throws DALException {
		Connection cnx = null;
		Statement rqt = null;
		ResultSet rs = null;
		List<Utilisateur> listeDeTousLesUtilisateurs = new ArrayList<Utilisateur>();
		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.createStatement();
			rs = rqt.executeQuery(sqlSelectAll);
			Utilisateur user = null;

			while (rs.next()) {
			

					user = new Utilisateur(rs.getInt("no_utilisateur"),
							rs.getString("pseudo"),
							rs.getString("nom"),
							rs.getString("prenom"),
							rs.getString("email"),
							rs.getString("telephone"),
							rs.getString("rue"),
							rs.getString("code_postal"),
							rs.getString("ville"),
							rs.getString("mot_de_passe"),
							rs.getInt("credit"),
							rs.getInt("administrateur"));
					
				
		listeDeTousLesUtilisateurs.add(user);
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
		return listeDeTousLesUtilisateurs;
	}
	
	/**
	 * 
	 */


	@Override
	public Utilisateur selectBynoUtilisateur(int id) throws DALException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur user = null;
		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlSelectById);
			rqt.setInt(1, id);

			rs = rqt.executeQuery();
			if (rs.next()){

				user = new Utilisateur(rs.getInt("no_utilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getString("telephone"),
						rs.getString("rue"),
						rs.getString("code_postal"),
						rs.getString("ville"),
						rs.getString("mot_de_passe"),
						rs.getInt("credit"),
						rs.getInt("administrateur"));

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
		return user;
	}
	
	/**
	 * 
	 */

	@Override
	public void update(Utilisateur user) throws DALException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlUpdate);
			
			rqt.setString(1, user.getPseudo());
			rqt.setString(2, user.getNom());
			rqt.setString(3, user.getPrenom());
			rqt.setString(4, user.getEmail());
			rqt.setString(5, user.getTelephone());
			rqt.setString(6, user.getRue());
			rqt.setString(7, user.getCodePostal());
			rqt.setString(8, user.getVille());
			rqt.setString(9, user.getMotDePasse());
			rqt.setInt(10, user.getCredit());
			rqt.setInt(11, user.getAdministrateur());
			rqt.setInt(12, user.getNoUtilisateur());

			rqt.executeUpdate();

		} catch (SQLException e) {
			throw new DALException("Update article failed - " + user, e);
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
	
	/**
	 * 
	 */

	@Override
	public boolean insert(Utilisateur user) throws DALException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		boolean success =false;
		ResultSet rs = null;
		try {
			
			cnx = JdbcTools.getConnection();
			//cnx.setAutoCommit(false);
			rqt = cnx.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);

			rqt.setString(1, user.getPseudo());
			rqt.setString(2, user.getNom());
			rqt.setString(3, user.getPrenom());
			rqt.setString(4, user.getEmail());
			rqt.setString(5, user.getTelephone());
			rqt.setString(6, user.getRue());
			rqt.setString(7, user.getCodePostal());
			rqt.setString(8, user.getVille());
			rqt.setString(9, user.getMotDePasse());
			rqt.setInt(10, user.getCredit());
			rqt.setInt(11, user.getAdministrateur());

			int result = rqt.executeUpdate();
			if(result == 1){
				ResultSet resultset = rqt.getGeneratedKeys();
				if(resultset.next()){
					user.setNoUtilisateur(resultset.getInt(1));
				}
				success=true;
			}
			
		}catch(SQLException e){
			throw new DALException("Insert utilisateur failed", e);
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
	
	/**
	 * 
	 */
	
	public boolean findUser(String i, String j) throws DALException {  

		boolean status=false;  
		try{  

			Connection con=JdbcTools.getConnection();     
			PreparedStatement ps=con.prepareStatement(  
					"select * from utilisateurs where pseudo=? and mot_de_passe=?");  

			ps.setString(1,i);  
			ps.setString(2,j);  

			ResultSet rs=ps.executeQuery();  
			if (rs.next()) {
				status = true;
			}

		}catch(Exception e){System.out.println(e);}  
		return status;  
	}  
	
	/**
	 * 
	 */

	@Override
	public boolean loginUser(String username, String password) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur user = null;
		boolean success = false;

		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlSelectByLogin);
			rqt.setString(1, username);
			rqt.setString(2, password);

			rs = rqt.executeQuery();

			if (rs.next()){
				success = true;
			}

		} catch (SQLException e) {
			throw new DALException("selectById failed - id" , e);
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
		return success;
	}
	
	/**
	 * 
	 */

	@Override
	public Utilisateur selectBynoemail(String email) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		ResultSet rs = null;
		Utilisateur user = null;
		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.prepareStatement(sqlSelectByEmail);
			rqt.setString(1, email);

			rs = rqt.executeQuery();
			if (rs.next()){

				user = new Utilisateur(rs.getInt("no_utilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"));
			}

		} catch (SQLException e) {
			throw new DALException("selectByEmail failed - email = " + email , e);
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
		return user;
	}

}











