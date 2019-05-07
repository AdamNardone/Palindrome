package palindrome;

import java.util.Scanner;
/**
 * Adam Nardone, student no: 103547808
 * palindrome class contains two methods to test a string to see if it is a palindrome or mirrored string
 * @author nardo
 *
 */
public class palindrome {
	
	/**
	 * isPalindrome method takes a string arguement and returns true if it is a palindrome
	 * @param entry
	 * @return
	 */
	public static boolean isPalindrome(String entry) {
		String forward = entry;
		StringBuilder str= new StringBuilder(entry);
		str.reverse();
		String reverse = str.toString();
		
		if (forward.equals(reverse)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * isMirroredString method takes in a string argument and returns true if it is a mirrored string
	 * @param entry
	 * @return
	 */
	public static boolean isMirroredString(String entry) {
		char[] array = entry.toCharArray();
		String forward = entry;
		
		for(int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 'A':
				array[i] = 'A';
				break;
			case 'E':
				array[i] = '3';
				break;
			case '3':
				array[i] = 'E';
				break;
			case 'H':
				array[i] = 'H';
				break;
			case 'I':
				array[i] = 'I';
				break;
			case 'J':
				array[i] = 'L';
				break;
			case 'L':
				array[i] = 'J';
				break;
			case 'M':
				array[i] = 'M';
				break;
			case 'O':
				array[i] = 'O';
				break;
			case 'S':
				array[i] = '2';
				break;
			case '2':
				array[i] = 'S';
				break;
			case 'T':
				array[i] = 'T';
				break;
			case 'U':
				array[i] = 'U';
				break;
			case 'V':
				array[i] = 'V';
				break;
			case 'W':
				array[i] = 'W';
				break;
			case 'X':
				array[i] = 'X';
				break;
			case 'Y':
				array[i] = 'Y';
				break;
			case 'Z':
				array[i] = '5';
				break;
			case '5':
				array[i] = 'Z';
				break;
			case '1':
				array[i] = '1';
				break;
			case '8':
				array[i] = '8';
				break;
			
			default:
				return false;
			}
		}
		String temp = new String(array);
		StringBuilder str= new StringBuilder(temp);
		
		String reverse = str.reverse().toString();
		
		if (forward.equals(reverse)) {
			return true;
		}
		else {
			return false;
		}
	}		
		
}
