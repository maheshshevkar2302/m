package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_listbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		WebElement Year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Thread.sleep(3000);
		
	     Select Y1=new Select(Year);
	     
	     Thread.sleep(3000);
	     
	     WebElement Sh=Y1.getFirstSelectedOption();
	     
	    System.out.println(Sh.getText());
	}

}
