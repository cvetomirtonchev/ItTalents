package shop;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import shop.Product.AutoType;

public class Client {
	public class MyOwnException extends Exception {
		public MyOwnException(String msg) {
			super(msg);
		}
	}

	private Shop shop;
	private double money;
	private int maxShops;
	private TreeMap<Product, Integer> kolichka;

	public Client(Shop shop, double money, int maxShops) throws MyOwnException {

		this.shop = shop;

		if (money > 0) {
			this.money = money;
		} else {
			throw new MyOwnException("Exter proper value of money");

		}

		this.maxShops = maxShops;
		kolichka = new TreeMap<>();
	}

	public void addToKolichka(Product a, int broi) {
		AutoType type = a.getType();
		if(shop.getStoki().get(type).get(a).intValue()==broi){
		kolichka.put(a, a.getNalichnot());
		shop.getStoki().get(type).remove(a);
		}
		else{
			kolichka.put(a, a.getNalichnot());
			shop.getStoki().get(type).put(a, a.getNalichnot()-broi);
			
		}
		
	

	}
	public void removeFromKolichka(Product a, int broi){
	    
			shop.getStoki().get(a.getType()).put(a, a.getNalichnot());
			kolichka.remove(a);
	
		
	}
	
	public void payForAll(){
		double price = 0 ;
		for (java.util.Map.Entry<Product, Integer> e : kolichka.entrySet()) {
			price+=e.getKey().getPrice()*e.getValue();
			
		}
		if(price>this.money){
			System.out.println("Not enought money");
		}
		else {
			
			this.money-=price;
			shop.setCash(price+shop.getCash());
		}
	}
	void printKolichka(){
		for (java.util.Map.Entry<Product, Integer> e : kolichka.entrySet()) {
			System.out.println("Bought products: " + e.getKey() +e.getValue() );
			System.out.println("Money left: "+ this.money);
			
		}
	}
}
