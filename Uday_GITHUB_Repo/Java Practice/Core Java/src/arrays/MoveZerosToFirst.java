package arrays;

import java.util.Arrays;

public class MoveZerosToFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {0,1,0,2,6,0,4,0,5,0,3};
		int counter=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0)
			{
				arr[counter]=arr[i];
				counter--;
			}
		}
		while(counter>=0) {
			arr[counter]=0;
			counter--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
