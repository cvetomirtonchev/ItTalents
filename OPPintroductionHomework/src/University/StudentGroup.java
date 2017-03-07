package University;

public class StudentGroup {
	String groupSubject;
	Student [] students;
	int freePlaces;
	int takenPlaces=0;
	
	
	StudentGroup(){
		
	     this.students = new Student[5];
	     this.freePlaces = 5;
	}
	StudentGroup(String groupSubject){
		this();
		this.groupSubject=groupSubject;
	}
	

	
	void addStudent(Student a){
		
		if(this.freePlaces>0&&takenPlaces<=4){
			if(a.subject.equalsIgnoreCase(groupSubject)){
				this.students[takenPlaces]=a;
				takenPlaces++;
				freePlaces--;
				
				
			}
		}
		else{
			System.out.println("There aren't free places Mr/Mrs : " +a.name);
		}
	}
	void emptyGroup(){
		this.freePlaces=5;
		this.students = new Student[5];
		this.takenPlaces=0;
		
	}
	
	
	void theBestStudent(){
		Student theBest = students[0];
		double max = students[0].getGrade();
		for (int i = 0; i < students.length; i++) {
			if(this.students[i].getGrade()>max){
				theBest=this.students[i];
				max = this.students[i].getGrade();
					
				
				
			}
			
		}
		System.out.println("The best studet in group is: "+theBest.name +" with grade: "+ max);
	}
	void printStudentsInGroup(){
		System.out.println("-----------------------------------------------------------------");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student Name: " + students[i].name);
			System.out.println("Student Grade: "+ students[i].getGrade());
			System.out.println(students[i].name + " years in collage:  " + students[i].getyearsInCollage());
			System.out.println("-----------------------------------------------------------------");
		}
	}

}
