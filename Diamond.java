class Diamond
{
	
	
	
	void A()
	{
	int i,j;

	
	for(i=1;i<=4;i++)
		{
	for(j=4;j>=i;j--){
	System.out.print(" ");
	
	}

	for(int k=1;k<=(2*i)-1;k++)
	{
	System.out.print("*");
	}
System.out.println();
	}
	
	



	for(i=1;i<=4;i++)
		{
	for(j=1;j<=i;j++){
	System.out.print(" ");
	
	}

	for(int k=7;k>=(2*i)-1;k--)
	{
	System.out.print("*");
	}
System.out.println();
	}









	
	
	
	}




	
	
	
	
	
	public static void main(String[] args) 
	{

		Diamond a=new Diamond();
		a.A();
      



	}
}