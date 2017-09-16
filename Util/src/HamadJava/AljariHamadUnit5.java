package HamadJava;

import java.util.Random;
import java.util.Scanner;

public class AljariHamadUnit5 {
	/*************************************
	 * Author : Hamad Aljari Description : Assignment - 5 FileName :
	 * AljariHamadUnit5.Java
	 *************************************/
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner;
		Random random;
		int round = 0;  
		int rand = 0;
		int randPowRound = 0;
		int modulus;
		double randByRound;
		String newLine = System.getProperty("line.separator");
		StringBuffer buffer = new StringBuffer();
		scanner = new Scanner(System.in);
		System.out.println("Please enter maximun Random number to be used (2-8): ");
		String maxRandNumberString = scanner.next();
		int maxRandNumberInteger = Integer.parseInt(maxRandNumberString);
		if (!(maxRandNumberInteger >= 2 && maxRandNumberInteger <= 8)) {
			System.out.println("Random larger than 8 entered, using max number of 8");
			System.out.println(newLine);
			maxRandNumberInteger = 8;
		}
		System.out.println("Please enter the number of rounds (1-8) : ");
		int noOfRoundsInteger = scanner.nextInt();
		if (!(noOfRoundsInteger >= 1 && noOfRoundsInteger <= 8)) {
			System.out.println("Rounds larger than 8 entered , using max number of 8");
			System.out.println(newLine);
			noOfRoundsInteger = 8;
		}
		for (int i = 1; i <= noOfRoundsInteger; i++) {
			random = new Random();
			rand = random.nextInt(maxRandNumberInteger); // Generating the random number for each iteration
			/*calculating values to display start*/
			round = i;
			randPowRound = (int) Math.pow(rand, round);
			modulus = (rand % round);
			randByRound = rand / round;
			/*calculating values to display end*/
			if (i == 1) {
				buffer.append(String.format("%-15s %-15s %-15s %-15s %-15s\n","Round","Rand","Rand^Round","Modulus","Rand/Round"));//To format the output in given format
				//buffer.append(newLine);
			}
			buffer.append(String.format("%-15s %-15s %-15s %-15s %-15s\n",round,rand,randPowRound,modulus,randByRound));//To format the output in given format
			//buffer.append(newLine);
		}
		System.out.println(buffer.toString()); // displaying the output
	}
}
