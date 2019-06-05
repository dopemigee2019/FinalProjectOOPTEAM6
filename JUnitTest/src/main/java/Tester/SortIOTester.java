package Tester;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.IIOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class SortIOTester {
	@Test
	public void sortWithNullsValidArray()  { // VALID ARRAY LIST
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(8));
	    integerList.add(Integer.valueOf(11));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortWithNulls(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test
	public void sortWithNullsFalseBoolean() { // TRUE BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(8));
	    integerList.add(null);
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortWithNulls(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test
	public void sortWithNullsTrueBoolean() { // FALSE BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
	    integerList.add(Integer.valueOf(9));
	    integerList.add(null);
	    integerList.add(Integer.valueOf(11));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortWithNulls(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test
	public void sortWithNullsEmpty() { // FALSE BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortWithNulls(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void sortWithNullsNullInp() { // FALSE BOOLEAN
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortWithNulls(null, true);
	}
	/*
	 * START OF SORT ARRAY LIST ASSENDING / DECENDING
	 */
	public void sortWithValidArray() { // VALID ARRAY LIST
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(8));
	    integerList.add(Integer.valueOf(11));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sort(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test (expected = NullPointerException.class)
	public void sortWithInvalidArray() { // INVALID ARRAY LIST
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(10));
	    integerList.add(null);
	    integerList.add(Integer.valueOf(11));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sort(integerList, true);
		
	}
	@Test
	public void sortWithEmptyArray() { // EMPTY ARRAY LIST
		List<Integer> integerList = new ArrayList<Integer>();
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sort(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test
	public void sortWithValidBoolean() { // VALID BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sort(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test
	public void sortWithFalseBoolean() { // INVALID BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(Integer.valueOf(1));
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(8));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sort(integerList, false);

		assertEquals(tester, integerList);
	}
	/*
	 * String Sort
	 */
	public void stringSortValidArray() { // VALID ARRAY LIST
		List<String> integerList = new ArrayList<String>();
		integerList.add("10");
	    integerList.add("9");
	    integerList.add("8");
	    integerList.add("11");
	    integerList.add("a");
	    integerList.add("b");
		List<String> tester = new ArrayList<String>();
		tester = SortIO.sort(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test (expected = NullPointerException.class)
	public void stringSortInvalidArray() { // INVALID ARRAY LIST
		List<String> integerList = new ArrayList<String>();
		integerList.add("10");
	    integerList.add("9");
	    integerList.add("8");
	    integerList.add(null);
	    integerList.add("a");
	    integerList.add("b");
		List<String> tester = new ArrayList<String>();
		tester = SortIO.sort(integerList, true);
		
	}
	@Test
	public void stringSortEmptyArray() { // EMPTY ARRAY LIST
		List<String> integerList = new ArrayList<String>();
		List<String> tester = new ArrayList<String>();
		tester = SortIO.sort(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test
	public void stringSortValidBoolean() { // VALID BOOLEAN
		List<String> integerList = new ArrayList<String>();
		List<String> tester = new ArrayList<String>();
		tester = SortIO.sort(integerList, true);

		assertEquals(tester, integerList);
	}
	@Test
	public void stringSortFalseBoolean() { // INVALID BOOLEAN
		List<String> integerList = new ArrayList<String>();
		integerList.add("10");
	    integerList.add("9");
	    integerList.add("8");
	    integerList.add("11");
	    integerList.add("a");
	    integerList.add("b");
		List<String> tester = new ArrayList<String>();
		tester = SortIO.sort(integerList, false);

		assertEquals(tester, integerList);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void stringSortNull() { // INVALID BOOLEAN
		List<String> tester = new ArrayList<String>();
		tester = SortIO.sort(null, false);
	}

	/*
	 * START OF SORT ALPHANUMERIC STRING
	 */
	@Test
	public void sortAlphaNumericValidInput() { // VALID INPUT
		String input = "bsb2a";
		String tester = "2abbs";
		input = SortIO.sortStringAlphaNumeric(input, true);
		assertEquals(input, tester);
	}
	@Test
	public void sortAlphaNumericSpecCharInput() { // INVALID INPUT
		String input = "bsb2@a";
		String tester = "2@abbs";
		input = SortIO.sortStringAlphaNumeric(input, true);
		assertEquals(input, tester);
	}
	@Test
	public void sortAlphaNumericEmptyInput() { // EMPTY INPUT
		String input = "";
		String tester = "";
		input = SortIO.sortStringAlphaNumeric(input, true);
		assertEquals(input, tester);
	}
	@Test
	public void sortAlphaNumericFalseBoolean() { // TRUE BOOLEAN
		String input = "bsb2a";
		String tester = "abbs2";
		input = SortIO.sortStringAlphaNumeric(input, false);
		assertEquals(input, tester);
	}
	@Test
	public void sorAlphaNumericTrueBoolean() { // FALSE BOOLEAN
		String input = "bsb2a";
		String tester = "2abbs";
		input = SortIO.sortStringAlphaNumeric(input, true);
		assertEquals(input, tester);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void sorAlphaNumericNull() { // FALSE BOOLEAN
		String input = null;
		String tester = "2abbs";
		input = SortIO.sortStringAlphaNumeric(input, true);
		assertEquals(input, tester);
	}
	/*
	 * Compare
	 */
	@Test
	public void stringPrioritizeValidArray() { // VALID ARRAY LIST
		List<Integer> integerList = new ArrayList<Integer>();
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(11));
	    integerList.add(Integer.valueOf(10));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortByPriority(integerList, false, 10);

		assertEquals(tester, integerList);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void stringPrioritizeInvalidArray() { // INVALID ARRAY LIST
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(8));
	    integerList.add(Integer.valueOf(11));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortByPriority(null, false, 1);
		
	}
	@Test
	public void stringPrioritizeEmptyArray() { // EMPTY ARRAY LIST
		List<Integer> integerList = new ArrayList<Integer>();
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortByPriority(integerList, false, 1);
		assertEquals(tester, integerList);
	}
	@Test
	public void stringPrioritizeValidBoolean() { // VALID BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(null);
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(8));
	    integerList.add(Integer.valueOf(11));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortByPriority(integerList, true, 1);
		assertEquals(tester, integerList);
	}
	@Test
	public void stringPrioritizeFalseBoolean() { // INVALID BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
	    integerList.add(Integer.valueOf(9));
	    integerList.add(Integer.valueOf(8));
	    integerList.add(Integer.valueOf(11));
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortByPriority(integerList, false, 1);
		assertEquals(tester, integerList);
		
		assertEquals(tester, integerList);
	}
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void stringPrioritizeNull() { // INVALID BOOLEAN
		List<Integer> integerList = new ArrayList<Integer>();
		List<Integer> tester = new ArrayList<Integer>();
		tester = SortIO.sortByPriority(null, false, 1);
	}

}
