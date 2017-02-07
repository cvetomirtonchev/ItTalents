
public class Demo {

	public static void main(String[] args) {
		
		Person pesho = new Person();
		pesho.name = "Petur Jelqzkov";
		pesho.weight = 130;
		pesho.age = 24;
		pesho.eyeColor = "Pink";
		System.out.println("Pesho se kazva " + pesho.name);
		
		Person gosho = new Person();
		gosho.name = "Georgi Vinkelov";
		gosho.weight = 65;
		gosho.age = 13;
		
		System.out.println(pesho);
		System.out.println(gosho);
		System.out.println(pesho == gosho);
		pesho = gosho;
		
	}
}
