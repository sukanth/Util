

public class StringReverse {

    /**
     * @param args
     */
    static int i,c=0,res;
    
    static void stringreverse(String s)
    {
        char ch[]=new char[s.length()];
        for(i=0;i < s.length();i++)
        ch[i]=s.charAt(i);
        for(i=s.length()-1;i>=0;i--)
        System.out.print(ch[i]);
    }
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String string="sukanth";
	System.out.println("String reverse using SrtingUtils- "+org.apache.commons.lang3.StringUtils.reverse(string));
	StringBuffer buffer=new StringBuffer(string);
	System.out.println("String reverse using SrtingBuffer- "+buffer.reverse());
	stringreverse(string);
    }

}
