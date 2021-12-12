@Regression
Feature: Rebate File Admin, Search Criteria Results with File Type as Rejected and all the Statuses 

  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Rebate" application
  
  Scenario: Navigate to File Admin Tab
  	Given User is on Customer Contracts page
  	When Click on File Admin link in Customer Contracts page
  	Then File Admin Page should be displayed
  
  Scenario Outline: Search and Verify the Results with File Type as Rejected and Status as ALL
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status All
  		| Master_Customer_Set | File_Type | File_Name                                       | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status                 | Browse_Error_Details_Dialog_MCS_Details																																										  | Browse_Error_Details_Dialog_Claim_Details |
  		| Humana              | Rejected  | Fullsvcrebate-ARGHUMA-COM-REJECTED-20190911.txt | 3			  | 09/11/2019    | 08/2019        | 4            | 3            | 1              | Failed - Error Details | Master customer set:^Humana*File type:^Rejected*File name:^Fullsvcrebate-ARGHUMA-COM-REJECTED-20190911.txt*Invalid claims:^1 |	0319196340003171^08/2019^0^Specialty      |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status | From_Date  | To_Date    |  
  		| All                 |	Rejected	|	All    | 01/01/2015 | 12/31/2020 |
  
  Scenario Outline: Search and Verify the Results with File Type as Rejected and Status as Processed
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status Processed
  		| Master_Customer_Set   | File_Type | File_Name   																		| Version   | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status    | No_Records_Message | 
  		| Humana	              | Rejected	| Fullsvcrebate-ARGHUMA-COM-REJECTED-20190911.txt	| 4					| 09/11/2019	  | 08/2019				 | 4	          | 4	           | 0	            | Processed |  		               |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status    | From_Date  | To_Date    |  
  		| All                 |	Rejected	|	Processed | 01/01/2015 | 12/31/2020 |  
	
  Scenario Outline: Search and Verify the Results with File Type as Rejected and Status as Failed - Error Details
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results and Browse Error Details
  		| Master_Customer_Set | File_Type | File_Name   																		| Version | Received_Date | Process_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status                 | Browse_Error_Details_Dialog_MCS_Details																																										  | Browse_Error_Details_Dialog_Claim_Details | No_Records_Message |
  		| Humana							| Rejected	| Fullsvcrebate-ARGHUMA-COM-REJECTED-20190911.txt	| 3			  | 09/11/2019	  | 08/2019			 | 4						| 3						 | 1							| Failed - Error Details | Master customer set:^Humana*File type:^Rejected*File name:^Fullsvcrebate-ARGHUMA-COM-REJECTED-20190911.txt*Invalid claims:^1 |	0319196340003171^08/2019^0^Specialty      |  	                 |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status                 | From_Date  | To_Date    |  
  		| All                 |	Rejected	|	Failed - Error Details | 01/01/2015 | 12/31/2020 |
  		
	Scenario Outline: Search and Verify the Results with File Type as Rejected and Status as In Progress
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status In Progress
  		| Master_Customer_Set | File_Type | File_Name | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status | No_Records_Message |
  		|       						  |         	|           | 			  | 	 	          |                | 	            | 	           | 	              |        | No records found.  |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status      | From_Date  | To_Date    |  
  		| All                 |	Rejected	|	In Progress | 01/01/2015 | 12/31/2020 |  						
  