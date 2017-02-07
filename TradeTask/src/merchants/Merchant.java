package merchants;

import java.util.Random;

import suppliers.Supplier;
import trading_objects.Product;

public abstract class Merchant {

	private String name;
	private String address;
	private int money;
	
	public Merchant(String name, String address, int money) {
		this.name = name;
		this.address = address;
		this.money = money;
	}

	public void makeOrder(int money, Supplier supplier) {
		if(money < this.money/2){
			this.money -= money*((100-supplier.getDiscount())/100);
			int priceCap = 0;
			Product[] pokupki = new Product[money/5];
			int index = 0;
			while(priceCap < money){
				Product p = new Product("chasha", new Random().nextInt(10)+5);
				pokupki[index++] = p;
				priceCap+=p.getPrice();
			}
			acceptProducts(pokupki);
		}
	}
	
	protected abstract void acceptProducts(Product[] pokupki);
}
