import java.lang.* ;
 class MinMax
{
public static void main(String h[])
{
int a =Integer.parseInt(h[0]);
int b =Integer.parseInt(h[1]);
int c =Integer.parseInt(h[2]);

int max = a>b ? (a>c ? a: c) : (b>c?b:c);
int min = a<b ? (a<c ? a: c) : (b<c?b:c);
System.out.println("The greatest number out of  " + a+ "," + b + ","  + c +" is :" + max);
System.out.println("The least number out of  " + a+ "," + b + ","  + c +" is :" + min);
}
}