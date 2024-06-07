package arrays;

import java.util.Arrays;

public class MergeTwoArraysInSortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {2,4,6,1,9,5};
int[] arr2= {20,40,60,10,19,15};
	int n=arr1.length;
	int m= arr2.length;
int i=0,j=0,k=0;
int[] res = new int [n+m];

while(i<n) {
	res[k]=arr1[i];
	i++;
	k++;
}
while(j<m) {
	res[k]=arr2[j];
	j++;
	k++;
}
Arrays.sort(res);
//System.out.println(Arrays.toString(res));

for(int a=0;a<res.length;a++) {
	System.out.print(res[a]);
}

		
	}

}
