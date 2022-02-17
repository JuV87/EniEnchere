package fr.eni.enchere.dao;

import java.util.ArrayList;
import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public class AppliTestDAO {

	public static void main(String[] args) throws DALException {
		// TODO Auto-generated method stub
		UtilisateurDAO userDAO = DAOFactory.getUtilisateurDAO();

		
		Utilisateur utilisateur = new Utilisateur("bob", "Vérité", "Julie", "veriteju@gmail.com", "0546092358", "3 rue de la plage", "17137", "La Rochelle", "gjregj", 150, 1);
		Utilisateur user1= new Utilisateur("bob", "eghjjtt", "Bernard", "bernard@gmail.com", "0586898968", "5 rue de la plage", "17140", "L'Houmeau", "gjregj", 150, 0);
		Utilisateur user2= new Utilisateur("pouet", "Dupont", "Juliette", "verite@gmail.com", "0546092358", "6 rue de la plage", "17015", "Nantes", "zezggzg", 5, 0);
		Utilisateur user3 =new Utilisateur("souris", "Durand", "Laura", "ju@gmail.com", "0546092359", "7 rue de la plage", "17000", "Paris", "yrtjtyz1", 300, 0);
		Utilisateur user4= new Utilisateur("marc17", "Petit", "Louis", "veritju@gmail.com", "0546092347", "8 rue de la plage", "17140", "Tours", "zgagrh^peh^2", 1500, 0);

		
		System.out.println("Ajout des users... ");
		//TODO...
		try {
			
			userDAO.insert(utilisateur); 
			System.out.println("Utilisateur ajouté  : " + utilisateur.toString() );
			userDAO.insert(user1);
			System.out.println("Utilisateur ajouté  : " + user1.toString() );
			userDAO.insert(user2);
			System.out.println("Utilisateur ajouté  : " + user2.toString() );
			userDAO.insert(user3);
			System.out.println("Utilisateur ajouté  : " + user3.toString() );


			//Sélection de l'article par id
			//TODO...
			Utilisateur u = userDAO.selectBynoUtilisateur(user4.getNoUtilisateur());
			userDAO.delete(0);
			System.out.println(0);
			

	
		} catch (DALException e) {
			e.printStackTrace();
		}

	}

}
