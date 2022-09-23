package utility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	
	public static WebDriver driver=null;
	
	//browserLaunch
	 public static void browserLaunch(Object[]inputParameters)
	 {
		 try{
		 String bName=(String)inputParameters[0];
		 String webDriverExePath=(String)inputParameters[1];
		 
		 if(bName.equalsIgnoreCase("Chrome"))
		 {
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 
		 System.setProperty("webdriver.chrome.driver",webDriverExePath);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 }
		 
		 else if(bName.equalsIgnoreCase("Firefox"))
		 {
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 
			 System.setProperty("webdriver.gecko.driver",webDriverExePath);
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
		 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
	 }
	 
	 //openApplication
	 public static void openApplication(Object[]inputParameters)
	 {
		 try{
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 
		 String strgUrl=(String) inputParameters[0];
		 driver.get(strgUrl);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
	 
	 //click
	 public static void clickOnElement(Object[]inputParameters)
	 {
		 try{
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		 String locator=(String)inputParameters[0];
		driver.findElement(By.xpath(locator)).click();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
	 
	 //mouseover
	 public static void mouseOverAction(Object[]inputParameters)
	 {
		 try{
			 
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 
		 String locator=(String)inputParameters[0];
		 Actions act=new Actions(driver);
		 WebElement abc=driver.findElement(By.xpath(locator));
		 act.moveToElement(abc).build().perform();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
	 }
	 
	 //sendkeys
	 public static void sendText(Object[]inputParameters)
	 {
		 try{
		 String locator=(String)inputParameters[0];
		 String charseq=(String)inputParameters[1];
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath(locator)).sendKeys(charseq);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
	 
	   //validation
	 
	 
	 public static void validation(Object[]inputParameters)
	 {
		 try{
		 String xpath=(String)inputParameters[0];                    //xpath
		 String giventext=(String)inputParameters[1];                //name
		 
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 String findedText=driver.findElement(By.xpath(xpath)).getText();
		 
		 if(findedText.equalsIgnoreCase(giventext))
		 {
			 System.out.println("Test Case Pass");
		 }
		 else
		 {
			 System.out.println("Test Case Fail");
		 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }	 
		
}
