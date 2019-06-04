package Tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.IIOException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CompressionTest {
	@Test
	public void toJpegValidPaths() { //Valid dir
		Path a = Paths.get(System.getProperty("user.dir"),"bg.png");
		Path b = Paths.get(System.getProperty("user.dir"));
		
		Compression.importImgToJPG(a, b);
		
		File file = new File(System.getProperty("user.dir"), "tempForCompression.jpg");

		assertTrue(file.exists());
	}
	@Test(expected = IIOException.class)
	public void toJpegInalidPaths() throws IOException {
		try {
			Path a = Paths.get(System.getProperty("as"),"bg.png");
			Path b = Paths.get(System.getProperty("user.dir"));
			
			Compression.importImgToJPG(a, b);
			
			File file = new File(System.getProperty("user.dir"), "tempForCompression.jpg");
		} catch (FileNotFoundException e) {
			fail();
		}
	}
	
	/////////////////////////////////
	@Test
	public void tempPathValid() { //Valid dir
		Compression.createTempFolder("yes");
		
		File file = new File(System.getProperty("user.dir"), "//yes");

		assertTrue(file.exists());
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void tempPathInvalid2() throws IOException {
		Compression.createTempFolder(null);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void tempPathInvalid3() throws IOException {
		Compression.createTempFolder("");
	}
	////////////////////////////////
	@Test
	public void delTempPathValid() { //Valid dir
		Compression.createTempFolder("yes");
		
		File file = new File(System.getProperty("user.dir"), "//yes");

		assertTrue(file.exists());
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void delTempPathInvalid2() throws IOException {
		Compression.deleteTempFolder(null);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void delTempPathInvalid3() throws IOException {
		Path b = Paths.get(System.getProperty("user.dir"),"ThisShouldntBeHere");
		Compression.deleteTempFolder(b);
	}
	///////////////////////////////
	@Test
	public void CompressValid() { //Valid dir
		Path a = Paths.get(System.getProperty("user.dir"),"bg.png");
		Compression.compressImg(a, .1, false);
		
		File file = new File(System.getProperty("user.dir"), "tempForCompression.jpg");

		assertTrue(file.exists());
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void compressInvalid2() throws IOException {
		Path a = null;
		Compression.compressImg(a, .1, false);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void compressInvalid3() throws IOException {
		Path a = Paths.get("");
		Compression.compressImg(a, .1, false);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void compressInvalid4() throws IOException {
		Path b = Paths.get(System.getProperty("user.dir"),"ThisShouldntBeHere");
		Compression.compressImg(b, .1, false);
	}
	///////////////////////////////////////////////////
	@Test
	public void importValid() { //Valid dir
		Path a = Paths.get(System.getProperty("user.dir"),"bg.png");
		Compression.importImgToJPG(a, Compression.createTempFolder("temp"));
}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void importInvalid2() throws IOException {
		Path a = null;
		Compression.importImgToJPG(a, Compression.createTempFolder("temp"));
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void importInvalid3() throws IOException {
		Path a = Paths.get("");
		Compression.importImgToJPG(a, Compression.createTempFolder("temp"));
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void importInvalid4() throws IOException {
		Path b = Paths.get(System.getProperty("user.dir"),"ThisShouldntBeHere");
		Compression.importImgToJPG(b, Compression.createTempFolder("temp"));
	}
	//////////////////////////////////////////////////////
	@Test
	public void exportValid() { //Valid dir
		Path a = Paths.get(System.getProperty("user.dir"),"bg.png");
		Path b = Paths.get(System.getProperty("user.dir"));
		Compression.exportImg(a, b, ".jpg");
}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void exportInvalid2() throws IOException {
		Path a = null;
		Compression.exportImg(null, a, ".jpg");
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void exportInvalid3() throws IOException {
		Path a = Paths.get("");
		Compression.exportImg(a, null, ".jpg");
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void exportInvalid4() throws IOException {
		Path b = Paths.get(System.getProperty("user.dir"),"ThisShouldntBeHere");
		Compression.exportImg(b, b, ".jpg");
	}
}
