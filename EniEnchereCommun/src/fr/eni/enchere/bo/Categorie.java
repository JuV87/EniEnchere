package fr.eni.enchere.bo;

import java.util.List;

public class Categorie {
	private String noCategorie;
	private String libelle;
	
	private List<ArticleVendu> listeCategorieArticle;
	
	
	public Categorie() {
		
	}
	public Categorie(String noCategorie, String libelle) {
		this.setNoCategorie(noCategorie);
		this.setLibelle(libelle);
	}
	
	public Categorie(String noCategorie) {
		this.setNoCategorie(noCategorie);
	
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

	public List<ArticleVendu> getListeCategorieArticle() {
		return listeCategorieArticle;
	}

	public void setListeCategorieArticle(List<ArticleVendu> listeCategorieArticle) {
		this.listeCategorieArticle = listeCategorieArticle;
	}
	

}
