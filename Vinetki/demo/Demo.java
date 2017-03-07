<<<<<<< HEAD
package demo;

import java.security.KeyRep.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


import Vihicle.Vehicle;
import Vihicle.Vehicle.ModelType;
import driver.Driver;
import driver.GasStation;
import vinetki.Vinetka;
import vinetki.Vinetka.AutoType;
import vinetki.Vinetka.DurationType;

public class Demo {
	public static void main(String[] args) {
		
		
		
		
		
		ArrayList<Vinetka> magazin = new ArrayList<>();
		
		for (int i = 0; i < 10000; i++) {
			magazin.add(new Vinetka(AutoType.values()[new Random().nextInt(AutoType.values().length)],
					DurationType.values()[new Random().nextInt(DurationType.values().length)]));			
		//System.out.println(magazin.get(i));
		}
		
		GasStation shell = new GasStation("Shell");

		for (Vinetka vinetka : magazin) {
			shell.addVinete(vinetka);
			
		}
		
		//shell.printInfo(); // printim vinetkite
		
		ArrayList<Vehicle> koli = new ArrayList<>();
		String modeli = "Pageout Audi Mercedes BMW";
		String[]models = modeli.split(" ");
		for (int i = 0; i < 200; i++) {
			koli.add(new Vehicle(models[new Random().nextInt(4)], 
					new Random().nextInt(20)+1996,ModelType.values()[new Random().nextInt(ModelType.values().length)]) );
		}
		System.out.println(koli);
		Driver driver1 = new Driver("Pencho", 1000);
		Driver driver2 = new Driver("Ivan", 1000);
		Driver driver3 = new Driver("Gosho", 4000);
		Driver driver4 = new Driver("Ivo", 1050);
		Driver driver5 = new Driver("Ceco", 1400);
		Driver driver6 = new Driver("Mira", 1300);
		Driver driver7 = new Driver("Krasi", 2000);
		Driver driver8 = new Driver("Kiro", 5000);
		Driver driver9 = new Driver("Milen", 7000);
		Driver driver10 = new Driver("Stoqn", 5000);
		
		for (int i = 0; i < 10; i++) {
			
			
		}
		
		
		
	}

}
=======
package demo;

import java.security.KeyRep.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


import Vihicle.Vehicle;
import Vihicle.Vehicle.ModelType;
import driver.Driver;
import driver.GasStation;
import vinetki.Vinetka;
import vinetki.Vinetka.AutoType;
import vinetki.Vinetka.DurationType;

public class Demo {
	public static void main(String[] args) {
		
		
		
		
		
		ArrayList<Vinetka> magazin = new ArrayList<>();
		
		for (int i = 0; i < 10000; i++) {
			magazin.add(new Vinetka(AutoType.values()[new Random().nextInt(AutoType.values().length)],
					DurationType.values()[new Random().nextInt(DurationType.values().length)]));			
		//System.out.println(magazin.get(i));
		}
		
		GasStation shell = new GasStation("Shell");

		for (Vinetka vinetka : magazin) {
			shell.addVinete(vinetka);
			
		}
		
		//shell.printInfo(); // printim vinetkite
		
		ArrayList<Vehicle> koli = new ArrayList<>();
		String modeli = "Pageout Audi Mercedes BMW";
		String[]models = modeli.split(" ");
		for (int i = 0; i < 200; i++) {
			koli.add(new Vehicle(models[new Random().nextInt(4)], 
					new Random().nextInt(20)+1996,ModelType.values()[new Random().nextInt(ModelType.values().length)]) );
		}
		System.out.println(koli);
		Driver driver1 = new Driver("Pencho", 1000);
		Driver driver2 = new Driver("Ivan", 1000);
		Driver driver3 = new Driver("Gosho", 4000);
		Driver driver4 = new Driver("Ivo", 1050);
		Driver driver5 = new Driver("Ceco", 1400);
		Driver driver6 = new Driver("Mira", 1300);
		Driver driver7 = new Driver("Krasi", 2000);
		Driver driver8 = new Driver("Kiro", 5000);
		Driver driver9 = new Driver("Milen", 7000);
		Driver driver10 = new Driver("Stoqn", 5000);
		
		for (int i = 0; i < 10; i++) {
			
			
		}
		
		
		
	}

}
>>>>>>> 3929b29723bd642a520be8e9247116168bab8e63
