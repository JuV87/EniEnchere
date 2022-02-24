package fr.eni.enchere.bo;

import java.util.Date;

public class Enchere {

	private Date dateEnchere;
	private int montantEnchere;
	private Utilisateur user;
	private ArticleVendu art;
	
	
	
	public Enchere() {
		
	}
	public Enchere(Utilisateur user, ArticleVendu art, Date dateEnchere, int montantEnchere) {
		this.setUser(user);
		this.setArt(art);
		this.setDateEnchere(dateEnchere);
		this.setMontantEnchere(montantEnchere);
	}
	
	public Enchere(Date dateEnchere, int montantEnchere) {
		this.setDateEnchere(dateEnchere);
		this.setMontantEnchere(montantEnchere);
	}
	
	
	//getter-setter

	public int getMontantEnchere() {
		return montantEnchere;
	}
	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	public Date getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(Date dateEnchere2) {
		this.dateEnchere = dateEnchere2;
	}
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}
	public ArticleVendu getArt() {
		return art;
	}
	public void setArt(ArticleVendu art) {
		this.art = art;
	}
	

}
