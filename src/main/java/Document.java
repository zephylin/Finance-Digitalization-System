import java.io.File;
import java.util.Date;
import java.util.List;

public class Document {

	private String documentID;
	private String type;
	private String accountNumber;
	private Date date;
	private String status;
	private String viewDocumentFormat;
	private String downloadDocumentFormat;

	public List<Document> getMetadata() {
		// TODO - implement Document.getMetadata
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param format
	 */
	public File viewDocument(String format) {
		// TODO - implement Document.viewDocument
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param format
	 */
	public File downloadDocument(String format) {
		// TODO - implement Document.downloadDocument
		throw new UnsupportedOperationException();
	}

}
