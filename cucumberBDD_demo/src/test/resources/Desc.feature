Feature: Product Description Page Navigation

  Scenario: User navigates from search results to a specific product's details
    Given the user is on the website's search page
    When the user searches for "Apple MacBook Pro 13 16GB RAM"
    And the user selects the "Apple MacBook Pro 13 RETINA INTEL CORE 16GB RAM 1TB SSD" from the results
    Then the user should be on the product description page for that item