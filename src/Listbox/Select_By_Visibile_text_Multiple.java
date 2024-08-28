package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By_Visibile_text_Multiple 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Mahesh%20Shevkar/Desktop/HTML/Listbox_3.html");
		
		Thread.sleep(3000);
		
	WebElement	Country =driver.findElement(By.xpath("//select[@multiple='true']"));
	
	Select S1=new Select(Country);
	
	S1.selectByVisibleText("India");
	Thread.sleep(3000);
	
	S1.selectByVisibleText("Pakistan");
	Thread.sleep(3000);
	
	S1.selectByVisibleText("Srilanka");
	Thread.sleep(3000);
	
	S1.selectByVisibleText("Nepal");
	Thread.sleep(3000);
		
	}

}
