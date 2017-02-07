package notepad;

public class Page  {

	private String title;
	private String text;
	
	public Page(String title, String text) {
		
		this.title = title;
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	void addText(String text){
		String space = " ";
	    this.text=this.text + space +text;
		
	}
	void deleteText(){
		this.text=" ";
	}
	
	void printPage(){
		System.out.println("Title: " + this.title );
		System.out.println("Text: " + this.text);
	}
	
	boolean searchWord(String word){
		String[] words = this.text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(word)){
				return true;
			}
		}
		return false;
    }
	
	boolean containsDigits(){
		String digit = "1 2 3 4 5 6 7 8 9 0";
		String [] digits = digit.split(" ");
		String [] words = this.text.split("");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < digits.length; j++) {
				if(words[i].equals(digits[j])){
					return true;
				}
				
				
			}
			
		}
		return false;
		
		
	}
	
	
	
	
	
}
