package strings;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //caaabbbc
		String inp="caaabbbc";
		char[] inpArray=inp.toCharArray();
		char prev=0;
		int k=0;
		for(char c : inpArray) {
			if(prev !=0) {
				inpArray[k++]=c;
				prev=c;
			}
		}
		System.out.println(new String(inpArray).substring(0, k));
	}

}
