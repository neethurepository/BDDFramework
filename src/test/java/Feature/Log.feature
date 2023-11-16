#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Form

  @tag1
  Scenario Outline: Checking the functionality of login form
    Given User must be on homepage by clicking url "https://demo.applitools.com/"
    When Enter valid <username> and <password>
    And Click on Signin button
    Then user must be navigated to his or her account

    Examples: 
      | username | password         |
      | Roicians | Roicianspassword |
      | Allen    | James            |
      | Selenium | Webdriver        |
