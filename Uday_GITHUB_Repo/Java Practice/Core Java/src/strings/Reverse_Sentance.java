package strings;

public class Reverse_Sentance {

	 public static void main(String args[]) {
	      String input = "you shall not pass";
	      String[] s=input.split(" ");
	      String ans = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + ans); 
	 
	 
	 //Another reverse type
	      String str = "you shall not pass";
	      String arr[] = str.split(" ");
	      for (int i = 0; i < arr.length; i++) {

	         for (int j = arr[i].length() - 1; j >= 0; j--) {
	             System.out.print(arr[i].charAt(j));
	         }
	         System.out.print(" ");
	      }
	      reverse("i.like.this.program.very.much");
	 
}
	 public static String reverse(String S) {
		  String[] strArray=S.split(".");
		  String s2 = "";
		 for(String st : strArray) {
			 System.out.println(st); 
			 s2+=st;
		 }
	       return s2;
	 }
}
