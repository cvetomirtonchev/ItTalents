package notepad;

public abstract class NotePad implements INotepad {
	private Page[] pages;
	private int currentPage ;

	private final int maxPages;

	public NotePad(int maxPages) {
		if (maxPages > 0) {
			this.maxPages = maxPages;
		} else {
			this.maxPages = 1;
		}
		this.pages = new Page[this.maxPages];
		currentPage=0;

	}
	void addPage(Page page){
		if(this.currentPage<maxPages){
		this.pages[currentPage++] = page;
		}
		else{
			return;
		}
		
}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if (pageNumber > maxPages) {
			System.out.println("Enter number correct page number");
		} else {
			pages[pageNumber].addText(text);

		}

	}

	@Override
	public void replaceTextToPage(String text, int pageNumber) {
		if (pageNumber < maxPages) {
			System.out.println("Enter number correct page number");
		} else {
			pages[pageNumber].setText(text);
		}

	}

	@Override
	public void deleteText(int pageNumber) {
		if (pageNumber > maxPages) {
			System.out.println("Enter number correct page number");
		} else {
			pages[pageNumber]= null;

		}

	}
	@Override
	public void printAllpages() {
		for (int i = 0; i < pages.length; i++) {
			if(pages[i]==null){
				continue;
			}
			else{
			pages[i].printPage();
			}
		}
		
	}
}
