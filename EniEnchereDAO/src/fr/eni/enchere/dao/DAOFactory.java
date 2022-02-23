package fr.eni.enchere.dao;


import fr.eni.enchere.dao.jdbc.ArticleDAOJdbcImpl;
import fr.eni.enchere.dao.jdbc.EnchereDAOJdbcImpl;
import fr.eni.enchere.dao.jdbc.UtilisateurDAOJdbcImpl;

public class DAOFactory {

	private static DAOFactory instance;
	private UtilisateurDAO utilisateurDAO;
	private ArticleDAO articleDAO;
	private EnchereDAO enchereDAO;

	public UtilisateurDAO getUtilisateurDAO() {
		if (utilisateurDAO == null) {
			utilisateurDAO = new UtilisateurDAOJdbcImpl();
		}
		return utilisateurDAO;
	}
	
	public EnchereDAO getEnchereDAO() {
		if (enchereDAO == null) {
			enchereDAO = new EnchereDAOJdbcImpl();
		}
		return enchereDAO;
	}
	
	public ArticleDAO getArticleDAO() {
		if (articleDAO == null) {
			articleDAO = new ArticleDAOJdbcImpl();
		}
		return articleDAO;
	}
	
	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = new DAOFactory();
		}
		
		return instance;
	}
}





