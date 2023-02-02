Feature: Validating Orders API
Scenario Outline: verify if user login is able to create order with description
Given Add Orders payload with "<description>" and "<type>"
When user calls "orderTypeAPI" with "POST" http request
Then the API call got success with status code 201
And "status" in response body is "OK"

Examples: 
     		|description	|  type|
     		|testing	|assignment|



