Feature: Validating signIn API's
@SignInwithPhonenumber
Scenario Outline: verify if user login is successfully added using signInAPI
Given Add signIn payload with "<phoneNumber>" "<password>"
When user calls "signInAPI" with "POST" http request
Then the API call got success with status code 200 
And "status" in response body is "OK"

Examples: 
     		|phoneNumber	|    password|
     		|+447591195685		|tutorbin1234|

@Signinwithemailandpassword
Scenario Outline: verify if email password functionlity is working
Given Add email payload with password "<email>" "<password>" 
When user calls "signInAPI" with "POST" http request
Then the API call got success with status code 200 
And "status" in response body is "OK"

Examples:
             |email	|password|
     		|nitinjain9205868138@gmail.com|Nitin1234|
     		
     		
     		




		
			
