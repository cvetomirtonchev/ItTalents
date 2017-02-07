package policeForce;

public interface IRobot {

	default void shoot(){
		System.out.println("pew pew");
	}
	
	static void shoot(int x){
		
	}
	
	void chase();
	
}
