

public class Q1Test 
{
	
	public static void main (String[] args) 
	{
		int base;
		IBIO.output(" CHEN siwei ");
		IBIO.output("=====================");
		base = IBIO.inputInt("Enter a positive number less than 10: ");
		while (base >= 10 || base < 1 )
			{
				base = IBIO.inputInt ("Error please enter again  ");
				}
			/*
				IBIO.output("Error - invalid input ");
				System.exit(0);*/
			
		for (int i = 1; i <= base; i++)
			{
				IBIO.output(i);
			}
		IBIO.output("=====================");
		int square;
		for (int n = 1; n <= base; n++)
			{
				square= n*n;
				IBIO.output( n +"\t" + square);
			}
		IBIO.output("=====================");
		int power = 1;
		for (int x = 1; x <= base; x++)
			{
				square= x*x;
				power= power*base;
				IBIO.output( x + "\t" + square + "\t" + power);
				
			}
		IBIO.output("=====================");
			}
		
	}


