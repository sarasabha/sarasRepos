package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISENABLED {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 WebElement btn = driver.findElement(By.xpath("//a[contains (text(), '#u')][4]"));
if(btn.isEnabled())
	
{
	System.out.println("pass:element is enabled");
	btn.click();
	Thread.sleep(3000);
}
else
{
	System.out.println("fail:element is not enabled");
}
driver.close();
	}
	}


