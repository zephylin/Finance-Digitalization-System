import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DocumentTest {
    @Test
    void viewDocument_ThrowsUnsupportedOperation() {
        Document doc = new Document();
        assertThrows(UnsupportedOperationException.class, () -> doc.viewDocument("PDF"));
    }

    @Test
    void downloadDocument_ThrowsUnsupportedOperation() {
        Document doc = new Document();
        assertThrows(UnsupportedOperationException.class, () -> doc.downloadDocument("PDF"));
    }
}