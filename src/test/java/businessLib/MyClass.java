package businessLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class MyClass {

	public void testclass()
	{
		Boolean flag=true;
		 WebDriver driver = new FirefoxDriver();
		  driver.get("https://in.linkedin.com/");
		  Boolean present=false;
		  if(flag.equals(present))
		  {
			  Reporter.log("PASS", true);
		  }
	}

}
