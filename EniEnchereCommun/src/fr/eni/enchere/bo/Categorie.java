package fr.eni.enchere.bo;

public class Categorie {
	private String noCategorie;
	private String libelle;
	
	private ArticleVendu categorieArticle;
	
	public Categorie() {
		
	}
	
	
	
	
	//getter-setter
	public String getNoCategorie() {
		return noCategorie;
	}
	public void setNoCategorie(String noCategorie) {
		this.noCategorie = noCategorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public ArticleVendu getCategorieArticle() {
		return categorieArticle;
	}
	public void setCategorieArticle(ArticleVendu categorieArticle) {
		this.categorieArticle = categorieArticle;
	}
}
