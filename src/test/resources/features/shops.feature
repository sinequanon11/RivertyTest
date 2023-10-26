@testriverty
Feature: Testing the Shops Feature

  Background:
    When User goes to Riverty "homepage"
    Then User accepts all cookies

  Scenario: TC-4 Testing the Riverty Shops Feature
    When User clicks Shops
    And User clicks Autovermietung
    And User clicks the result
    Then User asserts that a new window is opened
