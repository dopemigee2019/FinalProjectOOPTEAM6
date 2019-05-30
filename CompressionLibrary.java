package MasterLib;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

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
	
	public static boolean deleteTempFolder(Path toDelete) {
		
		boolean isComplete = false;
		try {
			if (toDelete != null) {
				toDelete.toFile().deleteOnExit(); //It's more efficient to delete the folder once the program closes.
				isComplete = true;
			}
		} catch (SecurityException c) {
			c.printStackTrace();
			isComplete = false;
		}
		
		return isComplete;
	}
	
	public static boolean importImgToJPG(Path readPath, Path tempPath) {
		
		boolean isComplete = false;
		try {
			File input = readPath.toFile();
			BufferedImage inkjet = ImageIO.read(input);
			BufferedImage copied = new BufferedImage(inkjet.getWidth(), inkjet.getHeight(), BufferedImage.TYPE_INT_RGB);
			copied.createGraphics().drawImage(inkjet, 0, 0, Color.WHITE, null);
			
			String tempNamer = tempPath.toString() + "tempForCompression.jpg";
			Path tempPather = Paths.get(tempNamer);
			File output = tempPather.toFile();
			
			ImageIO.write(copied, "jpg", output);
			
			isComplete = true;
		}
		catch (IOException a) {
			a.printStackTrace();
			isComplete = false;
		}
		
		return isComplete;
	}
			
	
}
