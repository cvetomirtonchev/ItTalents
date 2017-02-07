package crypton;

import crypton.temple.SuperPriest;

public class Demo {
	
	public static void main(String[] args) {
		
		Alien alf 	= new Alien("ALF", 5, "orange");
		SuperPriest pop = new SuperPriest(6);
		pop.setYearsAtService(-5);
		System.out.println(pop.getYearsAtSercice());
		
		final int x;
		x = 4;
		System.out.println(x);
	}
}
