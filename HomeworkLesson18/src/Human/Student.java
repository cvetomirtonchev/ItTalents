package Human;

public class Student extends Person {
	

	private double score;
	
	Student(String name, int age, boolean isMale,double score) {
		super(name, age, isMale);
		if(score<2&&score>6){
			this.score = 2;
		}
		else{
			this.score=score;
		}
		
	}
	
	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.println("Grade: "+ score +".");
	}
	@Override
	void showPersonInfo() {
		super.showPersonInfo();
		this.showStudentInfo();
	}

	@Override
	public String toString() {
		this.showStudentInfo();
		return "Student [score=" + score + "]";
	}
	
	
	
	
	

}
