package strings;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String inp="uday";
   String res=" ";
   for(int i=0;i<inp.length();i++) {
	   char ch = inp.charAt(i);
	   res=inp.substring(0,i)+inp.substring(i+1);
	   System.out.print(res + " ");
   }
	   if (inp.length() == 0) {
           System.out.print(res + " ");
       }
	   
   }
	}

