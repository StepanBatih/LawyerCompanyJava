package ua.lviv.iot.lawyer.managers;


import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.lawyer.models.Advocate;
import ua.lviv.iot.lawyer.models.Lawsuit;
import ua.lviv.iot.lawyer.models.Lawyer;

public class Main {

	public static void main(String[] args) {
		LawyerManagerImpl manager = new LawyerManagerImpl();
		List<Lawyer> listOfLawyers = new LinkedList<Lawyer>();
		Lawyer stepan = new Advocate(0, 0.0, "Stepan", Lawsuit.MAKINGCLAIM);
		Lawyer vlad = new Advocate(2, 10.0, "Vlad", Lawsuit.EVIDECECOLLECTION);
		Lawyer taras = new Advocate(3, 10.0, "Taras", Lawsuit.CONTRUCTCONSULTION);
		Lawyer mykola = new Advocate(2, 10.0, "Danz", Lawsuit.CONTRUCTCONSULTION);
		Lawyer nord = new Advocate(10, 10.0, "Daniel", Lawsuit.CONTRUCTCONSULTION);
		listOfLawyers.add(stepan);
		listOfLawyers.add(vlad);
		listOfLawyers.add(taras);
		listOfLawyers.add(mykola);
		listOfLawyers.add(nord);

		List<Lawyer> listResult = manager.searchAdvocateServices(listOfLawyers, Lawsuit.CONTRUCTCONSULTION);
		for (int i = 0; i < listResult.size(); i++) {
			System.out.println(listResult.get(i).getName());
		}

		List<Lawyer> listResults = manager.sortbyName(listResult);

		for (int i = 0; i < listResults.size(); i++) {
			System.out.println(listResults.get(i).getName());
		}

		List<Lawyer> listResultes = manager.sortbyExpirience(listResult);

		for (int i = 0; i < listResultes.size(); i++) {
			System.out.println(listResultes.get(i).getExpirience());
		}

	}
}