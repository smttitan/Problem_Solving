import java.util.*;
public class reverse_string{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the String to be reversed:");
		String a=inp.next();
		String b="";
    	
    	for(int i=a.length()-1;i>=0;i--)
    	{
    	b+=a.charAt(i);
    	}
    	System.out.println("Reversed String:");
    	System.out.println(b);
	}
}