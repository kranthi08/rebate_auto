@Regression
Feature: Rebate File Admin, Search Criteria Results with File Type as Cash Net Adjustment and all the Statuses 

  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Rebate" application
  
  Scenario: Navigate to File Admin Tab
  	Given User is on Customer Contracts page
  	When Click on File Admin link in Customer Contracts page
  	Then File Admin Page should be displayed
  
  Scenario Outline: Search and Verify the Results with File Type as Cash Net Adjustment and Status as ALL
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status All
  		| Master_Customer_Set | File_Type           | File_Name                                         | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status                 | Browse_Error_Details_Dialog_MCS_Details																																										                   | Browse_Error_Details_Dialog_Claim_Details                                                                                 |
  		| Kern Master         | Cash Net Adjustment | Fullsvcrebate-ARGKERN-ALL-CASHNETADJ-20171031.txt | 7 		  | 02/15/2019    | 10/2017        | 3            | 0            | 3              | Failed - Error Details | Master customer set:^Kern Master*File type:^Disbursement*File name:^Fullsvcrebate-ARGKERN-ALL-DISBURSEMENT-20171031.txt*Invalid claims:^2,496 | 0497174947888241^04/2017^0.03^Duplicate on Table ~*0497175021191831^04/2017^0.11^Duplicate on Table ~ Duplicate on File ~ |
  	Examples: 
  		| Master_Customer_Set | File_Type           | Status | From_Date  | To_Date    |  
  		| All                 |	Cash Net Adjustment | All    | 01/01/2015 | 12/31/2020 |
  
  Scenario Outline: Search and Verify the Results with File Type as Cash Net Adjustment and Status as Processed
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status Processed
  		| Master_Customer_Set | File_Type | File_Name | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status | No_Records_Message | 
  		|                     |           |           | 			  |           	  |      				   |              |              |  	            |        | No records found.  |
  	Examples: 
  		| Master_Customer_Set | File_Type           | Status    | From_Date  | To_Date    |  
  		| All                 |	Cash Net Adjustment | Processed | 01/01/2015 | 12/31/2020 |  
	
  Scenario Outline: Search and Verify the Results with File Type as Cash Net Adjustment and Status as Failed - Error Details
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results and Browse Error Details
  		| Master_Customer_Set | File_Type           | File_Name   																		  | Version | Received_Date | Process_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status                 | Browse_Error_Details_Dialog_MCS_Details																																										                   | Browse_Error_Details_Dialog_Claim_Details                                                                                 | No_Records_Message |
  		| Kern Master         | Cash Net Adjustment | Fullsvcrebate-ARGKERN-ALL-CASHNETADJ-20171031.txt | 7 		  | 02/15/2019    | 10/2017      | 3            | 0            | 3              | Failed - Error Details | Master customer set:^Kern Master*File type:^Disbursement*File name:^Fullsvcrebate-ARGKERN-ALL-DISBURSEMENT-20171031.txt*Invalid claims:^2,496 | 0497174947888241^04/2017^0.03^Duplicate on Table ~*0497175021191831^04/2017^0.11^Duplicate on Table ~ Duplicate on File ~ |                    |
  	Examples: 
  		| Master_Customer_Set | File_Type           | Status                 | From_Date  | To_Date    |  
  		| All                 |	Cash Net Adjustment | Failed - Error Details | 01/01/2015 | 12/31/2020 |
  		
	Scenario Outline: Search and Verify the Results with File Type as Cash Net Adjustment and Status as In Progress
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status In Progress
  		| Master_Customer_Set | File_Type | File_Name | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status | No_Records_Message |
  		|       						  |         	|           | 			  | 	 	          |                | 	            | 	           | 	              |        | No records found.  |
  	Examples: 
  		| Master_Customer_Set | File_Type           | Status      | From_Date  | To_Date    |  
  		| All                 |	Cash Net Adjustment | In Progress | 01/01/2015 | 12/31/2020 |  						
  