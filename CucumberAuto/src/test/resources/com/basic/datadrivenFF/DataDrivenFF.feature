Feature: Create account of Facebook2
  As a user u need to open facebook homepage and do the validations

  # Scenario: Validate First Name field
  # Given User need to be on facebook login page
  # When User enters user "Milton" firstname
  #Then User checks user "Milton" firstname is present
  #Then close browser
  Scenario Outline: Validate create user multiple fields21
    Given User need to be on facebook login page
    When User enters user "<user>" firstname
    And User enters user "<surname>" surname
    Then User checks user "<user>" firstname is present
    Then User Mobile Field should be blank
    Then close browser

    Examples: 
      | user   | surname |
      | Tom    | Jerry   |
      | Lorren | hardy   |
