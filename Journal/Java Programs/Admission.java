import java.io.* ;

class Admission
{
public static void main(String h[])throws IOException
{
InputStreamReader isr= new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);

System.out.println("Enter Maths marks");
int math=Integer.parseInt(br.readLine());

System.out.println("Enter Chemistry marks");
int chem=Integer.parseInt(br.readLine());

System.out.println("Enter Physics marks");
int phy=Integer.parseInt(br.readLine());

int total=math + chem + phy;
if(math>=60 && chem>=40 && phy>=50 && total>=200)

System.out.println("Eligible for Admission");
else
System.out.println("Better Luck next time");
}
}