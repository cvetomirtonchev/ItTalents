package merchants;

import suppliers.Supplier;
import trading_objects.IChainTradingObject;
import trading_objects.Product;

public class ChainStore extends Merchant {
	
	private Supplier[] suppliers;
	private IChainTradingObject[] tradingObjects;
	private int addedTOs;

	public ChainStore(String name, String address, int money) {
		super(name, address, money);
		suppliers = new Supplier[15];
		tradingObjects = new IChainTradingObject[10];
	}
	
	public void setTradingObject(IChainTradingObject tradingObject) {
		if(addedTOs < this.tradingObjects.length){
			this.tradingObjects[addedTOs++] = tradingObject;
		}
	}

	@Override
	protected void acceptProducts(Product[] pokupki) {
		for (int i = 0; i < tradingObjects.length; i++) {
			if(tradingObjects[i] != null){
				tradingObjects[i].acceptProducts(pokupki);
			}
		}
	}

}
