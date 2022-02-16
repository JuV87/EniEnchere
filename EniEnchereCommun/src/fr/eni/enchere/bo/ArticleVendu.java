package fr.eni.enchere.bo;

public class ArticleVendu {

	private int noArticle;
	private String nomArticle;
	private String description;
	private int dateDebutEnchere;
	private int dateFinEnchere;
	private int miseAPrix;
	private int prixVente;
	
	public  enum  EtatVente {
		En_Cours,
		Vendu	
	}
	private EtatVente etatVente;
	private Utilisateur vente;
	private Categorie categorieArticle;
	private Retrait lieuRetrait;
	
	public ArticleVendu() {
		
	}
	public ArticleVendu(int noArticle, String nomArticle, String description, int dateDebutEnchere, int dateFinEnchere, int miseAPrix, int prixVente, EtatVente etatVente) {
		this.setNoArticle(noArticle);
		this.setNomArticle(nomArticle);
		this.setDescription(description);
		this.setDateDebutEnchere(dateDebutEnchere);
		this.setDateFinEnchere(dateFinEnchere);
		this.setMiseAPrix(miseAPrix);
		this.setPrixVente(prixVente);
		this.setEtatVente(etatVente);
		
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

	public int getDateDebutEnchere() {
		return dateDebutEnchere;
	}

	public void setDateDebutEnchere(int dateDebutEnchere) {
		this.dateDebutEnchere = dateDebutEnchere;
	}

	public int getDateFinEnchere() {
		return dateFinEnchere;
	}

	public void setDateFinEnchere(int dateFinEnchere) {
		this.dateFinEnchere = dateFinEnchere;
	}

	public int getMiseAPrix() {
		return miseAPrix;
	}

	public void setMiseAPrix(int miseAPrix) {
		this.miseAPrix = miseAPrix;
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
	public Utilisateur getVente() {
		return vente;
	}
	public void setVente(Utilisateur vente) {
		this.vente = vente;
	}
	public EtatVente getEtatVente() {
		return etatVente;
	}
	public void setEtatVente(EtatVente etatVente) {
		this.etatVente = etatVente;
	}
	
	
	
	
}
