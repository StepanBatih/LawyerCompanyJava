package ua.lviv.iot.lawyer.models;

public class Notary extends Lawyer {
	
	private String notaryDistrict;
	private int pricePerCase;
	Lawsuit ls;
	
	

	public Notary() {
		
	}

	public Notary(int expirience, double raiting, String name, Lawsuit ls) {
		super(expirience, raiting, name, ls);
		
	}

	

	public String getNotaryDistrict() {
		return notaryDistrict;
	}

	public void setNotaryDistrict(String notaryDistrict) {
		this.notaryDistrict = notaryDistrict;
	}

	public int getPricePerCase() {
		return pricePerCase;
	}

	public void setPricePerCase(int pricePerCase) {
		this.pricePerCase = pricePerCase;
	}

	
}
