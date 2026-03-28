Feature: Test log in feature of XYZ.com

  Background:
    Given user open url "https://www.saucedemo.com/"

  @Test1 @device_Window
  Scenario: Test login with valid credentials
    When user input userName as "standard_user"
    And user input password as "secret_sauce22"
    And click on login button
    Then user should be navigated to homepage

  @Test1
  Scenario: Test login with valid credentials
    When user input userName as "standard_user"
    And user input password as "secret_sauce"
    And click on login button
    Then user should be navigated to homepage

  @Test1
  Scenario: Test login with valid credentials
    When user input userName as "standard_user"
    And user input password as "secret_sauce"
    And click on login button
    Then user should be navigated to homepage

  @Test1
  Scenario: Test login with valid credentials
    When user input userName as "standard_user"
    And user input password as "secret_sauce"
    And click on login button
    Then user should be navigated to homepage

  @Test1
  Scenario: Test login with valid credentials
    When user input userName as "standard_user"
    And user input password as "secret_sauce"
    And click on login button
    Then user should be navigated to homepage

  @Test1
  Scenario: Test login with valid credentials
    When user input userName as "standard_user"
    And user input password as "secret_sauce"
    And click on login button
    Then user should be navigated to homepage