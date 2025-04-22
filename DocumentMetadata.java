public class DocumentMetadata {

	private String metadataID;
	private String documentIID;
	private String title;
	private Date creationDate;
	private Date lastModifiedDate;
	private Date retentionDate;
	private String sourceSystem;

	/**
	 * 
	 * @param metadata
	 */
	public Boolean updateMetadata(metadataDTO metadata) {
		// TODO - implement DocumentMetadata.updateMetadata
		throw new UnsupportedOperationException();
	}

	public String getSearchableContent() {
		// TODO - implement DocumentMetadata.getSearchableContent
		throw new UnsupportedOperationException();
	}

	public Boolean validateRetentionCompliance() {
		// TODO - implement DocumentMetadata.validateRetentionCompliance
		throw new UnsupportedOperationException();
	}

}