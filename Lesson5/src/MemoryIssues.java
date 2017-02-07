
public class MemoryIssues {

	public static void main(String[] args) {
		
		int x = 4;
		int y = x;
//		System.out.println(x == y);
//		System.out.println(x);
//		System.out.println(y);
//		x++;
//		System.out.println(x);
//		System.out.println(y);
		int[] masiv = {4,8,5,9};
		System.out.println(masiv[1]);
		int[] grades = {4,8,5,9};//same as = new int[4]; grades[0] = 4; grades[1] = ...
		System.out.println("equal = " + (masiv == grades));
		int[] masiv2 = masiv;
		System.out.println(masiv);
		System.out.println(masiv2);
		System.out.println(masiv == masiv2);
		System.out.println(masiv[0]);
		System.out.println(masiv2[0]);
		masiv[0]++;
		System.out.println(masiv[0]);
		System.out.println(masiv2[0]);
		
	}
}
