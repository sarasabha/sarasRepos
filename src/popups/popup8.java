package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Chrome
		ChromeOptions option=new ChromeOptions();
		option.addArguments("----disable--notification---");
		WebDriver driver=new ChromeDriver(option);
		
	//firefox
		//ChromeOptions option=new ChromeOptions();
		//option.addArguments("----disable--notification---");
		//WebDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
		
		
		
		
	}

}
