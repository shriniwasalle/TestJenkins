package Utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	
		public static void screenShot(WebDriver driver, String folder, String fileName) {

			TakesScreenshot ts = (TakesScreenshot)driver;
			
			// Take screenshot and store as a file format
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			try {
				// now copy the  screenshot to desired location using copyFile //method
				FileUtils.copyFile(source, new File(folder+"\\"+fileName+".png"));
			} 
			catch (Exception e) {
				e.getMessage();
			}
		}
}
