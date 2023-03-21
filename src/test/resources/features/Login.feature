@Login
  Feature: Login Orange HRM

    @Login @Postive
      Scenario: Login with correct username and password
      Given user on the orange HRM Login
      When user click username field
      And user input username "Admin"
      And user click password field
      And user inpur password "admin123"
      And user click button login
      Then user succes login with menu "Dashboard"