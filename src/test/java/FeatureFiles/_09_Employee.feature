# Employee menusu için Create-Exist-delete bölümleri olan Senaryoyu yazınız
# Daha sonra aynı senaryoyu 5 farklı değerler için çalıştırınız

Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario Outline: Creat a Fee, delete Fee
    And Click on the element in the left Nav
      | humanResources |
      | employees |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | firstNameInput              | <firstName>      |
      | lastNameInput               | <lastName>       |
    And Click on the element in the Dialog
      | genderInput0                |
      | genderInput1                |
      | employeesTypeInput0         |
      | employeesTypeInput1         |

    Examples:
      | firstName   |lastName     |
      | bekir001    |akca001      |