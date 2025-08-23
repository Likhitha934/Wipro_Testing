Feature: Category Navigation

  Scenario: User navigates through product categories
    Given the user is on the home page
    When the user clicks on the "category" link or button
    And the user clicks on the "electronics" category
    Then the user should be taken to the "electronics" category page
