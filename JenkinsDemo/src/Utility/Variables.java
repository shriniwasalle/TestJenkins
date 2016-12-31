package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Variables {
	
	public static final WebDriver driver = new FirefoxDriver();
	public static final String folder = "C:\\Users\\Lenovo\\git\\GitTest\\GitTest\\src\\ScreenShots";
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

}
