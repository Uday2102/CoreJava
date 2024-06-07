package other_interview_programs;

class Animal{
	public void test1() {
		System.out.println("In Method A");
	}
}

class Ball extends Animal{
	public void test2() {
		System.out.println("In Method B");
	}
}



public class UpcastingAndDownCasting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a=new Ball();
//a.test1();

Ball b=(Ball) a;
b.test1();
	}

}
