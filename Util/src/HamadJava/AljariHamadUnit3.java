package HamadJava;
/*************************************
 * Author : Hamad Aljari
 * Description : Assignment - 3
 * FileName : AljariHamadUnit3.Java
 *************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AljariHamadUnit3 {
	private static final String FILENAME = "/Users/sukanthgunda/Desktop/energyProduced.txt";
	private static Double costOfElectricity = 0.085;

	public static void main(String[] args) {

		Scanner scanner;
		double totalEnergyInWeek = 0;	//total energy in one week
		int noOfProductionValues = 0;	//number of values in the text file
		double oneWeekSavings = 0;		// Savings for one Week
		double oneDaySavings = 0;		//savings for one day
		double daysToRecoupeCost = 0;	//days to recoupe cost
		double yearsToRecoupeCost = 0;	// Years to recoupe cost
		ArrayList<Double> productionValues = null;
		try {
			productionValues = new ArrayList<Double>();
			scanner = new Scanner(new File(FILENAME));
			while(scanner.hasNextDouble()){
				productionValues.add(scanner.nextDouble());
				noOfProductionValues++;
			}
			scanner = new Scanner(System.in);
			System.out.println("Please enter system cost in dollars");
			int totalSystemCost = scanner.nextInt();
			for(Double test:productionValues){
				totalEnergyInWeek +=test;
			}
			//Calculation for savings and recoupe cost.
			oneWeekSavings = costOfElectricity*totalEnergyInWeek;
			oneDaySavings = oneWeekSavings/noOfProductionValues;
			daysToRecoupeCost = totalSystemCost/oneDaySavings;
			yearsToRecoupeCost = daysToRecoupeCost/365;
			System.out.println(String.format("%-50s: %s" , "Total System Cost In Dollars ", totalSystemCost ));
			System.out.println(String.format("%-50s: %s" , "Total Energy Produced in one weeks ", totalEnergyInWeek+" kWH" ));
			System.out.println(String.format("%-50s: %s" , "Total savings for one week ", oneWeekSavings ));
			System.out.println(String.format("%-50s: %s" , "Savings per Day ", oneDaySavings ));
			System.out.println(String.format("%-50s: %s" , "Days to recoup cost(truncated) ", (int)daysToRecoupeCost ));	// Casting to integer to round off the value
			System.out.println(String.format("%-50s: %s" , "Years to recoup cost(truncated) ", (int)yearsToRecoupeCost ));	// Casting to integer to round of the value
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}
