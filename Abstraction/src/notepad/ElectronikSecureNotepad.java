package notepad;

public class ElectronikSecureNotepad extends SecureNotepad implements IElectronikDevice{
	private boolean started;


	public ElectronikSecureNotepad(String password, int maxPages) {
		super(password, maxPages);
		
	}

	@Override
	public void start() {
		this.started = true;
		
	}

	@Override
	public void stop() {
		this.started= false;
		
	}

	@Override
	public boolean isStarted() {
		return this.started;
		
	}
}