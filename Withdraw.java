import java.util.Scanner;
import java.util.*;


class Withdraw
{
	int k,wb;
	int t;	
	
void withdrawb(){
	Accountbalance ab=new Accountbalance();
	t=ab.balance();
	
	
	System.out.println("Enter the the amount that u wish to withdraw");
	Scanner sc=new Scanner(System.in);
	k=sc.nextInt();
	

	if(k>t)
	{
	System.out.println("Entered amount is greater than your account balace cannot be withdraw");
	}

	else
	{
	wb=t-k;
	// int h=t-wb;
	System.out.println("The remaining balance is="+wb);
}
	}	
	

}
