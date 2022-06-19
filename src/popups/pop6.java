package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.amazon.com");
	driver.findElement(By.id("email"));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("admin");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("admin");
	
	String parent= driver.getWindowHandle();
	Set<String> child=driver.getWindowHandles();
	
	  ArrayList a = new ArrayList<>();
	for(String b:child)
	{
		driver.switchTo().window(b);
		String title=driver.getTitle();
		a.add(title);
		driver.close();
	}
	
	
	
	
	
	
	}

}
