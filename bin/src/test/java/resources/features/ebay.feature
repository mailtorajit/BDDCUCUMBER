@ebay
Feature: ebay

  Scenario: Add to Cart
    Given I set search text "Titanwatchesmen"
    When I perform search
    Then click the first "Titan" element in the search result grid
    Then click Add To Cart    

  Scenario Outline: Add to Cart
    Given I set search text "<item>"
    When I perform search
    Then click the first "<item>" element in the search result grid
    Then click Add To Cart
    

    Examples: 
      | item            |
      | casiowatchwomen |
      | fossilwatchmen  |
