Feature: This feature file demonstrates the examples 

@BrowserLaunchTest
Scenario: This scenario launches a browser, hits a url and closes 
	Given I launch browser
	When I launch url "https://softwaretestingpro.github.io/index.html"
	Then I close browser
	
@AddNumbersTest
Scenario: This scenario adds 2 numbers
	Given I add 5 with 10 and print result

@SoftAssertionTest
Scenario: Example of Soft Assertion fails but test proceeds 
	Given I verify sum of 5 with 10 is 20 via soft assert

@HardAssertionTest
Scenario: Example of Hard Assertion fails and test halts 
	Given I verify sum of 5 with 10 is 20 via hard assert

@ScenarioOutlineTest
Scenario Outline: This scenario can test multiple test data without repeating the steps
	Given I verify sum of <num1> with <num2> is <sum> via hard assert

    Examples:
		| num1 | num2 | sum |
		| 1    | 1    | 2   |
		| 2    | 2    | 2   |
		| 3    | 3    | 6   |
		| 4    | 4    | 6   |