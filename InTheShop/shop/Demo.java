<<<<<<< HEAD
package shop;

import java.util.Random;

import shop.Product.AutoType;
import shop.Shop.MyOwnException;

public class Demo {
	
	public static void main(String[] args) throws MyOwnException, shop.Client.MyOwnException {
		Shop magazin = new Shop("Malibu", "Sofia,Jak Natan N:21", 150.0, 8);
		/*String [] naKilogram = {"Meso","Sirene","Riba","Maslini"};
		String [] naBroi = {"Vafla","Shokolad","Salam","Krenvirsh"};
		for (int i = 0; i < naKilogram.length; i++) {
			magazin.addStoka(new Product(naKilogram[i], new Random().nextDouble()*20, new Random().nextInt(10)+1, AutoType.KILOGRAM));
			
		}
		for (int i = 0; i < naKilogram.length; i++) {
			magazin.addStoka(new Product(naBroi[i], new Random().nextDouble()*20, new Random().nextInt(10)+1, AutoType.BROI));
			
		}
		*/
		Product pr1 = new Product("Snikers", 0.80, 5, AutoType.BROI);
		Product pr2 = new Product("Kniga", 11.80, 2, AutoType.BROI);
		Product pr3 = new Product("Meso", 4.80, 10, AutoType.KILOGRAM);
		Product pr4 = new Product("Riba", 7.80, 5, AutoType.KILOGRAM);
		Product pr5 = new Product("Bounty", 1.80, 9, AutoType.BROI);
		magazin.addStoka(pr1);
		magazin.addStoka(pr2);
		magazin.addStoka(pr3);
		magazin.addStoka(pr4);
		magazin.addStoka(pr5);
		
		
		
		magazin.printStoki();
		Client gosho = new Client(magazin, 360.25, 5);
		gosho.addToKolichka(pr1, 2);
		gosho.addToKolichka(pr3, 5);
		
		
		gosho.payForAll();
		System.out.println("====================");
		gosho.printKolichka();
		System.out.println("================");
		magazin.printStoki();
		
		
	}
	

}
=======
package shop;

import java.util.Random;

import shop.Product.AutoType;
import shop.Shop.MyOwnException;

public class Demo {
	
	public static void main(String[] args) throws MyOwnException, shop.Client.MyOwnException {
		Shop magazin = new Shop("Malibu", "Sofia,Jak Natan N:21", 150.0, 8);
		/*String [] naKilogram = {"Meso","Sirene","Riba","Maslini"};
		String [] naBroi = {"Vafla","Shokolad","Salam","Krenvirsh"};
		for (int i = 0; i < naKilogram.length; i++) {
			magazin.addStoka(new Product(naKilogram[i], new Random().nextDouble()*20, new Random().nextInt(10)+1, AutoType.KILOGRAM));
			
		}
		for (int i = 0; i < naKilogram.length; i++) {
			magazin.addStoka(new Product(naBroi[i], new Random().nextDouble()*20, new Random().nextInt(10)+1, AutoType.BROI));
			
		}
		*/
		Product pr1 = new Product("Snikers", 0.80, 5, AutoType.BROI);
		Product pr2 = new Product("Kniga", 11.80, 2, AutoType.BROI);
		Product pr3 = new Product("Meso", 4.80, 10, AutoType.KILOGRAM);
		Product pr4 = new Product("Riba", 7.80, 5, AutoType.KILOGRAM);
		Product pr5 = new Product("Bounty", 1.80, 9, AutoType.BROI);
		magazin.addStoka(pr1);
		magazin.addStoka(pr2);
		magazin.addStoka(pr3);
		magazin.addStoka(pr4);
		magazin.addStoka(pr5);
		
		
		
		magazin.printStoki();
		Client gosho = new Client(magazin, 360.25, 5);
		gosho.addToKolichka(pr1, 2);
		gosho.addToKolichka(pr3, 5);
		
		
		gosho.payForAll();
		System.out.println("====================");
		gosho.printKolichka();
		System.out.println("================");
		magazin.printStoki();
		
		
	}
	

}
>>>>>>> 3929b29723bd642a520be8e9247116168bab8e63
