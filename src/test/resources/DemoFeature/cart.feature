Feature: Automating Cart Page in the DemoBlaze Website

  Scenario: Adding the Products to the cart and check out to purchase
    When Launch the Website
    And Click a phone Product
    And Click Add to Cart Button
    And Back to Home Page
    And Move to Laptops Category
    And Click a Laptop Product1
    And Click Add to Cart Button1
    And Click the Cart Option to open the Cart Page
    And Delete a Product from the Cart
    And Click the Place Order Button
    And Click the Purchase Button without filling the Details
    And Enter Name in the Place Order Details page
      | Prakash |
    And Enter Country in the Place Order Details page
      | Country | India |
    And Enter the City
    And Fetch the Credit Card Number
    And Enter Month
    And Enter Year 
    And Click the Purchase Button
    Then Click Ok Button and Check whether it returns to home page
