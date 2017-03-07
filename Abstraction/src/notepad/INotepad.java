package notepad;

public interface INotepad {
	void addTextToPage(String text,int pageNumber);
	void replaceTextToPage(String text , int pageNumber);
	void deleteText(int pageNumber);
	void printAllpages();
	
}
