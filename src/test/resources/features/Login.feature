@Login
  Feature: Login Orange HRM

    @Login @Postive
      Scenario: Login with correct username and password
      Given user on the orange HRM Login
      When user click username field
      And user input username "Admin"
      And user click password field
      And user input password "admin123"
      And user click button login
      Then user succes login with menu "Dashboard"

    @Login @Negative
      Scenario: Login with wrong username
      Given user on the orange HRM Login
      When user click username field
      And user input username "username salah"
      And user click password field
      And user input password "admin123"
      And user click button login
      Then get notification "Invalid credentials"

    @Login @Negative
    Scenario: Login with wrong password
      Given user on the orange HRM Login
      When user click username field
      And user input username "Admin"
      And user click password field
      And user input password "admin123456789"
      And user click button login
      Then get notification "Invalid credentials"

    @Login @Negative
    Scenario: Login with null username
      Given user on the orange HRM Login
      And user click password field
      And user input password "admin123456789"
      And user click button login
      Then field username get notif "Required"

    @Login @Negative
    Scenario: Login with null password
      Given user on the orange HRM Login
      When user click username field
      And user input username "Admin"
      And user click button login
      Then field password get notif "Required"

    @Login @Negative
    Scenario: Login with null username and null password
      Given user on the orange HRM Login
      And user click button login
      Then field username get notif "Required"
      Then field password get notif "Required"