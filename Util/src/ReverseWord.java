
import java.util.Stack;
import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		System.out
				.println("This program reads a sentence from the user and prints the sentence with the characters of each word backwards:");
		// Ask user to enter a sentence
		System.out.print("Enter a sentence: ");
		Scanner scan = new Scanner(System.in);

		// Store the line entered by user in the variable userInput of type
		// String
		String userInput = scan.nextLine();

		// Split the string by space (" ") and store it into word array of they
		// String
		String word[] = userInput.split(" ");

		// store the total no. of word in the integer variable totalWord
		int totalWord = word.length;

		// for each word in the word[], reverse the character of word and print
		// it to console
		System.out.print("AFTER REVERSED:\t  ");
		for (int i = 0; i < totalWord; i++) {

			// calls a reverseTheWord() passing the word as parameter and stores
			// the result to reverseWord
			String reverseWord = reverseSubmittedWord(word[i]);

			System.out.print(reverseWord); // print the word, does not line
											// break

			// if it is not the last word, add the space to the sentence.
			if (i != totalWord - 1) {
				System.out.print(" ");

			}

		}
		System.out.println();
		System.out.println("***************************Thank You***********************************");

	}

	// Method that returns the word with its character reversed
	public static String reverseSubmittedWord(String wordAtPosition) {

		String punctuationMark = ".,:;?!";
		String last_letter = "";
		// create an empty String reverse
		String reverse = "";

		if (punctuationMark.contains(wordAtPosition.substring(wordAtPosition
				.length() - 1))) {
			last_letter = wordAtPosition.substring(wordAtPosition.length() - 1);
			wordAtPosition = wordAtPosition.replace(
					wordAtPosition.substring(wordAtPosition.length() - 1), "");
		}

		// instantiate a Stack of type Character.
		Stack<Character> stack = new Stack<Character>();

		// For each character in the word, put the character into the stack
		// variable of type Stack
		for (int i = 0; i < wordAtPosition.length(); i++) {
			stack.push(wordAtPosition.charAt(i));
		}

		// When we pop from the stack, the size of stack decreases.
		// Hence until the size of the stack is 0, we pop out from the stack and
		// append it to the variable reverse
		while (stack.size() != 0) {
			reverse += stack.pop();
		}

		reverse = reverse + last_letter;

		// return the reverse word
		return reverse.toString();

	}

}
 
