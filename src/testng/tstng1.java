package testng;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tstng1 {
	@Test (invocationCount=3)
	public void calls()
	{
		Reporter.log("calls", true);
	}
	@Test(priority=-1)
	public void settings()
	{
		Reporter.log("settings", true);
	}
	@Test(priority=-1,enabled=false)
	public void chats()
	{
		Reporter.log("chats", true);
		
	}
	
	

}
