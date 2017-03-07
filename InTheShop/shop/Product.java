<<<<<<< HEAD
package shop;



public class Product implements Comparable<Product> {
	@Override
	public String toString() {
		return  name + ", price=" + price ;
	}
	public enum AutoType { KILOGRAM,BROI};
	private String name;
	private double price;
	private int nalichnot;
	private AutoType type;
	
	public AutoType getType() {
		return type;
	}
	public int getNalichnot() {
		return nalichnot;
	}
	public void setNalichnot(int nalichnot) {
		this.nalichnot = nalichnot;
	}
	public double getPrice() {
		return price;
	}
	public Product(String name, double price, int nalichnot, AutoType type) {
		
		this.name = name;
		this.price = price;
		this.nalichnot = nalichnot;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Product o) {
		
		return this.name.compareTo(o.name);
	}

	
}
=======
package shop;



public class Product implements Comparable<Product> {
	@Override
	public String toString() {
		return  name + ", price=" + price ;
	}
	public enum AutoType { KILOGRAM,BROI};
	private String name;
	private double price;
	private int nalichnot;
	private AutoType type;
	
	public AutoType getType() {
		return type;
	}
	public int getNalichnot() {
		return nalichnot;
	}
	public void setNalichnot(int nalichnot) {
		this.nalichnot = nalichnot;
	}
	public double getPrice() {
		return price;
	}
	public Product(String name, double price, int nalichnot, AutoType type) {
		
		this.name = name;
		this.price = price;
		this.nalichnot = nalichnot;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Product o) {
		
		return this.name.compareTo(o.name);
	}

	
}
>>>>>>> 3929b29723bd642a520be8e9247116168bab8e63
