/**
 * Josh Bauer 
 * Period 7
 * Program 2
 */

import java.util.Scanner;

public class Doubles {

	public static void main(String[] args) 
	{
		
		DiceClass dice1 = new DiceClass();
		
		Scanner in = new Scanner(System.in);
		
		int count = 0;
		int rollOne = 0;
		int rollTwo = 0;
		
		System.out.println("Please enter a value between 1 and 6: ");
		int num = in.nextInt();
		in.nextLine();
		
		
		while (num < 1 || num > 6)
		{
			System.out.println("Please enter a value between 1 and 6: ");
			num = in.nextInt();
			in.nextLine();
		}
		
		while (rollOne != num || rollTwo != num)
		{
			rollOne = dice1.roll();
			rollTwo = dice1.roll();
			
			count++;
			
			System.out.println("\n" + rollOne + " " +  rollTwo);
		
		}
		System.out.println("\nnumber of rolls: " + count);
		}  

}
