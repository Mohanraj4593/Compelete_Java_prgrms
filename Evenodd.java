class Evenodd 
{ 
	
	void calculate()
	{ int a[]={10,11,12,13,15};
	for(int i=0;i<=a.length-1;i++)
		{ 
			if(a[i]%2==0)
				{
			System.out.print(a[i]+"number is even \n");
				}
			else
				{
            System.out.print(a[i]+"number is odd \n ");
				}
		}
		

	}
	public static void main(String[] args) 
	{
		Evenodd b=new Evenodd();
		b.calculate();
	}
}
