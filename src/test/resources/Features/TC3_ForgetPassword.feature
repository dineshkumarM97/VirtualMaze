@forgot
Feature: Forgot Password Functionality

  Scenario Outline: User can request a password reset
    Given User is on the forgot password page
    When User enters their email address "<email>"
    And User clicks on reset password button
    Then User should receive a password reset email
    When User enters the password again "<password>"
    And User should see a success message "Try again after Sometime"

    Examples: 
      | email                      | password |
      | dineshkumarm1617@gmail.com | Dinesh17 |

  Scenario Outline: User cannot request a password reset with an invalid email
    Given User is on the forgot password page
    When User enters an invalid email address "<email>"
    And User clicks on reset password button
    Then User should verify user error message "User doesn't exist"

    Examples: 
      | email                  |
      | dineshkumarm@gmail.com |
