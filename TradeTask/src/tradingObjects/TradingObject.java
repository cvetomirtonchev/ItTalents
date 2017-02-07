package tradingObjects;

public abstract class TradingObject {

	private String address;
	private double area;
	private int tax;
	private String workingTime;
	private Product[] products;
	
	public TradingObject(String address, double area, int tax, String workingTime) {
		this.address = address;
		if(validArea(area)){
			this.area = area;
		}
		this.tax = tax;
		this.workingTime = workingTime;
	}

	protected abstract boolean validArea(double area);
	

	public void acceptProducts(Product[] pokupki){
		products = pokupki;
	}
}
