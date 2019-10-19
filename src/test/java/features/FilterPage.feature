Feature: Filter page Work India Application

  @FilterPage
  Scenario: Verify serveral field presence on Filter page
    Given Appium server is up and running and WorkIndia application is launched
    When User is on Landing page of the application
    And Click on Filter button
    And User is on Filter page of the application
    Then User can see serveral fields on the filter page

  @FilterPage
  Scenario Outline: Verify the label for different engish options
    Given Appium server is up and running and WorkIndia application is launched
    When User is on Landing page of the application
    And Click on Filter button
    And User is on Filter page of the application
    Then Validate "<Lable>" when differnt "<options>" are selected.

    Examples: 
      | Lable          | options                                         |
      | No English     | No English: English Bolni Nahi Aati             |
      | Thoda English  | Thoda English: Tuti-Futi English Bolna Aata Hai |
      | Good English   | Good English:Aapko Achhi English Bolna Aata Hai |
      | Fluent English | Fluent English:Aapko Aisi English Bolna Hai     |
