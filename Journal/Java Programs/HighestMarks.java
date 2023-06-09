import java.lang.*;
import java.util.*;

class StudentDetails
{
int roll,math,phy,chem,total;
String name;

    void getdata()
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your name");
    name=obj.nextLine();

    System.out.println("Enter your Roll Number");
    roll=obj.nextInt();

    System.out.println("Enter your Maths marks");
    math=obj.nextInt();

    System.out.println("Enter your Physics marks");
    phy=obj.nextInt();

    System.out.println("Enter your Chemistry marks");
    chem=obj.nextInt();

    }
    void calculate()

    {
        total=phy+chem+math;

    }

     void display()
    {
      
       System.out.println(roll+ "\t\t" +  name +  "\t \t "  +   total); 
        
    }
}

class HighestMarks
{
    public static void main(String a[])
    {
        int n=5;
         StudentDetails s[]=new StudentDetails[n];

        for(int i=0;i<n;i++)
        {
            s[i]=new StudentDetails();
            System.out.println("Enter the details of Student " + (i+1));
            s[i].getdata();
            s[i].calculate();
        }

         System.out.println("Roll \t\t Name \t\t   Total ");
        for(int i=0;i<n;i++)
        {   
            s[i].display();  
        }

        int max=s[0].total;
        int pos=0;
         for(int i=0;i<n;i++)
        {
            if(s[i].total>max)
            {
                max=s[i].total;
                pos=i;

            }
        }
    

       System.out.println("Student "+ (pos+1)+ " i.e, " +s[pos].name +" has the highest marks " + max); 
    }
}


