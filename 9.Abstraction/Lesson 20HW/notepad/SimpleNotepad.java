package notepad;

public class SimpleNotepad implements INotepad {
	private Page[] pages;

	public SimpleNotepad(Page[] newPages) {
		this.pages = new Page[newPages.length];
		this.setPages(newPages);
	}

	public void addText(int page, String text) {
		if (this.checkPage(page)) {
			this.getPage(page - 1).addText(text);
		}
	}

	public void changeText(int page, String newText) {
		if (this.checkPage(page)) {
			this.getPage(page - 1).deleteText();
			this.getPage(page - 1).addText(newText);
		}
	}

	public void deleteText(int page) {
		if (this.checkPage(page)) {
			this.getPage(page - 1).deleteText();
		}
	}

	public void printAllPages() {
		for (int index = 0; index < this.pages.length; index++) {
			System.out.println("Page " + (index + 1) + ":");
			this.getPage(index).printText();
			System.out.println();
		}
	}

	private boolean checkPage(int page) {
		if (page < this.pages.length) {
			return true;
		}
		return false;
	}

	public Page[] getPages() {
		return this.pages.clone();
	}

	public Page getPage(int index) {
		return this.pages[index];
	}

	public void setPages(Page[] pages) {
		if (pages != null) {
			this.pages = pages.clone();
		}
	}

	@Override
	public boolean searchWord(String word) {
		for (int index = 0; index < this.pages.length; index++) {
			return this.pages[index].searchWord(word);
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigis() {
		boolean isDigit = false;
		for (int index = 0; index < this.pages.length; index++) {
			if (this.pages[index].containsDigs()) {
				this.pages[index].printText();
				isDigit = true;
			}
		}
		if (!isDigit) {
			System.out.println("There is no gigits in this notepad!");
		}

	}

}
