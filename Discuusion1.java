package discussions;
import java.util.ArrayList;
import java.util.Collections;
public class Discuusion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<Integer> list = new ArrayList<Integer>();
 //add
   System.out.println("Adding");
   list.add(10);
   list.add(3);
   list.add(678);
   System.out.println(list);
  //get
   System.out.println("Getting");
   int res=list.get(0);
   System.out.println(res);
   //add element in middle
   System.out.println("Adding element in the middle");
   list.add(1,6);
   System.out.println(list);
   //set element
   System.out.println("Setting element");
   list.set(1,25);
   System.out.println(list);
   //delete
   System.out.println("Removing");
   list.remove(1);
   System.out.println(list);
   //size
   System.out.println("Size");
   int res1=list.size();
   System.out.println(res1);
   //Iterate
   System.out.println("Iterate");
   for(int i =0;i<list.size();i++){
   System.out.println(list.get(i));
   }
//sorting
   System.out.println("Sorting");
   Collections.sort(list);
   System.out.println(list);
	}
}
      