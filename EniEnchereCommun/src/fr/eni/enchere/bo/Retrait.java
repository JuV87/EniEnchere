package fr.eni.enchere.bo;

public class Retrait {

	private String rue;
	private int codePostal;
	private String ville;
	
	private ArticleVendu articleVendu;
	
	public Retrait() {
		
	}
	public Retrait(String rue, int codePostal, String ville) {
		this.setRue(rue);
		this.setCodePostal(codePostal);
		this.setVille(ville);
	}
	
	
	
	//getter-setter
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
	public ArticleVendu getArticleVendu() {
		return articleVendu;
	}
	public void setArticleVendu(ArticleVendu articleVendu) {
		this.articleVendu = articleVendu;
	}

	
	
	
}
