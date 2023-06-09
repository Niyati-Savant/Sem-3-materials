import java.util.*;

class MaxMarks
{
public static void main(String h[])
{
int sum,max,n,i;
sum=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number of subjects ");
 n=obj.nextInt();

int marks[]=new int[n];

for(i=0;i<n;i++)
{
System.out.println("Enter the marks of subject " + (i+1) );
marks[i] = obj.nextInt();
}

for ( i=0; i<n; i++)
     {
         sum=sum+ marks[i];
      }
System.out.println("The sum of all the marks is "+ sum);

max=marks[0];
 for ( i=1; i<n; i++)
     {
         if (max<marks[i])
	max=marks[i];
      }
System.out.println("The Maximum of all the marks is "+ max);

}
}
