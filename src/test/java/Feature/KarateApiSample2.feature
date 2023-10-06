Feature: Get Api Sample Feature

Scenario: get details
 Given url 'https://reqres.in/api/users'
 When method GET
 Then status 200
 * print response
 #And expectedResult == read('')
