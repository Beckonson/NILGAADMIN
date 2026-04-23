Feature: validating login functionality
@smoke

  Scenario: Valid login
    //Given user navigate TO nilgs portal
    When user clicks on loginbutoon
    And user enters valid email and password
    Then user is successfully logged to begin application