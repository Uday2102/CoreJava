package strings;

import java.util.HashMap;

public class CountNumberOfCharsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="Better Butter";
char[] ch=input.toCharArray();
HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
for(int i=0;i<ch.length;i++) {
	if(hm.containsKey(ch[i])) {
		int count=hm.get(ch[i]);
		hm.put(ch[i], count+1);
	}
	else {
		hm.put(ch[i], 1);
	}
}
System.out.println(hm);
	}

}
