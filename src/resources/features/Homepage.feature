Feature: Search the desired mobile phones

  @EndToEnd
  Scenario: User searches for the desired mobile phone
    Given User is on Amazon Homepage
    And User clicks on hamburger
    And User clicks on Electronics and Computers
    And User clicks on Phone and Accessories
    And User clicks on Mobile Phones and Smartphones
    When User searches for the desired specifications
    Then User is displayed with the list of devices which are desired search results

  @EndToEnd @Negative
  Scenario: User search fails while searching for desired mobile phone
    Given User is on Amazon Homepage
    And User clicks on hamburger
    And User clicks on Electronics and Computers
    And User clicks on Phone and Accessories
    And User will click on Mobile Phones and Smartphones
