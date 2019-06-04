package MasterLib;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class CompressionLibrary {
	
	public static Path createTempFolder(String tempName){
		
		if (tempName == null) throw new IllegalArgumentException("Cannot be Null");
		
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
		
		if (toDelete == null) throw new IllegalArgumentException("Cannot be Null");
		
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
		
		if (readPath == null || tempPath == null) throw new IllegalArgumentException("Cannot be Null");
		
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
		
		if (tempPath == null || savePath == null || exportType == null) throw new IllegalArgumentException("Cannot be Null");
		
		boolean isComplete = false;
		
		if (exportType.length() != 3 || exportType.length() != 4) throw new IllegalArgumentException("Supports .jpg, .bmp, and .jpg");
			
			try {
				String namer = tempPath.toString() + "//tempForCompression.jpg";
				Path tempPather = Paths.get(namer);
				File input = tempPather.toFile();
				
				BufferedImage inkjet = ImageIO.read(input);
				BufferedImage copied = new BufferedImage(inkjet.getWidth(), inkjet.getHeight(), BufferedImage.TYPE_INT_RGB);
				
				String tempNamer = savePath.toString();
				Path pathFinder = Paths.get(tempNamer);
				File output = pathFinder.toFile();
				
				if(exportType.length() == 3) {
					
					ImageIO.write(copied, exportType, output);
					isComplete = true;
					input.delete();
					
				} else if (exportType.length() == 4) {

					String export = exportType.substring(0, 0) + exportType.substring(0+1);
					
					ImageIO.write(copied, export, output);
					isComplete = true;
					input.delete();
					
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
		
		
		return isComplete;
	}
	
	
	public static boolean compressImg(Path tempPath, double compressScale0_1, boolean isGreyScale) {
		
		if (tempPath == null) throw new IllegalArgumentException("Cannot be Null");
		
		boolean isComplete = false;
		
		if (compressScale0_1 <= 0 || compressScale0_1 > 1) throw new IllegalArgumentException("Must be a double between 1-0.");
			
			try {

				String tempNamer = tempPath.toString() + "//tempForCompression.jpg";
				Path tempPather = Paths.get(tempNamer);
				File imageLocation = tempPather.toFile();
				
				BufferedImage inkjet = ImageIO.read(imageLocation);
				
				int newWidth = (int) (inkjet.getWidth() * compressScale0_1);
				int newHeight = (int) (inkjet.getHeight() * compressScale0_1);
		
				BufferedImage copied = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
				
		        Graphics2D scaleDown = copied.createGraphics();
		        scaleDown.drawImage(inkjet, 0, 0, newWidth, newHeight, null);
		        scaleDown.dispose();
				
				if (isGreyScale) {
					for(int y = 0; y < newHeight; y++){
						  for(int x = 0; x < newWidth; x++){
							  
							  int pixel = copied.getRGB(x,y);
							  int red = (pixel >> 16)&0xff;
							  int green = (pixel >> 8)&0xff;
							  int blue = pixel&0xff;
							  
							  int average = (red + blue + green) / 3;
							  
							  pixel = (average << 24) | (average << 16) | (average << 8) | average;
							  copied.setRGB(x, y, pixel);
							  
						  }
					}
				}
				
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
		
		
		return isComplete;
	}
			
	
}
