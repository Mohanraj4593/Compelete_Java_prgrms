class Pattern10
{
	public static void main(String[] args) 
{ int i,j,k,m,n;

	for(i=1;i<=10;i++)
	{
	
	for(j=10;j>=i;j--)
	{
	System.out.print(" ");
	}
	
	for(k=1;k<=(i*2)-1;k++)
	{
	System.out.print("*");
	}
	System.out.println();

	}

			for (i = 1; i <=5; i++) {  
    
            // Left rectangle  
            for (j = 1; j <=8; j++)  
                System.out.print("*");  
    
            // Center Space rectangle  
            for (j = 9; j <=11; j++)  
                System.out.print(" ");  
    
            // Right rectangle  
            for (j = 12; j <=19; j++)  
                System.out.print("*");  
    
            System.out.println();  
			}
		

}
}