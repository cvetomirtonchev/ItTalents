package policeForce;

public class Robocop implements ICop, IRobot{


	@Override
	public void arrest(String name) {
		System.out.println(name+", You are under arrest!");
	}

	@Override
	public void chase() {
		System.out.println("ela tuka, pile");
	}

	@Override
	public void shoot() {
		IRobot.super.shoot();
		IRobot.super.shoot();
		System.out.println("abe q da si postrelqm kakto si iskam");
		ICop.super.shoot();
		ICop.super.shoot();
		ICop.super.shoot();
	}
	
}
