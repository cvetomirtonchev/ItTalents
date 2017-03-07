package Human;

public class Person {
	private final String name;
	private int age;
	private boolean isMale =true;
	
	Person(String name,int age,boolean isMale){
		if(!name.isEmpty()){
			this.name=name;
		}
		else{
			this.name = "John Doe";
		}
		if(age<0){
			this.age=0;
		}
		else {
			this.age=age;
		}
		this.isMale=isMale;
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isMale=" + isMale + "]";
	}
	
	void showPersonInfo(){
		System.out.println("Name: " + this.name + ".");
		System.out.println("Age: " + this.age + " years old.");
		if(isMale){
			System.out.println("Gender: Male.");
		}else{
			System.out.println("Gender: Feamle.");
		}
	}
	
	
 

		

}
