Feature: register the page using data table
  
 
  @ValidCredentials
  Scenario: register with Valid credentials
    Given click to register to enter the details
    When click the radio button
    And enter the first name,last name,email,password,confirm password
    |gender| firstname| lastname | email               |          Password     | confirm password | 
    |female| Akshaya  | lakshmi  | akshu0102@gmail.com | Akshu1234             | Akshu1234        |
    And click register
    Then register the page successfully
    