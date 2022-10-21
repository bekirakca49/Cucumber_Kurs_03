Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

 Scenario Outline: Creat and Delete a Exam

    And Click on the element in the left Nav
      | entranceExamsOne|
      | setupTwo |
      | entranceExamsTwo |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | <ExamName>|
    And User sending the keys in Form Content
      | academicPeriod1 |
      | <AcademicPeriodOption>|
      | gradeLevel1 |
      | <GradeLevelOption> |
    And Click on the element in the Dialog
      | saveButton|
    Then Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamsOne  |
      | setupTwo          |
      | entranceExamsTwo  |
    #burda geri dönüş yapmış olduk. silme işlemine geçiş yapmakk için.Feature:
    And User delete item from Dialog
      | <ExamName> |
    Then Success message should be displayed
   Examples:
     | ExamName        | AcademicPeriodOption | GradeLevelOption|
     | Kimya9          | academicPeriod2      | gradeLevel2|
     | IT  exam is2    | academicPeriod2      | gradeLevel2|
     | Oracle exam is3 | academicPeriod2      | gradeLevel2|



















