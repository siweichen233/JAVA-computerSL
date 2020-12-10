
public class MorkTest 
{
	
	public static void main (String[] args) 
	{
		String name = IBIO.input(" What is your name? ");
		IBIO.output("Nice to meet you," + name );
		int number1 = IBIO.inputInt("Enter the base ");
		IBIO.output("So the base is " + number1);
			if (number1 == 0)
			{
			IBIO.output("Base = 0, No thing to do");
			System.exit(0);
			}
		int number2 = IBIO.inputInt("Enter the exponent ");
			if (number2 < 0 )
			{
			IBIO.output("Warning: exponent should be positive");
			System.exit(0);
			}
		int temp = 1;
		for (int i = 0;i < number2; i++)
			{
				temp = number1*temp;
			}
		IBIO.output( number1 + " to the power of " + number2 + " is " + temp);
		
/* 
		  
What is your name? siwei
Nice to meet you,siwei
Enter the base 2
So the base is 2
Enter the exponent 5
2 to the power of 5 is 32
		
*/
	}
}

