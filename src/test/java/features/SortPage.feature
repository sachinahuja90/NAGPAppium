Feature: Filter page Work India Application

	@SortPage
  Scenario Outline: Verify the sort options on the sort pop-up
    Given Appium server is up and running and WorkIndia application is launched
    When User is on Landing page of the application
    And Click on sort button
    And User is on sort pop-up of the application
    Then Validate "<Sortedby>" when choose different sort "<Selection>"

    Examples: 
      | Selection              | Sortedby |
      | Salary - High to Low   | Salary   |
      | New Job                | New Job  |
      | Job View - High to Low | Job view |
