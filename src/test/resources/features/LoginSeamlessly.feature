Feature:  Login functionality tests

  @validLogin
  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters valid username
    And the user enters valid password
    And user clicks on the login button
    Then user should be able to log in


  @validLoginWithParameters
  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user enters valid username "username"
    And the user enters valid password "password"
    And user clicks on the login button
    Then user should be able to log in