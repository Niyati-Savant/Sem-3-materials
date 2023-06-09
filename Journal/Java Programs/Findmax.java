import java.util.* ;
 class Maximum
{
int Data()
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the Numbers" );
int a =obj.nextInt();
int b =obj.nextInt();
int c =obj.nextInt();

int max = a>b ? (a>c ? a: c) : (b>c?b:c);
return max;
}
}

class Findmax
{
public static void main(String h[])
{
Maximum m1= new Maximum();
System.out.println("The maximum of three numbers  is " + m1.Data() );

}
}