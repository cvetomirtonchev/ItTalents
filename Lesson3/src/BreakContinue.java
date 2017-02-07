
public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++){
			if(i == 66){
				break;
			}
			System.out.println(i);
		}
		
		for(int i = 0 ; i < 100; i++){
			if(i >= 10 && i <=20){
				continue;
			}
			System.out.println(i);
		}
	}
}
