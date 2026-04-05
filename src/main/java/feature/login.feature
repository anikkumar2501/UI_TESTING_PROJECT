@REGRESSION
Feature: Test log in feature of ORANGE_HRM_WEBPAGE

  Background:
    Given user open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

  @SMOKE
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

  @SANITY
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

  @SMOKE
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

  @SANITY
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

  @SMOKE
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

  @SANITY
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

  @SMOKE
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

  @SANITY
  Scenario: Test login with valid credentials
    When user input userName as "Admin"
    And user input password as "admin123"
    And click on login button
    Then user should be navigated to homepage

