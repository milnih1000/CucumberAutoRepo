Feature: Create account of Facebook11
  As a user u need to open facebook homepage and do the validations

  Scenario: Validate First Name field111
    Given User need to be on facebook login page
    When User enters user "Milton" firstname
    Then User checks user "Milton" firstname is present

 
  Scenario: Validate create user multiple fields112
    Given User need to be on facebook login page
    When User enters user "Mike" firstname
    And User enters user "Tyson" surname
    Then User checks user "Mike" firstname is present
    Then User Mobile Field should be blank
 