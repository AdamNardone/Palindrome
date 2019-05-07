package palindrome;

import java.util.Scanner;

public class palindromeTester {
	
public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("how many strings would you like to test?");
		int i = sc.nextInt();
		String[] myArray = new String[i];
		
		while(i>0) {
			i--;
		System.out.println("Enter a string: ");
		myArray[i] = sc.next();
		
		}
		
		for (int j = myArray.length -1; j >= 0; j--) {
			
			if (palindrome.isPalindrome(myArray[j]) == true) {
				if(palindrome.isMirroredString(myArray[j]) == true) {
					System.out.println(myArray[j] + " is a mirrored palindrome");
				}
				else {
					System.out.println(myArray[j] + " is a regular palindrome");
				}
			}
			else if(palindrome.isMirroredString(myArray[j]) == true) {
				System.out.println(myArray[j] + " is mirrored string");
			}
			else {
				System.out.println(myArray[j] + " is not palindrome");		
			}
		}
	}
}