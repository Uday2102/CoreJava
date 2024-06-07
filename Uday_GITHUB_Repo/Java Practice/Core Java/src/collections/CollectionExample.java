package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer>  a = new ArrayList<>(); 
		    ListIterator<Integer> l1 = null;
a.add(8);
a.add(9);
a.add(67);
a.add(23);
l1 = a.listIterator(); 


 Iterator i1=a.iterator(); while(i1.hasNext()) {
 System.out.println(i1.next()); }


//ListIterator l1=a.listIterator();
while(l1.hasPrevious()) {
	System.out.println(l1.previous());
}
	}
}
