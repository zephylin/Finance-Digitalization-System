import org.junit.jupiter.api.Test;
import java.sql.Date;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    void getDocuments_WithMockedDocument() {
        // Mock a Document
        Document mockDoc = mock(Document.class);
        when(mockDoc.getDocumentID()).thenReturn("MOCK_DOC_123");

        // Test Account (unimplemented method throws exception)
        Account account = new Account();
        assertThrows(UnsupportedOperationException.class, 
            () -> account.getDocuments(Date.valueOf("2023-01-01"), Date.valueOf("2023-12-31")));
    }
}