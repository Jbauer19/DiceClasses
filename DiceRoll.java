/**
 * Josh Bauer 
 * Period 7
 * Program 1
 */

import java.util.Scanner;

public class DiceRoll 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		DiceClass dice1 = new DiceClass();
		
		DiceClass dice2 = new DiceClass();
		
		int count = 0;
		
		System.out.println("Enter a Value: ");
		int dub = in.nextInt();
		while (dub > 12 || dub < 2)
		{
			System.out.println("Please enter a value between 2 and 12");
			dub = in.nextInt();
		}
		
		
		int rollOne = 0;
		int rollTwo = 0;
		
		while (dub != rollOne + rollTwo)
		{
			rollOne = dice1.roll();
			rollTwo = dice2.roll();
			int rollSum = rollOne + rollTwo;
			System.out.println(rollOne + "+" + rollTwo + "=" + rollSum );
			count++;
		}
		System.out.println("number of rolls: " + count);
		}

}
 