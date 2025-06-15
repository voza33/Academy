Feature: Login page functionality check for academy website
  
  As a user I should be able to login successfully to the website
  So that I can access all the course data

  Background: 
    Given I am on the Academy login page

  Scenario: Successfull login with valid credentials
    Given I click on Login button 
    When I have entered a valid username and password
   # Then I am at home page of acadamey website
#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step
#
#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#     | name2 |     7 | Fail    |