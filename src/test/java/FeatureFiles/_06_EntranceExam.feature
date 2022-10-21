Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Creat a Entrance Exams, delete Entrance Exams

    And Click on the element in the left Nav
      | entranceExamsOne|
      | setupTwo |
      | entranceExamsTwo |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | bekirExam22|
    And Click on the element in the Dialog
      | academicPeriod1 |
      | academicPeriod2 |
      | gradeLevel1 |
      | gradeLevel2 |
    And Click on the element in the Dialog
      | saveButton|
    Then Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamsOne|
      | setupTwo |
      | entranceExamsTwo |
    #burda geri dönüş yapmış olduk. silme işlemine geçiş yapmakk için.Feature:
    And User delete item from Dialog
      | bekirExam22 |
    Then Success message should be displayed


















