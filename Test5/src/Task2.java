
public class Task2 {

	public static void main(String[] args) {
		String dumi = "Книгата е печатно или произведение с научно или литературно съдържание. Представлява набор от писмени, печатни, илюстрирани или бели листа, изработени от мастило, хартия, пергамент или други материали, подзвързани заедно от едната страна. Книгата може да е с меки или твърди корици. Книгите се създават в печатници, а дистрибуцията им се нарича книгоразпространение. Когато текстът или илюстрациите са в електронен формат, се наричат е-книга.";
		mostFre(dumi);

	}
	static void mostFre(String duma){
		String masiv []=duma.split(" ");
		int count = 0;
		String popular = " ";
		for (int i = 0; i < masiv.length; i++) {
			String tempElement=masiv[i];
			int tempCount=0;
			for (int j = 0; j < masiv.length; j++) {
				if(masiv[j].equalsIgnoreCase(tempElement)){
					tempCount++;
				}
			}
			if(tempCount>count){
				popular=tempElement;
				count=tempCount;
				
			}
		}
		System.out.println(popular + " " + count + "puti");
		
	
	
	}

}
