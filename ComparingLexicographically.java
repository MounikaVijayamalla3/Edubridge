package assignment10;
import java.util.Scanner;
public class ComparingLexicographically {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter first string");
       String s1 = sc.next();
       System.out.println("Enter second string");
       String s2 = sc.next();
      System.out.println("Lexicographical condition :  "+s1.compareTo(s2));
	}

}
