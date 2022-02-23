package fr.eni.enchere.bll;

import java.text.ParseException;
import java.util.List;

import fr.eni.enchere.bll.utils.EniConstantes;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.dao.ArticleDAO;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.DAOFactory;

public class ArticleManager {
	
	private  ArticleDAO articleDAO;
	
	public ArticleVendu selectById(int noArticle) throws BusinessException, ParseException {
		ArticleVendu art=null;
	
			try {
				art = DAOFactory.getInstance().getArticleDAO().selectBynoArticle(noArticle);
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return art;
	}

	public EniResponse ajouterArticle(ArticleVendu newArticle) {	
		boolean success = false;
		try {	
			success =DAOFactory.getInstance().getArticleDAO().insert(newArticle);
		} catch (DALException e) {
			e.printStackTrace();
		}
		EniResponse response = new EniResponse(EniConstantes.CODE_SUCCESS, "Ajout de l'article avec succès!");
		if (!success) {
			response.setResponse(EniConstantes.CODE_ERROR_TECH, "Impossible d'insérer l'article dans la BDD");

		}
		return response;
	}
	
	public void supprimerArticle(int noArticle) throws BusinessException{
		try {
			this.articleDAO.delete(noArticle);
		} catch (DALException e) {
			e.printStackTrace();
		}
	}
	
	public List<ArticleVendu> selectionnerTousLesArticles() throws BusinessException, Exception
	{
		return DAOFactory.getInstance().getArticleDAO().selectAll();
	}

}
