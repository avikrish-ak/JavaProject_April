package day15;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		
		int x[] = {10,90,30,20,40,15};//6
		
		
		System.out.println(x.length);
		
		System.out.println(x[0]);
		System.out.println("for loop");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("For each loop");
		for(int y:x)
		{
			System.out.println(y);
		}

		System.out.println(Arrays.toString(x));
		System.out.println(x);
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		int u[]=Arrays.copyOf(x, x.length);
		System.out.println(Arrays.toString(u));
		u[0]=200;
		System.out.println("After change value");
		System.out.println(Arrays.toString(u));
		System.out.println(u);
		System.out.println(x);
		System.out.println(Arrays.toString(x));
	}

}
