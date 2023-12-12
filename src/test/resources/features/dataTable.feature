@dataTable
Feature: facebook sign in
 
  Scenario Outline: Sign up to facebook
    Given User logins to facebook website
    When  User validates homepage title
    Then User enters firstname and lastname
      |firstName| LastName|
      | sham | Sundar |
      | dev | Reddy    |
    And clicks on signin button 
      
