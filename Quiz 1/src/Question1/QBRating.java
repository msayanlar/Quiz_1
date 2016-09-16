package Question1;

import java.util.Scanner;

public class QBRating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What is the total amount of touchdowns that the Quarterback recieved? ");
				double TD = input.nextInt();
		System.out.println("What is the total amount of yards that the Quarterback ran?");
				double Yards = input.nextInt();
		System.out.println("What is the total amount of interceptions that the Quarterback recieved?");
				double INT = input.nextInt();
		System.out.println("What is the total amount of completions that the Quarterback got?");
				double comp = input.nextInt();
		System.out.println("What is the total number of passes attempted that the Quarterback got?");
				double ATT = input.nextInt();

				
			double a = ((comp/ATT)-.3)*5;
			
			if (a>=2.375)
			{
				a=2.375;
			}
			else if (a<=0)
			{		
				a = 0;
			}
			else	
			{
				a = ((comp/ATT)-.3)*5;	
			}
			double b = ((Yards/ATT)-3)*.25;
			
			if (b>=2.375)	
			{
			b=2.375;	
			}
			else if (b<=0)
			{	
			b = 0;
			}
			else	
			{
				b = ((Yards/ATT)-3)*.25;	
			}
			
			
			
		double c = (TD/ATT)*20;
			
			if (c>=2.375)			
			{				
				c=2.375;			
			}
			
			else if (c<=0)
			
			{			
				c = 0;	
			}			
			else		
			{
				c = (TD/ATT)*20;				
			}

			double d = 2.375 - ((INT/ATT)*25);
				
				if (d>=2.375)		
				{			
					d=2.375;		
				}
				else if (d<=0)
				
				{			
					d = 0;	
				}	
				else			
				{
					d = 2.375 - ((INT/ATT)*25);
				}

			
				double QB_Rating = ((a+b+c+d)/6)*100;
				
				
		System.out.printf("The QB rating for this player is %.2f%n", QB_Rating);
	
	}

	
	
	
	
	

}
