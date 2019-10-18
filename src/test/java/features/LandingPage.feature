Feature: Landing page Work India Application
  
  Scenario: Verify several tab on the landing page
    Given Appium server is up and running and WorkIndia application is launched
    When User is on Landing page of the application
    Then User can see serveral tab at the botton of the application    
    

  Scenario: Verify the several field on the Job tab
    Given Appium server is up and running and WorkIndia application is launched
    When User is on Landing page of the application
    And User click on "Jobs" tab
    Then User should see several fields on the screen