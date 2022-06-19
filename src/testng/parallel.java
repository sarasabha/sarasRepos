package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class parallel {
	public WebDriver driver;
	@Parameters({"browserName"})
	@Test
	public void demo(String browser)
	{
		if(browser.equals("chrome"))
			driver=new ChromeDriver();
	
	else
	{
	
		driver=new FirefoxDriver();
		
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	String title=driver.getTitle();
	String abcde="";
	//Assert.assertEquals(actual, expected);
	Assert.assertEquals(title, abcde);
	SoftAssert a=new SoftAssert();
	Reporter.log(title, true);
	String url=driver.getCurrentUrl();
	Reporter.log(url, true);
	

}

}
