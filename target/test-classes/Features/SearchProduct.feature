Feature: Search and Place the order for Products
 
 	@OfferPage
  Scenario Outline: Search Experience for product search in both home and Offers page
  
    Given User is on GreenCart Landing page
    When user searched with Shortname <CoulnName> and extracted actual name of product
    Then user searched for same <CoulnName> in Offer page 
    And  Validate product name in offers pages matched with landing page
    
    Examples:
    | CoulnName |
    | Tom  |
    
    

 