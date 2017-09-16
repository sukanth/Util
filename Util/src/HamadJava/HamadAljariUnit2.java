package HamadJava;

import java.util.Scanner;

public class HamadAljariUnit2 {

	public static void main(String[] args) {
		double monthlyBudget = 600;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter amountSpent");
		double amountSpent = scanner.nextDouble();
		double percentageSpent = (amountSpent/monthlyBudget)* 100;
		if(percentageSpent >=100){
			System.out.println("Over Budget, Stop  Now!.");
		}
		else if(percentageSpent>= 75 && percentageSpent<= 100){
			System.out.println("Nearing or at budget, time to stop  spending");
		}
		else if(percentageSpent>= 50 && percentageSpent<= 74){
			System.out.println("Still on budget, you may continue  spending");
		}
		else if(percentageSpent>= 25 && percentageSpent<= 59){
			System.out.println("Still on budget, you still have plenty to  go");
		}
		else if(percentageSpent>= 0 && percentageSpent<= 24){
			System.out.println("Spend away, maybe a nice dinner  out?");
		}
	}

}
