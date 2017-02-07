import java.util.Random;

import merchants.Ambul;
import merchants.ChainStore;
import merchants.ET;
import merchants.Merchant;
import providers.DrebenSupplier;
import providers.EdurSupplier;
import providers.Supplier;
import tradingObjects.Budka;
import tradingObjects.IChainTradingObject;
import tradingObjects.IETTradingObject;
import tradingObjects.MallShop;
import tradingObjects.Sergia;
import tradingObjects.TradingObject;

public class Demo {
	
	static Supplier[] suppliers = new Supplier[10];
	static TradingObject[] tradingObjects = new TradingObject[20];

	public static void main(String[] args) {
		
		//1.
		for (int i = 0; i < suppliers.length; i++) {
			if(new Random().nextBoolean()){
				suppliers[i] = new DrebenSupplier();
			}
			else{
				suppliers[i] = new EdurSupplier();
			}
		}
		
		//2.
		for (int i = 0; i < tradingObjects.length; i++) {
			switch(new Random().nextInt(3)){
				case 0:
					tradingObjects[i] = new Sergia("lulin", 8, "12-12");
				case 1:
					tradingObjects[i] = new Budka("jenskiq pazar", 4, "non stop");
				case 2:
					tradingObjects[i] = new MallShop("carigradsko", 40, "10-22");
			}
		}
		
		Ambul ambul = new Ambul("Ambul", "jenski pazar", 100);
		ET stoev = new ET("Stoev i kadeti", "mall bulgaria", 500);
		ChainStore mcnuggets = new ChainStore("McDonalds", "mladost", 3000);
	
		
		int randIdx = new Random().nextInt(tradingObjects.length);
		if(tradingObjects[randIdx] instanceof IETTradingObject){
			stoev.setTradingObject((IETTradingObject) tradingObjects[randIdx]);
		}

		randIdx = new Random().nextInt(tradingObjects.length);
		if(tradingObjects[randIdx] instanceof IChainTradingObject){
			mcnuggets.setTradingObject((IChainTradingObject) tradingObjects[randIdx]);
		}
	}
	
	public static void initiateTrade(Merchant[] merchants){
		for (int i = 0; i < merchants.length; i++) {
			merchants[i].makeOrder(200, suppliers[0]);//the trading object will be defined in the merchant itself
			merchants[i].collectMoney();
			merchants[i].payTax();
		}
	}
}
