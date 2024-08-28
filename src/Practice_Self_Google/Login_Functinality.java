package Practice_Self_Google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Functinality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password123");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement S1=driver.findElement(By.xpath("//strong[text()='Congratulations student. You successfully logged in!']"));
		
		Boolean Displayed=driver.findElement(By.xpath("//a[contains(@class,'wp')]")).isDisplayed();
		
		System.out.println(Displayed);
		
		String Actual_Result=S1.getText();
		
		String Expected_Result="Congratulations student. You successfully logged in!";
		
		
		
		if(Actual_Result==Expected_Result) 
		{
			System.out.println("Login Sucessful");
		}
		else 
		{
			System.out.println("Login unsucessful");
		}
		
	}
	
	

}
