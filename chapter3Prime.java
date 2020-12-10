

public class chapter3Prime 
{
	
	public static void main (String[] args) 
	{
		int divitor = 1;
		int number = IBIO.inputInt("plz enter a number");
		do
		{
			divitor++;	
		}
		while ( number % divitor != 0 );
		{
			System.out.println( number + " is divisible by " + divitor );
		}
		
	}
}

