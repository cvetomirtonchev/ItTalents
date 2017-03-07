package University;

public class Student {
	public String name;
	public String subject;
	private double grade;
	private int yearsInCollage;
	private int age;
	private boolean isDegree;
	private double money;
	public Student() {
		
		this.grade = 4.0;
		this.yearsInCollage = 1;
		this.isDegree = false;
		this.money = 0.00f;
	}
	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	void upYear(){
		if(yearsInCollage ==4){
			this.isDegree=true;
			System.out.println(this.name +" has already is degred.");
		}
		if(yearsInCollage<4){
			this.yearsInCollage++;
			if(yearsInCollage==4){
				this.isDegree=true;
				System.out.println(this.name +" has degre.");
			}
		}
				
	}
	double reciveScholarShip(double min,double amount){
		if(this.grade>=min&&this.age<30){
			return this.money+=amount;
		}
		if (age>30){
			System.out.println(this.name+ " is too old for scholar ship");
			return this.money;
		}
		else{
			return this.money;
		}
		
	}
	public int getAge() {
		return age;
	}
	
	public double getGrade(){
		return grade;
	}
	public int getyearsInCollage(){
		return yearsInCollage;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getMoney(){
		return this.money;
	}
	public int getYearsInCollage() {
		return yearsInCollage;
	}
	public void setYearsInCollage(int yearsInCollage) {
		this.yearsInCollage = yearsInCollage;
	}
	
	
	

}
	
