package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

fb f=new fb(driver);
f.user("admin");
f.pass("manager");
f.login(null);
	}

}
