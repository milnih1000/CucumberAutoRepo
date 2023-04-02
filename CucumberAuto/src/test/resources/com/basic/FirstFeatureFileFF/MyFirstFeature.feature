Feature: Create account of Facebook4
  As a user u need to open facebook homepage and do the validations

  Scenario: Validate First Name field41
    Given User need to be on facebook login page
    When User enters user firstname
    Then User checks user first name is present
#Scenario: Validate create user multiple fields
#Given User need to be on facebook login page
#When User enters user firstname And  User enters user surname 
#Then User checks user first name is present
#And User checks user first name is present
#But User Mobile Field should be blank
