package Page_Object_Module_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru_login_page 
{
	
	//Step_1:Declare data member with access level private by using find by annotations
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement PSW;
	@FindBy(xpath="//input[@type='submit']") private WebElement LOGIN;
	
	//Step_2:Initailize within constructor with access level public 
	
	public  guru_login_page (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Step_3:Usage of data member using method
	
	public void username() 
	{
		UN.sendKeys("mngr413784");
	}
	public void password() 
	{
		PSW.sendKeys("jyguqYs");
	}
	public void login() 
	{
		LOGIN.click();
	}


}
