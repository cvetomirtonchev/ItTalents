package barracks;

public class Dynamite implements Explodable {

	@Override
	public void blowUp(int radius, int time) {
		System.out.println("palim fitila i hvurlqme");
	}

	@Override
	public void disarm() {
		System.out.println("gasim fitila i pak hvurlqme za vseki sluchai");
	}

	
}
