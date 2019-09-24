Feature: payright Login
  Scenario: Login presence on Payright home page
    Given I launch chrome browser
    When I open  payright homepage
    Then I verify that login present on page
    And Close browser