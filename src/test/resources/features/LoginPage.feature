Feature: Login functionality for a Website

  As a user of the website
  I want to be able to log into my account
  So that I can access my profile and the store

  Background:
    Given Given the user navigates to the login page

  Scenario: Login as a sign-up user with valid data : REQ001-QQA001
    Given A user entered a valid username as 'standard_user' and password as 'secret_sauce'
    When User click in the login button
    Then User should be logged in successfully
    And Have access to the products page


  Scenario: Login with blocked user : REQ001-QA002
    Given A user entered a blocked username as 'locked_out_user' and password as 'secret_sauce'
    When User click in the login button
    Then The user should see an error message indicating 'Sorry, this user has been locked out'


  Scenario Outline: Login with invalid credentials : REQ001-QA003
    Given The user entered a invalid "<username>" and "<password>"
    When User click in the login button
    Then The user should see an error message indicating "<error_message>"

    Examples:
      | username        | password        | error_message                                               |
      | standard_user   | invalidPassword | Username and password do not match any user in this service |
      | standard_user   | 123456          | Username and password do not match any user in this service |
      | standard_user   | !@#$%^          | Username and password do not match any user in this service |
      | invalidUser     | secret_sauce    | Username and password do not match any user in this service |
      | 123456          | secret_sauce    | Username and password do not match any user in this service |


  Scenario Outline: Login with blank fields : REQ001-QA004
    Given The user entered a blank "<username>" or "<password>"
    When User click in the login button
    Then The user should see an error message indicating "<error_message>"

    Examples:
      | username      | password     | error_message        |
      |               | secret_sauce | Username is required |
      | standard_user |              | Password is required |


