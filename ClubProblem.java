
public class ClubProblem 
{
	public static void main (String[] args) 
	{
		int number = IBIO.inputInt("Enter a number   ");
		int x = 0;
		int anser;
		while (x < 10)
		{	x++;
			anser = x * number;
			System.out.println( anser );
		}
		/*
		 Enter a number   4
		4
		8
		12
		16
		20
		24
		28
		32
		36
		40
		 
		 
		 */
		 
	}	
}

