package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditFields {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/Edit.html");

		driver.findElementById("email").sendKeys("testleaft@gmail.com");
	
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Done");
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		String text = driver.findElementByName("username").getAttribute("value");
		System.out.println(text);
		
		boolean enabled = driver.findElementByXPath("//div[@class='large-6 small-12 columns']/following::input[4]").isDisplayed();
		
		System.out.println(enabled);
		
		
	}
	
	
	

}
