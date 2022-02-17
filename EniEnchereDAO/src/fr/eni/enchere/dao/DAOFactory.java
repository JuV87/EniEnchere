package fr.eni.enchere.dao;

import fr.eni.enchere.dao.jdbc.UtilisateurDAOJdbcImpl;

public abstract class DAOFactory {



	public static UtilisateurDAO getUtilisateurDAO()  
	{
		return new UtilisateurDAOJdbcImpl(); 
	}
}

