package ua.lviv.iot.lawyer.models;

//import java.util.List;
//import ua.lviv.iot.lawyer.managers.LawyerManagerImpl;

public abstract class Lawyer {
	
	private int expirience;
	private double raiting;
	private String name;
	private Lawsuit ls;
	
	
	public Lawyer() {
	}

	public Lawyer(int expirience, double raiting, String name, Lawsuit ls) {
		super();
		this.expirience = expirience;
		this.raiting = raiting;
		this.name = name;
		this.ls = ls;
		
	
	}

	

	public Lawsuit getLs() {
		return ls;
	}

	public void setLs(Lawsuit ls) {
		this.ls = ls;
	}

	public int getExpirience() {
		return expirience;
	}

	public void setExpirience(int expirience) {
		this.expirience = expirience;
	}

	public double getRaiting() {
		return raiting;
	}
 
	public void setRaiting(double raiting) {
		this.raiting = raiting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object isProvidingServices(Lawyer law) {
		return null;
	}/*
	public Object isProvidingServices(List<Consultation> services) {
		return null;
	}/

	public Object isProvidingServices(Lawyer law) {
		// TODO Auto-generated method stub
		return null;
	}*/

	
}
