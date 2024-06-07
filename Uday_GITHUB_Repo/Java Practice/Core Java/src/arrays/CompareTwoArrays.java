package arrays;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Single Dimensional Array
int[] arr1= {1,3,4,5};
int[] arr2= {1,3,4,5};

System.out.println(Arrays.equals(arr1, arr2));

//Multi Dimensional Array
String[][] s1= {{"a","b","c"},{"d","e","f"}};
String[][] s2= {{"a","b","c"},{"d","e","f"}};
System.out.println(Arrays.deepEquals(s1, s2));
	}

}
