Feature: validate Adactin reservation

  Scenario Outline: verifying the Adaction hotel with valid credintials
    Given user should be in  login page
    When user should login with the "<userName>" and "<password>"
    And they should click login
    And user should search for the hotel"<location>","<hotel>","<roomType>","<noOfRoom>","<checkInDate>","<checkOutDate>","<adult>"and"<childs>"
    And user should click search and click radio button and click on continue
    And user should enter "<firstName>","<lastName>","<address>"and"<cardNumber>"
    And user should select card type "<cardType>","<expMonth>","<expYear>"and"<cvv>"
    And user should click on booknow
    And print the booking Id on the console
    Then user should verify success msg

    Examples: 
      | userName         | password      | location  | hotel          | roomType | noOfRoom  | checkInDate | checkOutDate | adult   | childs  | firstName | lastName      | address                | cardNumber       | cardType    | expMonth | expYear | cvv |
      | gopinathabinayaa | gopinath@1993 | London    | Hotel Creek    | Double   | 1 - One   | 30-11-2021  | 31-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | Sydney    | Hotel Sunshine | Standard | 2 - Two   | 31-11-2021  | 01-12-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | Melbourne | Hotel Hervey   | Double   | 3 - Three | 29-11-2021  | 30-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | Brisbane  | Hotel Sunshine | Double   | 4 - Four  | 28-11-2021  | 29-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | Adelaide  | Hotel Cornice  | Double   | 5 - Five  | 27-11-2021  | 28-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | New York  | Hotel Sunshine | Standard | 6 - Six   | 26-11-2021  | 27-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | Sydney    | Hotel Hervey   | Double   | 7 - Seven | 25-11-2021  | 26-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | Sydney    | Hotel Hervey   | Standard | 8 - Eight | 24-11-2021  | 25-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | Paris     | Hotel Hervey   | Standard | 9 - Nine  | 23-11-2021  | 24-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
      #| gopinathabinayaa | gopinath@1993 | London    | Hotel Sunshine | Double   | 10 - Ten  | 22-11-2021  | 23-11-2021   | 2 - Two | 2 - Two | Gopinath  | Muthukrishnan | Komarapalayam-Namakkal | 1234567890123456 | Master Card | August   |    2022 | 123 |
