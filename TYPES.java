class trianglepattern
{
public static void main(String args[])
{

	for(int i=1;i<=5;++i)
	{
		for(int j=5;j>=i;j--)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=9;k=k+2)
		{
			System.out.print("*");
		}
		System.out.println();
	
	}
}
}