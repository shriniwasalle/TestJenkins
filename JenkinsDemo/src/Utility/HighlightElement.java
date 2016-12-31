package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HighlightElement {
	
	public static void highLighter(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor)Variables.driver;
		je.executeScript("arguments[0].setAttribute('style', 'background:yellow; border: 2px solid red')", element);
	}
	
}
