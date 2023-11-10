#Author David Sánchez

@stories
Feature: Sign up on the platform utest.com
  As a user
  Wants to enter Utest platform
  To sign up as a new user

@scenario1
  Scenario: Create a new user on the platform and get a successful registration
  Given That user wants to sign up on the Utest platform
    When User clicks on the signup button
    And User fills out the form to sign up
      | strFirstName | strLastName | strMail                  | strLanguage | strCity  | strZipCode | strPassword | strCheckPassword |
      | David        | Sanchez     | davidsanchez@testing.com | Spanish     | Medellin | 050035     | 519941*Dave | 519941*Dave      |

  Then User verifies that the new user has been successfully created
    | strVerifyRegister |
    | The last step     |


