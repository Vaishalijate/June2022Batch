package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	
			public static void main(String[]args)throws InterruptedException
		{
			//Lunch Browser
			System.setProperty("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//open application
			driver.get("https://www.flipkart.com/");
		
			//cancel on login
			driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
			
			//action class
			Actions act=new Actions(driver);
			
			WebElement mouseover=driver.findElementByXPath("//*[@class='_1_3w1N']");
			
			act.moveToElement(mouseover).build().perform();
			
	         WebElement search=driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]");
			
			//click on my profile
			driver.findElementByXPath("(//*[@class='_2kxeIr _1pY_1Z'])[1]").click();
		
			Thread.sleep(5000);
			
			//enter phone number
			driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9503152766");
			
			Thread.sleep(5000);
			//enter password
			driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("Ravi1995");
			
			Thread.sleep(5000);
			//click on login
			driver.findElementByXPath("(//*[@type='submit'])[2]").click();
			
			Thread.sleep(5000);
			//click on manage address
			driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
			
			Thread.sleep(5000);
			//click on add new addresses
			driver.findElementByXPath("//*[@class='_1QhEVk']").click();
			
			Thread.sleep(5000);
			//enter name
			driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("Ravindra Dhulgand");
			
			Thread.sleep(5000);
			//enter phone no
			driver.findElementByXPath("//*[@name='phone']").sendKeys("8329205671");
			
			Thread.sleep(5000);
			//enter pincode
			driver.findElementByXPath("//*[@name='pincode']").sendKeys("413710");
			
			Thread.sleep(5000);
			//enter locality
			driver.findElementByXPath("(//*[@type='text'])[5]").sendKeys("Pune");
			
			Thread.sleep(5000);
			//enter address
			driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("A/P-Galnimb,Tal-Shrirampur");
			
			//Thread.sleep(5000);
			//enter districtor city
			//driver.findElementByXPath("//*[@name='city']").sendKeys("Ahmednagar");
			
			Thread.sleep(5000);
			//enter landmark
			driver.findElementByXPath("//*[@name='landmark']").sendKeys("Shirdi");
			
			Thread.sleep(5000);
			//enter alternate phone
			driver.findElementByXPath("//*[@name='alternatePhone']").sendKeys("8380080575");
			
			Actions act1=new Actions(driver);
			WebElement abc=driver.findElementByXPath("(//*[@class='_1XFPmK'])[1]");
			abc.click();
			
			Thread.sleep(5000);
			//click on save
			driver.findElementByXPath("//*[@tabindex='10']").click();
			
		}		
	}		



		
		
		
		
	
