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
		for(int i=1;i<=5;i++)
		{	
			for(int k=3;k>=i;k--)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println("");
			
			for(int l=1;l>5;l--)
			{	
				for(int m=3;m<=i;m++)
				{
				System.out.print(" ");
				}
				for(int n=1;n>=l;n++)
				{
					System.out.print("*" + " ");
				}
				System.out.println("");
			}
		}	

	}
	
	
}
	
