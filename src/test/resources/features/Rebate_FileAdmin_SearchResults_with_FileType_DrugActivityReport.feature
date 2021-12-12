@Regression
Feature: Rebate File Admin, Search Criteria Results with File Type as Drug Activity Report and all the Statuses 

  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Rebate" application
  
  Scenario: Navigate to File Admin Tab
  	Given User is on Customer Contracts page
  	When Click on File Admin link in Customer Contracts page
  	Then File Admin Page should be displayed
  
  Scenario Outline: Search and Verify the Results with File Type as Drug Activity Report and Status as ALL
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status All
  		| Master_Customer_Set | File_Type            | File_Name                                | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status    | Browse_Error_Details_Dialog_MCS_Details	| Browse_Error_Details_Dialog_Claim_Details |
  		| Kern Master         | Drug Activity Report | Fullsvcrebate-ARG0497-ALL-DAR-202004.txt | 1 		  | 06/08/2020    | 06/2020        | 6,856        | 6,856        | 0              | Processed |                                         |  																					|
  	Examples: 
  		| Master_Customer_Set | File_Type            | Status | From_Date  | To_Date    |  
  		| All                 |	Drug Activity Report | All    | 01/01/2015 | 12/31/2020 |
  
  Scenario Outline: Search and Verify the Results with File Type as Drug Activity Report and Status as Processed
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status Processed
  		| Master_Customer_Set | File_Type            | File_Name                                | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status    | No_Records_Message | 
  		| Kern Master         | Drug Activity Report | Fullsvcrebate-ARG0497-ALL-DAR-202004.txt | 1 		  | 06/08/2020    | 06/2020        | 6,856        | 6,856        | 0              | Processed |                    |
  	Examples: 
  		| Master_Customer_Set | File_Type            | Status    | From_Date  | To_Date    |  
  		| All                 |	Drug Activity Report | Processed | 01/01/2015 | 12/31/2020 |  
	
  Scenario Outline: Search and Verify the Results with File Type as Drug Activity Report and Status as Failed - Error Details
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results and Browse Error Details
  		| Master_Customer_Set | File_Type | File_Name | Version | Received_Date | Process_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status | Browse_Error_Details_Dialog_MCS_Details | Browse_Error_Details_Dialog_Claim_Details | No_Records_Message |
  		|                     |           |           |  		    |               |              |              |              |                |        |                                         |                                           | No records found.  |
  	Examples: 
  		| Master_Customer_Set | File_Type            | Status                 | From_Date  | To_Date    |  
  		| All                 |	Drug Activity Report | Failed - Error Details | 01/01/2015 | 12/31/2020 |
  		
	Scenario Outline: Search and Verify the Results with File Type as Drug Activity Report and Status as In Progress
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status In Progress
  		| Master_Customer_Set | File_Type | File_Name | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status | No_Records_Message |
  		|       						  |         	|           | 			  | 	 	          |                | 	            | 	           | 	              |        | No records found.  |
  	Examples: 
  		| Master_Customer_Set | File_Type            | Status      | From_Date  | To_Date    |  
  		| All                 |	Drug Activity Report | In Progress | 01/01/2015 | 12/31/2020 |  						
  