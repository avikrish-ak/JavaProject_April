package day11;



public class Program4 {

	public static void main(String[] args) {
		int a=1;
		int end=100;
		int x= 12;
		while(a<=end)
		{
			if(a%x==0)
			{
				System.out.println(a);
			}	
			a=a+1;
		}

	}

}
