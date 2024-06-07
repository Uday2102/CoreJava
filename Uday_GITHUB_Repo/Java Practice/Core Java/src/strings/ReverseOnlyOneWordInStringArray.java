package strings;

public class ReverseOnlyOneWordInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"test","sdgfjsgd","sapiens","INDIA","Automation"};
		String output=" ";
		String word=" ";
		for(int i=0;i<arr.length;i++){
		if(i==2){
		for(int j=arr.length-1;j>=0;j--){
		//System.out.print(arr[i].charAt(j));
			word+=arr[i].charAt(j);
		}
		}
		else{
		output+=arr[i]+word+" ";
		}
	}
		System.out.print(output);
	}
}
