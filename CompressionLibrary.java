package MasterLib;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CompressionLibrary {
	
	public static Path createTempFolder(String tempName){
		
		Path dirPath = Paths.get(System.getProperty("user.dir"));
		Path tempPath = null;
		try {
			tempPath = Files.createTempDirectory(dirPath, tempName);
		}
		catch(IOException a) {
			a.printStackTrace(); 
		}
		catch(UnsupportedOperationException b) {
			b.printStackTrace(); 
		}
		catch(SecurityException c) {
			c.printStackTrace(); 
		}
		catch(IllegalArgumentException d) {
			d.printStackTrace(); 
		}
		
		return tempPath;
	}
	
	public static void deleteTempFolder(Path toDelete) {
		
		try {
			if (toDelete != null) {
				toDelete.toFile().deleteOnExit(); //It's more efficient to delete the folder once the program closes.
			}
		} catch (SecurityException c) {
			c.printStackTrace();
		}
	}
	
	
}
