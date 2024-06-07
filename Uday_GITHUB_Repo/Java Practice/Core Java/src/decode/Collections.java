package decode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList();
		linkedList();
		set();
		TreeSet();
	}

	public static void arrayList() {
		 ArrayList<Object> l1=new ArrayList<Object>();
		    l1.add("uday");
		    l1.add(123);
		    l1.add('c');
		    l1.add(true);
		    //l1.set(2, "uday");
		    //l1.clear();
		    //l1.remove(1);
		    //l1.removeAll(l1);
		    Object[] arr=new Object[l1.size()];
		    l1.toArray(arr);
		    System.out.println(Arrays.toString(arr));
		    boolean verify=l1.contains(123);
		    System.out.println(verify);
		    boolean result=l1.isEmpty();
		    System.out.println(result);
		    System.out.println(l1);	
		    System.out.println(l1.get(2));
		    System.out.println(l1.indexOf(123));
		 ArrayList<Object> l2=new ArrayList<Object>();
		    l2.addAll(l1);
		    System.out.println(l2);	
		 ArrayList<Object> l3= (ArrayList<Object>)l2.clone();
		    System.out.println(l3);	
		    System.out.println(l3.size());	
		    System.out.println("SubList: " + l3.subList(2, l3.size()));	
		 ArrayList<Object> l4=new ArrayList<Object>();   
		    l4.ensureCapacity(4);
		    ArrayList<Object> l5=new ArrayList<>(l1);
		    System.out.println("ArrayList is copied: "+l5);
		    boolean compare=l1.equals(l5);
	}
	
	public static void linkedList() {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("selenium");
		l1.add("java");
		l1.add("sql");
		l1.add("html");
		System.out.println("Linked list starts here");
		System.out.println(l1);
		System.out.println(l1.get(2));
	}
	
	public static void set() {
		Set<Integer> s1=new HashSet<>();
		s1.add(12);
		s1.add(13);
		s1.add(15);
		s1.add(16);
		System.out.println("Hash set starts here");
		System.out.println(s1);
		System.out.println(s1.size());
		//s1.clear();
		System.out.println("After clearing the set values");
		//System.out.println(s1);
		//System.out.println(s1.size());
		Iterator i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		s1.remove(16);
	
	   TreeSet<Integer> tree = new TreeSet<Integer>();
	   tree.add(1);
	   tree.add(16);
	   tree.add(12);
	   tree.add(10);
	   
	   Iterator<Integer> i2=tree.iterator();
	   while(i2.hasNext()) {
		   System.out.println(i2.next());
	   }
	   Iterator i3= tree.descendingIterator();
	   while(i3.hasNext()) {
		   System.out.println(i3.next());
	   }
	   System.out.println("Lowest Value: "+tree.pollFirst());    
       System.out.println("Highest Value: "+tree.pollLast());        
	}
	
	public static void TreeSet() {
		TreeSet<String> set=new TreeSet<String>(); 
		set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        System.out.println("Initial Set: "+set);           
        System.out.println("Reverse Set: "+set.descendingSet());           
        System.out.println("Head Set: "+set.headSet("C", true));           
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));            
        System.out.println("TailSet: "+set.tailSet("C", false)); 
        System.out.println("Head Set: "+set.headSet("C"));        
        System.out.println("SubSet: "+set.subSet("A", "E"));           
        System.out.println("TailSet: "+set.tailSet("C"));  
	}
}