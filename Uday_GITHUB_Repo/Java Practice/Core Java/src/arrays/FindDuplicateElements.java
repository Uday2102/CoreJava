package arrays;

import java.util.HashSet;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,3,4,8,3,4,6,8};
HashSet<Integer> set=new HashSet<Integer>();
HashSet<Integer> duplicate=new HashSet<Integer>();
for(int i=0;i<arr.length;i++) {
	if(!set.add(arr[i])) {
		duplicate.add(arr[i]);
	}
}
System.out.println(duplicate);	
	}
}
