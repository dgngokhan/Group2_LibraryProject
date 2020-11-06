Feature: As a user I should be able to add new book under the books module



  Background:
    Given log in as a Test Librarian
    When user navigates to "Books" module
  @AddBookDisplayed
  Scenario: Add book button should displayed for Test Librarian
    Then Add Book header should be displayed.
  @AddBook_close
  Scenario: User should be able to cancel adding books by clicking close button
    When I click add book button
    When I click on the close button on add book window
    Then I should be able to cancel or exit