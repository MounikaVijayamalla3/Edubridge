package assignment10;
import java.util.Scanner;
public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next(); 
		System.out.println("Enter how many times you want to concatenate the string");
		int n = sc.nextInt();
			System.out.print(s.repeat(n));	
		}

}
