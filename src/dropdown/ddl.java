package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(ele);
		Thread.sleep(3000);
		
	s.selectByValue("search-alias=arts-crafts-intl-ship");
	Thread.sleep(3000);	
	s.selectByIndex(8);
	Thread.sleep(3000);
	s.selectByVisibleText("Computers");
	s.deselectAll();
	List<WebElement> allOptions = s.getOptions();
	System.out.println(allOptions.size());
	for(WebElement b:allOptions)
	{
		System.out.println(b.getText());	
	}
	Thread.sleep(3000);
		driver.close();
	}

}
