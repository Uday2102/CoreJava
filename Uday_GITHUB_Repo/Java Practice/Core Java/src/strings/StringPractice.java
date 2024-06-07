package strings;

public class StringPractice {

	public static void main(String[] args) {
	
//To remove all the spaces in a sentance
		String s1="java selenium and python";
		String s2=s1.replaceAll("\\s", "");
		System.out.println(s2);
		
		//To remove the alphanumeric from a word
		String s3="java123 selenium@12#$%^&^ and python&*(&^";
		//s3.replaceAll("[^a-zA, replacement)
		
		
		String s4= new String("uday");
		String s5= new String("uday");
		if(s4==s5) {
			System.out.println("Passed");
		}
	}

}
