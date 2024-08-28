package all_in_one_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_Wait 
{
	
	public static void main(String[] args) 
	{
		
		
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=Camera&i=electronics&ref=nb_sb_noss");
		
	}

}
