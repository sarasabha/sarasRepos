package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb {
	//1st step-Declaration
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="pass")
	private WebElement passtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	//2nd step-Initialization
	
	public fb(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//3rd step-Utilization
	public void user(String name)
	{
		emailtb.sendKeys(name);
	
	}
	
	public void pass(String pass)
	{
		passtb.sendKeys(pass);
	}
	
	public void login(String login)
	{
		loginbtn.click();
		
	
	
	}
	

}
