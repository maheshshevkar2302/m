package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_first_select_option 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement Year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select y1=new Select(Year);
		
	    y1.selectByVisibleText("1");
		
       WebElement j1= y1.getFirstSelectedOption();
       
       System.out.println(j1);
		
		
		
	}

}
