package exceptions;

public class Exceptions {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

        practice();
	}
	
	public static void practice()  {
	int i=0;
	int j=5;
	if(i<j) {
		throw new RuntimeException("Please provide the larger number");
	}
}
}
