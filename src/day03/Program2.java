package day03;

public class Program2 {

	public static void main(String[] args) {
		addFunction(10,20);
		Program2 x=new Program2();
		x.subFunction(30,40);
		addFunction(20, 60);
		
	}
	
	public static void addFunction(int a,int b)
	{
		System.out.println(a+b);
	}
	public void subFunction(int a,int b)
	{
		System.out.println(a-b);
	}

}
