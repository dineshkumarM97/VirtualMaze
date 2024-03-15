@login
Feature: Login Functionality

  Scenario Outline: User logs in with valid credentials
    Given User is on the login page
    When User enters valid "<username>" and "<password>"
    And User clicks on login button
    Then User should verify the login success message "Privacy & Personalisation"

    Examples: 
      | username                   | password |
      | dineshkumarm1617@gmail.com | Dinesh17 |

  Scenario Outline: User cannot log in with invalid credentials
    Given User is on the login page
    When User enters invalid "<username>" and "<password>"
    And User clicks on login button
    Then User should verify an error message "Incorrect emailId or Password, Try again"

    Examples: 
      | username                   | password |
      | dineshkumarm1617@gmail.com | Dinesh   |

  Scenario: User can navigate to the registration page
    Given User is on the login page
    When User clicks on the registration link
    Then User should be redirected to the registration page
