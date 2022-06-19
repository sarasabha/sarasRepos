package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcase3 {
public WebDriver driver;

@BeforeMethod
public void openApp()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
@Test
public void createpage()
{
//driver.findElement(By.linkText("Create a page")).click();
driver.findElement(By.xpath("//a[(text()='Create a Page')]")).click();
//driver.findElement(By.xpath("//div[text()='Get started']")).click();
driver.findElement(By.xpath("//div[text()='Get Started']")).click();
Reporter.log(driver.getTitle(), true);
Reporter.log(driver.getCurrentUrl(), true);
}

@AfterMethod
public void closeApp()
{
	driver.quit();
	
}}
