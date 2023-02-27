package assignment10;
import java.util.Scanner;
public class GetUnicodeForDesiredChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
        String s = sc.next();
        System.out.println("Enter Desired Character index");
        int n = sc.nextInt();
        if(n>s.length()) {
        	System.out.println("Invalid Index");
        }
        for(int i=0;i<s.length();i++) {
          if(i==n) {
        	  System.out.println("Unicode is :   "+s.codePointAt(i));
        	  }
        }

	}

}
