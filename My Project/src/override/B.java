package override;

public class B extends A
{
	public String Add()// return type of overriden method should be the same.
	{
		return null;
		
	}
	
	public void Sum() // final acess modifier can not be overriden
	{
		
	}
	
	private void div() // parent class method is public hence child class overloaded method should be public only.
	{
		
	}

}
