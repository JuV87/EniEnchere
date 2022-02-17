package fr.eni.enchere.bo;

public class Enchere {

	private int dateEnchere;
	private int montantEnchere;
	
	
	public Enchere() {
		
	}
	public Enchere(int dateEnchere, int montantEnchere) {
		this.setDateEnchere(dateEnchere);
		this.setMontantEnchere(montantEnchere);
	}
	
	
	//getter-setter
	public int getDateEnchere() {
		return dateEnchere;
	}
	public void setDateEnchere(int dateEnchere) {
		this.dateEnchere = dateEnchere;
	}
	public int getMontantEnchere() {
		return montantEnchere;
	}
	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}
	

}
