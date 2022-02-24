package fr.eni.enchere.bll;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import fr.eni.enchere.bll.utils.EniConstantes;
import fr.eni.enchere.bo.ArticleVendu;
import fr.eni.enchere.bo.Categorie;
import fr.eni.enchere.bo.Enchere;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.ArticleDAO;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.DAOFactory;

public class ArticleManager {
	
	private  ArticleDAO articleDAO;
	
	public ArticleVendu selectById(int noArticle) throws BusinessException, ParseException {
		ArticleVendu art=null;
	
			try {
				art = DAOFactory.getInstance().getArticleDAO().selectBynoArticle(noArticle);
				Utilisateur user = DAOFactory.getInstance().getUtilisateurDAO().selectBynoUtilisateur(art.getNoUtilisateur());
				art.setUser(user);
				art.setCategorieArticle(new Categorie(0, "catégorie qui nexiste pas"));
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
	
	public boolean encherir(ArticleVendu article, Utilisateur loggedUser, int prix) {
		int nbError=0;
		Enchere enchere=null;
	
		
		//DAO appel 1
		try {
		loggedUser =DAOFactory.getInstance().getUtilisateurDAO().selectBynoUtilisateur(loggedUser.getNoUtilisateur());
		} catch (DALException e) {
			e.printStackTrace();
		}
		if (prix<=loggedUser.getCredit()) {
		
		}else {
			nbError++;
		}

		//DAO appel 2

		try {
			enchere = DAOFactory.getInstance().getEnchereDAO().selectBestEnchere(article);

		} catch (DALException e) {
			e.printStackTrace();
		}
		if (enchere!=null && prix>enchere.getMontantEnchere()) {

		}
		else if(enchere==null){

		}
		else {
			nbError++;
		}
		
		
		if (nbError>0) {
			return false;
		}else {
			Enchere nouvelleEnchere = new Enchere (new Date(), prix);
			nouvelleEnchere.setUser(loggedUser);
			nouvelleEnchere.setArt(article);
			try {
				DAOFactory.getInstance().getEnchereDAO().insert(nouvelleEnchere);
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		}

		//DAO appel 3
		

	}
	
	public List<ArticleVendu> selectionnerTousLesArticles() throws BusinessException, Exception
	{
		return DAOFactory.getInstance().getArticleDAO().selectAll();
	}

}
