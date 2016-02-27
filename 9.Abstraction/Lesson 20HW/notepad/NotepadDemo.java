package notepad;

public class NotepadDemo {
	public static void main(String[] args) {
		Page one = new Page("Chapter 1","Introduction");
		Page two = new Page("Chapter 2","The beggining...");
		Page three = new Page("Chapter 3","Action...");
		Page four = new Page("Chapter 4","Some more action...");
		Page five = new Page("Chapter 5","The end.");
		
		Page [] pages = {one, two, three, four, five};
		
		Page first = new Page("1","This is a secured notepad.");
		Page second = new Page("2","You can only acces it with password.");
		Page third = new Page("3","Write your password here: ");
		Page fourth = new Page("4","End.");
		
		Page [] pagesS = {first, second, third, fourth};
				

		INotepad simple = new SimpleNotepad(pages);
		ISecuredPad  secured = new SecuredNotepad("55aaH", pagesS);
		
		simple.addText(2, "is very interesting");
		simple.changeText(4, "Action is to its end...");
		System.out.println("Simple:");
		simple.printAllPages();
		
		secured.addText("55aaH", 3, "1991");
		
		System.out.println("Secured:");
		secured.printAll("55aaH");
		
		ElectronicSecuredNotepad el = new ElectronicSecuredNotepad("111Aa", pagesS.clone());
		if(!el.isStarted()){
			el.start();
		}
		el.addText("111Aa", 2, "You shoud carefully choose your password!");
		el.printAll("111Aa");
		
		
		System.out.println("Is there the word 'chapter' in the simple pad: "+simple.searchWord("chapter"));
	
		
		
	}

}
