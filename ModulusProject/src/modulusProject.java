import java.util.Scanner;

public class modulusProject
{

		public static void main(String[] args)
	{
			oddOrEven();
			leapYear();
			
	}

		public static void oddOrEven()
		{
		Scanner userInput= new Scanner (System.in);
		System.out.println("Please pick a number.");
		int number = userInput.nextInt();
		if (number %2==0)
			{
				System.out.println("That is an even number!");
			}
		else if (number %1==0)
			{
				System.out.println("That is an odd number!");
			}
		
		
		}
		
		public static void leapYear()
		{
			Scanner userInput= new Scanner (System.in);
			System.out.println("Please pick a year.");
			int year = userInput.nextInt();
			
			if (year %4==0)
				{
					System.out.println("That is a leap year");
				}
			else 
			{
				System.out.println("That is not a leap year.");
			}
		
		
		
		
		}
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
