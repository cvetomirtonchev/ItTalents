package policeForce;

public interface ICop {

	default void shoot(){
		System.out.println("bam bam");
	}
	
	void arrest(String name);
	
	void chase();
}
