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
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.ArticleDAO;
import fr.eni.enchere.dao.CategorieDAO;
import fr.eni.enchere.dao.DALException;

public class CategorieDAOJdbcImpl implements CategorieDAO {
	

	private static final String sqlSelectAll = "SELECT * " +  
			" FROM CATEGORIES";

	
	public List<Categorie> selectAll() throws DALException, ParseException {
		Connection cnx = null;
		Statement rqt = null;
		ResultSet rs = null;

		
		List<Categorie> listeDeToutesLesCategories = new ArrayList<Categorie>();
		try {
			cnx = JdbcTools.getConnection();
			rqt = cnx.createStatement();
			rs = rqt.executeQuery(sqlSelectAll);
			Categorie cat = null;

			while (rs.next()) {
		

				cat = new Categorie (rs.getString("no_categorie"),
							rs.getString("libelle"));
					listeDeToutesLesCategories.add(cat);
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
		return listeDeToutesLesCategories;
	}


}
