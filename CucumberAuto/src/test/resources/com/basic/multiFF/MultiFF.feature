Feature: Create account of Facebook8
  As a user u need to open facebook homepage and do the validations

  Scenario: Validate First Name field81
    Given User need to be on facebook login page
    When User enters user "Milton" firstname
    Then User checks user "Milton" firstname is present
    Then close browser

  Scenario: Validate create user multiple fields82
    Given User need to be on facebook login page
    When User enters user "Mike" firstname
    And User enters user "Tyson" surname
    Then User checks user "Mike" firstname is present
    Then User Mobile Field should be blank
    Then close browser
