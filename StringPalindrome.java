package assignment10;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a string");
     String s1=sc.next();
     String revs1="";
     for(int i=s1.length()-1;i>=0;i--) {
    	  revs1=revs1+s1.charAt(i);
     }
     if(s1.equals(revs1)) {
    	 System.out.println(s1+" is a palindrome");
     }
     else {
    	 System.out.println(s1+" is not a palindrome");
     }
       
	}

}
