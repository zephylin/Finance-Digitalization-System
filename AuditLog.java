public class AuditLog {

	private String logID;
	private Date timeStamp;
	private String action;
	private String userID;
	private String resourceType;
	private String resourceID;

	/**
	 * 
	 * @param customer
	 * @param document
	 */
	public void record(Customer customer, Document document) {
		// TODO - implement AuditLog.record
		throw new UnsupportedOperationException();
	}

	public void createLogEntry() {
		// TODO - implement AuditLog.createLogEntry
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @param format
	 */
	public byte[] exportLogs(Date startDate, Date endDate, String format) {
		// TODO - implement AuditLog.exportLogs
		throw new UnsupportedOperationException();
	}

}