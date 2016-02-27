package notepad;

public class Page {
	private static final int MAX_SYMBOLS_IN_TITLE = 20;
	private static final int MAX_SYMBOLS_PER_PAGE = 400;

	private String title;
	private String text;

	Page(String title, String text) {
		this.setTitle(title);
		this.setText(text);
	}

	public void addText(String text) {
		if (text != null && (!(text.equals("")))) {
			if (MAX_SYMBOLS_PER_PAGE - this.text.length() >= text.length()) {
				this.text += text;
			}
		}
	}

	public void deleteText() {
		this.text = "";
	}

	public void printText() {
		System.out.println(this.getTitle());
		System.out.println();
		System.out.println(this.getText());
	}

	public boolean searchWord(String word) {
		if (word != null && !(word.equals(""))) {
			if ((this.title.toLowerCase()).contains((word.toLowerCase()))
					|| (this.text.toLowerCase()).contains((word.toLowerCase()))) {
				return true;
			}
		}
		return false;
	}

	public boolean containsDigs() {
		char[] ch = text.toCharArray();
		for (int index = 0; index < ch.length; index++) {
			if (ch[index] >= 48 && ch[index] <= 57) {
				return true;
			}
		}
		char[] ch1 = title.toCharArray();
		for (int index = 0; index < ch1.length; index++) {
			if (ch1[index] >= 48 && ch1[index] <= 57) {
				return true;
			}
		}
		return false;
	}

	public String getTitle() {
		return this.title;
	}

	public String getText() {
		return this.text;
	}

	public void setTitle(String title) {
		if (title != null && (!(title.equals("")))) {
			if (title.length() <= MAX_SYMBOLS_IN_TITLE) {
				this.title = title;
			}
		}
	}

	public void setText(String text) {
		if (text != null && (!(text.equals("")))) {
			if (text.length() <= MAX_SYMBOLS_PER_PAGE) {
				this.text = text;
			}
		}
	}

}
