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
			
			String tempNamer = tempPath.toString() + "//tempForCompression.jpg";
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
	
	public static boolean exportImg(Path tempPath, Path savePath, String exportType) {
		
		boolean isComplete = false;
		
		if (exportType.length() == 3 || exportType.length() == 4) {
			
			try {
				File input = tempPath.toFile();
				BufferedImage inkjet = ImageIO.read(input);
				BufferedImage copied = new BufferedImage(inkjet.getWidth(), inkjet.getHeight(), BufferedImage.TYPE_INT_RGB);
				
				String tempNamer = savePath.toString();
				Path pathFinder = Paths.get(tempNamer);
				File output = pathFinder.toFile();
				
				if(exportType.length() == 3) {
					
					ImageIO.write(copied, exportType, output);
					isComplete = true;
					
				} else if (exportType.length() == 4) {

					String export = exportType.substring(0, 0) + exportType.substring(0+1);
					
					ImageIO.write(copied, export, output);
					isComplete = true;
				}
			}
			catch (IOException a ) {
				a.printStackTrace();
				isComplete = false;
			}
			catch (SecurityException b) {
				b.printStackTrace();
				isComplete =false;
			}
		}
		
		return isComplete;
	}
	
	
	public static boolean compressImg(Path tempPath, double compressScale0_1, boolean isGreyScale) {
		
		boolean isComplete = false;
		
		if (compressScale0_1 > 0 || compressScale0_1 <= 1) {
			
			try {

				String tempNamer = tempPath.toString() + "//tempForCompression.jpg";
				Path tempPather = Paths.get(tempNamer);
				File imageLocation = tempPather.toFile();
				
				BufferedImage inkjet = ImageIO.read(imageLocation);
				
				int newWidth = (int) (inkjet.getWidth() * compressScale0_1);
				int newHeight = (int) (inkjet.getHeight() * compressScale0_1);
				
				if (isGreyScale) {
					//TODO GreyScaling Code goes Here
				}
				
				BufferedImage copied = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
				
				File output = imageLocation;
				ImageIO.write(copied, "jpg", output);
				isComplete = true;
			}
			catch (IOException a) {
				a.printStackTrace();
				isComplete = false;
				
			}
			catch (IllegalStateException b) {
				b.printStackTrace();
				isComplete = false;
			}
			catch (SecurityException c) {
				c.printStackTrace();
				isComplete = false;
			}
		}
		
		return isComplete;
	}
			
	
}
