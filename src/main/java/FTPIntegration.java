import java.util.Date;
import java.util.List;

public class FTPIntegration {

	private String ftpServer;
	private String username;
	private String password;
	private String remotePath;
	private String localPath;
	private Date lastSyncTimestamp;

	public Boolean connectToFTP() {
		// TODO - implement FTPIntegration.connectToFTP
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param remoteDirectory
	 */
	public List<String> downloadFiles(String remoteDirectory) {
		// TODO - implement FTPIntegration.downloadFiles
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param frequency
	 */
	public Boolean scheduleSync(String frequency) {
		// TODO - implement FTPIntegration.scheduleSync
		throw new UnsupportedOperationException();
	}

}
