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
		  Boolean present=true;
		  if(flag.equals(present))
		  {
			  Reporter.log("MY TEST MAVEN PROJECT", true);
		  }
	}

}
