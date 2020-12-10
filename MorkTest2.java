

public class MorkTest2 
{
	
	public static void main (String[] args) 
	{
		System.out.println("Chen siwei");
		int number = IBIO.inputInt("Enter a number more than 5  ");
		while( number < 5)
			{
			System.out.println("Error number that less than 5");
			number = IBIO.inputInt("Error!!! -- Enter a number < 5 " );
			}
		
		int min = 0, max = 0, freq = 0;
		double sum = 1;
		for(int i = 0; i < number; i++)
		{
			int n = IBIO.inputInt("Enter a number: ");
			sum = sum + n;
			if( i == 0 )
			{
					min= n;
					max= n;
				} else
				{
					if(n < min)
					min = n;
					if(n > max)
					max = n;
				}
				int divisor = 1;
				do
				{
					divisor++;
				}
				while(n % divisor != 0);
				if (n == divisor)
					freq++;
			
		}
				
			System.out.println("maximum = " + max);
			System.out.println("minimum = " + min);
			System.out.println("Average = " + sum/number);
			System.out.println("prime frequency = " + freq);
		
	}
}

