package merchants;

import suppliers.DrebenSupplier;
import trading_objects.IETTradingObject;
import trading_objects.Product;

public class ET extends Merchant{

	private DrebenSupplier[] drebni;
	private IETTradingObject tradingObject;
	
	public ET(String name, String address, int money) {
		super(name, address, money);
		drebni = new DrebenSupplier[5];
	}

	public void setTradingObject(IETTradingObject tradingObject) {
		this.tradingObject = tradingObject;
	}

	@Override
	protected void acceptProducts(Product[] pokupki) {
		tradingObject.acceptProducts(pokupki);
		
	}
}
