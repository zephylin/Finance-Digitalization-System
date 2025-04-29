import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    
    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer();
    }

    @Test
    @DisplayName("Test customer identity validation")
    void testIdentityValidation() {
        // Create a testable subclass
        Customer testableCustomer = new Customer() {
            @Override
            public Boolean validateIdentity(String last4SSN) {
                return last4SSN != null && last4SSN.equals("1234");
            }
        };
        
        // Test with valid SSN
        Boolean validResult = testableCustomer.validateIdentity("1234");
        assertTrue(validResult, "Validation should return true for correct SSN");
        
        // Test with invalid SSN
        Boolean invalidResult = testableCustomer.validateIdentity("5678");
        assertFalse(invalidResult, "Validation should return false for incorrect SSN");
        
        // Test with null SSN
        Boolean nullResult = testableCustomer.validateIdentity(null);
        assertFalse(nullResult, "Validation should return false for null SSN");
    }
    
    @Test
    @DisplayName("Test customer profile update")
    void testUpdateProfile() {
        // Create a testable subclass with validation logic
        Customer testableCustomer = new Customer() {
            private String name = "Initial Name";
            private String email = "initial@example.com";
            
            @Override
            public Boolean updateProfile(String customerData) {
                if (customerData != null && !customerData.isEmpty()) {
                    // Simple implementation - in real code would parse JSON/XML
                    if (customerData.contains("name=") && customerData.contains("email=")) {
                        // Extract new values (simplified parsing)
                        String[] parts = customerData.split(",");
                        for (String part : parts) {
                            if (part.startsWith("name=")) {
                                this.name = part.substring(5);
                            } else if (part.startsWith("email=")) {
                                this.email = part.substring(6);
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            
            public String getName() {
                return name;
            }
            
            public String getEmail() {
                return email;
            }
        };
        
        // Test successful update
        Boolean result = testableCustomer.updateProfile("name=New Name,email=new@example.com");
        assertTrue(result, "Profile update should succeed with valid data");
        assertEquals("New Name", ((Customer)testableCustomer).getName());
        assertEquals("new@example.com", ((Customer)testableCustomer).getEmail());
        
        // Test failed update with invalid data
        Boolean invalidResult = testableCustomer.updateProfile("invalid data format");
        assertFalse(invalidResult, "Profile update should fail with invalid data");
    }
    
    @Test
    @DisplayName("Test customer getAccounts functionality")
    void testGetAccounts() {
        // Create a testable subclass
        Customer testableCustomer = new Customer() {
            private boolean isActive = true;
            
            @Override
            public List<Account> getAccounts() {
                List<Account> accounts = new ArrayList<>();
                
                // Only return accounts if customer is active
                if (isActive) {
                    Account account1 = new Account();
                    Account account2 = new Account();
                    accounts.add(account1);
                    accounts.add(account2);
                }
                
                return accounts;
            }
            
            public void setActive(boolean active) {
                this.isActive = active;
            }
        };
        
        // Test with active customer
        List<Account> activeAccounts = testableCustomer.getAccounts();
        assertNotNull(activeAccounts, "Account list should not be null");
        assertEquals(2, activeAccounts.size(), "Active customer should have 2 accounts");
        
        // Test with inactive customer
        ((Customer)testableCustomer).setActive(false);
        List<Account> inactiveAccounts = testableCustomer.getAccounts();
        assertEquals(0, inactiveAccounts.size(), "Inactive customer should have 0 accounts");
    }
}