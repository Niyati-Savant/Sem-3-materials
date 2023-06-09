import java.util.*;
public class Typesofdata
{
    public static void main(String h[] ) 
    {
        int upper = 0, lower = 0, digit = 0, blank = 0, special = 0;
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string ");
        String input=sc.nextLine();

        for(int i=0; i< input.length(); i++)
        {	
        ch = input.charAt(i);

		if(ch >='A' && ch <= 'Z') 		
            upper=upper + 1;

	    else if(ch >='a' && ch <= 'z')	
        	lower=lower +1;

	    else if(ch >='0' && ch <= '9')
        		digit=digit+1;
        
	    else if(ch ==' ' )
        		blank=blank+1;
        
	    else 	
            special =special+1;
        } 

        System.out.println("There are "+ upper+" uppercase letters.");
        System.out.println("There are "+lower +" lowercase letters ");
        System.out.println("There are " +special + " special characters");
        System.out.println("There are " + digit + " digits");
        System.out.println("There are " +blank + " blank spaces");
    }
}
