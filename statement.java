package Day2;

import java.util.Scanner;

public class statement 

{

	public static void main(String[] args) 
	
	{
		Scanner input  = new Scanner (System.in);
		String answer;
		do 
		
		{
		System.out.println("Werlcome");
		System.out.println("Enter the Quantity = ");
		int Quantity=input.nextInt();
		System.out.println("Enter the price = ");
		int Price=input.nextInt();
		double total=Quantity*Price;
		System.out.println("total = " + total);
		
		System.out.println("**********************");
		
		System.out.println("do you want to perform again");
		answer=input.next();
		
		} 
		
		while(answer.equals("Yes"));
		
	}

}
