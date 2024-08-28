package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru_login_page_1 
{
	//Step_1:Data member declare as global with access level private by using finds by annotations.
	
	@FindBy(xpath="//input[@type='text']")   private WebElement username;
    @FindBy(xpath="//input[@type='password']")  private WebElement password;
   @FindBy(xpath="//input[@type='submit']") private WebElement login;
    
    //Step_2:Initialize data member within constructor having access level public 
    public guru_login_page_1 (WebDriver driver) 
    {
    	PageFactory.initElements(driver,this);
    
    }
     //Step_3:Use data member usage using method 
    public void enterusername() 
    {
    	
    	username.sendKeys("mngr413784");
    }
    public void enterpassword() 
    {
    	
    	password.sendKeys("jyguqYs");
    }
    
    public void loginbtn() 
    {
    	
    	login.click();
    }
}
