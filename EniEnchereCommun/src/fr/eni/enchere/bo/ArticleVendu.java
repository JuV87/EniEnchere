package fr.eni.enchere.bo;

public class ArticleVendu {

	private int noArticle;
	private String nomArticle;
	private String description;
	private int dateDebutEncheres;
	private int dateFinEnchere;
	private int miseAPrix;
	private int prixVente;
	
	public enum etatVente {
		En_Cours,
		Vendu
		
	}
	
	private Categorie categorieArticle;
	
	public ArticleVendu() {
		
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

	public int getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	public void setDateDebutEncheres(int dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
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
	
	
	
	
}
