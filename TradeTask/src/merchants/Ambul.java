package merchants;

import suppliers.DrebenSupplier;
import trading_objects.Product;

public class Ambul extends Merchant{

	DrebenSupplier supplier;
	Product[] pokupki;
	
	public Ambul(String name, String address, int money) {
		super(name, address, money);
	}

	@Override
	protected void acceptProducts(Product[] pokupki) {
		this.pokupki = pokupki;
	}

}
