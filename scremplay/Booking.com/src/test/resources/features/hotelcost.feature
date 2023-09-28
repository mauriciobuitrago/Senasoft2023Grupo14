Feature:HotelCost
  The user selects the cost of the most comfortable room for their preference

  Scenario Outline: the user selects the price of the most appropriate room for their respective reservation
    Given 'user' is on the login page 'https://www.booking.com/'
    When he user is filling out the credentials to log in
      | E-mail   | <E-mail>   |
      | Password | <Password> |
    And Starts the interaction with the page and the hotel reservation integrating the established parameters
    And The user begins to select filters on the page
    Then he user has had a successful login

    Examples:
      | E-mail                | Password       |
      | jhonsenapro@gmail.com | 123456789Smith  |
      | eljhonsito@gmail.com  | 123456789Smith |