package Practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {   
    
    public static void main(String [] args) {	
	/*String sample ="#";
	StringBuffer buffer =new StringBuffer();
	for(int i=0;i<5;i++){
	    buffer.append(sample);
	    System.out.println(buffer);
	}*/
	/*String sampleString= "sukanth";
	char[] charArray = sampleString.toCharArray();
	for(int i=charArray.length-1;i>=0;i--){
	    System.out.print(charArray[i]);
	}*/
	/*int n1=0,n2=1,n3,count=20;
	for(int i=2;i<count;i++){
	    n3=n1+n2;
	    System.out.println(""+n3);
	    n1=n2;
	    n2=n3;
	}*/
	/*String testString = "aaa";
	StringBuffer buffer = new StringBuffer(testString);
	if(testString.equalsIgnoreCase(buffer.reverse().toString())){
	 System.out.println("Given String is a pallindrome");   
	}else{
	    System.out.println("String is not a pallindrome");
	}*/
	/*String sampleString="aaa";
	char[] charArray = sampleString.toCharArray();
	String buffer="";
	for(int i=charArray.length-1;i>=0;i--){
	    buffer = buffer + charArray[i];
	}
	if(sampleString.equalsIgnoreCase(buffer)){
	    System.out.println("Its a Pallindrome");
	}else{
	    System.out.println("Its not a pallindorome");
	}*/
	
	/*findDuplicateCharactersInString("whenthereisawillthereisaaway");*/
	/*  boolean a = false;
	  if(a=true){
	      System.out.println("hello");
	  }else{
	      System.out.println("goodbye");
	  }
    }*/

   /* private static void findDuplicateCharactersInString(String string) {
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	char[] charArray = string.toCharArray();
	for(Character character:charArray){
	    if(map.containsKey(character)){
	    map.put(character, map.get(character)+1);
	    }else{
		map.put(character, 1);
	    }
	    Set<Character> key = map.keySet();
	    for(Character character2:key){
		if(map.get(character2)>1){
		    System.out.println(character2+"------"+map.get(character2));
		}
	    }
	}
	
    }*/
    	System.out.println(digitSum(867));
    	
    }
    public static int digitSum(int n) {
	    int sum=0;
	   int count = 0;
	  while (n > 0) {
		  count++;
	            sum = sum + n % 10;
	            n = n / 10;
	        }
	  System.out.println(count);
	    return sum;
	}
    
}