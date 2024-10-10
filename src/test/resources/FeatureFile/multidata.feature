Feature: Passing data in name field

  Scenario: Passing multi data in the name field
    When Launch the URL
    And Locate the Name Field
    And Multiple Data are
      | Prakash | 23 |
      | Rajesh  | 30 |
    And Locate the Number Field
    And Multiple Numbers are
      | number | 8610368086 |
