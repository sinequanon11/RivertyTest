@testriverty
Feature: Testing the Search Feature

  Background:
    When User goes to Riverty "homepage"
    Then User accepts all cookies

  Scenario Outline: TC-1 Testing the Search Feature with items not available
    When User clicks the Search button
    And User enters an "<item>" in the Search bar and searches
    Then User sees a message saying that there is no result for this search

    Examples:
      | item      |
      | mortgages |
      | airplane  |
      | banana    |

  Scenario Outline: TC-2 Testing the Search Feature with items available
    When User clicks the Search button
    And User enters an "<item>" in the Search bar and searches
    Then User sees the results for this search

    Examples:
      | item   |
      | mode   |
      | konsum |
      | garten |

  Scenario: TC-3 Searching an item from Excel file
    When User clicks the Search button
    And User enters an item from "RivertySearch" sheet of the Excel file and searches
    Then User sees the results for this search