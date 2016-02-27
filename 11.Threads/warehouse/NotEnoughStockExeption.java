package warehouse;

public class NotEnoughStockExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4931300731743522639L;

	public NotEnoughStockExeption() {
		// TODO Auto-generated constructor stub
	}

	public NotEnoughStockExeption(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughStockExeption(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughStockExeption(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughStockExeption(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
