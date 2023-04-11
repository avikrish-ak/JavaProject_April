package day04;

public class Program2 extends Program1 {

	public static void main(String[] args) {
		Program2 x= new Program2();
		x.addFunction(10, 20);
		x.subFunction(20, 10);
		x.mul(10, 10);
	}
	
	
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}

}
