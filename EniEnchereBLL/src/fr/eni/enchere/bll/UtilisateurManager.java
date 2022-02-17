package fr.eni.enchere.bll;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;
import fr.eni.enchere.dao.DALException;
import fr.eni.enchere.dao.DAOFactory;
import fr.eni.enchere.dao.UtilisateurDAO;

public class UtilisateurManager {


	private  UtilisateurDAO utilisateurDAO;

	public UtilisateurManager() {
		this.utilisateurDAO=DAOFactory.getUtilisateurDAO();
	}

	public List<Utilisateur> selectionnerTousLesUtilisateurs() throws BusinessException, Exception
	{
		return this.utilisateurDAO.selectAll();
	}

	public Utilisateur selectById(int noUtilisateur) throws BusinessException {
		Utilisateur user=null;
		try {
			user = utilisateurDAO.selectBynoUtilisateur(noUtilisateur);
		} catch (DALException e) {
			// TODO Auto-generated catch 
			e.printStackTrace();
		}
		return user;
	}

	public void ajouterUtilisateur(Utilisateur newUtilisateur) {	
		try {	
			DAOFactory.getUtilisateurDAO().insert(newUtilisateur);
		} catch (DALException e) {

		}
	}


		

		public void supprimerUtilisateur(int noUtilisateur) throws BusinessException{
			try {
				this.utilisateurDAO.delete(noUtilisateur);
			} catch (DALException e) {
				e.printStackTrace();
			}
		}
	
	
			
	}


