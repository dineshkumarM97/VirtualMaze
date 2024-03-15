@register
Feature: Registration Functionality

  Scenario Outline: User can register with valid details
    Given User is on the registration page
    When User fills in valid registration details "<firstname>","<email>","<mobile>","<password>" and "<cnfmPsw>"
    And User clicks on register button
    Then User should receive a confirmation email
    And User should be redirected to the login page
    And User should verify the already existing email message "Already a user?"

    Examples: 
      | firstname   | email                      | mobile     | password | cnfmPsw  |
      | Dineshkumar | dineshkumarm1617@gmail.com | 7010176094 | Dinesh17 | Dinesh17 |

  Scenario Outline: User cannot register with invalid details
    Given User is on the registration page
    When User fills in invalid registration details "<firstname>","<email>","<mobile>","<password>" and "<cnfmPsw>"
    And User clicks on register button
    Then User should verify the error message "Invalid parameters"

    Examples: 
      | firstname | email                      | mobile     | password | cnfmPsw  |
      | Dk        | dineshkumarm1617@gmail.com | 7010176094 | Dinesh17 | Dinesh17 |
