package strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String test = "This sentence contains two words, one and two";
	        Set<String> duplicates = duplicateWords(test);
	        System.out.println("input : " + test);
	        System.out.println("output : " + duplicates);
	    }


	    /**
	     * Method to find duplicate words in a Sentence or String
	     * @param input String 
	     * @return set of duplicate words
	     */
	    public static Set<String> duplicateWords(String input){
	        
	        Set<String> duplicates = new HashSet<>();
	        Set<String> set = new HashSet<>();
	        
	        String[] words = input.split(" ");
	        for(String word : words){
	            if(!set.add(word)){
	                duplicates.add(word);
	            }
	        }
	        return duplicates;
	    
	}

}
