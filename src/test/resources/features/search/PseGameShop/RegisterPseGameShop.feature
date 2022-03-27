Feature:Login
  As a user
  I want to perform register on https://www.psegameshop.com/
  so that I can register on the website

  @PositiveResgister
  Scenario: Positive Register
    Given I open psegameshop home page
    When I chose favorite Genre, Console, Hobbie & Interest, and Gender then I input email "aldybuddy4040@gmail.com", password "admin745463696" and confirm "admin745463696"
    And I click button register
    Then Appear message thank you for register


  @NegativResgisterWeakPassword
  Scenario: Negative Register [Weak Password]
    Given I open psegameshop home page
    When I chose favorite Genre, Console, Hobbie & Interest, and Gender then I input email "aldy@gmail.com", password "a" and confirm "a"
    And I click button register
    Then Appear message weak password

  @NegativResgisterEmailoutofsync
  Scenario: Negative Register [Email out of sync]
    Given I open psegameshop home page
    When I chose favorite Genre, Console, Hobbie & Interest, and Gender then I input email "aldy@gmail.com", password "admin745463696" and confirm "admin727859696"
    And I click button register
    Then Appear password do not match


