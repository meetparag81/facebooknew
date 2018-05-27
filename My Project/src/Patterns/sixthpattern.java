package Patterns;

public class sixthpattern {

	public static void main(String[] args)
	{
		for(int i =1;i<=4;i++)// this will go to each row
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)// this will print the number 
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	

	}

}
