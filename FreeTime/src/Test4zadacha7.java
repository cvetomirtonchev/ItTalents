
public class Test4zadacha7 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int result = returnTimes(a,b);
		System.out.println(result);
	}
	static int sum(int a,int b ){
		int sum1=0;
		if (b==0){
			return 1;
		}
		for (int i = 0; i < b; i++) {
			sum1+=a;
			
		}
		return sum1;
	}
	static int returnTimes(int x, int times){
		if(times==0){
			return 1;
		}
		if(times==1){
			return x;
		}
		else{
			return sum(x,times)+returnTimes(x,times-1);
		}
	}
}
