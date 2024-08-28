package all_in_one_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_single_selected 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Shevkar\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://sim.unipune.ac.in/SIM_APP/Account/CreateAccount");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement Nationality=driver.findElement(By.xpath("//select[@class='form-control']"));
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Select M1=new Select(Nationality);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement Country=M1.getFirstSelectedOption();
		
		String S1=Country.getText();
		
		System.out.println(S1);
		
	}

}
