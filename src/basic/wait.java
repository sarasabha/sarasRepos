package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("manager");
	driver.findElement(By.xpath("//div[contains(@class,'qF0y9')][3]")).click();
	
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	if(actualtitle.contentEquals("Instagram"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
	driver.close();
	}
	
	}

