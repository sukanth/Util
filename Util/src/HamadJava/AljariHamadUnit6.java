package HamadJava;

import java.util.Scanner;

/*************************************
 * Author : Hamad Aljari 
 * Description : Driver Class - Assignment - 6 
 * FileName : AljariHamadUnit6.Java
 *************************************/
public class AljariHamadUnit6 {
	private static int countofDogs =0;
	private static int countofCats = 0;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");
		AljariHamadPets aljariHamadPetsInstance1=null;
		AljariHamadPets aljariHamadPetsInstance2=null;
		AljariHamadPets aljariHamadPetsInstance3=null;
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Java Pet Tracker.");
		System.out.println("Please enter the type of Pet#1 (Dog or Cat):");
		String pet1Type = scanner.next();
		System.out.println("Please enter the name of the Pet#1");
		String pet1Name =  scanner.next();
		System.out.println("Please enter the age of "+ pet1Name+" :");
		int pet1Age = scanner.nextInt();
		System.out.println("Please enter the weight of "+pet1Name+" in pounds :");
		double pet1Weight = scanner.nextDouble();
		System.out.println("Is "+pet1Name+" Male (True/False) : ");
		boolean pet1IsMale = scanner.nextBoolean();
		
		
		System.out.println("Please enter the type of Pet#2 (Dog or Cat):");
		String pet2Type = scanner.next();
		System.out.println("Please enter the name of the Pet#2");
		String pet2Name =  scanner.next();
		System.out.println("Please enter the age of "+ pet2Name+" :");
		int pet2Age = scanner.nextInt();
		System.out.println("Please enter the weight of "+pet2Name+" in pounds :");
		double pet2Weight = scanner.nextDouble();
		System.out.println("Is "+pet2Name+" Male (True/False) : ");
		boolean pet2IsMale = scanner.nextBoolean();
		
		
		System.out.println("Please enter the type of Pet#3 (Dog or Cat):");
		String pet3Type = scanner.next();
		System.out.println("Please enter the name of the Pet#3");
		String pet3Name =  scanner.next();
		System.out.println("Please enter the age of "+ pet3Name+" :");
		int pet3Age = scanner.nextInt();
		System.out.println("Please enter the weight of "+pet3Name+" in pounds :");
		double pet3Weight = scanner.nextDouble();
		System.out.println("Is "+pet3Name+" Male (True/False) : ");
		boolean pet3IsMale = scanner.nextBoolean();
		
		System.out.println(newLine);
		System.out.println("Calculating Pet Population and Stuff");
		aljariHamadPetsInstance1 = new AljariHamadPets(pet1Type,pet1Name,pet1Age,pet1Weight,pet1IsMale);
		aljariHamadPetsInstance2 = new AljariHamadPets(pet2Type,pet2Name,pet2Age,pet2Weight,pet2IsMale);
		aljariHamadPetsInstance3 = new AljariHamadPets(pet3Type,pet3Name,pet3Age,pet3Weight,pet3IsMale);
		
		countPets(aljariHamadPetsInstance1.getPetType());
		countPets(aljariHamadPetsInstance2.getPetType());
		countPets(aljariHamadPetsInstance3.getPetType());
		if(countofCats >1 && countofCats < 3|| countofDogs>1 && countofDogs<3){
			System.out.println("I sure hope that the cats and dogs get along");
			System.out.println(newLine);
		}
			
		System.out.println("Pet Registration Information:");
		
		aljariHamadPetsInstance1.displayPet();
		aljariHamadPetsInstance2.displayPet();
		aljariHamadPetsInstance3.displayPet();
	}
	
	public static void countPets(String petType){
		if(petType.equalsIgnoreCase("CAT")){
			countofCats++;
		}else{
			countofDogs++;
		}
	}
}