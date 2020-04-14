@Testing
Feature: Search Item from Homepage

  Scenario: Verify Search items
    Given Open chrome browser and enter url
    When Verify homePage title
    And Enter "Java" in for search
    Then Verify Search Results