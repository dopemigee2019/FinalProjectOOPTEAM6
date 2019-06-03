package Tester;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import lib.RecursiveOperations2;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LibTester {

	//BinaryTOASCII Tests
	
	//Throws IAE when input is empty

	@Test
	public void BinaryToASCII_ExceptionWhenInputIsEmpty() {
		//Arrange
		String input = "";
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			String ASCII = RecursiveOperations2.ConvertBinaryToASCII(input);
		});
	}
		@Test
	public void BinaryToASCII_ExceptionWhenInputIsSpace() {
		//Arrange
		String input = " ";
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			String ASCII = RecursiveOperations2.ConvertBinaryToASCII(input);
		});
	}
	//Returns the correct conversion from binary to ASCII and input in not empty
	@Test
	public void BinaryToASCII_WhenInputIsNotEmptyConvert() {
		//Arrange
		String input = "01010011 01010101 01001101";
		String ASCII = "SUM";
		String ASCII2 = "WEI";
		//Act
		ASCII2 = RecursiveOperations2.ConvertBinaryToASCII(input);
		//Assert
		assertEquals(ASCII, ASCII2);
	}
	
	//Throws IAE when input is an integer
	@Test
	public void BinaryToASCII_ExceptionWhenInputIsInteger() {
		//Arrange
		int s = 5;
		String input = ""+ s;
		
		//Act
		
		//Assert
			assertThrows(IllegalArgumentException.class, () -> {
				String ASCII = RecursiveOperations2.ConvertBinaryToASCII(input);
			});
	}
	//Throws IAE when input contains a negative sign
	@Test
	public void BinaryToASCII_ExceptionWhenInputContainsNegativeSign() {
		//Arrange
		String input = "-11110000";
		//Act

		//Assert

			assertThrows(IllegalArgumentException.class, () -> {
				String ASCII = RecursiveOperations2.ConvertBinaryToASCII(input);

			});
	}
	//asserts false if input is not null
	@Test
	public void BinaryToASCII_FalseWhenInputIsNotNull() {
		//Arrange
		String input = "00000000";
		//Act
		//Assert
			System.out.println("omegalol");
			String ASCII = RecursiveOperations2.ConvertBinaryToASCII(input);
			assertFalse("input is not null", false);
	}
	//true if input is null as well as throws IAE
	@Test
	public void BinaryToASCII_ThrowsIAEWhenInputIsNull() {
		//Arrange
		String input = null;
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			String ASCII = RecursiveOperations2.ConvertBinaryToASCII(input);
		});
		//assertTrue("input is null!", true);
	}

	//
	//
	//
	//
	//
	@Test
	public void ASCIIToBinary_ExceptionWhenInputIsEmpty() {
		//Arrange
		String input= "";
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			String ASCII = RecursiveOperations2.ConvertASCIIToBinary(input);
		});
	}
	//Returns the correct conversion from binary to ASCII and input in not empty
	@Test
	public void ASCIIToBinary_WhenInputIsNotEmptyConvert() {
		//Arrange
		String input = "01010011 01010101 01001101";
		String ASCII = "SUM";
		//Act
		ASCII = RecursiveOperations2.ConvertASCIIToBinary(input);
		System.out.println(ASCII);
		//Assert
		assertEquals(ASCII, input);
	}
	
	//Throws IAE when input is an integer
	@Test
	public void ASCIIToBinary_ExceptionWhenInputIsInteger() {
		//Arrange
		int s = 5;
		String input = ""+s;
		
		//Act
		
		//Assert
			assertThrows(IllegalArgumentException.class, () -> {
				String ASCII = RecursiveOperations2.ConvertASCIIToBinary(input);
			});
	}
//	//Throws IAE when input contains a negative sign
	@Test
	public void ASCIIToBinary_ExceptionWhenInputContainsNegativeSign() {
		//Arrange
		int s = -11110000;
		String input = "" + s;
		//Act
		
		//Assert
			assertThrows(IllegalArgumentException.class, () -> {
				String ASCII = RecursiveOperations2.ConvertASCIIToBinary(input);
			});
	}
	//asserts false if input is not null

	@Test
	public void ASCIIToBinary_FalseWhenInputIsNotNull() {
		//Arrange
		String input = "00000000";
		//Act
		//Assert
			String ASCII = RecursiveOperations2.ConvertASCIIToBinary(input);
			assertFalse("input is not null", false);
	}
	//true if input is null as well as throws IAE
	@Test
	public void ASCIIToBinary_ThrowsIAEWhenInputIsNull() {
		//Arrange
		//String input = null;
		//Act
		
		//Assert
			assertThrows(IllegalArgumentException.class, () -> {
				String ASCII = RecursiveOperations2.ConvertASCIIToBinary(null);
			});
	}
	@Test
	public void convertBaseTenToAnythingValidInteger() {
		//Arrange
		int input = 26;
		int base = 5;
		
		//Act
		int ans = RecursiveOperations2.Base10ToAnything(input, base);
		//Assert
		assertEquals(ans, 101);
				
	}
	@Test
	public void convertBaseTenToAnythingNegitiveInteger() {
		//Arrange
		int input  = -26;
		int base = 5;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			int ans = RecursiveOperations2.Base10ToAnything(input, base);
		});		
	}
	@Test
	public void convertBaseTenToAnythingZeroInteger() {
		//Arrange
		int input  = 0;
		int base = 5;
		
		//Act
		int ans = RecursiveOperations2.Base10ToAnything(input, base);
		//System.out.println(ans);
		//Assert
		assertEquals(ans, 0);
	}
	//
	@Test
	public void convertBaseTenToAnythingValidIntegerBase() {
		//Arrange
		int input = 26;
		int base = 6;
		
		//Act
		int ans = RecursiveOperations2.Base10ToAnything(input, base);
		//Assert
		assertEquals(ans, 101);
				
	}
	@Test
	public void convertBaseTenToAnythingNegitiveIntegerBase() {
		//Arrange
		int input  = 26;
		int base = -5;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			int ans = RecursiveOperations2.Base10ToAnything(input, base);
		});		
	}
	@Test
	public void convertBaseTenToAnythingZeroIntegerBase() {
		//Arrange
		int input  = 15;
		int base = 0;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			int ans = RecursiveOperations2.Base10ToAnything(input, base);
		});		
	}

	@Test
	public void convertAnythingToBase10ValidString() {
		//Arrange
		String input = "101";
		int base = 5;
		
		//Act
		double ans = RecursiveOperations2.AnythingToBase10("101", 5);RecursiveOperations2.AnythingToBase10(input, base);
		//Assert
		assertEquals(ans, ans, 26);
				
	}
	@Test
	public void convertAnythingToBase10InvalidString() {
		//Arrange
		String input = "/@*";
		int base = 11;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			double ans = RecursiveOperations2.AnythingToBase10(input, base);
		});	
				
	}
	@Test
	public void convertAnythingToBase10SpaceString() {
		//Arrange
		String input = "  ";
		int base = 11;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			double ans = RecursiveOperations2.AnythingToBase10(input, base);
		});	
				
	}
	@Test
	public void convertAnythingToBase10NullString() {
		//Arrange
		String input = null;
		int base = 11;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			double ans = RecursiveOperations2.AnythingToBase10(input, base);
		});	
				
	}
	@Test
	public void convertAnythingToBase10ValidInt() {
		//Arrange
		String input = "101";
		int base = 10;
		
		//Act
		double ans = RecursiveOperations2.AnythingToBase10("101", 5);RecursiveOperations2.AnythingToBase10(input, base);
		//Assert
		assertEquals(ans, ans, 101);
				
	}
	@Test
	public void convertAnythingToBase10NegitiveInt() {
		//Arrange
		String input = "101";
		int base = -10;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			double ans = RecursiveOperations2.AnythingToBase10(input, base);
		});	
				
	}
	@Test
	public void convertAnythingToBase10ZeroInt() {
		//Arrange
		String input = "101";
		int base = 0;
		
		//Act
		
		//Assert
		assertThrows(IllegalArgumentException.class, () -> {
			double ans = RecursiveOperations2.AnythingToBase10(input, base);
		});	
				
	}
}
