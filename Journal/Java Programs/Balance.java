import java.lang.*;
import java.util.*;

class  Balance extends Exception
{	
	Balance(String str)
	{
	super(str);	
	}

     	public static void main(String h[])
	{	int save,amt,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to the Bank ");
	         	do
		{	

			System.out.println("Enter Balance amount");
			save=sc.nextInt();

			System.out.println("Enter Amount to be withdrawn");
			amt=sc.nextInt();
			try
			{	
 				if(amt>save)
				{
				Balance b=new Balance("Insufficient Balance");
				throw b;	
				}

				else
				System.out.println("Successful withdrawal ");

			} catch(Balance b)
			{
			System.out.println("Exception is "+b);	
			}
		System.out.println("Press 0 to stop withdrawing more money");
			num=sc.nextInt();
		} while(num!=0);	
	}
 }
