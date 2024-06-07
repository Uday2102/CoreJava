package strings;

public class CharCount {

	public static void main(String[] args) {
		String input = "Today it is raining";
		//Display the first character of each of the words
		  int charCount = 0; //resetting character count
	        for(char ch: input.toCharArray()){
	            if(ch == 'a'){
	                charCount++;
	            }
	        }    
	        System.out.println("count of character 'a' on String: 'Today is Monday' using for each loop  " + charCount);
	    }
}
