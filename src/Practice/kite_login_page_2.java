package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_page_2 
{
	
	
	@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath="//button[text()='continue']") private WebElement conbtn;
	
	
	public kite_login_page_2 (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterpin() 
	{
		Pin.sendKeys("976346");
	}
	
	public void Continue() 
	{
		conbtn.click();
	}


}
