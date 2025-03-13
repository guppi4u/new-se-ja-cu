Feature: New user registration

  Background: I am a new user iam registering to automationexercise site

    Scenario: I am new user registering to automationexercise
      Given As new user i launch application url
      When I enter new users username
      When I enter new users emailid
      When I click on singup button
      Then user sees registration page
      When I select Title button
      When I enter password
      When I select date of birth
      When I enter fristname of user
      When I enter lastnamename of user
      When I enter company of user
      When I enter address of user
      When I select country of user
      When I enter state of user
      When I enter city of user
      When I enter zipcode of user
      When I enter mobilenumber of user
      When I click on createaccount button
      Then new user registration success message is displayed