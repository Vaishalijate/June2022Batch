Feature: Login functionality

Background: User cancelled initial login window

Given user provide browser name as "Chrome" and exe location as "D:\\Automation Support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com/"
Given user cancel initial login window

@SmokeTest

Scenario: Login functionality with valid credentials
When user navigate on Login tab
When user click on MyProfile 
When user enter "9503152766" as username
When user enter "Ravi1995" as password
When user click on Login button
Then Application shows user profile to user