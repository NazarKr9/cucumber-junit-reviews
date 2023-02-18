Feature:  Login functionality tests
@validLogin
  Scenario:
    Given the user is on the login page
    When the user enters valid username
    And the user enters valid password
    And user clicks on the login button
    Then user should be able to log in