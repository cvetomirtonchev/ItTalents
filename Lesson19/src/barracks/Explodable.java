package barracks;

public interface Explodable {

	int EXPLOSION_RADIUS = 10;//public static final int

	void blowUp(int radius, int time);
	void disarm();
}
