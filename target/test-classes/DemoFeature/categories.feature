Feature: Automating Category Options and Adding the Products to the Cart in Demo BLAZE Website

  Scenario: 
    When Launch the DemoBlaze Website to add products to the cart
    And Click a Phone Product
    And Click Add To Cart Button1
    And Move to the Previous Page and click another phone
    And Click Add To Cart Button2
    And Switch to the Home Page
    Then Phone Products added to the Cart Successfully
    And Locate the Laptops Link in the Categories Menu
    And Click a Laptop Product
    And Click Add to Cart Button3
    And Switch to the Laptop Page and click another Laptop
    And Click Add to Cart Button4
    And Switch to the Home Page
    Then Laptop Products added to the Cart Successfully
    And Locate the Monitors Link in the Categories Menu
    And Click a Monitor Product
    And Click Add to Cart Button5
    And Switch to the Monitor Page and click another Monitor
    And Click Add to Cart Button6
    And Switch to the Home Page
    Then Monitor Products added to the Cart Successfully
