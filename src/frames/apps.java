package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class apps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://www.google.com/");
driver.get("https://www.snapdeal.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
Actions a=new Actions(driver);
a.moveToElement(ele).perform();

driver.findElement(By.xpath("//a[text()='login']")).click();;

driver.switchTo().frame(0);
Thread.sleep(3000);
driver.findElement(By.id("userName"));
driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']"));
driver.switchTo().defaultContent();

driver.findElement(By.id("inputValEnter")).sendKeys("phone");

	}

}
