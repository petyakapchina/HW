package threadPool;
import java.util.concurrent.Callable;

public class CommasCounter implements Callable<Integer> {
	private String text;
	private int numberOfCommas = 0;

	public CommasCounter(String text) {
		this.setText(text);
	}

	@Override
	public Integer call() {
		for (int index = 0; index < this.text.length(); index++) {
			if (this.text.charAt(index) == ',') {
				this.numberOfCommas++;
			}
		}
		System.out.println("In this part: " + this.numberOfCommas);
		return this.numberOfCommas;
	}

	private void setText(String newText) {
		if (newText != null && newText.length() > 0) {
			this.text = newText;
		}
		else{
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

}
