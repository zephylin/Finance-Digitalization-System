import java.util.List;

public class Customer {

	private String cutomerID;
	private String name;
	private String last4SSN;
	private String email;
	private String phone;
	private Boolean isActive;

	public Boolean register() {
		// TODO - implement Customer.register
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param last4SSN
	 */
	public Boolean validateIdentity(String last4SSN) {
		// TODO - implement Customer.validateIdentity
		throw new UnsupportedOperationException();
	}

	public List<Account> getAccounts() {
		// TODO - implement Customer.getAccounts
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerData
	 */
	public Boolean updateProfile(String customerData) {
		// TODO - implement Customer.updateProfile
		throw new UnsupportedOperationException();
	}

    public Object getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    public Object getEmail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmail'");
    }

    public void setActive(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setActive'");
    }

}
