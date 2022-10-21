Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

    Scenario: Create Country
      And Click on the element in the left Nav
          | setupOne |
          | parameters |
          | countries |
      And Click on the element in the Dialog
        | addButton |
      And User sending the keys in Dialog content
        | nameInput | bekirCountry2|
        | codeInput | 11112111|
      And Click on the element in the Dialog
        | saveButton |
      And User delete item from Dialog
        | bekirCountry2|
      And Success message should be displayed


      Scenario: Create a Nationality
        And Click on the element in the left Nav
          | setupOne |
          | parameters |
          | nationalities |
        And Click on the element in the Dialog
          | addButton |
        And User sending the keys in Dialog content
          | nameInput | bekirNat11|
        And Click on the element in the Dialog
          | saveButton |

        And User delete item from Dialog
          | bekirNat11 |

        And Success message should be displayed

        Scenario: Creat a Fee, delete Fee

          And Click on the element in the left Nav
            | setupOne |
            | parameters |
            | fees |
          And Click on the element in the Dialog
            | addButton |
          And User sending the keys in Dialog content
            | nameInput          |  bekirFee12 |
            | codeInput          |  bekirFee12  |
            | integrationCode    |  bekirFee12  |
            | priorityCode       |  1505       |

          And Click on the element in the Dialog
            | saveButton |
          And User delete item from Dialog
            | bekirFee12 |
          And Success message should be displayed













