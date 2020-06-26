Feature: Login to OpenCart site 

Scenario: Login functionality for a openkart site
    Given user navigates to demo.opencart 
    When  I enter Username as "TestAccount@Cognizant.com" and Password as "Test@123" 
    Then login should be successful
 
 Scenario: Adding item to Addtocart
    Given user search the item
    When click on the the add to cart button
    Then item added successfully in the cart
    
    
    