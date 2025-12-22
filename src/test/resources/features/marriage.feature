Feature: Marriage Application functionality

Background:
//Given user navigate to NILGS Public portal
When when user enter admin email and password
And user clicks on login
@smoke3
  Scenario: Marriage Certificate Application Workflow
    When User clicks on new application button
    And user select marriage certificate
    And Clicks on new application
    And Check terms and condition
    Then Click on start application button
    And Check Accepts consent
    And Click on start application button
    Then validate marriage certificate application page

    When user select state to marry at
    And Select LGA to marry at
    And Enter partner’s email address
    And Provides valid email
    Then permform search




