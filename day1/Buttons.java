package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[@id='home']").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//img[@class='wp-categories-icon svg-image']/following::img").click();

		System.out.println(driver.findElementByXPath("//button[@id='position']").getLocation());
		System.out.println(driver.findElementByXPath("//button[@id='color']").getCssValue("background-color"));
        System.out.println(driver.findElementByXPath("//button[@id='size']").getSize());
	}

}
