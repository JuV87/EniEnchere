package fr.eni.enchere.bo;

import java.util.List;

public class Utilisateur  {
	
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private int administrateur;
	
	// Association class
	private List<ArticleVendu>  listVendu, ListeAcheter;
	private List<Enchere> listEnchere;
	
	
	//constructeur
	public Utilisateur() {
		
	}
	public Utilisateur(int noUtilisateur, String pseudo, String nom,String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse,
						int credit, int administrateur) {
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
	public Utilisateur( String pseudo, String nom,String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse,
			int credit, int administrateur) {
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal2) {
		this.codePostal = codePostal2;
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
	public int getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(int administrateur2) {
		this.administrateur = administrateur2;
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
	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + "]";
	}
	
	


	

	
}
