import java.util.* ;

class Employee
{
String name,depart,post;
int id,age ;
public static void main(String h[])
{
Employee e1 = new Employee() ;
e1.Details(); 
e1.Print(); 
}

void Details()
{
Scanner obj = new Scanner(System.in);

System.out.println("Enter your Name");
 name = obj.nextLine();

System.out.println("Enter your Post");
 post = obj.nextLine();

System.out.println("Enter your Age");
 age = obj.nextInt();
 obj.nextLine();
System.out.println("Enter your Department");
depart = obj.nextLine();

System.out.println("Enter your ID");
 id = obj.nextInt();
}

void Print()
{
System.out.println("Your Name is " + name);
System.out.println("Your ID is " + id);
System.out.println("Your Age is " + age);
System.out.println("Your Department is " + depart);
System.out.println("Your Post is " + post);
}
}