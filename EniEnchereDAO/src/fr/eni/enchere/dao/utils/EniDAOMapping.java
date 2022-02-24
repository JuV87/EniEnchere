package fr.eni.enchere.dao.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.bo.Utilisateur;

public class EniDAOMapping {
	
	/*
	 * 
	 */
	
	public static Utilisateur mappingUser (ResultSet rs) {
		Utilisateur user =null;
		try {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	/*
	 * 
	 */
	
	public static ArticleVendu mappingArticle (ResultSet rs) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		ArticleVendu art=null;
		Date dateDebut=null;
		Date dateFin=null;

		try {
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
		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return art;
	}
	
	/*
	 * 
	 */

	public static Enchere mappingEnchere(ResultSet rs) {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Enchere enchere =null;
		try {
			String dateEnchere = rs.getString("date_enchere");
			Date dateD = formatter.parse(dateEnchere);
			enchere = new Enchere (dateD,
					rs.getInt("montant_enchere"));
		} catch (SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enchere;
	}
}
