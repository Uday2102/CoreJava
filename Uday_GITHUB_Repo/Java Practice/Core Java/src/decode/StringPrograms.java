package decode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString();
		intToString();
		stringToInteger();
		countNoOfWords();
		printDuplicateWords();
		extractSpecificValueFromString();
		reverseSpecificWordInString();
		checkIfAnagram();
		printAllAnagram("abb","");
		reverseEachWordInaSentance();
		reverseEachCharInASentance();
		removeSpecialCharacter();
		
	}
	
	public static void reverseString() {
		String inp="uday";
		String out="";
		for(int i=inp.length()-1;i>=0;i--) {
			out=out+inp.charAt(i);			
		}
		System.out.println(out);
	}
	
	public static void intToString() {
		int inp=43543;
		String out=Integer.toString(inp);
		System.out.println(out);
		System.out.println(out.charAt(2));
	}
	
	public static void stringToInteger() {
		String inp="200";
		int out=Integer.parseInt(inp);
		System.out.println(out);		
	}
	
	public static void countNoOfWords() {
		String inp="my name is uday kumar my name";
		String[] inpArray=inp.split(" ");
		Map<String,Integer> hm=new HashMap<String,Integer>();
		for(String s : inpArray) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s,1);
			}
		}
		System.out.println(hm);
	}
	
	public static void printDuplicateWords() {
		String inp="My name is uday uday is name vinay";
		String[] inpArray=inp.split(" ");
		Set<String> s1=new HashSet<String>();
		Set<String> duplicate=new HashSet<String>();
		for(String s:inpArray) {
			if(!s1.add(s)) {
				duplicate.add(s);
			}
		}
		System.out.println("Duplicate words are : "+duplicate);
	}
	
	public static void extractSpecificValueFromString() {
		String inp="Let me see how will you extract specific word";
		String[] inpArray=inp.split(" ");
		System.out.println(inpArray[3]);		
		}
	
	//Pending
	public static void maxCharCount() {
		String inp="Udaaaayyyyaaahhjahdahdkjkjkjkjkjk";
	
		}
	public static void reverseSpecificWordInString() {
		String inp= "Reverse a specific word in a given String";
		String[] inpArray=inp.split(" ");
		String out=" ";
		for(int i=0;i<inpArray.length;i++) {
			if(i==2) {
				
				for(int j=inpArray[2].length()-1;j>=0;j--) {
					out=out+inpArray[2].charAt(j);
				}
				inpArray[2]=out;				
			}		
		}
		//last+=inp.replace(oldChar, newChar)
		System.out.println("Reverse one specific word "+ String.join(" ", inpArray));
		
	}
	
	public static void checkIfAnagram() {
		String s1= "Keep";
		String s2= "Peek";
		boolean anagram=true;
		if(s1.length()!=s2.length()) {
			System.out.println("can't be verified");
			anagram=false;
		}
		else {
			char[] s1Arr=s1.toLowerCase().toCharArray();
			char[] s2Arr=s2.toLowerCase().toCharArray();
			Arrays.sort(s1Arr);
			Arrays.sort(s2Arr);
			anagram=Arrays.equals(s1Arr, s2Arr);
		}
		if(anagram) {
			System.out.println("Strings are in Anagram");
		}
		else{
			System.out.println("Strings are not in Anagram");
		}
	}
	
	public static void printAllAnagram(String input,String ans) {
		//String input="abc";
		if (input.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			String out=input.substring(0,i)+input.substring(i+1);
			//Recursioning : Is a process of calling a method by itself continously
			printAllAnagram(out, ans+ch);
		}
	}
	
	public static void reverseEachWordInaSentance() {
		String input="This is a sample sentance";
		String[] inpArray=input.split(" ");
		String reverse=" ";
		for(int i=0;i<inpArray.length;i++) {
			if(i==inpArray.length-1) {
				reverse=inpArray[i]+reverse;
			}
			else {
				reverse=" "+inpArray[i]+ reverse;
			}
		}
		System.out.println(reverse);
	}
	
	public static void reverseEachCharInASentance() {
		String input="This is a sample sentance";
		String[] inpArray=input.split(" ");
		String reverse="";
		for(int i=0;i<inpArray.length;i++) {
			String word=inpArray[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord+=word.charAt(j);
			}
			reverse+=reverseWord+" ";
		}
		System.out.println(reverse);		
		
	}
	
	public static void removeSpecialCharacter() {
		String str= "This#string%contains^special*characters&.";   
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		System.out.println(str);  
	}
	
	
	}
