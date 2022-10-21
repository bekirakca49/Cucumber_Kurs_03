# Daha önceki Create a Fee, delete Fee senaryoosunu
  # Aşağıdaiki 5 farklı değerler icin çalıştırınız

Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

 Scenario Outline: Creat a Fee, delete Fee

    And Click on the element in the left Nav
      | setupOne |
      | parameters |
      | fees |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput       | <name>  |
      | codeInput     | <code> |
      | integrationCode | <intCode> |
      | priorityCode     |<priority>      |

    And Click on the element in the Dialog
      | saveButton |

    And User delete item from Dialog
      | <name> |

    And Success message should be displayed
   Examples:
     | name         |code         |intCode        |priority |
     | bekirFe201    |bekirFe201    |bekirFee201     |895      |
     | bekirFe211    |bekirFe221    |bekirFee211     |896      |


















