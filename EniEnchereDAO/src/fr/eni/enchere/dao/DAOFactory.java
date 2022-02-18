package fr.eni.enchere.dao;


import fr.eni.enchere.dao.jdbc.UtilisateurDAOJdbcImpl;

public class DAOFactory {

	private static DAOFactory instance;
	private UtilisateurDAO utilisateurDAO;

	public UtilisateurDAO getUtilisateurDAO() {
		if (utilisateurDAO == null) {
			utilisateurDAO = new UtilisateurDAOJdbcImpl();
		}
		return utilisateurDAO;
	}
	
	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = new DAOFactory();
		}
		
		return instance;
	}
}





