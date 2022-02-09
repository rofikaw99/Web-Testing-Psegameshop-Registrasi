Feature: add Employee

  @orange @addemployee
  Scenario: Add employee happy path
    Given I already Login to the dashboard
    When I clik menu Employee List
    Then Employee list page appear
    When I clik add
    Then Employee form appear
    When I fill the data with first name "fifeka" and last name "wahid"
    And click save button
    Then employee "fifeka wahid" added

    @addemployee2
  Scenario Outline: Add employee happy path
    Given I already Login to the dashboard
    When I clik menu Employee List
    Then Employee list page appear
    When I clik add
    Then Employee form appear
    When I fill the data with first name "<first name>" and last name "<last name>"
    And click save button
    Then employee "<first name> <last name>" added
    Examples:
    |first name|last name|
    |fifeka    |wahid    |
