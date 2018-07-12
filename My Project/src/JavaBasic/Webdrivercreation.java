package JavaBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivercreation 
{
	static int a = 10;
	
	public static void main(String[] arrg)
	{
		
		final int b= 20;
		WebDriver driver = new ChromeDriver();
		ChromeDriver driver1 = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Webdrivercreation wc =new Webdrivercreation();
		
		
		
		
				
		
	}
	

}
