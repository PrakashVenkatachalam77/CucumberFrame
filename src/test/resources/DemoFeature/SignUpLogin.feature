Feature: Automating Login Signup in Demo BLAZE Website

Background: 

When Launch the DemoBlaze Website

  Scenario: 
    And Click the Sign Up Link
    And Locate the UserName Field and Enter the Name
      | Prakash789 |
    And Locate the Passowrd Field and Enter the Password
      | Password | 1234567 |
    And Click the Signup Button to finish the Signup Button
    Then Account will be Created Successfully

  Scenario: 
    And Click the Login Link
    And Locate the UserName Field and Enter the User Name
    And Locate the Passowrd Field and Enter the Given Password
    And Click the Login Button to Login in to the WebSite
    Then Account will be Logged In Successfully
