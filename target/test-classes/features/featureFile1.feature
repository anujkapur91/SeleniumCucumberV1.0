Feature: Login to Amazon
  Scenario Outline: Login With Correct Credentials first
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|
    |Chrome|
    |FireFox|
    
    
    Scenario Outline: Login With Correct Credentials second
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|
    |Chrome|
    |FireFox|
    
    
   