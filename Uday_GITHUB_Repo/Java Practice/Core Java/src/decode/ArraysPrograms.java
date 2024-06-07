package decode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraysPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		integerDuplicate();		
		stringDuplicate();
		findLargestNumber();
		moveZerosToEnd();
		moveZerosToFirst();
		secondLargestNumber();
		thirdLargestNumber();
		countNoOfCharacter();
		fibonachiSeries();
		bubbleSort();
		possibleSumElements();
		convertArrayToArrayList();
		convertArrayListToArray();		
	}
	
	public static void integerDuplicate() {
		   int[] inp = {1,2,3,4,2,3,7,8,1};
	       Set<Integer> s1 = new HashSet<Integer>();
	       Set<Integer> duplicate = new HashSet<Integer>();
	       for(int i=0;i<inp.length;i++) {
	    	   if(!s1.add(inp[i])) {
	    		   duplicate.add(inp[i]);
	    	   }
	       }
	       System.out.println("Duplicate numbers are "+duplicate);
		}
	
	public static void stringDuplicate() {
		String inp = "Hello my name is uday my name";
		String[] strArr = inp.split(" ");
		HashSet<String> s1 = new HashSet<String>();
		HashSet<String> duplicate = new HashSet<String>();
		for(int i=0;i<strArr.length;i++) {
			if(!s1.add(strArr[i])) {
				duplicate.add(strArr[i]);
			}
		}
		System.out.println("Duplicate words are "+ duplicate);		
	}
	
	public static void findLargestNumber() {
		int[] inp = {1,2,3,4,9,8,65,6,7,44,33,22};
		int big=0;
		for(int i=0;i<inp.length;i++) {
			if(inp[i]>big) {
				big=inp[i];
			}
		}
		System.out.println("Largest number is "+ big);
	}
	
	public static void moveZerosToEnd() {
		int[] inp= {1,0,2,0,3,0,4,0,5,0,6};
		int count=0;
		for(int i=0;i<inp.length;i++) {
			if(inp[i]!=0) {
				inp[count]=inp[i];
				count++;
			}
		}		
		while(count<inp.length) {
			inp[count]=0;
			count++;
		}
		System.out.println("After moving xeros to end "+ Arrays.toString(inp));
	}
	
	public static void moveZerosToFirst() {
		int[] inp= {1,0,2,0,3,0,4,0,5,0,6};
		int count=inp.length-1;
		for(int i=inp.length-1;i>=0;i--) {
			if(inp[i]!=0) {
				inp[count]=inp[i];
				count--;
			}
		}
		while(count>=0) {
			inp[count]=0;
			count--;
		}
		System.out.println("After moving xeros to first "+ Arrays.toString(inp));			
	}
		
	public static void secondLargestNumber() {
		int[] inp= {1,2,96,4,5,6,7,88,45,97};
		Arrays.sort(inp);
		for(int i=inp.length-2;i>=0;i--) {
			if(inp[i]!=inp[inp.length-1]) {
				System.out.println("Second largest number is "+inp[i]);
				break;
			}
		}		
	}
		
	public static void thirdLargestNumber() {
		int[] inp= {1,2,96,4,100,6,7,88,45,97};
		Arrays.sort(inp);
		for(int i=inp.length-3;i>=0;i--) {
			if(inp[i]!=inp.length-2) {
				System.out.println("Third largest number is : "+inp[i]);
				break;
			}
		}
	}
	
	public static void countNoOfCharacter() {
		String inp="udayy is my name uday";
		char[] ch=inp.toCharArray();
		Map<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char c : ch) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		for(Map.Entry entry: hm.entrySet() ) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
	
	public static void fibonachiSeries() {
		//0,1,2,3,5,8,13
		int a=0, b=0, c=1;
		for(int i=0;i<=6;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println("Fibonachi series " +c);
		}
	}
	
	public static void bubbleSort() {
		int[] inp= {135,6,45,540,0,20,15,60};
		int count=0;
		for(int i=0;i<inp.length;i++) {
			for(int j=1;j<(inp.length-i);j++) {
				if(inp[j-1]>inp[j]) { 
					count=inp[j-1];   
					inp[j-1]=inp[j];   
					inp[j]=count;      
				}
			}
		}
		System.out.println("Highest number "+inp[inp.length-1]+" Highest second "+inp[inp.length-2]);
		for(int k=0;k<inp.length;k++) {
		System.out.println(inp[k]);
		}
	}
	
	public static void possibleSumElements() {
		int[] inp= {1,3,4,2,5,8,6,7,9};
		//int count=0;
		for(int i=0;i<inp.length;i++) {
			for(int j=1;j<(inp.length-i);j++) {
				if((inp[i]+inp[j])==10) {
					System.out.println(inp[i]+" "+inp[j]);
				}
			}
	}
	}
	
	public static void convertArrayListToArray() {
		List<String> list=new ArrayList<String>();
		list.add("sravan");
		list.add("vasu");
		list.add("raki"); 
		String[] names=list.toArray(new String[0]);		
		System.out.println(Arrays.toString(names));
		//For Integer type
		//int[] arr = list.stream().mapToInt(i -> i).toArray();
	}
	public static void convertArrayToArrayList() {
		String[] inp= {"sravan","vasu","raki"};
		List<String> list=new ArrayList<String>(Arrays.asList(inp));
	    System.out.println(list);
	}
	
	
	
	
	
}


