
@Sample
Feature: To validate the sample form

  @tag1
  Scenario: Sample from
    Given open the browser and enter the url of sample form
    When User enters firstname,lastname,email,contactno
    When enters a message
    And Click on submit button
    Then alert message comes
   
    
  @tag2
  Scenario Outline: 
  	Given open the browser and enter the url of sample form
    And User enters "<firstname>","<lastname>","<email>","<contactno>"
    And enters a message
    And Click on submit button
    Then alert message comes
   
    Examples: 
      | firstname | lastname | email                      | contactno |
      | va123 		|  lakhore | 89@.com                    | 76584726  |
     	| vaishnavi |   $lak234| vaishnavi@.com             |99897845323|
      |Vaishnavi	|   Lakhore| VaishnaabiLkahore@gmail.com|7888542869 |
