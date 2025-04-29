import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DocumentTest {
    // Test if Document has expected fields
    @Test
    void documentClass_HasAttributes() throws NoSuchFieldException {
        Class<?> docClass = Document.class;
        assertNotNull(docClass.getDeclaredField("documentID"));
        assertNotNull(docClass.getDeclaredField("type"));
    }
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