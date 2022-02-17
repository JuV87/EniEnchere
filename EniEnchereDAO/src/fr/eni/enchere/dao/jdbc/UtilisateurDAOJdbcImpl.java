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
import fr.eni.enchere.dao.ConnectionProvider;

/**
 * @author Eni Ecole
 * 
 */


public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String sqlSelectById = "select noUtilisateur, pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit, administrateur " +
			" from utilisateurs where noUtilisateur = ?";
	private static final String sqlSelectAll = "select noUtilisateur, pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit, administrateur " +  
			" from utilisateurs";
	private static final String sqlUpdate = "update utilisateurs set pseudo=?,nom=?,prenom=?,email=?,telephone=?,rue=?,codePostal=?, ville=?, motDePasse=?, credit=?, cadministrateur=? where noUtilisateur=?";
	private static final String sqlInsert = "insert into utilisateurs(pseudo,nom,prenom,email,telephone,rue,codePostal,ville, motDePasse, credit, administrateur) values(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String sqlDelete = "delete from utilisateurs where noUtilisateur=?";

	

	@Override
	public List<Utilisateur> selectAll() throws DALException {
		Connection cnx = null;
		Statement rqt = null;
		ResultSet rs = null;
		List<Utilisateur> listeDeTousLesUtilisateurs = new ArrayList<Utilisateur>();
		try {
			cnx = ConnectionProvider.getConnection();
			rqt = cnx.createStatement();
			rs = rqt.executeQuery(sqlSelectAll);
			Utilisateur user = null;

			while (rs.next()) {
			

					user = new Utilisateur(rs.getInt("noUtilisateur"),
							rs.getString("pseudo"),
							rs.getString("nom"),
							rs.getString("prenom"),
							rs.getString("email"),
							rs.getString("telephone"),
							rs.getString("rue"),
							rs.getInt("codePostal"),
							rs.getString("ville"),
							rs.getString("motDePasse"),
							rs.getInt("credit"),
							rs.getString("administrateur"));
					
				
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

				user = new Utilisateur(rs.getInt("noUtilisateur"),
						rs.getString("pseudo"),
						rs.getString("nom"),
						rs.getString("prenom"),
						rs.getString("email"),
						rs.getString("telephone"),
						rs.getString("rue"),
						rs.getInt("codePostal"),
						rs.getString("ville"),
						rs.getString("motDePasse"),
						rs.getInt("credit"),
						rs.getString("administrateur"));

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

	@Override
	public void update(Utilisateur user) throws DALException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		try {
			cnx = ConnectionProvider.getConnection();
			rqt = cnx.prepareStatement(sqlUpdate);
			rqt.setInt(1, user.getNoUtilisateur());
			rqt.setString(2, user.getPseudo());
			rqt.setString(3, user.getNom());
			rqt.setString(4, user.getPrenom());
			rqt.setString(5, user.getEmail());
			rqt.setString(6, user.getTelephone());
			rqt.setString(7, user.getRue());
			rqt.setInt(8, user.getCodePostal());
			rqt.setString(9, user.getVille());
			rqt.setString(10, user.getMotDePasse());
			rqt.setInt(11, user.getCredit());
			rqt.setString(12, user.getAdministrateur());

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

	@Override
	public void insert(Utilisateur user) throws DALException {

		Connection cnx = null;
		PreparedStatement rqt = null;
		try {
			cnx = ConnectionProvider.getConnection();
			rqt = cnx.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);

			rqt.setString(1, user.getPseudo());
			rqt.setString(2, user.getNom());
			rqt.setString(3, user.getPrenom());
			rqt.setString(4, user.getEmail());
			rqt.setString(5, user.getTelephone());
			rqt.setString(6, user.getRue());
			rqt.setInt(7, user.getCodePostal());
			rqt.setString(8, user.getVille());
			rqt.setString(9, user.getMotDePasse());
			rqt.setInt(10, user.getCredit());
			rqt.setString(11, user.getAdministrateur());

			int nbRows = rqt.executeUpdate();
			if(nbRows == 1){
				ResultSet rs = rqt.getGeneratedKeys();
				if(rs.next()){
					user.setNoUtilisateur(rs.getInt(1));
				}

			}

		}catch(SQLException e){
			throw new DALException("Insert article failed - " + user, e);
		}
		finally {
			try {
				if (rqt != null){
					rqt.close();
				}
				if(cnx!=null){
					cnx.close();
				}
			} catch (SQLException e) {
				throw new DALException("close failed - ", e);
			}

		}
	}

	@Override
	public void delete(int id) throws DALException {
		Connection cnx = null;
		PreparedStatement rqt = null;
		try {		
			cnx = ConnectionProvider.getConnection();
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

}









