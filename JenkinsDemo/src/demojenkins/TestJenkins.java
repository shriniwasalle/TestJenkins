package demojenkins;
import org.testng.annotations.Test;

import Utility.Variables;

public class TestJenkins {

	@Test
	public void JenkinsDemo() {
		System.out.println("Welcome to Jenkins World!!");
		
		Variables.driver.get("http://www.facebook.com");
		Variables.maximizeWindow();
		System.out.println(Variables.driver.getTitle());
		Variables.driver.quit();
		
	}
	
	@Test
	public void JenkinsDemo1() {
		System.out.println("Welcome to Jenkins World 2 !!");	
	}
}
