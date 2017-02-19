package driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import vinetki.Vinetka;
import vinetki.Vinetka.AutoType;

public class GasStation {
	public class NameComparator implements Comparator<Vinetka>{

		@Override
		public int compare(Vinetka o1, Vinetka o2) {
			
			return o1.getPrice()-o2.getPrice();
		}
		
	}
	private String name;
	private int dayCash;
	private TreeMap<AutoType,ArrayList<Vinetka>> spisuk ;

	public GasStation(String name) {
		this.name=name;
		spisuk = new TreeMap<>();
		this.spisuk.put(AutoType.CAR, new ArrayList<>());
		this.spisuk.put(AutoType.BUS, new ArrayList<>());
		this.spisuk.put(AutoType.TRUCK, new ArrayList<>());
		
		
	}
	public void addVinete(Vinetka a) {
		AutoType type = a.geType();
		if(!spisuk.containsKey(type)){
			spisuk.put(type, new ArrayList<Vinetka>());
		}
		
		spisuk.get(type).add(a);
		
	}
	
	public void printInfo(){
		System.out.println("===============Welcome to "+this.name+"===============");
		for(java.util.Map.Entry<AutoType, ArrayList<Vinetka>> e : spisuk.entrySet()){
			System.out.println("-------Vinete for:"+e.getKey());
			for (Vinetka it : e.getValue()) {
				
				System.out.println("          -*"+it);
				
			}
			
		}
	}
	
	

	
}
	
	
	

