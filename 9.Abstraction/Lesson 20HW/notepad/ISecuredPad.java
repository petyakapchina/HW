package notepad;

public interface ISecuredPad {
	
	void changeText(String password, int page, String text);
	void deleteText(String password, int page);
	void addText(String password, int page, String text);
	void printAll(String password);
}
