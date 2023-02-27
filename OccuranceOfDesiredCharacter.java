package assignment10;
import java.util.Scanner;
public class OccuranceOfDesiredCharacter {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String");
	String s = sc.next();
	System.out.println("Enter the index of a character for which you want to check the occurance");
	char check=sc.next().charAt(0);
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==check)
			count++;	
		}
	System.out.println(count);
	  }
}
