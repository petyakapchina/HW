package notepad;

public interface INotepad {
	void addText(int page, String text);
	void changeText(int page, String newText);
	void deleteText(int page);
	void printAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigis();

}
