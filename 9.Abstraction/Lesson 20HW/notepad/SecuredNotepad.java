package notepad;

public class SecuredNotepad extends SimpleNotepad implements ISecuredPad {
	private String password;

	public SecuredNotepad(String password, Page[] newPages) {
		super(newPages);
		this.setPassword(password);
	}

	@Override
	public void addText(String password, int page, String text) {
		if (this.checkPassword(password)) {
			this.addText(page, text);
		} else {
			System.out.println("Wron password!");
		}
	}

	@Override
	public void changeText(String password, int page, String text) {
		if (this.checkPassword(password)) {
			this.changeText(page, text);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void deleteText(String password, int page) {
		if (this.checkPassword(password)) {
			this.deleteText(page);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void printAll(String password) {
		if (this.checkPassword(password)) {
			this.printAllPages();
		} else {
			System.out.println("Wrong password!");
		}
	}

	private boolean checkPassword(String password) {
		if (this.password == password) {
			return true;
		}
		return false;
	}

	public void setPassword(String password) {
		if (password.length() >= 5) {
			boolean correct1 = false;
			boolean correct2 = false;
			boolean correct3 = false;
			for (int index = 0; index < password.length(); index++) {
				if (password.charAt(index) >= 48 && password.charAt(index) <= 57) {
					correct1 = true;
				}
				if (password.charAt(index) >= 97 && password.charAt(index) <= 122) {
					correct2 = true;
				}
				if (password.charAt(index) >= 65 && password.charAt(index) <= 90) {
					correct3 = true;
				}
			}
			if (correct1 && correct2 && correct3) {
				this.password = password;
			}
		}
	}

}
