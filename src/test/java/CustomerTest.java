import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
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