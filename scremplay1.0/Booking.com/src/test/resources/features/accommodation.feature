Feature:Accommodation
  Once the user logs in, he is located in the accommodation part

  Scenario Outline: he user can make the hotel reservation according to his convenience
    Given 'user' is on the login page 'https://www.booking.com/'
    When he user is filling out the credentials to log in
      | E-mail   | <E-mail>   |
      | Password | <Password> |
   And Starts the interaction with the page and the hotel reservation integrating the established parameters
    Then he user has had a successful login

    Examples:
      | E-mail                | Password      |
      | jhonsenapro@gmail.com | Sumadre199314 |