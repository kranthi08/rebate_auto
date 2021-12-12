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
    	| Qtp_Master_1        | AUTO                |
  
       