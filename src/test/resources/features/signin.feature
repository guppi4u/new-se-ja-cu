Feature: Signin functionality for AutomationPractice

  As a new user of automation practice website
  I should be able to signin to  website
  and create my profile

  Background: I am a new user signing to automationexercise site

  Scenario: Sucessfull new user sign up
    Given i launch application url
    When I click on signin link
    When Enter username
    When Enter email
    When I click on signup button
    Then Signin page should be displayed