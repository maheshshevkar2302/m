package Handling_Dynamic_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_element_snapdeal 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.snapdeal.com/product/veirdo-green-half-sleeve-tshirt/639827458615");
    
    Thread.sleep(3000);
    
   WebElement Reviews=driver.findElement(By.xpath("(//div[@class='pdp-comp comp-product-description clearfix']//span)[7]"));
	
	
	String hS=Reviews.getText();
	
	System.out.println(hS);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
