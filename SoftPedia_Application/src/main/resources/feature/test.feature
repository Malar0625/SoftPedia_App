@softpedia
Feature: SoftPedia Application

@tc_01_Register
Scenario: Register into softpedia web application
	Given  The user launch and register the application with valid and invalid details
	And close the browser

@tc_02_Login
Scenario: Login into softpedia web applications
	Given The user launch the application
	Then clicking on the user icon and enter username and password
	And clicking on the login button

@tc_03_Search
Scenario: Search for application
	Given The user launch the softpedia application
	Then The User enter the word for search
	Then Click go button
	Then Download the application in the list
	And Check file is exist or not

@tc_04_Contactus
Scenario Outline: Send feedback through contact us
	Given The user launch the browser
	Then click on i named icon and contact us
	Then click radio button from the list
	Then The user enter "<msg>" and "<emailid>" for contactus page
	And clicking on send button
	
Examples: 

		|msg	        |emailid	                | 
		|hello      	|malarvizhimarie@gmail.com	|
		
@tc_05_Calender	
Scenario: Softpedia News Calendar
	
	Given Launch the browser for calendar
	Then Select month and year
	Then Select the date 
	And Scroll and click any news 
	
@tc_6_NextPage
Scenario: Navigation to the next page
	
	Given The user Launch the application for nextpage
	Then Scroll Down and click next page