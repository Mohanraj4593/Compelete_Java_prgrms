class Timerglass 
{

static class A
{
	int i,j,k;

		void m1(){
		for(i=7;i>=1;i--)
		{

		for(j=1;j<=i;j++)
		{
		System.out.print(" ");
		}

		for(k=7;k>=(i*2)-1;k--)
		{
			System.out.print("*");
		}
System.out.println();
	}
	
	}
}

 static class B
{
	 void m2(){
for(int i=1;i<=4;i++)
{
for(int j=4;j>=i;j--)
	{
System.out.print(" ");
}
		for(int k=1;k<=(i*2)-1;k++)
		{
			System.out.print("*");
		}

System.out.println();
}
}

}
	
	
	public static void main(String[] args) 
{
A a=new A();
a.m1();
B b=new B();
b.m2();
}
}