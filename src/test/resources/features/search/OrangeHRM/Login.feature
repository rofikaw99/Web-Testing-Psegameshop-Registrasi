Feature:Login in Orange HRM

  @orange @loginorange
  Scenario: login success
    Given I open orangeHRM login page
    When I input email and password in orangeHRM
    When I click button login orangeHRM
    Then I can see my dashbord
