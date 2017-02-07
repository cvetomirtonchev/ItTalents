package zoo;

public class ZooDemo {

	public static void main(String[] args) {

		Cat pisi = new Cat("Lisko");
		pisi.scratch();
		
		Tiger bigPisi = new Tiger("Risko");
		bigPisi.scratch();
		bigPisi.age = 55;
	}
}
