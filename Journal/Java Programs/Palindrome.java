import java.util.*;

public class Palindrome
 {
    public static void main(String h[]) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string ");
        String given=sc.nextLine();
        String reverse= reverseString(given);

        System.out.println("The input String is " + given );
        System.out.println("The reverse of the String is " + reverse );

        if (given.equals(reverse))
            System.out.println("The input String is a palindrome.");

        else
            System.out.println("The input String is a palindrome.");
  
    }

    public static String reverseString(String x)
    {
        String rev="";
        int i,len;
        len=x.length();
        for (i = len - 1; i >= 0; i--)
             rev =rev + x.charAt(i);
    
        return rev;
    } 
 }