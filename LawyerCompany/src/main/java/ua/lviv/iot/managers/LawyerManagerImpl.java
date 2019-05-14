package ua.lviv.iot.lawyer.managers;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.lawyer.models.Advocate;
import ua.lviv.iot.lawyer.models.Lawsuit;
import ua.lviv.iot.lawyer.models.Lawyer;
import ua.lviv.iot.lawyer.models.Notary;


public class LawyerManagerImpl implements LawyerManager<Lawyer> {

	public List<Lawyer> lawyerList = new LinkedList<Lawyer>();

	Advocate advocateService;
	Notary notaryService;

	public void addlawyer(Lawyer lawyer) {
		lawyerList.add(lawyer);
	}

	public List<Lawyer> sortbyName(List<Lawyer> lawyers) {

		Collections.sort(lawyers, Comparator.comparing(Lawyer::getName));
		return lawyers;
	}

	
	public List<Lawyer> sortbyExpirience(List<Lawyer> lawyersss) {

        Collections.sort(lawyersss, Comparator.comparing(Lawyer::getExpirience));
		return lawyersss;
    }

	public List<Lawyer> searchAdvocateServices(List<Lawyer> list, Lawsuit ls) {
		List<Lawyer> searchedList = new LinkedList<Lawyer>();
		for (Lawyer lawyer : list) {
			if (ls.equals(lawyer.getLs())) {
				searchedList.add(lawyer);
			}
		}
		return searchedList;
	}

	@Override
	public List<Lawyer> searchNotaryServices(List<Lawyer> list, Lawsuit ls) {
		List<Lawyer> searchedList = new LinkedList<Lawyer>();
		for (Lawyer lawyer : list) {
			if (ls.equals(lawyer.getLs())) {
				searchedList.add(lawyer);
			}
		}
		return searchedList;

	}

}
