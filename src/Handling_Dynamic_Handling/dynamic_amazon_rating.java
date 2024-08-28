package Handling_Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_amazon_rating 
{
public static void main(String[] args) throws InterruptedException 
{
//Step_1:-Launch Browser
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_9bqbl508i4_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734071&hvpos=&hvnetw=g&hvrand=12422064444942246909&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301240&hvtargid=kwd-296458777401&hydadcr=14454_2154375&gclid=CjwKCAjw7vuUBhBUEiwAEdu2pK67rQxkEQOQy5cylKZ_6oAhkvoc1w37Lpc8VrAdy_kvghg6m55GPxoC2P4QAvD_BwE");
	
	Thread.sleep(3000);
	
	//Step_2:Identify element and send values using sendkeys
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple Phones");
	
	Thread.sleep(3000);
	
	//Step_3:Identify click button and click
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	Thread.sleep(3000);
	
	//Step_3:Identify dynamic and perform action using relative xpath
	
	WebElement Rating=driver.findElement(By.xpath("(//div[@class='a-section'][1]//span)[15]"));
	
	String S1=Rating.getText();
	
	System.out.println(S1);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
