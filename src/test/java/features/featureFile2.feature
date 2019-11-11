Feature: Login to Amazon two
  Scenario Outline: Login With Correct Credentials third
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|
    |FireFox|
    |Chrome|
    
    
    
    Scenario Outline: Login With Correct Credentials fourth
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|
    |FireFox|
    |Chrome|
    
    
    
   