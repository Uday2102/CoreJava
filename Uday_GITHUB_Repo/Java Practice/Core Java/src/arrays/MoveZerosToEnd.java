package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {0,1,0,2,3,0,4,0,5,0};
int counter=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		arr[counter]=arr[i];
		counter++;
	}
}
	while(counter<arr.length) {
		arr[counter]=0;
		counter++;
	}
	
System.out.println(Arrays.toString(arr));

	}

}
