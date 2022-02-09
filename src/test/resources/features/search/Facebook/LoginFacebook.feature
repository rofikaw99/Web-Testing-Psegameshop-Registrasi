Feature:Login
  As a user
  I want to perform login on facebook
  so that I can see my news feed

  @fblogin
  Scenario: login success
    Given I open facebook login page
    When I input email and password
    When I click button login
    Then I can see my news feed


