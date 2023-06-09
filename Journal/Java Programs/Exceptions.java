import java.util.*;

public class Exceptions
{
    public static void main(String h[])
    {
       int b,x,y;
       
    
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter any index number");
       x=sc.nextInt();

       int array[] = {5,10,15,20,0} ;
            try
            {
                b=array[x]/array[4];
                System.out.println("Answer is "+ b);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Attempted division by 0");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index is only 4");
            } 

           
            try
            {
                System.out.println("Enter any value to be stored in int array");
                y=sc.nextInt();
            }
            catch(ArrayStoreException e)
            {
                System.out.println("Only integers are allowed");
            }
    }
}
