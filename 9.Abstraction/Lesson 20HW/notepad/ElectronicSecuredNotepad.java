package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isStared;

	public ElectronicSecuredNotepad(String password, Page[] newPages) {
		super(password, newPages);
	}

	@Override
	public void start() {
		this.isStared = true;
	}

	@Override
	public void stop() {
		this.isStared = false;
	}

	@Override
	public boolean isStarted() {
		if (this.isStared = true) {
			return true;
		}
		return false;
	}

}
