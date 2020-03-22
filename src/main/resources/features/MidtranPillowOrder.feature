@Testing 
Feature: Pillow purchasing using Payment method Credit Card
	
	Scenario: Verify payment status with valid Card
		Given Open chrome browser and enter url
		When Click on Buy now
		And Click on Checkout button
		Then payment with Valid Credit Card
		
		
	Scenario: Verify payment status with invalid Card
			Given Open chrome browser and enter url
			When Click on Buy now
			And Click on Checkout button
			Then payment with invalid Credit Card