package fr.eni.enchere.bo;

import java.util.Date;

public class ArticleVendu {

	private int noArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEnchere;
	private Date dateFinEnchere;
	private String miseAPrix;
	private int noUtilisateur;
	private int noCategorie;
	private int prixVente;
	
	public  enum  EtatVente {
		En_Cours,
		Vendu	
	}
	private EtatVente etatVente;
	private Utilisateur user;
	private Categorie categorieArticle;
	private Retrait lieuRetrait;
	
	public ArticleVendu() {
		
	}
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEnchere, Date dateFinEnchere, String miseAPrix, int prixVente, EtatVente etatVente) {
		this.setNoArticle(noArticle);
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEnchere(dateDebutEnchere);
		this.setDateFinEnchere(dateFinEnchere);
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
		this.setEtatVente(etatVente);
		
	}
	
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEnchere, Date dateFinEnchere, String miseAPrix, int prixVente, int noUtilisateur,int noCategorie) {
		this.setNoArticle(noArticle);
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEnchere(dateDebutEnchere);
		this.setDateFinEnchere(dateFinEnchere);
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
		this.setNoUtilisateur(noUtilisateur);
		this.setNoCategorie(noCategorie);
	}
	
	public ArticleVendu(String nomArticle, String description, Date dateDebutEnchere, Date dateFinEnchere, String miseAPrix, int prixVente) {
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEnchere(dateDebutEnchere);
		this.setDateFinEnchere(dateFinEnchere);
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
	}
	
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEnchere, Date dateFinEnchere, String miseAPrix, int prixVente) {
		this.setNoArticle(noArticle);
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEnchere(dateDebutEnchere);
		this.setDateFinEnchere(dateFinEnchere);
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
	}
	
	
	
// getter-setter
	public int getNoArticle() {
		return noArticle;
	}
	
	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebutEnchere() {
		return dateDebutEnchere;
	}

	public void setDateDebutEnchere(Date dateDebutEnchere2) {
		this.dateDebutEnchere = dateDebutEnchere2;
	}

	public Date getDateFinEnchere() {
		return dateFinEnchere;
	}

	public void setDateFinEnchere(Date dateFinEnchere) {
		this.dateFinEnchere = dateFinEnchere;
	}

	public String getMiseAPrix() {
		return miseAPrix;
	}

	public void setMiseAPrix(String miseAPrix2) {
		this.miseAPrix = miseAPrix2;
	}

	public int getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}

	public Categorie getCategorieArticle() {
		return categorieArticle;
	}

	public void setCategorieArticle(Categorie categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}

	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur vente) {
		this.user = vente;
	}
	public EtatVente getEtatVente() {
		return etatVente;
	}
	public void setEtatVente(EtatVente etatVente) {
		this.etatVente = etatVente;
	}
	
	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	public int getNoCategorie() {
		return noCategorie;
	}
	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
	
	
	
}
