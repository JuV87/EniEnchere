package fr.eni.enchere.bll;

import java.text.ParseException;
import java.util.List;

import fr.eni.enchere.bll.utils.EniConstantes;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.dao.ArticleDAO;
import fr.eni.enchere.dao.CategorieDAO;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.DAOFactory;

public class CategorieManager {
	
	private  CategorieDAO categorieDAO;

/*
	public Categorie selectById(int noCategorie) throws BusinessException, ParseException {
		Categorie cat=null;
	
			try {
				cat = DAOFactory.getInstance().getCategorieDAO().selectBynoCategorie(noCategorie);
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return cat;
	}

	public EniResponse ajouterArticle(ArticleVendu newArticle) {	
		boolean success = false;
		try {	
			success =DAOFactory.getInstance().getCategorieDAO().insert(newCategorie);
		} catch (DALException e) {
			e.printStackTrace();
		}
		EniResponse response = new EniResponse(EniConstantes.CODE_SUCCESS, "Ajout de l'article avec succès!");
		if (!success) {
			response.setResponse(EniConstantes.CODE_ERROR_TECH, "Impossible d'insérer l'article dans la BDD");

		}
		return response;
	}
	
	public void supprimerCategorie(int noCategorie) throws BusinessException{
		try {
			this.categorieDAO.delete(noCategorie);
		} catch (DALException e) {
			e.printStackTrace();
		}
	}
*/	
	public List<Categorie> selectionnerToutesLesCategories() throws BusinessException, Exception
	{
		return DAOFactory.getInstance().getCategorieDAO().selectAll();
	}

}
