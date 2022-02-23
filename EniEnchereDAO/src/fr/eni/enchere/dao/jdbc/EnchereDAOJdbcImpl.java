package fr.eni.enchere.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.EnchereDAO;

public class EnchereDAOJdbcImpl implements EnchereDAO {
	
private static final String sqlSelectBestEnchere = "SELECT TOP 1 *" +
			" FROM ENCHERES where no_article = ? ORDER BY montant_enchere DESC";


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
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

		
		cnx = JdbcTools.getConnection();
		//cnx.setAutoCommit(false);
		rqt = cnx.prepareStatement(sqlSelectBestEnchere, Statement.RETURN_GENERATED_KEYS);

		rqt.setInt(1, enchere.getUser().getNoUtilisateur());
		rqt.setInt(2, enchere.getArt().getNoArticle());
		rqt.setString(3, formatter.format(art.getDateDebutEnchere()));
		rqt.setInt(4, enchere.getMontantEnchere());
		int result = rqt.executeUpdate();
		
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
	

/**
 * 
 */

@Override
public Enchere selectBestEnchere(ArticleVendu art) throws DALException {
	// TODO Auto-generated method stub
	return null;
}

}
