package MasterLib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortIO {
	
	public static<T extends Comparable> List<T> sortWithNulls(List<T> input, boolean nullIsLow) {
		
		if (input == null) throw new IllegalArgumentException("Cannot be Null");
		
			if (nullIsLow) {
				input.sort(Comparator.nullsFirst(T::compareTo));
				
			}else if (!nullIsLow) {
				input.sort(Comparator.nullsLast(T::compareTo));
				
			}

		return input;
	}
	
	public static<T extends Comparable> List<T> sort(List<T> input, boolean isAscending) {
		
		if (input == null) throw new IllegalArgumentException("Cannot be Null");
			
			if (isAscending) {
				input.sort(Comparator.naturalOrder());
				
			}else if (!isAscending ){
				input.sort(Comparator.naturalOrder());
				Collections.sort(input, Collections.reverseOrder());
				
			}
			
		return input;
	}
	
	public static String sortStringAlphaNumeric(String input, boolean abc123IsLow) {
		String output = input;
		
		if (abc123IsLow) {
			try {
				char[] sortArray = input.toCharArray();
				Arrays.sort(sortArray);
				output = new String(sortArray);
			}
			catch(NullPointerException a) {
				a.printStackTrace();
			}
		} else if (!abc123IsLow) {
			try {
				char[] sortArray = input.toCharArray();
				Arrays.sort(sortArray);
				Collections.sort(Arrays.asList(sortArray), Collections.reverseOrder());
				output = new String (sortArray);
			}
			catch(NullPointerException a) {
				a.printStackTrace();
			}
		}
		
		return output;
	}
	
	public static ArrayList<String> sortStringsByLength(ArrayList<String> input, boolean lengthIsLow){
		ArrayList<String> output = input;
		
		if (lengthIsLow) {
			try {
				Collections.sort(input, Comparator.comparing(String::length));
				output = input;
				}
			catch (NullPointerException a) {
				a.printStackTrace();
			}
		} else if (!lengthIsLow) {
			try {
				Collections.sort(input, Comparator.comparing(String::length));
				Collections.sort(input, Collections.reverseOrder());
				}
			catch (NullPointerException a) {
				a.printStackTrace();
			}
		}
		
		return output;
	}
	
	public static<T extends Comparable> List<T> sortByPriority(List<T> input, boolean priorityIsLow, T IPrioritize){
		
		if (input == null) throw new IllegalArgumentException("Cannot be Null");
		
			if (priorityIsLow) {
				IPrioritize.compareTo(IPrioritize);
			
			}else if (!priorityIsLow) {
				IPrioritize.compareTo(IPrioritize);
				Collections.sort(input, Collections.reverseOrder());
			
			}

		return null;
	}

}
