Feature: Search within All Categories

  Scenario: User searches for items within multiple categories
    Given the user is on the website's homepage
    When the user selects the category at index 4
    And clicks the search button
    Then the search results should be filtered by the selected category
    When the user selects the category at index 6
    And clicks the search button
    Then the search results should be filtered by the newly selected category
