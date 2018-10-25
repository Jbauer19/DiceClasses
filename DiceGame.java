import java.util.Scanner;

/**
 * October 23 2018
 * @author Josh Bauer
 * Period 7
 */
public class DiceGame 
{

	public static void main(String[] args) 
	{
		DiceClass dice1 = new DiceClass();
		DiceClass dice2 = new DiceClass();
		
		Scanner in = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Welcome to Craps, press enter to begin");
		String enter = in.nextLine();
		
		int sum = dice1.roll() + dice2.roll();
		System.out.println("You rolled a " + sum);
		enter = in.nextLine();
		
		boolean userChoice = true;
		
		while (userChoice)
		{
			if (sum == 7 || sum == 11)
			{
				System.out.println("You win! Would you like to play again? (y or n)");
				enter = in.nextLine();
				if (enter.equals("y"))
				{
					main(args);
				}
				if (enter.equals("n"))
				{
					System.exit(0);
				}
			}
			
			if (sum == 2 || sum == 12)
			{
				System.out.println("You lose. Would you like to play again? (y or n)");
				enter = in.nextLine();
				if (enter.equals("y"))
				{
					main(args);
				}
				if (enter.equals("n"))
				{
					System.exit(0);
				}
				
			}
			
			else
			{
				
				boolean choice = true;
				int point = 0;
				
				while (choice)
				{		
					point = sum;
					
					System.out.println("The point is now " + sum + ", press enter to roll again");
					enter = in.nextLine();
					
					sum = dice1.roll() + dice2.roll();
					System.out.println("You rolled a " + sum);
					
					if (sum == 7 || sum == point)
					{
						choice = false;
					}
				}
				
				if (sum == 7)
				{
					System.out.println("\nYou lose. Would you like to play again? (y or n)");
					enter = in.nextLine();
					if (enter.equals("y"))
					{
						main(args);
					}
					else if (enter.equals("n"))
					{
						System.exit(0);
					}
					
				}
				else if (sum == point)
				{
					System.out.println("\nYou win! Would you like to play again? (y or n)");
					enter = in.nextLine();
					if (enter.equals("y"))
					{
						main(args);
					}
					else if (enter.equals("n"))
					{
						System.exit(0);
					}
					
				}
			}
		}
	}
}
