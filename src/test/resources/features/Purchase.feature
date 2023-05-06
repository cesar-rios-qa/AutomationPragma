@Purchase
  Feature: Purchase
    I as a user
    I want purchase to product

    Background:
      Given he logs into with the "username_valid" username and "password_valid" password
      And he enters a "Product" product


  Scenario: Purchase a product
    When click on the option to add to cart
    Then completes the purchase process successfully
