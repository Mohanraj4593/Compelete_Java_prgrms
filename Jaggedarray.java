class Jaggedarray
{ 
public static void main(String[] args)
{

int count=1;
int[][] a=new int[2][];

a[0]=new int[3];

a[1]=new int[2];

for(int i=0;i<a.length;i++)
	{
for(int j=0;j<a[i].length;j++)
	{

a[i][j]=count++;
	}
	}

	System.out.println("The elements stored in array are.....");

for(int i=0;i<a.length;i++)
	{
for(int j=0;j<a[i].length;j++)
	{

System.out.print(a[i][j]);
	}
	System.out.println(" ");
	}
	


}

}