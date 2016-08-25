import java.util.Scanner;

/*
 * Author : Sukanth Gunda.
 * Description : This program takes two strings as input from the user and returns the greatest common prefix .
 */
@SuppressWarnings("resource")
public class LargestPrfix {
   
    public static String greatestCommonPrefix(String a, String b) {
	    int minLength = Math.min(a.length(), b.length());
	    for (int i = 0; i < minLength; i++) {
	        if (a.charAt(i) != b.charAt(i)) {
	            return a.substring(0, i);
	        }
	    }
	    return a.substring(0, minLength);
	}
    
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter the first String :");
	Scanner scanner= new Scanner(System.in);
	 String firstString= scanner.nextLine();
	 System.out.println("Enter second String :");
	 String secondString= scanner.nextLine();
	 String greatestCommonPrfix = greatestCommonPrefix(firstString,secondString);
	 System.out.println("The Common Prefix is :" +greatestCommonPrfix);
    }

}
