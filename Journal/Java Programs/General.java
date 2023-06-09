import java.lang.*;
import java.util.*;

class EmployeeDetails
{
int id;
int hours;
int wages;
String name;

    void getdata()
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your name");
    name=obj.nextLine();

    System.out.println("Enter your ID");
    id=obj.nextInt();

    System.out.println("Enter the number of working hours");
    hours=obj.nextInt();

    }

    void calculate()

    {
    wages=hours*100;

    }

    void display()
    {
      
       System.out.println(id+ "   " +  name +  "\t \t "  +  hours +  " \t \t"    +  wages); 
        
    }
    
}

class General
{
    public static void main(String a[])
    {
        int n=5;
         EmployeeDetails e[]=new EmployeeDetails[n];

        for(int i=0;i<n;i++)
        {
            e[i]=new EmployeeDetails();
            System.out.println("Enter the details of employee " + (i+1));
            e[i].getdata();
            e[i].calculate();
        }

         System.out.println("Id   Name \t   Hours \t Wages");
        for(int i=0;i<n;i++)
        {   
            e[i].display();  
        }

        int max=e[0].wages;
        int pos=0;
         for(int i=0;i<n;i++)
        {
            if(e[i].wages>max)
            {
                max=e[i].wages;
                pos=i;

            }
        }

       System.out.println("Employee "+ (pos+1)+ " i.e, " +e[pos].name +" has the highest salary of Rs " + max); 
    }
}

