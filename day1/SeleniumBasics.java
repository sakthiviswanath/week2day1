package week2.day1;

import java.io.File;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException 

	{
		//		File file = new File("C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("demosalesmanager");	
		WebElement id = driver.findElementById("password");
		id.sendKeys("crmsfa");
		System.out.println("op:"+""+userName);
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");

		driver.findElementById("createLeadForm_firstName").sendKeys("sakthi");
		driver.findElementById("createLeadForm_lastName").sendKeys("viswanath");

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");

		Select dropDown = new Select(source);

		List<WebElement> options1 = dropDown.getOptions();

		dropDown.selectByVisibleText("Employee");	         

        System.out.println(options1);
	

	
	WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");

		Select dropDown1 = new Select(mc);

		List<WebElement> options2 = dropDown1.getOptions();

		dropDown1.selectByValue("9001");
		
      

		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");

		Select dropDown2 = new Select(ownership);

		List<WebElement> options3 = dropDown2.getOptions();

		dropDown2.selectByIndex(5);
		
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");

		Select dropDown3 = new Select(country);

		List<WebElement> options4 = dropDown3.getOptions();

		dropDown3.selectByVisibleText("India");
		
		driver.findElementByName("submitButton").click();
		
		String title = driver.getTitle();
        System.out.println(title);

		//driver.findElementByClassName("smallSubmit").click();




		//Thread.sleep(2000);
		//driver.close();

	}

}

