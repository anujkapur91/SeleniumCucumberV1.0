Feature: Login to Amazon three
  Scenario Outline: Login With Correct Credentials fifth
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|
    |FireFox|
    |Chrome|
    
    
    
    Scenario Outline: Login With Correct Credentials sixth
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|
    |FireFox|
    |Chrome|
    
    
    
   