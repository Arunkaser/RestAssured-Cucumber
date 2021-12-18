Feature: Functional Test Library Data

  Background: User generates token for Authorisation
    Given I am an authorized user

  Scenario: the Authorized user can Add and Remove a book.
    Given A list of books are available
    When I remove a book from my reading list
    Then the book is removed