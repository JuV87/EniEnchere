package fr.eni.enchere.dao;

import java.text.ParseException;
import java.util.List;

import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;

public interface CategorieDAO {




	//Sélectionner tous les articles mis en vente
	public List<Categorie> selectAll() throws DALException, ParseException;


}



