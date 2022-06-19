package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearsubmit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement ele = driver.findElement(By.id("username"));
	  Thread.sleep(3000);
	  ele.clear();

	  WebElement web = driver.findElement(By.id("password"));
	  Thread.sleep(3000);
	  web.clear();
	WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Sign')]"));
	Thread.sleep(3000);
	btn.submit();
	  
	}

}
