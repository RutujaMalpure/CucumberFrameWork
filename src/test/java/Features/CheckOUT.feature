Feature: Place the order for Products
 
 @PlaceOrder
  Scenario Outline: Search Experience for product search in both home and Offers page
  
    Given User is on GreenCart Landing page
    When user searched with Shortname <ProductName> and extracted actual name of product
    And Added "3" items of the selected product to cart
    Then user proceeds to checkout  Validate the <ProdctName> items in checkout Page
    And Verify user had ability to enter promo code and place the order
    
   Examples:
   | ProductName |
   | Tom         |
   
  

 