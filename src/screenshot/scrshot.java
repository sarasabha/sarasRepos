package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step1) typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// step2) access the method and photo is stored in RAM
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		// step3) Specify the required location
		File destFile = new File("./photo/amazon.png");
		
		// step4) Copy paste from Ram to dest
		FileUtils.copyFile(ram, destFile);
		driver.close();

	}

}
