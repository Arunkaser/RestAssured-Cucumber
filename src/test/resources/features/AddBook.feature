Feature: Functional Test Library Data

#  Background: User generates token for Authorisation
#    Given I am an authorized user

  @Sanity
  Scenario: the Authorized user can Add and Remove a book.
    Given A list of books are available
    When I add a book to my reading list
    Then the book is added
