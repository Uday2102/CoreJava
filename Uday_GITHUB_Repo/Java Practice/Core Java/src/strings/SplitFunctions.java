package strings;

public class SplitFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="i like this program very much";
        String[] str=s.split(" ");
        for(String s1:str) {
        	System.out.println(s1);
        }
        reverseWords("i.like.this.program.very.much");
	}
	public static String reverseWords(String S)
	    {
	        String[] strArray=S.split("[.]");
	       String s2 = "";
	       for(int i=strArray.length-1;i>=0;i--){
	           if(i==0){
	             s2+=strArray[i];
	           }
	           else{
	           s2+=strArray[i]+ ".";
	       }
	       }
	       System.out.println(s2);
	       return s2;
	    }

}
