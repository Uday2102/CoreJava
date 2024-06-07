package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HasPreviousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Integer>  li = new ArrayList<>();  
          ListIterator<Integer> itr = null;  
          li.add(22);  
          li.add(44);  
          li.add(88);  
          li.add(11);  
          li.add(33);  
          itr = li.listIterator();  
          System.out.println("In actual order :");  
          while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
          System.out.println("In reverse order :");  
            
          while (itr.hasPrevious()) {  
                System.out.println(""+itr.previous());  
         }  
    }   
}  