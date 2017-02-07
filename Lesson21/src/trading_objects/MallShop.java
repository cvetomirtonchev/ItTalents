package trading_objects;

public class MallShop extends TradingObject implements IChainTradingObject{

	public MallShop(String address, double area, String workingTime) {
		super(address, area, 150, workingTime);
	}

	@Override
	protected boolean validArea(double area) {
		return area > 10 && area < 100;
	}

	
	
}