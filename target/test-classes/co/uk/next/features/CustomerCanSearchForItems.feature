Feature: Search
		As a customer 
		I want the ability to search for a product of my choice
		So that I can add it to basket
		
Scenario Outline: Customer Defined Search
	Given I am Next homepage
	When I enter "<Item>" into the search bar
	And I click on the search button
	Then the result of "<Item>" is displayed

Examples:
|Item|
|Dress|
|Bra|
|Trousers|
