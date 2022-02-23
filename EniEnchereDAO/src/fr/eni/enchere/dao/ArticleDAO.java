package fr.eni.enchere.dao;

import java.text.ParseException;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;

public interface ArticleDAO {



	public ArticleVendu selectBynoArticle(int noArticle)throws DALException, ParseException;

	//Sélectionner tous les articles mis en vente
	public List<ArticleVendu> selectAll() throws DALException, ParseException;

	//Modifier les attributs d'un article connu en BD
	public void update(ArticleVendu art) throws DALException;

	//Insérer un nouvel article dans la BDD
	public boolean insert(ArticleVendu art) throws DALException;

	//Supprimer un article
	public void delete(int id) throws DALException;

}



