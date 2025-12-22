Feature:UI work flow

  Background:
    //Given user navigate to NILGS Public portal
    When when user enter admin email and password
    And user clicks on login
@smoke
  Scenario: Valid Login
    Then user is successfully logged in

  Scenario: Indiginization Certificate Application Workflow
    When user click on new application button
    And select indigization Certificate
    And Accepts terms and conidition
    And Clicks on starts application button
