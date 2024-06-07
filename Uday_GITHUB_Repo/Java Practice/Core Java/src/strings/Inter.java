package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="Your Number is P-10000543/00 created sucesfully .";
		//String[] s2=s.split(" ");
		//for(int i=0;i<s2.length;i++){
		//if(s2[i].startsWith("P-")){
		//System.out.println(s2[i]);
			
			//keyProgram(3);
		test();
	}
	
	
	public static void keyProgram(int key){
		String input = "bazz";
		String output="";
		char[] c1= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
				'q','r','s','t','u','v','w','x','y','z'};
		char[] ch=input.toCharArray();
		for(int i=0;i<=ch.length-1;i++){ //4
		for(int j=0;j<c1.length;j++){   //26
		output=c1[i+key]+""; 
		}
		System.out.println(output);
}
	}
	
	//String = "How are you"
		//	Substring = " are"
			//Output = "How era you"
	public static void keyProgram(){
	String s1= "How are you";
	String[] s2=s1.split(" ");
	String output=" ";
	for(int i=0;i<=s2.length-1;i++) {
		if(s2[i].equals("are")) {
			for(int j=s2[i].length()-1;j>=0;j--) {
				output+=s2[i].charAt(j);
			}
			
		}
		else {
			output+=s2[i]+" ";
		}
		
	}
	System.out.println(output);
}
	//Input : 2,4,5,2,6,5,2,9,1,14
	//Output 
	//Unique = 4,6,9,1,14
	//duplicate = 2,5
	public static void test() {
	int[] a= {2,4,5,2,6,5,2,9,1,14};
	
	Set<Integer> s=new HashSet<Integer>();
	Set<Integer> duplicate=new HashSet<Integer>();
	Set<Integer> unique=new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
	if(!s.add(a[i])) {
		duplicate.add(a[i]);
	}
	else {
		unique.add(a[i]);
	}
	}
	System.out.println(duplicate);
	System.out.println(unique);
	
	
	/*HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	for(int i=0;i<a.length;i++) {
		hm.put(a[i], i);
	}
	System.out.println(hm.keySet());
	}*/
	
	/*
	 * for(int i=0;i<a.length;i++) { int j; for(j=0;j<i;j++) { if(a[i]==a[j]) {
	 * System.out.print("Duplicate : "+a[j]); break; } else if(i==j)
	 * System.out.println("Unique : "+a[i]); } } }
	 */
	
	}
	}
	

