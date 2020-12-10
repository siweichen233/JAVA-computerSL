
public class Q2Test 
{
	
	public static void main (String[] args) 
	{
		System.out.println("Chen siwei");
		int f = 0, x = 1 ;
		int a = f + x;
		int c = 2;
		int n = IBIO.inputInt("Enter a number:  ");
		while (n < 0)
		{
			System.out.println("Error- enter a positive number  ");	
				n = IBIO.inputInt("Enter a number again:  ");
		}
		IBIO.out(f + " " + x + " ");
		for (int i = 2; i <= n; i++)
		{
			a = f + x;
			IBIO.out(a + " ");
			f = x;
			x = a;
		}
		
					
	}
}

