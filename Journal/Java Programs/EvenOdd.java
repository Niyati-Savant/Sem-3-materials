import java.util.* ;

class EvenOdd
{
	public static void main(String h[])
	{
	int even,odd,i;
	even=0;
	odd=0;
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the number of  elements");
	int num =obj.nextInt();
	int [] numbers= new int[num];
	System.out.println("Enter the   elements");
	for(i=0;i<num;i++)
		{
		numbers[i]=obj.nextInt();
		}
	
	for(i=0;i< numbers.length ;i++)
		{
		if (numbers[i] % 2 == 0)
		even = even +1;
		else
		odd=odd +1;
		}
	System.out.println("There are " + even + " even numbers in your array");
	System.out.println("There are " + odd +" odd numbers in your array");	
	}	
}