package TestProject.MyTestProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleTest 
{
  @Test
  public void example() 
  {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://in.linkedin.com/");
  }
}
