package trading_objects;

public class Budka extends TradingObject implements IETTradingObject, IChainTradingObject{

	public Budka(String address, double area, String workingTime) {
		super(address, area, 50, workingTime);
	}

	@Override
	protected boolean validArea(double area) {
		return area > 4 && area < 6;
	}

	
	
}