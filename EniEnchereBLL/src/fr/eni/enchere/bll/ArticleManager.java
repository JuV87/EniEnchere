package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bll.utils.EniConstantes;
import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.DAOFactory;

public class ArticleManager {
	
	
	
	
	public Utilisateur selectById(int noUtilisateur) throws BusinessException {
		Utilisateur user=null;
	
			try {
				user = DAOFactory.getInstance().getUtilisateurDAO().selectBynoUtilisateur(noUtilisateur);
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return user;
	}

	public EniResponse ajouterUtilisateur(Utilisateur newUtilisateur) {	
		boolean success = false;
		try {	
			success =DAOFactory.getInstance().getUtilisateurDAO().insert(newUtilisateur);
		} catch (DALException e) {
			e.printStackTrace();
		}
		EniResponse response = new EniResponse(EniConstantes.CODE_SUCCESS, "Inscription avec succès!");
		if (!success) {
			response.setResponse(EniConstantes.CODE_ERROR_TECH, "Impossible d'insérer l'utilisateur dans la BDD");

		}
		return response;
	}
	
	public void supprimerUtilisateur(int noUtilisateur) throws BusinessException{
		try {
			this.utilisateurDAO.delete(noUtilisateur);
		} catch (DALException e) {
			e.printStackTrace();
		}
	}
	
	public List<Utilisateur> selectionnerTousLesUtilisateurs() throws BusinessException, Exception
	{
		return this.utilisateurDAO.selectAll();
	}

}
