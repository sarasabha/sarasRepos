package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
//driver.close();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();

		driver.close();
	}

}
