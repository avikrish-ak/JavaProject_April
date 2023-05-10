package day15;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of value to insert in array :- ");
		int n= scan.nextInt();
		int x[] = new int[n];
		scan.close();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter value in array :- ");
			x[i]= scan.nextInt();
		}
		
		for(int y:x)
		{
		System.out.println(y);
		}

	}

}

