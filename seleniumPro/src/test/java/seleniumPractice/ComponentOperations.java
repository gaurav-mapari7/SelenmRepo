package seleniumPractice;

import org.openqa.selenium.By;

public class ComponentOperations {
	
	public static void waitForSecond(int n) {
		try {
			Thread.sleep(n*1000);
		} catch (InterruptedException e) {
		}
	}
	
	public static void clickonWebElement(String xpath) {
		Drivers.driver.findElement(By.xpath(xpath)).click();
	}
	
	
	
}
