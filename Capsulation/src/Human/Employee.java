package Human;

public class Employee extends Person {
	


	private double daySalary ;

	
	Employee(String name, int age, boolean isMale,double daySalary) {
		super(name, age, isMale);
		if(daySalary<1){
			this.daySalary=0;
		}
		else{
			this.daySalary=daySalary;
		}
		
	}
	public double calculateOvertime(double hours){
		if(this.getAge()<18){
			return 0;
		}
		else{
			
			double perHour = ((daySalary/8)+1.5);
			return hours*perHour;
			
			
		}
		
	}

	
	void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Day salary: " + this.daySalary + " leva.");
		
		}
	@Override
	public String toString() {
		this.showEmployeeInfo();
		return "Employee [daySalary=" + daySalary + "]";
	}
	
	
	

	
}
