Feature: API Testing

@APIRequest
  Scenario: Verify API Response
    Given I have the endpoint "https://jsonplaceholder.typicode.com/posts/1"
    When I make a GET request
    Then the status code should be 200
    And the response should contain "userId"