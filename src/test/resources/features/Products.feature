@Products
  Feature: Products
    I as a user
    I want to view products

  Background:
    Given he logs into with the "username_valid" username and "password_valid" password

  @HappyPath
  Scenario: Validate that the product has detail
    When he enters a "Product" product
    Then he validates that the detail has information

    @HappyPath
    Scenario: Validate that the product has detail
      When he enters a "Product" product
      And click on the option to add to cart
      Then the product is added to the shopping cart
