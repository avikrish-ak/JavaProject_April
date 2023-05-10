package day15;

public class Program1 {

	public static void main(String[] args) {
		
		int x[] = new int[5];
		
		//0-4 (5-values in x)
		
		x[0]=10;
		x[4]=60;
		x[2]=30;
		
		System.out.println(x[0]);
		System.out.println("for-loop");
		for(int i=0;i<=4;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("While");
		int a=0;
		while(a<5)
		{
			System.out.println(x[a]);
			a++;
		}
		
		System.out.println("for-each loop");
		
		for(int y:x)//10 0 30 0 60
		{
			System.out.println(y);
		}
		

	}

}
