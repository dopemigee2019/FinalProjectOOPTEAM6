package Tester;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CompressionTest {
	@Test
	public void compression() {
		Path a = Paths.get(System.getProperty("user.dir"),"bg.png");
		Path b = Paths.get(System.getProperty("user.dir"));
		Compression.importImgToJPG(a, b);
		File file = new File(System.getProperty("user.dir"), "tempForCompression.jpg");
		

		assertTrue(file.exists());
	}
}
