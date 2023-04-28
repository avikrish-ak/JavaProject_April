package day10;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Mobile Brand :- ");
		String brand = scan.next();
		int price;
		String colour;
		if(brand.equals("apple"))
		{
			System.out.println("Enter Apple Mobile Price Range :- ");
			price = scan.nextInt();
			if(price>=50000 && price<=150000)
			{
				System.out.println("Enter the Apple Mobile colour");
				colour = scan.next();
				if(colour.equals("red")||colour.equals("silver")){
					System.out.println("Apple Mobile is avaiable");
				}
				else
				{
					System.out.println("Apple Mobile is not avaiable");
				}
			}
			else
			{
				System.out.println("Apple Mobile is not avaiable");
			}

		}
		else if(brand.equals("oppo"))
		{

			System.out.println("Enter Oppo Mobile Price Range :- ");
			price = scan.nextInt();
			if(price>=15000 && price<=120000)
			{
				System.out.println("Enter the Oppo Mobile colour");
				colour = scan.next();
				if(colour.equals("black")||colour.equals("silver")){
					System.out.println("Oppo Mobile is avaiable");
				}
				else
				{
					System.out.println("Oppo Mobile is not avaiable");
				}
			}
			else
			{
				System.out.println("Oppo Mobile is not avaiable");
			}

		}
		else if(brand.equals("vivo"))
		{

			System.out.println("Enter Vivo Mobile Price Range :- ");
			price = scan.nextInt();
			if(price>=12000 && price<=100000)
			{
				System.out.println("Enter the vivo Mobile colour");
				colour = scan.next();
				if(colour.equals("red")||colour.equals("silver")){
					System.out.println("vivo Mobile is avaiable");
				}
				else
				{
					System.out.println("Vivo Mobile is not avaiable");
				}
			}
			else
			{
				System.out.println("Vivo Mobile is not avaiable");
			}

		}

		else
		{
			System.out.println("Not available..!");
		}

		scan.close();

	}

}
