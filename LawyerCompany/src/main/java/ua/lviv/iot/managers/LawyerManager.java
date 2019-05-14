package ua.lviv.iot.lawyer.managers;

import java.util.List;

//import ua.lviv.iot.lawyer.models.Consultation;
import ua.lviv.iot.lawyer.models.Lawsuit;
import ua.lviv.iot.lawyer.models.Lawyer;

public interface LawyerManager<L>{

	List<Lawyer> searchAdvocateServices(List<Lawyer> list, Lawsuit ls);
	List<Lawyer> searchNotaryServices(List<Lawyer> list,  Lawsuit ls);
	void addlawyer(Lawyer lawyer);
	List<Lawyer> sortbyName(List<Lawyer> lawyers);
	List<Lawyer> sortbyExpirience(List<Lawyer> lawyers);
	
	
}
