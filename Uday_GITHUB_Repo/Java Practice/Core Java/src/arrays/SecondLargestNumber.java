package arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] input= {1,4,6,76,56,47,66};
int firstLargest,secondLargest;
if(input[0]>input[1]) {
	firstLargest=input[0];
	secondLargest=input[1];
}
else {
	firstLargest=input[1];
	secondLargest=input[0];
}
for(int i=2;i<input.length;i++) {
	if(input[i]>firstLargest) {
		secondLargest=firstLargest;
		firstLargest=input[i];
	}
	else if(input[i]<firstLargest && input[i]>secondLargest) {
		secondLargest=input[i];
	}
}
System.out.println(secondLargest);


	}

}
