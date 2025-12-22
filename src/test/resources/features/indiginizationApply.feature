Feature: indiginization Application Functionality

Background:
  //Given user navigate to NILGS Public portal
  When when user enter admin email and password
  And user clicks on login
@smoke1
  Scenario: Indiginization Certificate Application Workflow
    When user click on new application button
    And select indigization Certificate
    And Accepts terms and conidition
    And Clicks on starts application button
