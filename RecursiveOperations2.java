package lib;

import java.awt.Color;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class RecursiveOperations2 {

	/**
	 * Takes an int (num) and calculates its factorial product
	 * @param num - The number representing the inclusive upper limit of the factorial function
	 * @return The facotrial product of the supplied num value
	 * @exception Throws IllegalArgumentException if num is less than 0 or greater than 20
	 */
	public static long calcFactorial(int num) {
		if(num < 0 || num > 20) {
			throw new IllegalArgumentException("The num argument must be between 0 and 20 inclusive!");
		}
		long result = 1;
		if(num > 1) {
			result = num * calcFactorial(num-1);
		}
		return result;
	}
	
	/**
	 * Parses the input String to the int value the String represents
	 * @param input - The String to be parsed to an int
	 * @return the int value parsed from the String
	 * @exception IllegalArgumentException if input is null
	 * @exception NumberFormatException if input cannot be parsed to an int for ANY reason
	 */
	public static int parseInt(String input) {
		input = input.trim();
		if(input == null) {
			throw new IllegalArgumentException("User input cannot be null, please give valid input!");
		}
		if (input.matches("[A-Za-z]{1}")) {
		    throw new NumberFormatException("Input cannot contain letters!");
		}
	        System.out.println("String Before Conversion :  "+ input);
	        long output = stringToint(input);
	        System.out.println("");
	        System.out.println("");
	        System.out.println("int value as output "+ output);
	        System.out.println("");
		return (int) output;
	}
	private static long stringToint(String input){
        int i = 0, number = 0;
        boolean isNegative = false;
        if(input.charAt(0) == '-' ){
            isNegative = true;
            i = -1;
        }else {
        switch(input.charAt(0)) {
        case '1':
        	number = 1;
        	break;
        case '2':
        	number = 2;
        	break;
        case '3':
        	number = 3;
        	break;
        case '4':
        	number = 4;
        	break;
        case '5':
        	number = 5;
        	break;
        case '6':
        	number = 6;
        case '7':
        	number = 7;
        	break;
        case '8':
        	number = 8;
        	break;
        case '9':
        	number = 9;
        	break;
        }
        for(int i2 = 0; i2 < input.length()-1; i2++) {
        	number =  number * 10;
        }
        }
        if(isNegative && i == 1) {
        number = number * 10;
        }
        if(input.length() > 1) {
        	input = input.substring(1, input.length());
        	number += stringToint(input);
        }
        return number;
    }   
	
	/**
	 * Converts the non-negative num integer value to its representative binary String
	 * @param num - The integer to be converted to binary
	 * @return A String containing the characters "1" and "0" representing num's value in its binary form
	 * @exception IllegalArgumentException if num is less than 0
	 */
	public static String convertDecimalToBinary(int num) {
		if(num < 0 || num > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("The number given is not within the range from 0 to 255");
		}
		String Binary = "";
		
		
		Binary = "" + convertDecimaltoBinary(num);
		Binary = Binary.substring(1, 9);
		return Binary;
	}
	public static int convertDecimaltoBinary(int num) {
		int so = 0;
		if(num <= Integer.MAX_VALUE) {
			int newnum = num-255;
			so = 11111111;
		}
		if(num == 255) {
			so = 111111111;
			num = num-255;
		}else if(num == 0) {
			so = 100000000;
			return so;
		}else if(num >= 128) {
			so = 10000000;
			num = num-128;
		}else if(num >= 64) {
			so = 101000000;
			num = num-64;
		}else if(num >= 32) {
			so = 100100000;
			num = num-32;
		}else if(num >= 16) {
			so = 100010000;
			num = num-16;
		}else if(num >= 8) {
			so = 100001000;
			num = num-8;
		}else if(num >= 4) {
			so = 100000100;
			num = num-4;
		}else if(num >= 2) {
			so = 100000010;
			num = num-2;
		}else {
			so = 100000001;
			num = num-1;
		}
		return convertDecimaltoBinary(num)+so;
	}
	
	
	
	/**
	 * Uses the binary search algorithm to find a specific int within the array
	 * @param nums - The sorted array of ints to be searched
	 * @param key - The value to be found within the array
	 * @return The index of the value if found; -1 if the value is not found within the array
	 * @exception IllegalArgumentException if nums is null
	 */
	public static int binarySearch(int[] nums, int key) {
		if(nums == null) {
			throw new IllegalArgumentException("Nums cannot be null");
		}
		return binarySearch(nums, 0, nums.length - 1, key);
	}
	public static int binarySearch(int[] nums, int start, int end, int key) {
		if(nums == null) {
			throw new IllegalArgumentException("The nums array cannot be null!");
		}
		int middle = (start + end) / 2;
		if(end < start) {
			return -1;
		}
		if(key == nums[middle]) {
			return middle;
		}else if(key < nums[middle]) {
			binarySearch(nums, start, middle - 1, key);
		}else {
			binarySearch(nums, middle + 1, end, key);
		}
		System.out.println();
		return -1;
		
	}
	
	/**
	 * Given a source String and a specific substring, this method counts how many times the substring occurs
	 * within the source
	 * @param source - The String containing of content to be searched
	 * @param sub - The substring to be found within the source
	 * @return The total number of times the substring appears within the source
	 * @exception IllegalArgumentException if source or sub are null
	 */
	public static int countSubstringAppearances(String source, String sub) {
		int counter = 0;
		int match = 0;
		if(source == null || sub == null) {
			throw new IllegalArgumentException("Neither the source string or the sub string can be null!");
		}
		if(source.length() >= sub.length()) {
			char[] sourcechar = source.toCharArray();
			char[] subchar = sub.toCharArray();
			for(int i = 0; i < sub.length(); i++) {
				if(sourcechar[i] == subchar[i]) {
					match++;	
				}
			}
			if(match == sub.length()) {
				counter++;
			}
			source = source.substring(1, source.length());
			counter += countSubstringAppearances(source, sub);
		}else {
			counter = 0;
		}
		return counter;
	}
	
	/*
	 * @param input - the string composed of 1's and 0's
	 * @return ASCII - the string representing the converted input
	 * @exception Illegal Argument Exception - if the input string is empty the ASCII string will return 0
	 */
	public static String ConvertBinaryToASCII(String input) {
		String ASCII = "";
		char nextChar;
		String numRegex   = ".*[2-9].*";
		String alphaRegex = ".*[A-Z].*";
		
		if(input == null || input.isEmpty() || input.matches(numRegex) || input.matches(alphaRegex)) {
			throw new IllegalArgumentException("input cannot be empty nor can it be null!");
		}
		for(int i = 0; i <= input.length()-8; i += 9)
		{
		     nextChar = (char)Integer.parseInt(input.substring(i, i+8), 2);
		     ASCII += nextChar;
		}
		//System.out.println(ASCII);
		return ASCII;
	}
	
	/*
	 * @param input - the string composed of ASCII characters
	 * @return Binary - the string representing the converted ASCII characters
	 * @exception isEmpty - if the input string is empty the Binary string will be 0000 0000
	 */
	public static String ConvertASCIIToBinary(String input) {
		byte[] bytes = input.getBytes();  
        StringBuilder Binary = new StringBuilder();  
        for (byte b : bytes)  
        {  
           int value = b;  
           for (int i = 0; i < 8; i++)  
           {  
              Binary.append((value & 128) == 0 ? 0 : 1);  
              value <<= 1;  
           }  
          // binary.append(' ');  
        }  
       // System.out.println(Binary.toString());
        return Binary.toString();
	}

	/*
	 * @param input - the integer passed in
	 * @return anything - the array representing all the other bases
	 * @exception null - if the input is null the array will contain all 0's
	 */
	public static int Base10ToAnything(int input, int new_base) {
		int k = 0;
	    String result = "";
	    String output = "";
	    if(new_base < 2) {
	    	throw new IllegalArgumentException("base can be less than 2");
	    }else {
	    	if(input == 0) {
	    		result = String.valueOf(k);
	    	}
	       do { 
	        input /= new_base;   
	        k = input % new_base;
	        result += String.valueOf(k);
	       }while(input != 0);
	       
	       for(int i=result.length()-1; i>-1; i--) {
	        output += result.charAt(i);
	       }
	     //  System.out.println(Integer.parseInt(output));
	       return Integer.parseInt(output);
	    }
	}
	
	/*
	 * @param input - the double passed in
	 * @return base10 - the integer that is equal to the other bases
	 * @exception null - if the input is null, base10 will be 0
	 */
	public static long AnythingToBase10(String input, int base) {
		int value = 0;
		int power = 1;
		if(input.isEmpty() || input.equals(null)) {
			throw new IllegalArgumentException("input cannot be empty!");
		}
		if (base < 2) {
			value = -1;
			 return value;
		 }
		if(base >=2 || base <= 36) {

			    for (int i = input.length() - 1; i >= 0; i--) {
			        int digit = digitToValue(input.charAt(i));

			        if (digit < 0 || digit >= base) {
			        	return -1;
			        }

			        value += digit * power;
			        power = power * base;
			    }
		}
		System.out.println(value);
		return value;
		   
	}
	
	public static int digitToValue(char c) {
	    if (c >= '0' && c <= '9')
	        return (int) c - '0';
	    else
	        return (int) c - 'A' + 10;
	}
	/*
	 * @param input - the string composed of base 16
	 * @return rgb - the array of numbers representing r, g, and b
	 * @exception isEmpty - if the input is empty rgb will be the array of the color representation of white
	 */
	public static int[] ConvertStringToRGB(String input) {
		int r = 0, g = 0, b = 0;
		int[] hex = new int[3];
		if(input.equals(null) || input.isEmpty()) {
			throw new IllegalArgumentException("input cannot be null or empty");
		}
		if(input.matches("[A-Za-z]")) {
			input = "#"+input;
			Color.decode(input);
		}
		
		hex[0] = r;
		hex[1] = g;
		hex[2] = b;
		//System.out.println(hex);
		return hex;
		
	}
	
	/*
	 * @param input - the string composed of base 16
	 * @return rgb - the array of numbers representing a, r, g, and b
	 * @exception isEmpty - if the input is empty argb will be the array of the color representation of white
	 */
	public static int[] ConvertStringToARGB(String input) {
		int a = 0, r = 0, g = 0, b = 0;
		int[] hex = new int[4];
		if(input.equals(null) || input.isEmpty()) {
			throw new IllegalArgumentException("input cannot be null or empty");
		}
		if(input.matches("[A-Za-z]")) {
			input = "#"+input;
			Color.decode(input);
		}
		
		hex[0] = a;
		hex[1] = r;
		hex[2] = g;
		hex[3] = b;
		
		return hex;
	}
}
