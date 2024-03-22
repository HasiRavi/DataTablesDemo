Feature: Adactin Hotel Web Application

@login
  Scenario: Login Successful
    Given I am on HotelApp login page	
    When I enter username as "vasuvespag"
    And I enter password as "vasu1234"
    And I click on login button
    Then I get login successful message
@select 
   Scenario Outline: Location Search
   Given I am on HotelApp login page	
    When I enter username as "vasuvespag"
    And I enter password as "vasu1234"
    And I click on login button
    Then I get login successful message
   Given I enter desired location on Search Hotel page as "London"
   When I click on search button
   Then I get successful location required
   

  