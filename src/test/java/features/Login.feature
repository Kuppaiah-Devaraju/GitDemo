Feature: Login into Application

Scenario Outline: Positive test Validation login
 
 Given Intialize the browser with "chrome"
 And Naviage to "http://qaclickacademy.com" Site
 And click to login link in home page to load sign in page
 When User enters username <username> and password <password>
 Then Verify the user with successfull login
 
 Examples:
|username							|password	|
|raju@gmail.com				|password	|
|devaraju@gmail.com		|devaraju	|

