Feature: Check list of users

  Background: 
    * url 'https://reqres.in/api/users'
    * header Accept = 'application/json'
    * def expectedOutput = read('../DemoResult\Result.json')

  Scenario: Get list of all the users
    Given param page = 2
    When method GET
    Then status 200
    * print response
    And match $ == expectedOutput
    And match response == expectedOutput
    #contains
    And match response.data[0] == {"id": 7, "email": '#ignore', "first_name": "Michael", "last_name": "Lawson", "avatar": '#ignore'}
    And match response.data[*].id contains [7, 8, 9, 10, 11, 12]
    And match response.data[*].email contains 'lindsay.ferguson@reqres.in'
    And match response.data[*].first_name contains ['Lindsay', 'Tobias', 'Byron']
    #match (not) !contains
    And match response.data[*].id !contains [null, 1]
    And match response.data[*].id !contains 3
    #match contains only:
    And match response.data[*].id contains only [7, 8, 9, 10, 11, 12]

  Scenario: Get user details1
    Given url 'https://reqres.in/api/users/2'
    When method GET
    Then status 200
    * print response
    * def name = response.data.first_name
    * def surname = response.data.last_name
    * assert name + surname == 'JanetWeaver'