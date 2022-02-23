package fr.eni.enchere.dao;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Enchere;

public interface EnchereDAO {


	public boolean insert(Enchere enchere) throws DALException;

	public Enchere selectBestEnchere(ArticleVendu art) throws DALException;


}
