package fiveThreads;

public class CommasRegister implements Runnable {
	private String text;
	private int numberOfCommas = 0;

	public CommasRegister(String text) {
		this.setText(text);
	}

	@Override
	public void run() {
		for (int index = 0; index < this.text.length(); index++) {
			if (this.text.charAt(index) == ',') {
				this.numberOfCommas++;
			}
		}
		System.out.println("In this part: " + this.numberOfCommas);
	}

	private void setText(String newText) {
		if (newText != null && newText.length() > 0) {
			this.text = newText;
		} else {
			try {
				throw new Exception("Invalid text!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String getText() {
		return this.text;
	}

	public int getNumber() {
		return this.numberOfCommas;
	}

}
