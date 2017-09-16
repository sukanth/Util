package HamadJava;
/*************************************
 * Author : Hamad Aljari Description : Assignment - 6 FileName :
 * AljariHamadUnitPets.Java
 *************************************/
public class AljariHamadPets {
	private String petType;
	private String petName;
	private int petAge;
	private double petWeight;
	private boolean petIsMale;

	public AljariHamadPets() {
		super();
		
	}

	public AljariHamadPets(String petType, String petName, int petAge, double petWeight, boolean petIsMale) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.petWeight = petWeight;
		this.petIsMale = petIsMale;
		//displayPet();
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public int getPetAge() {
		return petAge;
	}

	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}

	public double getPetWeight() {
		return petWeight;
	}

	public void setPetWeight(double petWeight) {
		this.petWeight = petWeight;
	}

	public boolean isPetIsMale() {
		return petIsMale;
	}

	public void setPetIsMale(boolean petIsMale) {
		this.petIsMale = petIsMale;
	}

	public void  displayPet(){
		String newLine = System.getProperty("line.separator");     
		System.out.println("Type: "+ getPetType());
		System.out.println("Name : "+ getPetName());
		System.out.println("Age : "+getPetAge());
		System.out.println("Weight: "+getPetWeight());
		if(isPetIsMale()){
			System.out.println("Sex :"+"Male");
		}else{
			System.out.println("Sex :"+"Female");
		}
		System.out.println(newLine);
	}
}
