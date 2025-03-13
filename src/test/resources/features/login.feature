Feature: Login functionality for AutomationPractice

  As a new user of automation practice website
  I should be able to signin to  website
  so that i have all my transaction saved in my profile

  Background: I am an existing user loggin on to AUT

    Scenario: Successfully Login on to application
      Given I launch application url
      When I enter valid username and password
      When I click login button
      Then I should be able to login successfully
