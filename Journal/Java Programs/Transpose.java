import java.util.*;

class Transpose
{
public static void main(String h[])
{

int m,n,i,j;

Transpose  t1=new Transpose();
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

t1.display(a);
t1.transpose(a);
}

void display(int a[][])
{
int i,j;
System.out.println("The Entered Matrix is ");

for( i=0;i<a.length;i++)
{
	for( j=0; j<a[0].length; j++)
	System.out.print(a[i][j] + "   ");
System.out.println();
}

}


void transpose(int a[][])
{
int i,j,temp;

for( i=0;i<a.length;i++)
{
	for( j=0;j<i;j++)
	{
	temp=a[i][j];
	a[i][j]=a[j][i];
	a[j][i]=temp;
	}
}

System.out.println("The Transpose of the matrix is ");

for(i=0;i<a.length;i++)
{
	for( j=0;j<a[0].length;j++)
	System.out.print(a[i][j] + "   ");
System.out.println();
}

}
}

