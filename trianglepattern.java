class trianglepattern
{
public static void main(String args[])
{  int i,j,k,l;

	for(i=1;i<=5;++i)
	{
		for(j=1;j<=9;j++)
		{
		if((i==5)||(i+j==6)||(j-i==4))
			{System.out.print("*");}
		else{System.out.print(" ");}
	
	}
System.out.println();
}
}
}