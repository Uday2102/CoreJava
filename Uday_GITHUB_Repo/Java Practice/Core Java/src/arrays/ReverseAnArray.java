package arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray= {2,4,7,9,1,5,6,8};
		int temp;
        
        for (int i = 0; i < inputArray.length/2; i++) 
        {
            temp = inputArray[i];
             
            inputArray[i] = inputArray[inputArray.length-1-i];
             
            inputArray[inputArray.length-1-i] = temp;
        }
         
        System.out.println("Array After Reverse : "+Arrays.toString(inputArray));
    }
	}
