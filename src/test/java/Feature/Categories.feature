Feature: Get Api Feature

  Scenario: Get user details
    Given url 'http://samarthbuyadmin.us-west-1.elasticbeanstalk.com/SamarthBuyAdmin/login/Categories'
    When method GET
    Then status 200
    * print response
    * def jsonResponse = response
    * print jsonResponse
    * assert jsonResponse == response
    #* def actId = jsonResponse.id
    #* def actName = jsonResponse.name
    #* def actEmail = jsonResponse.email
    #* print actId
    #* print actName
    #* print actEmail
    #* match actId == 1516217
    #* match actName == 'Chandrakala Chaturvedi'
    #* match actEmail == 'chaturvedi_chandrakala@kuhic-bartell.test'
