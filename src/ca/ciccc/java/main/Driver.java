package ca.ciccc.java.main;

import ca.ciccc.java.model.Country;

public class Driver {

	public static void main(String[] args) {

		Country canada = new Country();
		canada.displayAllProvinces();
		System.out.println(canada.howManyHaveThisPopulation(4, 6));

	}

}
