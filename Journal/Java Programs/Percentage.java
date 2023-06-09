import java.util.* ;

class Percentage
{
public static void main(String h[])
{
Scanner obj = new Scanner(System.in);
 System.out.println("Enter your Grades ") ;

char grade= obj.next().charAt(0);

if (grade=='A' || grade== 'a')
{
System.out.println("Your percentage is in the range 91-100 ") ;
}

else if (grade=='B' || grade== 'b')
{
System.out.println("Your percentage is in the range 81-90 ") ;
}

else if (grade=='C' || grade== 'c')
{
System.out.println("Your percentage is in the range 71-80 ") ;
}

else if (grade=='D' || grade== 'd')
System.out.println("Your percentage is in the range 61-70 ") ;


else if (grade=='F' || grade== 'f')
System.out.println("Your percentage is in the range 0-60 ") ;

else
System.out.println("Wrong Grade entered ") ;

}
}