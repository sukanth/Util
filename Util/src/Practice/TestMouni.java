package Practice;

import java.util.Scanner;

public class TestMouni {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
		int test = scan.nextInt();
		double testDouble = scan.nextDouble();
		scan.nextLine();
		String testString = scan.nextLine();
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back
		// and review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		int sumOfInt = test + i;
		System.out.println(sumOfInt);
		/* Print the sum of the double variables on a new line. */
		double sumOfDouble = d + testDouble;
		System.out.println(sumOfDouble);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.println(s.concat(testString));
	}

}