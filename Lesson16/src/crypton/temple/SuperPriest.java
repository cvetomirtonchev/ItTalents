package crypton.temple;

public class SuperPriest {

	public String name;
	int age;
	private int yearsAtService;
	final private String egn;
	
	public SuperPriest(int yearsAtService){
		this.egn = "242344";
	}
	
	public SuperPriest(int yearsAtService, String egn) {
		setYearsAtService(yearsAtService);
		this.egn = egn;
	}
	
	
	public void setYearsAtService(int yearsAtService){
		if(yearsAtService > 0 && yearsAtService > this.yearsAtService){
			this.yearsAtService = yearsAtService;
		}
	}
	
	public int getYearsAtSercice(){
		return this.yearsAtService;
	}
}
