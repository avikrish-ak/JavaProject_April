package day04.packageA;

public class Program1 {
	public static void addFunction_static(int a,int b)
	{
		System.out.println(a+b);
	}
	private static void subFunction_static(int a,int b)
	{
		System.out.println(a-b);
	}
	protected static void mulFunction_static(int a,int b)
	{
		System.out.println(a*b);
	}
	static void divFunction_static(int a,int b)
	{
		System.out.println(a/b);//%
	}
	public void addFunction(int a,int b)
	{
		System.out.println(a+b);
	}
	private void subFunction(int a,int b)
	{
		System.out.println(a-b);
	}
	protected void mulFunction(int a,int b)
	{
		System.out.println(a*b);
	}
	void divFunction(int a,int b)
	{
		System.out.println(a/b);//%
	}
}
