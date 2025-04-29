import java.sql.Date;
import java.util.List;

public class Account {

	private String accountNumber;
	private String deliveryFrequency;
	private String customerName;
	private String accountType;
	private String status;

	public List<Account> linkAccounts() {
		// TODO - implement Account.linkAccounts
		throw new UnsupportedOperationException();
	}

	public List<Account> getAccountDetails() {
		// TODO - implement Account.getAccountDetails
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param last4SSN
	 */
	public Boolean validateAcount(int last4SSN) {
		// TODO - implement Account.validateAcount
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param startDate
	 * @param endDate
	 */
	public List<Document> getDocuments(Date startDate, Date endDate) {
		// TODO - implement Account.getDocuments
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fromTimestamp
	 */
	public List<Document> getNewDocuments(Date fromTimestamp) {
		// TODO - implement Account.getNewDocuments
		throw new UnsupportedOperationException();
	}

}
