Feature: Login Feature

@SmokeTest
Scenario: Login with valid credentials
Given UserId is "UserOne" and Password is "P@$$w0rd"
When User enters above credetials
Then User will be able to login

@RegressionTest
Scenario Outline: Login with Multiple credentials
Given Username is <UserID> and passkey is <Password>
When customer enters the above values
Then customer is able to login to the application

Examples:
| UserID | Password |
| User1  | Pass1    |
| User2  | Pass2    |
| User3  | Pass3    |
| User4  | Pass4    |