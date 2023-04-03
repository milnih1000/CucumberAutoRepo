Feature: Create account of Facebook3
  As a user u need to open facebook homepage and do the validations

  Scenario: Validate create user multiple fields31
    Given User need to be on facebook login page
    When Enter following data
    
      | Username | UserSurname | Mobile |
      | Tom      | Hanks       |   1234 |
      | Jack     | Daniels     |   5678 |
