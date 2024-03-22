Feature: Hotel App Login Page
Scenario: Login Successful
    Given I am on the Hotel login page
    When I enter credentials to login  
      | vasuvespag | vasu1234 |      
    Then I logged in successfully
