public class AuthenticationService {

	private String sessionToken;
	private String passwordHash;
	private Date sessionExpiry;
	private String loginEmail;

	/**
	 * 
	 * @param email
	 * @param password
	 */
	public Boolean login(String email, String password) {
		// TODO - implement AuthenticationService.login
		throw new UnsupportedOperationException();
	}

	public Boolean logout() {
		// TODO - implement AuthenticationService.logout
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param email
	 */
	public Boolean resetPassword(String email) {
		// TODO - implement AuthenticationService.resetPassword
		throw new UnsupportedOperationException();
	}

}