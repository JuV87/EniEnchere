package fr.eni.enchere.dao;

import java.util.List;

import fr.eni.enchere.bo.Utilisateur;

public interface UtilisateurDAO {

	//S�lectionner un Utilisateur par son noUtilisateur
	public Utilisateur selectBynoUtilisateur(int noUtilisateur) throws DALException;

	//S�lectionner tous les utilisateurs
	public List<Utilisateur> selectAll() throws DALException;

	//Modifier les attributs d'un utilisateur connu en BD
	public void update(Utilisateur user) throws DALException;

	//Ins�rer un nouvel utilisateur dans la BDD
	public void insert(Utilisateur user) throws DALException;

	//Supprimer un utilisateur
	public void delete(int id) throws DALException;
	
	// Trouver un utilisateur dans la base de donn�es
	public boolean findUser(String i, String j) throws DALException;

}



