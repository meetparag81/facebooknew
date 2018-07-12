package Interface;

public class S implements R
{

	public static void main(String[] args) 
	{
		S obj = new S();
		obj.Add();

	}

	@Override
	public void Add() 
	{
		System.out.println("implement S");
		
	}

}
