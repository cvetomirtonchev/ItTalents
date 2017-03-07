package notepad;

public class Demo {

	public static void main(String[] args) {
	SimpleNotepad note1 = new SimpleNotepad(5);
	Page page1 = new Page("az", "asdasdasd");
	page1.addText("edinichen  14 asda das ddas ads");
	
	
	System.out.println(page1.searchWord("edinichen"));
	
	
	note1.addPage(page1);
	note1.addPage(new Page("Petko", "izqde banicata"));
	note1.addPage(new Page("Tsanko", "izqde banicata"));
	note1.addPage(new Page("Mitko", "izqde banicata"));
	note1.addPage(new Page("Petka", "izqde banicata"));
	
	
	note1.addTextToPage("i izpi bozata", 1);
	


	SecureNotepad note2 = new SecureNotepad("asdeRs)-", 5);
	note2.addPage(page1, "asdeRs)-");
	note2.printAllpages("asdeRs)-");
	
	


	
	
	
	}

}
