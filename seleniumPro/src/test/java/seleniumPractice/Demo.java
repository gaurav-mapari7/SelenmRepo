package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	DashboardPageObjects dashboardPageObjects;
	public Demo(){
		dashboardPageObjects= new DashboardPageObjects();
	}
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = Drivers.driver;
		WebDriverManager.chromedriver().setup();
		driver.get("https://omayo.blogspot.com/");
		ComponentOperations.waitForSecond(2);
		driver.manage().window().maximize();
		ComponentOperations.waitForSecond(2);
//		Drivers.driver.findElement(By.linkText("Page")).click();
		
		//AttributeName=AN
		//AttributeValue=AV
		
		//tagName[@AN='AV']
		//tagName[text()='label']
		//tagName[contains(text(),'label')]
		//tagName[contains(@id,'xyz')]
		
	}

}