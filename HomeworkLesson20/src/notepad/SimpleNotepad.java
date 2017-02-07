package notepad;

public class SimpleNotepad extends NotePad{

	public SimpleNotepad(int maxPages) {
		super(maxPages);
		
	}
    @Override
    void addPage(Page page) {
    	
    	super.addPage(page);
    }
}
