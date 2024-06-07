package strings;

import java.util.HashMap;

public class CountTheNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Hi Hello Good morning are Good How are you How are you guys";
String[] s2=s1.split(" ");
HashMap<String,Integer> hm=new HashMap<String,Integer>();
for(int i=0;i<=s2.length-1;i++) {
	if(hm.containsKey(s2[i])) {
		int count=hm.get(s2[i]);
		hm.put(s2[i], count+1);
	}
	else {
		hm.put(s2[i], 1);
	}
}
System.out.println(hm);
	}

}
