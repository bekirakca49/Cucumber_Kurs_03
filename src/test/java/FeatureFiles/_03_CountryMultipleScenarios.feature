Feature:  Country Multi Scenairo

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to country page

  @Regression
  Scenario: Create Country
    When Create a country
    Then Success message should be displayed


  Scenario: Create a country parameter data
    When Create a country name as "bekirYeni1" code as "code2"
    Then Success message should be displayed