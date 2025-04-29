import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    // Test if the Customer class has required fields
    @Test
    void customerClass_HasAttributes() throws NoSuchFieldException {
        Class<?> customerClass = Customer.class;
        assertNotNull(customerClass.getDeclaredField("cutomerID"));
        assertNotNull(customerClass.getDeclaredField("name"));
        assertNotNull(customerClass.getDeclaredField("last4SSN"));
    }
   
    @Test
    void register_ThrowsUnsupportedOperation() {
        Customer customer = new Customer();
        assertThrows(UnsupportedOperationException.class, customer::register);
    }

    @Test
    void getName_ThrowsUnsupportedOperation() {
        Customer customer = new Customer();
        assertThrows(UnsupportedOperationException.class, customer::getName);
    }
}