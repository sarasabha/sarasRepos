package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/index.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement wb=driver.findElement(By.id("username"));
wb.clear();
WebElement ele=driver.findElement(By.id("password"));
ele.clear();
//driver.close();
	}

}
