Feature: As a registerd user i need to purchase an item from demo site

  Background: As an exisiting user i need to checkout an item

  Scenario: Product checkout
    Given  I launch application url and watch
    When I enter registered email address and password
    When I click on login button and watch
    Then I should be able to login and see home page
    When  I click on view product link
    When I click on add to cart button
    When I click on continue shopping button
    When I click on cart icon
    When I click on proceed to checkout
    When I click on place order button
    Then Payment page will be displayed
    When I enter name on card
    When I enter card number
    When I enter cvc and expiration
    When I click on place order button and watch
    Then Order is placed message should be displayed

