package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_multi 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();	
	
	driver.get("file:///C:/Users/Mahesh%20Shevkar/Desktop/HTML/Listbox_3.html");
	
	WebElement Country=driver.findElement(By.xpath("//select[@id='1234']"));
	
	
    Select m=new Select(Country);

    m.selectByVisibleText("India");

    Thread.sleep(3000);
	
     m.selectByVisibleText("Pakistan");

     Thread.sleep(3000);
	
      m.selectByVisibleText("Srilanka");

      Thread.sleep(3000);
	
m.selectByVisibleText("Nepal");

Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
