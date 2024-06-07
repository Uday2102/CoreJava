package other_interview_programs;

public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0,1,1,2,3,5,8,13
		int a=0,b=0,c=1;
		for(int i=0;i<8;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}

}
