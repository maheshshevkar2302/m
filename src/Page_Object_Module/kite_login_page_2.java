package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_page_2 
{
	//Step_1:Declare global variable for webelement present on second page having access within class by using findsby annotations
	
	//1. Data members/Global Variable should be declared globally with access level private by using @Findby Annotation
    @FindBy(xpath="//input[@id='pin']")  private   WebElement PIN; // private WebElement PIN=driver.findElement(By.xpath("//input[@id='pin']"));
    @FindBy(xpath="//button[text()='Continue ']")  private   WebElement Ctnbtn; //private WebElement Ctnbtn=driver.findElement(By.xpath("//button[text()='Continue ']"));
    
	//Step_2:-Initialize data member within constructor having  access level public by using pagefactory class & initelements method
	public kite_login_page_2 (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);}
		
    //Step_3:Utiliza data member with access level public
		public void enterpin() 
		{
			PIN.sendKeys("976346");
		}
		
		public void conbtn() 
		{
			Ctnbtn.click();
		}
	}
