Feature: Login Page Automation SauceDemo

Scenario Outline: Check login is successfull with valid data
Given user is on login page
When user enter "<username>" and "<password>"
And clicks on Login button
Then User should navigate to Home page
And user close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
| locked_out_user | secret_sauce |
| problem_user | secret_sauce |
| performance_glitch_user | secret_sauce |
