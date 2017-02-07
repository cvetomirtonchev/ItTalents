package trading_objects;

public class Sergia extends TradingObject implements IETTradingObject{

	public Sergia(String address, double area, String workingTime) {
		super(address, area, 50, workingTime);
	}

	@Override
	protected boolean validArea(double area) {
		return area > 2 && area < 10;
	}

	
	
}
