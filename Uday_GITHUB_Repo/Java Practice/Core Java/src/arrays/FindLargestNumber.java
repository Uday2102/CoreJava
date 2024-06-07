package arrays;
import java.util.Arrays;

public class FindLargestNumber {

	public static void main(String[] args) {
	int[] a= {1,2,3,6,9,5,80};
	int big=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>big) {
	big=a[i];
	}	
	}
	System.out.println(big);
	//after sorting
		Arrays.sort(a);
		for(int k : a) {
			System.out.println(k);
		}
	}
	
}