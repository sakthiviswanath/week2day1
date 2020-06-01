package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElementByXPath("//div[@class='large-6 small-12 columns']/a").click();
	    driver.findElementByXPath("//img[@class='wp-categories-icon svg-image']/following::a[2]").click();
	    String URL = driver.findElementByXPath("//a[@style='color:green']").getAttribute("href");
	    System.out.println(URL);
	    
	    driver.findElementByXPath("//div[@class='large-6 small-12 columns']/following::div[6]/a").click();
	    
	    Thread.sleep(2000);
	    
	    String title = driver.getTitle();
	    
	    System.out.println("Title :" + title);
	    
	    if(title.contains("HTTP Status 404"))
	    		{
	    	System.out.println("The link is Broken");
	    		}
	driver.navigate().back();
	
	Thread.sleep(2000);
	
	 List<WebElement> tag = driver.findElementsByTagName("a");
	
	
	System.out.println(tag.size());
	
	}
	
	
	
	
	
}
