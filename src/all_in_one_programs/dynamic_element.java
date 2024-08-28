package all_in_one_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_element 
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	
	driver.navigate();
	
	driver.get("https://www.amazon.in/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple Phones");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("(//input[contains(@class,'nav')])[5]")).click();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
WebElement	Rating=driver.findElement(By.xpath("(//div[@class='_YXV0b_asinWrapper_3ZIxn _YXV0b_asinPaddingT2_2J4Oo']//span)[5]"));

String R1=Rating.getText();

System.out.println(R1);

//If u have handle dynamic element we have to use dynamic xpath
//Step_1:first we have to reach child element for where we have to handle dynamic element 
//after that we have to reach parent element and find out xpath by using findby
//Which has return type webelement and stores into object and use gettext method for getting output at console


}
}