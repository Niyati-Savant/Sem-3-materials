import java.lang.*;
import java.util.*;

class  Registration extends Exception
{	
	Registration(String str)
	{
	super(str);	
	}

     public static void main(String h[])
	{	int age,wt,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to the process of registration ");
	         	do
		{	

			System.out.println("Enter Age");
			age=sc.nextInt();

			System.out.println("Enter Weight");
			wt=sc.nextInt();
			try
			{	
 				if(age<=10 && wt<=40)
				{
				Registration r=new Registration("Not eligible");
				throw r;	
				}

				else
				System.out.println("Registered");

			} catch(Registration r)
			{

			System.out.println("Exception is "+r);	

			}
		System.out.println("Press 0 to stop entering details of more students");
			num=sc.nextInt();
		} while(num!=0);	
	}
 }
