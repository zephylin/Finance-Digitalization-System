public class NotificationService {

	private String templateID;
	private String body;
	private Boolean sendEmailEnabled;
	private Boolean sendSMSEnabled;

	/**
	 * 
	 * @param email
	 * @param subject
	 * @param body
	 */
	public Boolean sendEmail(String email, String subject, String body) {
		// TODO - implement NotificationService.sendEmail
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param message
	 */
	public Boolean sendSMS(String message) {
		// TODO - implement NotificationService.sendSMS
		throw new UnsupportedOperationException();
	}

}