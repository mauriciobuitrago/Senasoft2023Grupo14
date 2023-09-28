Feature: Login
  I as a user want to log in

  Scenario Outline: he user will log in to access the services of the page
    Given 'user' is on the login page 'https://www.booking.com/'
    When he user is filling out the credentials to log in
      | E-mail   | <E-mail>   |
      | Password | <Password> |

    Then he user has had a successful login

    Examples:
      | E-mail                | Password      |
      | jhonsenapro@gmail.com | Sumadre199314 |
