import java.lang.*;

class Sum
{
public static void main(String h[])
{
int i,sum;
sum=0;

for(i=101 ; i<200 ; i++)
{
if (i%7 == 0)
sum=sum+i;
}
System.out.println("The sum of numbers between 100 and 200 which are divisible by 7 is " + sum);
}
}