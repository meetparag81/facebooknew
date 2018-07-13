
public class Test {

	public static void main(String[] args) 
	{
		ABC obj = ABC.GetInstance();
		

	}

	
	 class ABC  
	{
		static ABC obj = new ABC();
		
		private ABC()
		{
			
		}
		public static ABC GetInstance()
		{
			
			return obj; 
			
		}

		 
		{
			ABC obj = new ABC();

		}

	}
}
