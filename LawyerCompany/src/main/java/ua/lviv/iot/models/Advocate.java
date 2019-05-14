package ua.lviv.iot.lawyer.models;

public class Advocate extends Lawyer {
	
	private String CompanyName;
	private int pricePerHour;
	private  Specialization specialization;
	
	public Advocate() {
		
	}

	public Advocate(int expirience, double raiting, String name, Lawsuit ls) {
		 super(expirience, raiting,  name,  ls );
		
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public int getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(int pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
	
}