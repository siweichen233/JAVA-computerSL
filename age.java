


public class age 
{
	
	public static void main (String[] args) 
	{
			IBIO.output("=====================");
			String name = IBIO.input("What is you name? ");
			IBIO.output("Nice to meet you," + name);
			int number = IBIO.inputInt("How old are you? ");
			IBIO.output("So you are " + number + " years old.");
		if (number > 17)
			{
				IBIO.output("you are so old");
				IBIO.output("at least you're not dead");
			}
		if (number < 17)
			{
				IBIO.output("ohhh" + number +"is so youny for this job");
				IBIO.output("Too young too simple");
			}
	}
}
/*
 if (number < 0)
			{
				IBIO.output("OK...\n" + number + "years old");
				IBIO.output("are you kidding me?");

=====================
What is you name? siwei
Nice to meet you,siwei
How old are you? 18
So you are 18 years old.
you are so old
at least you're not dead

=====================
What is you name? siwei
Nice to meet you,siwei
How old are you? 16
So you are 16 years old.
Too young too simple


  
  
  
  
  
  
  
  
 * /
