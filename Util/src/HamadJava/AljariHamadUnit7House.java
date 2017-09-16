package HamadJava;
/**
 * 
 * @author Hamad Ajlari
 *
 */
public class AljariHamadUnit7House {
	int number;
	String street;
	String city;
	String state;
	String zipCode;
	
	
	
	public AljariHamadUnit7House() {
		super();
		
	}

	public AljariHamadUnit7House(int number, String street, String city, String state, String zipCode) {
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	

	public int getNumber() {
		return number;
	}

	public AljariHamadUnit7House setNumber(int number) {
		this.number = number;
		return this;
	}

	public String getStreet() {
		return street;
	}

	public AljariHamadUnit7House setStreet(String street) {
		this.street = street;
		return this;
	}

	public String getCity() {
		return city;
	}

	public AljariHamadUnit7House setCity(String city) {
		this.city = city;
		return this;
	}

	public String getState() {
		return state;
	}

	public AljariHamadUnit7House setState(String state) {
		this.state = state;
		return this;
	}

	public String getZipCode() {
		return zipCode;
	}

	public AljariHamadUnit7House setZipCode(String zipCode) {
		this.zipCode = zipCode;
		return this;
	}

	public void print() {
		System.out.println("House Information");
		System.out.println("Number: " +number);
		if(street ==null){
			System.out.println("No Street");
		}
		else{
			System.out.println("Street: "+street);
		}
		if(city == null){
			System.out.println("No City");
		}
		else{
			System.out.println("City: "+city);
		}
		if(state == null){
			System.out.println("No State");
		}
		else{
			System.out.println("State: "+state);
		}
		if(zipCode == null){
			System.out.println("No ZipCode");
		}
		else{
			System.out.println("Zip: "+zipCode);
		}
		System.out.println("");
	}
}
