import java.util.Scanner;
import java.util.*;

class Accountinfo
	{
String name;
int age;
int pnumber;

void information()
{

Scanner sc=new Scanner(System.in);


System.out.println("Enter the account holder name");
name=sc.nextLine();

System.out.println("Enter the age of an account holder");
age=sc.nextInt();

System.out.println("Enter the phonenumber of an account holder");
pnumber=sc.nextInt();

System.out.println("name is="+name+"Age is="+age+"Phone nummber is="+pnumber);
	}
	}

