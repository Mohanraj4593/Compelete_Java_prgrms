class Pattern9
{
	public static void main(String[] args) 
{ int i,j,k;

	for(i=1;i<=5;i++)
	{
	
	for(j=5;j>=i;j--)
		{
	System.out.print(" ");
	}
	
	for(k=1;j<=9;j=j+2)
		{
	System.out.print("*");
	}

	System.out.println();


	}


		

}
}