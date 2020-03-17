Feature: Login to Amazon two
  Scenario Outline: Login With Correct Credentials 1
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    |Username|Password|
    |anujkapur91@gmail.com|Rockye08$|
    |anujkapur19@gmail.com|Rockye08$|
    Then User types "<Product>" "<Model>" name and searches and selects the first listing
    Then User goes to cart and removes the product
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|Product|Model|
    |FireFox|OnePlus|7T|
     |Chrome|OnePlus|7t pro|
    

    
  Scenario Outline: Login With Correct Credentials 2
  
    Given  User Launches Amazon Webpage "<Browser>"
    When  User Navigates to Login Link
    Then  User logins with Username  and Password 
    |Username|Password|
    |anujkapur91@gmail.com|Rockye08$|
    |anujkapur19@gmail.com|Rockye08$|
    Then User types "<Product>" "<Model>" name and searches and selects the first listing
    Then User goes to cart and removes the product
    Then  User Logs Out
    Then User closes Browser
    
    Examples:
    |Browser|Product|Model|
    |FireFox|OnePlus|7T|
     |Chrome|OnePlus|7t pro|    
    
   