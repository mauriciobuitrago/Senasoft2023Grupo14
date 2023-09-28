Feature:Reservation
  the user is going to finalize his hotel reservation

  Scenario Outline: the home user will start the reservation of his hotel
    Given 'user' is on the login page 'https://www.booking.com/'
    When he user is filling out the credentials to log in
      | E-mail   | <E-mail>   |
      | Password | <Password> |
    And Starts the interaction with the page and the hotel reservation integrating the established parameters
    And The user begins to select filters on the page
    And the user will finalize his reservation and finish his process
    Then he user has had a successful login

    Examples:
      | E-mail                | Password       |
      | jhonsenapro@gmail.com | 123456789Smith  |
      | eljhonsito@gmail.com  | 123456789Smith |