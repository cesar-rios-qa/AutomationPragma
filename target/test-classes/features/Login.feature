@Login
  Feature: Login
    I as a user
    I want to log in the web


  @HappyPath
  Scenario: Valid credentials_Successful login
    When he logs into with the "username_valid" username and "password_valid" password
    Then the products screen should be displayed

  @UnhappyPath
  Scenario: Unconfirmed User_Unsuccessful login with unconfirmed user
    When he logs into with the "username_invalid" username and "password_invalid" password
    Then you should see a message indicating that it is error