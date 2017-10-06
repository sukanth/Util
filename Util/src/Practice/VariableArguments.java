package Practice;

public class VariableArguments {

	public static void main(String[] args) {
		
		System.out.println(add(1,2,3,4,5,6,7,8));
	}
	
	
	public static int add(int ...params){
		int c=0;
		for(int i:params){
			c += i;
		}
		return c;
	}
}
