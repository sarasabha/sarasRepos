package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class coordinates {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele = driver.findElement(By.name("desktop-searchBar"));
	Point loc = ele.getLocation();
		System.out.println(loc.getX() +"x coordinates");
		System.out.println(loc.getY() +"y coordinates");
		driver.close();
		
	}

}
