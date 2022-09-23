package utility;

public class Calling 
{
	 
	 public static void main(String[]args) throws InterruptedException
	 {
		 //browserLaunch
		 Object[]intput=new Object[2];
		 intput[0]="Chrome";
		 intput[1]="D:\\Automation Support\\chromedriver.exe";
		 SeleniumOperations.browserLaunch(intput);
		 
		 //open application
		 Object[]intput1=new Object[1];
		 intput1[0]="https://www.flipkart.com/";
		 SeleniumOperations.openApplication(intput1);
		 
		 //click on cancel icon
		 Object[]intput2=new Object[1];
		 intput2[0]="//*[@class='_2KpZ6l _2doB4z']";
		 SeleniumOperations.clickOnElement(intput2);
		 
		//action class
		 Object[]intput3=new Object[1];
		 intput3[0]="//*[@class='_1_3w1N']";
		 SeleniumOperations. mouseOverAction(intput3);
		 
		 //click on my profile
		 Object[]intput4=new Object[1];
		 intput4[0]="(//*[@class='_2kxeIr _1pY_1Z'])[1]";
		 SeleniumOperations.clickOnElement(intput4);
		 
		 Thread.sleep(5000);
		 //enter phone no
		 Object[]intput5=new Object[2];
		 intput5[0]="(//*[@type='text'])[2]";
		 intput5[1]="9503152766";
		 SeleniumOperations.sendText(intput5);
		 
		 Thread.sleep(5000);
		 //enter password
		 Object[]intput6=new Object[2];
		 intput6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		 intput6[1]="Ravi1995";
		 SeleniumOperations.sendText(intput6);
		 
		 Thread.sleep(5000);
		 //click on login
		 Object[]intput7=new Object[1];
		 intput7[0]="(//*[@type='submit'])[2]";
		 SeleniumOperations.clickOnElement(intput7);
		 
		
		
		 
		 
		 
	 }
}
