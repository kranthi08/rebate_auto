@Regression
Feature: Rebate Master Customer Set Abbreviation

	Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Rebate" application
    
  Scenario Outline: Verify and add the Master Customer Set if not available
  	Given User is on Customer Contracts page
  	When Navigate to Master Customer Set Abbreviation page 
  	Then Verify and add the required MCS if not available
  		| Master_Customer_Set   | Master_Abbreviation   |
  		| <Master_Customer_Set> | <Master_Abbreviation> |
  	And verify the newly added Master Customer Set
  		| Master_Customer_Set   | Master_Abbreviation   |
  		| <Master_Customer_Set> | <Master_Abbreviation> |
    Examples:
    	| Master_Customer_Set | Master_Abbreviation |
    	| QTP2_Master         | QTPA                |
  
  Scenario Outline: Update the Master Abbreviation
  	Given User is on Customer Contracts page
  	When Navigate to Master Customer Set Abbreviation page
  	Then Verify and update the Master Abbreviation
  		| Master_Customer_Set   | Master_Abbreviation   | New_Master_Abbreviation   |
  		| <Master_Customer_Set> | <Master_Abbreviation> | <New_Master_Abbreviation> |
  	And verify the updated Master Abbreviation
  		| Master_Customer_Set   | New_Master_Abbreviation   |
  		| <Master_Customer_Set> | <New_Master_Abbreviation> |
  	Examples:
    	| Master_Customer_Set | Master_Abbreviation | New_Master_Abbreviation |
    	| QTP2_Master         | QTPA                | QTPU										|

  Scenario Outline: Verify and Remove the Master Customer Set
  	Given User is on Customer Contracts page
  	When Navigate to Master Customer Set Abbreviation page
  	Then Verify and Remove the Master Customer Set Abbreviation
  		| Master_Customer_Set   | Master_Abbreviation   |
  		| <Master_Customer_Set> | <Master_Abbreviation> |
  	And verify MCS is removed or not
  		| Master_Customer_Set   | Master_Abbreviation   |
  		| <Master_Customer_Set> | <Master_Abbreviation> |
    Examples:
    	| Master_Customer_Set | Master_Abbreviation |
    	| QTP2_Master         | QTPU                |
       