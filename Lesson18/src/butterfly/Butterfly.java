package butterfly;

public class Butterfly {

	String color;
	int wingSpan;//sm
	
	public Butterfly(String color, int wingSpan) {
		this.color = color;
		this.wingSpan = wingSpan;
	}

	@Override
	public String toString() {
		return "Butterfly [color=" + color + ", wingSpan=" + wingSpan + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Butterfly){
			Butterfly peperudka =  ( Butterfly ) obj;
			return this.color.equals(peperudka.color) && this.wingSpan == peperudka.wingSpan;
		}
		return false;
	}

	
}
