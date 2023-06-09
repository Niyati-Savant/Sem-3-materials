import java.util.*;

class Matrix
{

boolean check(int a[][])
{
if(a.length==a[0].length)
return true;
else
return false;
}

void display(int a[][])
{
System.out.println("The Entered Matrix is ");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[0].length;j++)
	System.out.print(a[i][j] + " ");
System.out.println();
}
}

void sum(int a[][])
{
int sum=0;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[0].length;j++)
	{
	if(i==j)
	sum=sum+a[i][j];
	}

}
System.out.println("The sum is=" + sum);
}


public static void main(String h[])
{
int m,n,i,j;

Matrix m1=new Matrix();
Scanner obj=new Scanner(System.in);

System.out.println("Enter number of rows");
m=obj.nextInt();
System.out.println("Enter number of rows");
n=obj.nextInt();

int a[][]=new int[m][n];

System.out.println("Enter elements");
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
	a[i][j]=obj.nextInt();
}

m1.display(a);

if(m1.check(a))
{
System.out.println("A Square Matrix.Calculating the sum of Diagonal elements");
m1.sum(a);
}

else
{
System.out.println("Not a Square Matrix.Exiting the program");
System.exit(0);
}

}
}

