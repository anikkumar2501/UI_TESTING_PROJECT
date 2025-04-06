Feature: Test log in feature of XYZ.com

  Background:
    Given user open url "https://www.saucedemo.com/"

  Scenario: Test login with valid credentials
    When user input userName as "standard_user"
    And user input password as "secret_sauce"
    And click on login button
    Then user should be navigated to homepage

