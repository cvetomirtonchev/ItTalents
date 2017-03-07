package notepad;

public class SecureNotepad extends SimpleNotepad {
	private String password;
	private boolean hasPassword;

	public SecureNotepad(String password, int maxPages) {
		super(maxPages);
		String[] passcode = password.split("");
		String golemibukvi = "QWERTYUIOPASDFGHJKLZXCVN";
		String[] bukvi = golemibukvi.split("");
		String simvoli = "!@#$%^&*()_+{}:|<>?123456789";
		String[] simbols = simvoli.split("");
		if (!password.equals(" ")) {
			if (password.length() > 5) {
				for (int i = 0; i < passcode.length; i++) {
					for (int j = 0; j < bukvi.length; j++) {
						if (passcode[i].equals(bukvi[j])) {
							for (int j2 = 0; j2 < passcode.length; j2++) {
								for (int k = 0; k < simbols.length; k++) {
									if (passcode[j2].equals(simbols[k])) {
										this.password = password;
										this.hasPassword = true;

									}

								}

							}
						}

					}

				}

			}

		} else {
			this.hasPassword = false;
			System.out.println("Weak Password!!!");

		}

	}

	// set password for all methoods

	void addPage(Page newPage, String Password) {
		if (hasPassword && password.equals(this.password)) {
			super.addPage(newPage);
		} else {
			System.out.println("Wrong password!!!");
		}
	}

	public void addTextToPage(String text, int pageNumber, String password) {
		if (hasPassword && password.equals(this.password)) {
			super.addTextToPage(text, pageNumber);
		} else {
			System.out.println("Wrong password!!!");
		}
	}

	public void replaceTextToPage(String text, int pageNumber, String password) {
		if (hasPassword && password.equals(this.password)) {
			super.replaceTextToPage(text, pageNumber);
		} else {
			System.out.println("Wrong password!!!");
		}
	}

	public void deleteText(int pageNumber, String password) {
		if (hasPassword && password.equals(this.password)) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("Wrong password!!!");
		}
	}

	public void printAllpages(String password) {
		if (hasPassword && password.equals(this.password)) {
			super.printAllpages();
		} else {
			System.out.println("Wrong password!!!");
		}
	}

}
