package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1, "uday");
hm.put(2, "vijay");
hm.put(3, "vinay");



for(Map.Entry<Integer, String> entry:hm.entrySet()) {
	System.out.println(entry);
	
}
		
	}

}
