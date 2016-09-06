package TestProject.MyTestProject;

import org.testng.annotations.Test;
import businessLib.MyClass;

public class ExampleTest 
{
  @Test
  public void example() 
  {
	 MyClass mc= new MyClass();
	 mc.testclass();
  }
}
