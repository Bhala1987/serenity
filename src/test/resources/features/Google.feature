@Google
Feature: Search in Google

  Background:
    Given launch the google page url 'https://www.google.com/'

  Scenario Outline: Search for something in google
    When search for '<SearchText>'
    Then all the results should contain the text '<SearchText>'
    Examples:
      | SearchText |
      | Google     |
      | Bhala      |
