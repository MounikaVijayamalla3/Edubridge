package assignment10;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class SortByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Ente the size of an array");
     int n=sc.nextInt();
     String[] a = new String[n];
     System.out.println("Enter array elemets");
     for(int i=0;i<a.length;i++) {
    	 a[i]=sc.next();
     }
    Arrays.sort(a, Comparator.comparingInt(String::length));
      System.out.println("Ascending order  "+Arrays.toString(a));
    Arrays.sort(a,Comparator.comparingInt(String::length).reversed());
      System.out.println("Descending order  :"+Arrays.toString(a));
     }

}
