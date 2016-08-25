import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class linuxfcgen {
     
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter temperature in Celsius : ");
        double celsius = Double.parseDouble(reader.readLine());
        convert(celsius);
        
    }
    public static void convert(double celsius) throws IOException{
	double fahrenheit = (9.0/5.0)*celsius + 32;
        System.out.println("Temperature in Fahrenheit is : "+fahrenheit);
        System.out.println("Do you Want to Continue Y/N?");
        Scanner input = new Scanner(System.in);
        String in = input.next();
        if("Y".equalsIgnoreCase(in.trim())){
            String[] placeholder = null;
            main(placeholder);
        }
        else if("N".equalsIgnoreCase(in.trim())){
            System.out.println("Thank You for using this program");
            System.exit(0);
        }
        else{
            System.out.println("Invalid Input Please try running the program again");
            
        }
    }
}
