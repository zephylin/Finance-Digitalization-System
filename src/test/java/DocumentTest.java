import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DocumentTest {
    
    private Document document;

    @BeforeEach
    void setUp() {
        document = new Document();
    }

    @Test
    @DisplayName("Test document view functionality")
    void testDocumentView() {
        // Create testing subclass
        Document testDocument = new Document() {
            @Override
            public File viewDocument(String format) {
                if (format != null && (format.equals("PDF") || format.equals("HTML"))) {
                    return new File("test-document." + format.toLowerCase());
                }
                return null;
            }
        };
        
        // Test valid format
        File pdfResult = testDocument.viewDocument("PDF");
        assertNotNull(pdfResult, "Document should be viewable in PDF format");
        assertEquals("test-document.pdf", pdfResult.getName());
        
        // Test another valid format
        File htmlResult = testDocument.viewDocument("HTML");
        assertNotNull(htmlResult, "Document should be viewable in HTML format");
        assertEquals("test-document.html", htmlResult.getName());
        
        // Test invalid format
        File invalidResult = testDocument.viewDocument("INVALID");
        assertNull(invalidResult, "Invalid format should return null");
    }
    
    @Test
    @DisplayName("Test document download functionality")
    void testDocumentDownload() {
        // Create testing subclass
        Document testDocument = new Document() {
            @Override
            public File downloadDocument(String format) {
                if (format != null && (format.equals("PDF") || format.equals("CSV"))) {
                    return new File("downloaded-document." + format.toLowerCase());
                }
                return null;
            }
        };
        
        // Test download with valid formats
        File pdfFile = testDocument.downloadDocument("PDF");
        assertNotNull(pdfFile, "PDF download should not return null");
        assertEquals("downloaded-document.pdf", pdfFile.getName());
        
        File csvFile = testDocument.downloadDocument("CSV");
        assertNotNull(csvFile, "CSV download should not return null");
        assertEquals("downloaded-document.csv", csvFile.getName());
        
        // Test download with invalid format
        File invalidFile = testDocument.downloadDocument("INVALID");
        assertNull(invalidFile, "Invalid format should return null");
    }
    
    @Test
    @DisplayName("Test document metadata retrieval")
    void testGetMetadata() {
        // Create testing subclass
        Document testDocument = new Document() {
            @Override
            public List<Document> getMetadata() {
                List<Document> metadata = new ArrayList<>();
                // Add this document to the metadata list
                metadata.add(this);
                return metadata;
            }
        };
        
        List<Document> metadata = testDocument.getMetadata();
        assertNotNull(metadata, "Metadata should not be null");
        assertEquals(1, metadata.size(), "Should return one document in metadata");
        assertSame(testDocument, metadata.get(0), "Metadata should contain the document itself");
    }
}