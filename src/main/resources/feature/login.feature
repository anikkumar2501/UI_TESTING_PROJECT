Feature: Test log in feature of XYZ.com

  Background:
    Given user launch "Chrome" driver

  Scenario: Test login with valid credentials
    Given user open url "https://www.saucedemo.com/"
    When user input userName as "standard_user"
    And user input password as "secret_sauce"
    And click on login button
    Then user should be navigated to homepage

