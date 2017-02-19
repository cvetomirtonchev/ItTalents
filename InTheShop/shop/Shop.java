package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.omg.IOP.ExceptionDetailMessage;
import org.omg.Messaging.SyncScopeHelper;

import shop.Product.AutoType;

public class Shop {
	public class MyOwnException extends Exception {
		public MyOwnException(String msg){
			super(msg);
		}
		
	}
	
	private String name ;
	private String adress;
	private double cash;
	private int space;
	private HashMap<AutoType,TreeMap<Product, Integer>> stoki;
	
	public Shop(String name, String adress, double cash, int space) throws MyOwnException {
		if(!name.equals(" ")&&!name.isEmpty()){
			this.name = name;
		}
		else{
			throw new MyOwnException("Write a name");
		}
		if(!name.equals(" ")&&!name.isEmpty()){
			this.adress = adress;
		}else{
			throw new MyOwnException("Write proper adress");
		}
		if(cash>=0){
			this.cash = cash;
		}
		else{
			throw new MyOwnException("Write a proper cash");
		}
		if(space>=0){
			this.cash = cash;
		}
		else{
			throw new MyOwnException("Space must be >0");
		}
		stoki = new HashMap<>();
		stoki.put(AutoType.BROI, new TreeMap<>());
		stoki.put(AutoType.KILOGRAM, new TreeMap<>());
		
	}
	
	public void addStoka(Product a){
		AutoType type = a.getType();
		if(!stoki.containsKey(type)){
			stoki.put(type, new TreeMap<>());
			stoki.get(type).put(a, a.getNalichnot());
		}
		else{
			stoki.get(type).put(a, a.getNalichnot());
		}
		
	}
	public HashMap<AutoType, TreeMap<Product,Integer>> getStoki() {
		return stoki;
	}
	public void printStoki(){
		System.out.println("Welcome to "+this.name);
		for(Entry<AutoType, TreeMap<Product,Integer>> e : stoki.entrySet()){
			System.out.println("         -"+e.getKey());
			for (Entry<Product,Integer>e1 : e.getValue().entrySet()) {
				if(e.getKey().equals(AutoType.BROI)){
				System.out.println("          ------"+e1.getKey()+" broq");
				}
				else{
					System.out.println("          ------"+e1.getKey() +" kg");
				}
				
			}
			
		}
		
	}
	public void setCash(double cash) {
		this.cash = cash;
	}
	public double getCash() {
		return cash;
	}
	
	
	

}
