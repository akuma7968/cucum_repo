package steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class Hooks {

	
	
	public WebDriver driver;
	
	
	@Before(order=0)
	public void setUp1(Scenario sc) {
		
		System.out.println("Before tag 1");		
		System.out.println(sc.getId());
		System.out.println(sc.getName());
	}
	
	@Before(order=1)
	public void setUp() {
		
		System.out.println("Before tag 2");
		SeleniumDriver.setUpDriver();
		
	}
	
	
	@After(order=1)
	public void tearDown(Scenario scenario) {
		//capturing screenshot
		System.out.println("After tag");
		if(scenario.isFailed()) {
			driver = SeleniumDriver.getDriver();
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
			
		}
		
		
		SeleniumDriver.tearDown();
	}
	
	@After(order=0)
	public void tearDown2(Scenario scenario) {
		System.out.println("After tag 2");		
	}
	
}
