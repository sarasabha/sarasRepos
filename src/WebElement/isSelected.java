package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createNewAccountBtn= driver.findElement(By.xpath("//a[contains(text(),'Create New')][1]"));
		createNewAccountBtn.click();
		
		//WebElement radiobutton= driver.findElement(By.xpath("//span[contains(@data-name,'gender_wrapper')]"));
		//input[contains(@name,'sex')][1]
	
		WebElement radiobutton= driver.findElement(By.xpath("//input[contains(@name,'sex')][1]"));
		if(radiobutton.isSelected())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		}
		
		
	}


