package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;;

public class Base 
{
 public static WebDriver Driver;
 
 
	public static void application_launch()
	{	
		WebDriverManager.chromedriver().setup();	
		Driver= new ChromeDriver();
		Driver.get("https://www.fb.com");	
	}
	
	public static void APplication_close()
	{
		
		Driver.close();
	}
	public void testmethod() {
		
	}
	
}
