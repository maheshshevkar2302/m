package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_home_page 
{
	
	//Step_1:declare global variable for webelement present on webpage having access within class using findsby annotations
     @FindBy(xpath="//span[@class='user-id']") private WebElement home;

     
    //Step_2:Initialize data member within constructor by using pagefactory class & initelements method
     
     public  kite_home_page (WebDriver driver) 
     {
    	 
    	 PageFactory.initElements(driver,this);
     }
     
     //Step_3:Usage of data member by using data member 
     public void dashboard() 
     {
    	 String Expected_Result="GP8097";
    	 
    	 String Actual_Result=home.getText();
    	 
    	 if(Expected_Result.equals(Actual_Result)) 
    	 {
    		 System.out.println("Pass");
    	 }
    	 else 
    	 {
    		 System.out.println("Fail");
    	 }
    	 
    	 
     }
}
