Feature: login page automation of saucedemo application

Scenario: check login is successful with valid credentials 

Given user is on login page
When  user enterd valid username and password
And user enter login
Then user is navigated to home and 
And close the browser