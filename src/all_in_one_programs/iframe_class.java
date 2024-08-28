package all_in_one_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_class 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.xpath("(//input[@class='bcTextBox'])[1]")).sendKeys("Mahesh");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
