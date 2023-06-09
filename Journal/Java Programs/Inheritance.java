

import java.lang.*;
import java.util.*;

class Staff
{
int code;
String name;
String address;
Scanner obj=new Scanner(System.in);

void setdataStaff()
	{
	System.out.println("Enter Name ");
	name=obj.nextLine();
	System.out.println("Enter Address");
	address=obj.nextLine();
	System.out.println("Enter code ");
	code=obj.nextInt();
	}
	
void putdataStaff()
	{
	System.out.println("Name is "+name);
	System.out.println("Address is "+address);
	System.out.println("Code is "+code);
	}
}

class Teacher extends Staff
{
Scanner obj1=new Scanner(System.in);
String sub;
int std;
void setdataTeacher()
	{
	super.setdataStaff();
	System.out.println("Enter Subject ");
	sub=obj1.nextLine();
	System.out.println("Enter Standard ");
	std=obj1.nextInt();
	
	
	}
	
void putdataTeacher()
	{
	super.putdataStaff();
	System.out.println("Subject is "+sub);
	System.out.println("Class is "+std);
	}
}

class Officer extends Staff
{
Scanner obj2=new Scanner(System.in);
char grade;
void setdataOfficer()
	{
	super.setdataStaff();
	System.out.println("Enter Grade ");
	grade=obj2.next().charAt(0);
	}
	
void putdataOfficer()
	{
	super.putdataStaff();
	System.out.println("Grade is "+ grade);
	}
}

class Typist extends Staff
{
Scanner obj3=new Scanner(System.in);
int speed;

void setdataTypist()
	{
	super.setdataStaff();
	System.out.println("Enter Speed i.e words typed per minute  ");
	speed=obj3.nextInt();
	}
	
void putdataTypist()
	{
	super.putdataStaff();
	System.out.println("Speed is "+speed);
	}
}

class Regular extends Typist
{
Scanner obj4=new Scanner(System.in);
int basic_pay;

void setdataRegular()
	{
	super.setdataTypist();
	System.out.println("Enter basic pay  ");
	basic_pay=obj4.nextInt();
	}
	
void putdataRegular()
	{
	super.putdataTypist();
	System.out.println("Basic Pay is "+ basic_pay);
	}
}

class Adhoc extends Typist
{
Scanner obj5=new Scanner(System.in);
int daily_pay;

void setdataAdhoc()
	{
	super.setdataTypist();
	System.out.println("Enter daily pay  ");
	daily_pay=obj5.nextInt();
	}
	
void putdataAdhoc()
	{
	super.putdataTypist();
	System.out.println("Daily Pay is "+ daily_pay);
	}
}

class Inheritance
{
	public static void main(String h[])
	{ int choice,ans;
	System.out.println("1 Teacher");
	System.out.println("2 Officer");
	System.out.println("3 Adhoc Typist");
	System.out.println("4 Regular Typist");

	Scanner sc=new Scanner(System.in);
	
	
	do
	{
	System.out.println("Whose Details do you want to enter?");
	choice =sc.nextInt();
	switch(choice)
	{
	case 1:
	Teacher t=new Teacher();
	System.out.println("Teacher Details");
	t.setdataTeacher();
	t.putdataTeacher();
	break;
	
	case 2:
	Officer o=new Officer();
	System.out.println("Officer Details");
	o.setdataOfficer();
	o.putdataOfficer();
	break;

	case 3:
	Adhoc a=new Adhoc();
	System.out.println("Adhoc Typist Details");
	a.setdataAdhoc();
	a.putdataAdhoc();
	break;

	case 4:
	Regular r=new Regular();
	System.out.println("Regular Typist Details");
	r.setdataRegular();
	r.putdataRegular();
	break;

	default:
	System.out.println("Wrong choice");
	}

	System.out.println("Press 1 to continue");
	ans=sc.nextInt();
	}while(ans==1);
	}
}

