Feature: login functionality of sauce demo
Scenario Outline: test login with valid credentials

Given user is on login page
When user gives valid <username> and <password>
Then user clicks on ligin button
And user navigated to home page

Examples:
|username | password |
|standard_user | secret_sauce |