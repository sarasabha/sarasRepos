package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLinkLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//driver.get("https://demo.actitime.com/login.do");
	//driver.findElement(By.linkText("Forgot your password?")).click();
	//driver.findElement(By.partialLinkText("Forgot")).click();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Return")).click();
	
	}

}
