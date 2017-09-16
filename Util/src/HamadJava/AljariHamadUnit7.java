package HamadJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * 
 * @author Hamad Aljari
 *
 */
public class AljariHamadUnit7 {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner stdIn = new Scanner(System.in);
		Scanner stdInFile = new Scanner(new File("AljariHamadUnit7HouseData.txt"));
		AljariHamadUnit7House house1, house2; //New houses
		//Create house 1 using default constructor
		house1 = new AljariHamadUnit7House();
		house1.print(); //print house 1 with default values
		String street, city, state, zipCode;
		int number;
		System.out.println("Importing Number.");	
		number = stdInFile.nextInt();
		stdInFile.nextLine();
		System.out.println("Importing Street.");
		street = stdInFile.nextLine();
		System.out.println("Importing City.");
		city = stdInFile.nextLine();
		System.out.println("Importing State.");
		state = stdInFile.nextLine();
		System.out.println("Importing ZipCode.");
		zipCode = stdInFile.nextLine();
		System.out.println();
		//use method call chaining to set values
		//and print results for house 1
		house1.setNumber(number).setStreet(street).setCity(city).setState(state).setZipCode(zipCode).print();
		System.out.println("Importing Number.");
		number = stdInFile.nextInt();
		stdInFile.nextLine();
		System.out.println("Importing Street.");
		street = stdInFile.nextLine();
		System.out.println("Importing City.");
		city = stdInFile.nextLine();
		System.out.println("Importing State.");
		state = stdInFile.nextLine();
		System.out.println("Importing ZipCode.");
		zipCode = stdInFile.nextLine();
		System.out.println();
		//create house 2 using 5 parameter constructor
		house2 = new AljariHamadUnit7House(number,
		street, city, state, zipCode);
		//print house 2
		house2.print();
	}

}
