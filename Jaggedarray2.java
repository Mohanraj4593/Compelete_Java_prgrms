class Jaggedarray2
{
public static void main(String[] args)
{
int count=0;
int[][][] a=new int[2][][];

a[0]=new int[2][];
a[1]=new int[3][];

a[0][0]=new int[2];
a[0][1]=new int[2];


a[1][0]=new int[3];
a[1][1]=new int[4];
a[1][2]=new int[3];

for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
		{
		for(int k=0;k<a[i].length;k++)
			a[i][j][k]=count++;
		}
	}

System.out.println("The stored values in the array are as follows...");
for(int i=0;i<a.length;i++)
	{
	for(int j=0;j<a[i].length;j++)
		{
		for(int k=0;k<a[i].length;k++)
			System.out.print(a[i][j][k]);
		}
		System.out.println(" ");
	}





}

}