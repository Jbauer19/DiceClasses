
public class DiceArray 
{

	public static void main(String[] args) 
	{
		DiceClass dice1 = new DiceClass();
		DiceClass dice2 = new DiceClass();
		
		int[] rollArray = {0,1,2,3,4,5,6,7,8,9,10,11,12};
		int[] counterArray = new int[13];
		
		for (int i = 0; i < 1000; i++)
		{
			int sum = dice1.roll() + dice2.roll();
			
			if (sum == rollArray[sum])
			{
				counterArray[sum]++;
			}
			
		}	
		
		for (int i = 2; i < 12; i++)
		{
			System.out.println( i + ": " + counterArray[i]);
		}
	}

}
