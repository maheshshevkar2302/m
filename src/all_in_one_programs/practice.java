package all_in_one_programs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=gILDL39hxIw");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Step_1:-Typecast driver into takescreenshot then we have to use getscreenshot method which has return type file 
         File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
         File Destination=new File("C:\\Users\\Mahesh Shevkar\\Desktop\\Screenshot\\sample_28.jpg");
         
         FileHandler.copy( Source, Destination);
         
         driver.navigate().to("https://www.facebook.com/");  
         
        //Advantages of selenium
         //Regression testing is possible
         //Open souce tool
         //functional testing is possible
        //Reduce Manpower
         
         //Architecture Of selenium
         
         //Search Context Is super most interface in selenium aechitecture which contains abstract method 
         //This methods are overridden in selenium web driver
         //Selenium webdriver contains its own abstract methods and abstract method of search context.
         //This methods are overridden into selenium webdriver 
         //The methods which are present in selenium webdriver are completed by different different implementation class.
         
         //What are disadvantages of selenium webdriver
         //We cannot automate captacha
         //We cannot automate barcode 
         //We cannot automate otp
         
         //What is difference between Webdriver and webelement
         //Webdriver method is used to perform action on browser whereas webelement method is used to perform action webelement present on webpage.
         
        Boolean Display=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
        
        System.out.println(Display);
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mahesh@9763");
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        Boolean Enable=driver.findElement(By.xpath("(//a[@role='button'])[2]")).isEnabled();
        
        System.out.println(Enable);
        
        
        
        
	}

}
