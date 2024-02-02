Feature: GET all carts

  Scenario: User calls web service to get all carts
    Given  user had made api endpoint for all cards
    When  User retrieves the carts
    Then Status code is 200




