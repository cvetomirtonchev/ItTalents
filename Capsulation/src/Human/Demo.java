package Human;

public class Demo {

	public static void main(String[] args) {
		
	Person [] hora = new Person[10];
	
	Person gosho = new Person("Georgi Ivanov", 20,true);
	Person petq = new Person("Petq Gospodinova", 25,false);
	Student elena = new Student ("Elena Petrova",17,false,5.50);
	Student milen = new Student ("Milen Nikolov", 21, true, 4);
	Employee vanina = new Employee("Vanina Ivanova",35,false,40);
	Employee tsvetomir = new Employee("Tsvetomir Tonchev",20,true,350);
	
	hora[0]=gosho;
	hora[1]=petq;
	hora[2]=elena;
	hora[3]=milen;
	hora[4]=vanina;
	hora[5]=tsvetomir;
	
	hora[0].getClass();
	System.out.println(hora[0].getName());
	
	for (int i = 0; i <hora.length; i++) {
		if(hora[i]==null){
			continue;
		
		}
		
		if(hora[i].getClass().getSimpleName().equals("Person")){
			
			
			
			hora[i].showPersonInfo();
			System.out.println("----------------------------------");
			}
			
		
        if(hora[i].getClass().getSimpleName().equals("Student")){
			((Student)hora[i]).showStudentInfo();
			System.out.println("-----------------------------------");
		}
		if(hora[i] instanceof Employee){
			((Employee)hora[i]).showEmployeeInfo();
			System.out.println("-----------------------------------");
			
		}
		
		
		
		
	}
	for (int i = 0; i < hora.length; i++) {
		if(hora[i]==null){
			continue;
		}
		if(hora[i] instanceof Employee){
			System.out.println(hora[i].getName()+" worked overtime and earned: " + ((Employee)hora[i]).calculateOvertime(2) + " leva");
		}
		
		
	}
		
	
	
		
	}

}
