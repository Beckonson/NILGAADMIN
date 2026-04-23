Feature:UI work flow

@smoke0
  Scenario: Valid Login
    //Given user navigate to NILGS Public portal
    When when user enter admin email and password
    And user clicks on login
    Then user is successfully logged in
