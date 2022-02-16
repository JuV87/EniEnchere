package fr.eni.enchere.bo;

import java.util.List;

public class Utilisateur  {
	
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	private String rue;
	private int codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private String administrateur;
	
	// Association class
	private List<ArticleVendu>  listVendu, ListeAcheter;
	private List<Enchere> listEnchere;
	
	
	//constructeur
	public Utilisateur() {
		
	}
	public Utilisateur(int noUtilisateur, String pseudo, String nom,String prenom, String email, int telephone, String rue, int codePostal, String ville, String motDePasse,
						int credit, String administrateur) {
		this.setNoUtilisateur(noUtilisateur);
		this.setPseudo(pseudo);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setEmail(email);
		this.setTelephone(telephone);
		this.setRue(rue);
		this.setCodePostal(codePostal);
		this.setVille(ville);
		this.setMotDePasse(motDePasse);
		this.setCredit(credit);
		this.setAdministrateur(administrateur);
	}
	
	
	
	//getter-setter
	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(String administrateur) {
		this.administrateur = administrateur;
	}

	public List<ArticleVendu> getListVendu() {
		return listVendu;
	}
	public void setListVendu(List<ArticleVendu> listVendu) {
		this.listVendu = listVendu;
	}
	public List<ArticleVendu> getListeAcheter() {
		return ListeAcheter;
	}
	public void setListeAcheter(List<ArticleVendu> listeAcheter) {
		ListeAcheter = listeAcheter;
	}
	public List<Enchere> getListEnchere() {
		return listEnchere;
	}
	public void setListEnchere(List<Enchere> listEnchere) {
		this.listEnchere = listEnchere;
	}
	



	

	
}
