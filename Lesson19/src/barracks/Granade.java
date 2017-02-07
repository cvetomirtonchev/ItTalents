package barracks;

public class Granade implements Explodable {

	@Override
	public void blowUp(int radius, int time) {
		System.out.println("durpame shplenta i hvurlqme");
	}

	@Override
	public void disarm() {
		System.out.println("vrushtame shplenta i pak hvurlqme za vseki sluchai");
	}

	
}
