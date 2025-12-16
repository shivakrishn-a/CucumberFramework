Feature: test saucedemo

Background:
  Given user is on login page
  When user enters valid credentials
  Then user clicks login button
  And user navigated to home page

Scenario: test menu function
  Then user clicked on menu
  And menu is displayed

Scenario: test add to cart
  Then user clicked add to cart
  And item added to cart
