Feature: sauce demo login functionality
Scenario Outline: to test login with multiple valid login credentials

Given the user is on the login page
When the user entered the valid <username> and <password>
Then the user clicks login button
And the user is navigated to the home page of app

Examples:
| username | password |
| standard_user | secret_sauce |
