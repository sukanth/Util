package HamadJava;

import java.util.Scanner;

public class AljariHamadUnit4 {
	/*************************************
	 * Author : Hamad Aljari Description : Assignment - 4 FileName :
	 * AljariHamadUnit4.Java
	 *************************************/
	public static void main(String[] args) {
		Scanner scanner;
		String dayOfFlight = null; // variable for holding day of flight value
		int hour; // variable for holding hour value
		int currentHour; // variable for holding current hour value
		String currentDay = null; // variable for holding current day value
		int hoursLeftToGo; // variable for holding hours left to go value
		try {
			do { // do while loop to check if the day matches and continue if it does not
				scanner = new Scanner(System.in);
				System.out.println("What is the day of your flight (Monday-Sunday)");
				dayOfFlight = scanner.next();
				System.out.println("What hour does your flight leave (Military Time)");
				hour = scanner.nextInt();
				System.out.println("What is the current Day(Monday-Sunday)");
				currentDay = scanner.next();
				if (!dayOfFlight.equalsIgnoreCase(currentDay)) {
					System.out.println("Today isn't your flight,Keep Checking.");
				}
				System.out.println("What is the current hour(Military Time)");
				currentHour = scanner.nextInt();
				hoursLeftToGo = hour - currentHour;
				System.out.println("you have " + hoursLeftToGo + " hours to go");
					switch (Integer.valueOf(hoursLeftToGo)) { // switch case to display the wait message
					case 1:
						System.out.println("You best be at the airport, security lines are long.");
						break;
					case 2:
						System.out.println("Hope you are at the airport.");
						break;
					case 3:
					case 4:
						System.out.println("Better be heading to the airport.");
						break;
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
					case 11:
					case 12:
					case 13:
					case 14:
					case 15:
					case 16:
					case 24:
					case 25:
					case 26:
						System.out.println("Plenty of time, no need to rush.");
						break;
					case 17:
					case 18:
					case 19:
					case 20:
					case 21:
					case 22:
					case 23:
						System.out.println("Are you seriously checking this early?");
						break;
					default:
						System.out.println("Hopefully you made your flight");
						break;
					}
				System.out.println("Thanks for planning your trip with us.");
			} while (!dayOfFlight.equalsIgnoreCase(currentDay));
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
