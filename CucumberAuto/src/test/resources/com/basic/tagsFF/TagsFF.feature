@Important
Feature: Create account of Facebook12
  As a user u need to open facebook homepage and do the validations

  @Smoke
  Scenario: Validate First Name field121
    Given User need to be on facebook login page
    When User enters user "Milton" firstname
    Then User checks user "Milton" firstname is present
    Then close browser

  @Smoke @Regression
  Scenario: Validate create user multiple field122
    Given User need to be on facebook login page
    When User enters user "Mike" firstname
    And User enters user "Tyson" surname
    Then User checks user "Mike" firstname is present
    Then  User Mobile Field should be blank
    Then close browser

  Scenario: Validate First Name field123
    Given User need to be on facebook login page
    When User enters user "Milton" firstname
    Then User checks user "Milton" firstname is present
    Then close browser

  @Regression
  Scenario: Validate First Name field124
    Given User need to be on facebook login page
    When User enters user "Milton" firstname
    Then User checks user "Milton" firstname is present
    Then close browser

  @Smoke
  Scenario: Validate First Name field125
    Given User need to be on facebook login page
    When User enters user "Milton" firstname
    Then User checks user "Milton" firstname is present
    Then close browser
