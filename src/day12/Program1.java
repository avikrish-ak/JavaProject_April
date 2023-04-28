package day12;

public class Program1 {

	public static void main(String[] args) {
		int n=10;
		int a=1;
		int result=1;
		while(a<=n)
		{
			result = result *a;
			System.out.println(a+"   "+result);
			a=a+1;
		}
	}

}
