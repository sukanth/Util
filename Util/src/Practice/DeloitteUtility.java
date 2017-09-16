package Practice;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author sukanthgunda Deloitte Coding Assignment for Interview
 *
 */
public class DeloitteUtility {
	private static HashMap<String, String> encryptionCache = new HashMap<String, String>();
	private static HashMap<String, String> decryptionCache = new HashMap<String, String>();
	private static Scanner scanner;
	private static String result = null;
	private static String decryptedName = null;
	private static String encryptedName = null;
	public static void main(String[] args) {
		try {
			while (true) {
				System.out.println("********Please enter 1 for Encrypting , 2 for Decrypting , 0 to Terminate**********");
				scanner = new Scanner(System.in);
				int menuSelection = scanner.nextInt();
				switch (menuSelection) {
				case 1:
					System.out.println("***Please enter a name to Encrypt***");
					scanner = new Scanner(System.in);
					String nonEncryptedNameFromUser = scanner.next();
					result = encryptName(nonEncryptedNameFromUser);
					System.out.println("Result = " + result);
					break;
				case 2:
					System.out.println("***Please enter a name to Decrypt***");
					scanner = new Scanner(System.in);
					String encryptedNameFromUser = scanner.next();
					result = decryptName(encryptedNameFromUser);
					System.out.println("Result = " + result);
					break;
				case 0:
					System.out.println("Thank You!!");
					System.exit(0);
					break;
				default:
					System.out.println("Please enter an Integer Value");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went Wrong please enter a valid input");
		}

	}

	/**
	 * @author sukanthgunda
	 * @param encryptedName
	 * @return decryptedName Description : decrypts the name passed to the
	 *         method.
	 */
	private static String decryptName(String encryptedName) {
		try {
			System.out.println("Decrypting " + encryptedName);
			
			if (!decryptionCache.containsKey(encryptedName)) {
				String firstHalf = encryptedName.substring(0, encryptedName.length() / 2);
				String secondHalf = encryptedName.substring(encryptedName.length() / 2, encryptedName.length());
				decryptedName = secondHalf.concat(firstHalf);
				/*Conditional IF statement to check whether # exists in the string*/
				decryptedName = (decryptedName.contains("#") ? (decryptedName.substring(0, decryptedName.length() - 1))
						: decryptedName);
				System.out.println("Adding to Cache");
				/*Adding to cache*/
				decryptionCache.put(encryptedName, decryptedName);
				encryptionCache.put(decryptedName, encryptedName);
			} else {
				System.out.println(encryptedName + " found in cache");
				decryptedName = decryptionCache.get(encryptedName);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong in decryptName()");
		}
		return decryptedName;
	}

	/**
	 * @author sukanthgunda
	 * @param nonEncryptedName
	 * @return encryptedName Author : Sukanth Gunda Description : encrypts the
	 *         name passed to the method
	 */
	public static String encryptName(String nonEncryptedName) {
		try {
			System.out.println("Encrypting " + nonEncryptedName);

			if (!encryptionCache.containsKey(nonEncryptedName)) {
				String afterCheckingEvenOdd = null;
				int isOdd = ((nonEncryptedName.length()) % 2);
				/*Checking if the string is even / odd and adding # if its odd to make it even*/
				afterCheckingEvenOdd = (isOdd == 1) ? (afterCheckingEvenOdd = nonEncryptedName.concat("#"))
						: (afterCheckingEvenOdd = nonEncryptedName);
				String firstHalf = afterCheckingEvenOdd.substring(0, afterCheckingEvenOdd.length() / 2);
				String secondHalf = afterCheckingEvenOdd.substring(afterCheckingEvenOdd.length() / 2,
						afterCheckingEvenOdd.length());
				encryptedName = secondHalf.concat(firstHalf);
				System.out.println("Adding to Cache");
				encryptionCache.put(nonEncryptedName, encryptedName);
				decryptionCache.put(encryptedName, nonEncryptedName);
			} else {
				System.out.println(nonEncryptedName + " found in cache");
				encryptedName = encryptionCache.get(nonEncryptedName);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong in encryptName()");
		}
		return encryptedName;
	}
}
