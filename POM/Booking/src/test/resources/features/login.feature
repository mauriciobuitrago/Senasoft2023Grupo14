Feature: Login
  I as a user want to log in

  Scenario: he user will log in to access the services of the page
    Given he user is on the login page
    When he user is filling out the credentials to log in.
    Then he user has had a successful login