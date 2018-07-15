package Patterns;
/*    *
	 * *
	* * *
   * * * *
  * * * * *
   * * * * 
    * * *
     * *
	  * */

public class Diamind 
{
	

	public static void main(String[] args) 
	{
		int i,j,k,l,m,n;
		for( i=1;i<=5;i++)
		{	
			for( k=3;k>=i;k--)
			{
			System.out.print(" ");
			}
			for( j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
			
			for( l=4;l>0;l--)
			{	
				for( m=0;m>=l;m++)// for space starts from 0 and increased up to 10th row
				{
				System.out.print(" ");
				}
				for( n=1;n<=l;n++)
				{
					System.out.print(" " +"*" );
				}
				System.out.println("");
			}
			
		

	}
	
	
}
	
