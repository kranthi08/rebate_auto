@Regression
Feature: Rebate File Admin, Search Criteria Results with File Type as Billing and all the Statuses 

  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Rebate" application
  
  Scenario: Navigate to File Admin Tab
  	Given User is on Customer Contracts page
  	When Click on File Admin link in Customer Contracts page
  	Then File Admin Page should be displayed
  
  Scenario Outline: Search and Verify the Results with File Type as Billing and Status as ALL
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status All
  		| Master_Customer_Set | File_Type | File_Name                                       | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status                 | Browse_Error_Details_Dialog_MCS_Details																																										         | Browse_Error_Details_Dialog_Claim_Details                                                                                           |
  		| Kern Master         | Billing   | Fullsvcrebate-ARGKERN-ALL-BILLING-20181130.txt  | 10		  | 02/13/2019    | 11/2018        | 5,765        | 0            | 5,765          | Failed - Error Details | Master customer set:^Kern Master*File type:^Billing*File name:^Fullsvcrebate-ARGKERN-ALL-BILLING-20181130.txt*Invalid claims:^5,765 | 0497185692891161^08/2018^-156.03^External Claim ID ~ Hierarchy 1 ~*0497185872127201^07/2018^624.1^External Claim ID ~ Hierarchy 1 ~ |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status | From_Date  | To_Date    |  
  		| All                 |	Billing	  |	All    | 01/01/2015 | 12/31/2020 |
  
  Scenario Outline: Search and Verify the Results with File Type as Billing and Status as Processed
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status Processed
  		| Master_Customer_Set   | File_Type | File_Name   																		| Version   | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status    | No_Records_Message | 
  		| Kern Master           | Billing 	| Fullsvcrebate-ARGKERN-ALL-BILLING-20190228.txt	| 1					| 04/22/2019	  | 02/2019				 | 6,774        | 6,774        | 0	            | Processed |  		               |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status    | From_Date  | To_Date    |  
  		| All                 |	Billing	  |	Processed | 01/01/2015 | 12/31/2020 |  
	
  Scenario Outline: Search and Verify the Results with File Type as Billing and Status as Failed - Error Details
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results and Browse Error Details
  		| Master_Customer_Set | File_Type | File_Name   																		| Version | Received_Date | Process_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status                 | Browse_Error_Details_Dialog_MCS_Details																																										         | Browse_Error_Details_Dialog_Claim_Details                                                                                           | No_Records_Message |
  		| Kern Master         | Billing   | Fullsvcrebate-ARGKERN-ALL-BILLING-20181130.txt  | 10		  | 02/13/2019    | 11/2018      | 5,765        | 0            | 5,765          | Failed - Error Details | Master customer set:^Kern Master*File type:^Billing*File name:^Fullsvcrebate-ARGKERN-ALL-BILLING-20181130.txt*Invalid claims:^5,765 | 0497185692891161^08/2018^-156.03^External Claim ID ~ Hierarchy 1 ~*0497185872127201^07/2018^624.1^External Claim ID ~ Hierarchy 1 ~ |                    |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status                 | From_Date  | To_Date    |  
  		| All                 |	Billing	  |	Failed - Error Details | 01/01/2015 | 12/31/2020 |
  		
	Scenario Outline: Search and Verify the Results with File Type as Billing and Status as In Progress
  	Given User is on File Admin Page
  	When perform serach with File Type and Status
  		| Master_Customer_Set   | File_Type   | Status   | From_Date   | To_Date   |
  		| <Master_Customer_Set> | <File_Type> | <Status> | <From_Date> | <To_Date> |
  	Then verify the File Admin search results for Status In Progress
  		| Master_Customer_Set | File_Type | File_Name | Version | Received_Date | Processed_Date | Total_Claims | Valid_Claims | Invalid_Claims | Status | No_Records_Message |
  		|       						  |         	|           | 			  | 	 	          |                | 	            | 	           | 	              |        | No records found.  |
  	Examples: 
  		| Master_Customer_Set | File_Type | Status      | From_Date  | To_Date    |  
  		| All                 |	Billing  	|	In Progress | 01/01/2015 | 12/31/2020 |  						
  