package strings;

public class ReverseSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp="my name is uday";
		String[] inpArray= inp.split(" ");
		for(int i=0;i<inpArray.length;i++) {
			for(int j=inpArray[i].length()-1;j>=0;j--) {
				//output+=inpArray[i].charAt(j);
				System.out.print(inpArray[i].charAt(j));
			}
			System.out.print(" ");
		}
		//System.out.println(output);

	}

}
