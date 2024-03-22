Feature: Hotel App Login Page
Scenario: Login Successful
    Given I am on the Hotel login page
    When I enter credentials to login  
    	| username | password |
      | vasuvespag | vasu1234 |
      | Prasanna29 | 21UFJS | 
    Then I logged in successfully
