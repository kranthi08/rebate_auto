@Regression
Feature: Rebate Contract Tab UI Validation 

  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Rebate" application
	
  Scenario: Navigate to Contract Creation page
    Given User is on Customer Contracts page
    When click on New button
    Then Customer Contract Creation page should be displayed
    
  Scenario Outline: Verify Vendor List Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor List Box presence
  	Then verify the Vendor List Box enabled
  	And verify the Vendor List Box items
  		| Vendor_List_Items   |
  		| <Vendor_List_Items> |	 
  	And select Vendor List Box value
  		| Vendor_List_Value   |
  		| <Vendor_List_Value> |
    Examples: 
    	| Vendor_List_Items | Vendor_List_Value |
    	| Optum*SS&C*ESI    | Optum             |
    
  Scenario Outline: Verify Vendor Contract Type List Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor Contract Type List Box presence
  	Then verify the Vendor Contract Type List Box enabled
  	And verify the Vendor Contract Type List Box items
  		| Vendor_Contract_Type_List_Items   |
  		| <Vendor_Contract_Type_List_Items> |	 
  	And select Vendor Contract Type List Box value
  		| Vendor_Contract_Type_List_Value   |
  		| <Vendor_Contract_Type_List_Value> |
    Examples: 
    	| Vendor_Contract_Type_List_Items                                | Vendor_Contract_Type_List_Value |
    	| Fixed Guarantee*Pass Thru %*Pass Thru % with Minimum Guarantee | Fixed Guarantee                 |
    	
  Scenario Outline: Verify Vendor Claim Basis List Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor Claim Basis List Box presence
  	Then verify the Vendor Claim Basis List Box enabled
  	And verify the Vendor Claim Basis List Box items
  		| Vendor_Claim_Basis_List_Items   |
  		| <Vendor_Claim_Basis_List_Items> |	 
  	And select Vendor Claim Basis List Box value
  		| Vendor_Claim_Basis_List_Value   |
  		| <Vendor_Claim_Basis_List_Value> |
    Examples: 
    	| Vendor_Claim_Basis_List_Items                               | Vendor_Claim_Basis_List_Value |
    	| All Claims*Qualified Brand Claims*Rebated Brand Claims Only | All Claims                    |  	
    	
  Scenario Outline: Verify Vendor Day Supply List Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor Day Supply List Box presence
  	Then verify the Vendor Day Supply List Box enabled
  	And verify the Vendor Day Supply List Box items
  		| Vendor_Day_Supply_List_Items   |
  		| <Vendor_Day_Supply_List_Items> |	 
  	And select Vendor Day Supply List Box value
  		| Vendor_Day_Supply_List_Value   |
  		| <Vendor_Day_Supply_List_Value> |
    Examples: 
    	| Vendor_Day_Supply_List_Items                  | Vendor_Day_Supply_List_Value |
    	| Day Supply Break at 84*Day Supply Break at 34 | Day Supply Break at 84       |  	
    	
  Scenario Outline: Verify Client Type List Box
  	Given User is on Customer Contract Creation page
  	When verify the Client Type List Box presence
  	Then verify the Client Type List Box enabled
  	And verify the Client Type List Box items
  		| Client_Type_List_Items   |
  		| <Client_Type_List_Items> |	 
  	And select Client Type List Box value
  		| Client_Type_List_Value   |
  		| <Client_Type_List_Value> |
    Examples: 
    	| Client_Type_List_Items                                                      | Client_Type_List_Value |
    	| 1 - Health Plan*2 - Non-Health Plan*3 - Small Group*4 - External Aggregated | 1 - Health Plan        |  	
    	
  Scenario Outline: Verify Master Customer Set List Box
  	Given User is on Customer Contract Creation page
  	When verify the Master Customer Set List Box presence
  	Then verify the Master Customer Set List Box enabled
  	And verify the Master Customer Set List Box items
  		| Master_Customer_Set_List_Items   |
  		| <Master_Customer_Set_List_Items> |	 
  	And select Master Customer Set List Box value
  		| Master_Customer_Set_List_Value   |
  		| <Master_Customer_Set_List_Value> |
    Examples: 
    	| Master_Customer_Set_List_Items                                                                                    | Master_Customer_Set_List_Value |
    	| Acme Customer Set*C1_Master*ClearScript*DEEPA*GIRI*Humana*Kern Master*Master MEMBER1*Master MEMBERQC*Qtp_Master_1 | Qtp_Master_1                   |  	
    	
  Scenario Outline: Verify Customer ID List Box
  	Given User is on Customer Contract Creation page
  	When verify the Customer ID List Box presence
  	Then verify the Customer ID List Box enabled
  	And verify the Customer ID List Box items
  		| Customer_ID_List_Items   |
  		| <Customer_ID_List_Items> |	 
  	And select Customer ID List Box value
  		| Customer_ID_List_Value   |
  		| <Customer_ID_List_Value> |
    Examples: 
    	| Customer_ID_List_Items                                                               | Customer_ID_List_Value |
    	| 0886*0888*1415*1416*1419*1424*1427*1428*1429*1430*1435*1436*1444*1445*1448*1449*1557 | 0888                   |  	
    	
  Scenario Outline: Verify Contract Name Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Contract Name Edit Box presence
  	Then verify the Contract Name Edit Box enabled
  	And verify the Contract Name Edit Box max Length
  		| Contract_Name_Edit_Length   |
  		| <Contract_Name_Edit_Length> |	 
  	And input Contract Name Edit Box value
  		| Contract_Name_Edit_Value   |
  		| <Contract_Name_Edit_Value> |
    Examples: 
    	| Contract_Name_Edit_Length | Contract_Name_Edit_Value |
    	| 35                        |                          |  	
  
  Scenario Outline: Verify Reclassification Drug Vendor List Box
  	Given User is on Customer Contract Creation page
  	When verify the Reclassification drug vendor List Box presence
  	Then verify the Reclassification drug vendor List Box enabled
  	And verify the Reclassification drug vendor List Box items
  		| Reclassification_Drug_Vendor_List_Items   |
  		| <Reclassification_Drug_Vendor_List_Items> |	 
  	And select Reclassification drug vendor List Box value
  		| Reclassification_drug_vendor_List_Value   |
  		| <Reclassification_drug_vendor_List_Value> |
    Examples: 
    	| Reclassification_Drug_Vendor_List_Items | Reclassification_drug_vendor_List_Value |
    	| FDB*Medi-Span                           | Medi-Span                               |  	
    	
  Scenario Outline: Verify Internal External List Box
  	Given User is on Customer Contract Creation page
  	When verify the Internal External List Box presence
  	Then verify the Internal External List Box enabled
  	And verify the Internal External List Box items
  		| Internal_External_List_Items   |
  		| <Internal_External_List_Items> |	 
  	And select Internal External List Box value
  		| Internal_External_List_Value   |
  		| <Internal_External_List_Value> |
    Examples: 
    	| Internal_External_List_Items | Internal_External_List_Value |
    	| Internal*External*Both       | Internal                     |  	
    	
  Scenario Outline: Verify Contract Line Of Business List Box
  	Given User is on Customer Contract Creation page
  	When verify the Contract Line Of Business List Box presence
  	Then verify the Contract Line Of Business List Box enabled
  	And verify the Contract Line Of Business List Box items
  		| Contract_Line_Of_Business_List_Items   |
  		| <Contract_Line_Of_Business_List_Items> |	 
    Examples: 
    	| Contract_Line_Of_Business_List_Items | 
    	| Part D*Non-Part D                    |   	
  
  Scenario Outline: select Contract Line Of Business List Box value
  	Given User is on Customer Contract Creation page
  	When verify the Contract Line Of Business List Box presence
  	Then select Contract Line Of Business List Box value
  		| Contract_Line_Of_Business_List_Value   |
  		| <Contract_Line_Of_Business_List_Value> |
  	Examples: 
    	| Contract_Line_Of_Business_List_Value |
    	| Part D                               | 
  
  Scenario: verify Vendor Adj Day Supply Option list box 
  	Given User is on Customer Contract Creation page
  	When verify the Vendor adj day supply option List Box presence
  	Then verify the Vendor adj day supply option List box disabled
  
  Scenario: verify Customer adj day supply option list box
  	Given User is on Customer Contract Creation page
  	When verify the Customer adj day supply option List Box presence
  	Then verify the Customer adj day supply option List Box disabled
  	
  Scenario Outline: verify Rate Details LOB list items for Padt D
  	Given User is on Customer Contract Creation page
  	When verify the Rate Details Line of business List Box presence
  	Then verify the Rate Details Line of business List Box Items
  		| Rate_Details_Line_Of_Business_List_Box_Items  |
  		|<Rate_Details_Line_Of_Business_List_Box_Items> |
  	Examples: 
  		| Rate_Details_Line_Of_Business_List_Box_Items |
  		|	Medicare Part D*Medicare Part D - Closed  	 |
  
  
  Scenario Outline: select Contract Line Of Business List Box value
  	Given User is on Customer Contract Creation page
  	When verify the Contract Line Of Business List Box presence
  	Then select Contract Line Of Business List Box value
  		| Contract_Line_Of_Business_List_Value   |
  		| <Contract_Line_Of_Business_List_Value> |
  	Examples: 
    	| Contract_Line_Of_Business_List_Value |
    	| Non-Part D                           |
  
  Scenario Outline: Verify Contract Type List Box
  	Given User is on Customer Contract Creation page
  	When verify the Contract Type List Box presence
  	Then verify the Contract Type List Box enabled
  	And verify the Contract Type List Box items
  		| Contract_Type_List_Items   |
  		| <Contract_Type_List_Items> |	 
  	And select Contract Type List Box value
  		| Contract_Type_List_Value   |
  		| <Contract_Type_List_Value> |
    Examples: 
    	| Contract_Type_List_Items                                                              | Contract_Type_List_Value |
    	| Fixed Guarantee*Funded Fixed Guarantee*Pass Thru %*Pass Thru % with Minimum Guarantee | Fixed Guarantee          |  	  	
    	
  Scenario Outline: Verify Claim basis List Box
  	Given User is on Customer Contract Creation page
  	When verify the Claim Basis List Box presence
  	Then verify the Claim Basis List Box enabled
  	And verify the Claim Basis List Box items
  		| Claim_basis_List_Items   |
  		| <Claim_basis_List_Items> |	 
  	And select Claim Basis List Box value
  		| Claim_basis_List_Value   |
  		| <Claim_basis_List_Value> |
    Examples: 
    	| Claim_basis_List_Items                                      | Claim_basis_List_Value |
    	| All Claims*Qualified Brand Claims*Rebated Brand Claims Only | All Claims             |  	
    	
  Scenario Outline: Verify Vendor Start Date Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor Start Date Edit Box presence
  	Then verify the Vendor Start Date Edit Box enabled
  	And verify the Vendor Start Date Edit Box maximum length
  		| Vendor_Start_Date_Edit_Box_Maximum_Length   |
  		| <Vendor_Start_Date_Edit_Box_Maximum_Length> |
  	And verify the Vendor Start Date Edit Box Default text
  		| Vendor_Start_Date_Edit_Box_Default_Text   |
  		| <Vendor_Start_Date_Edit_Box_Default_Text> |
		And input value into Vendor Start Date Edit Box
			| Vendor_Start_Date_Edit_Box_Value   |
			| <Vendor_Start_Date_Edit_Box_Value> |   		
  	Examples: 
  		| Vendor_Start_Date_Edit_Box_Maximum_Length | Vendor_Start_Date_Edit_Box_Default_Text | Vendor_Start_Date_Edit_Box_Value |
  		| 10                                        | mm/dd/yyyy                              | 06/06/2021											 |
    	
  Scenario Outline: Verify Vendor End Date Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor End Date Edit Box presence
  	Then verify the Vendor End Date Edit Box enabled
  	And verify the Vendor End Date Edit Box maximum length
  		| Vendor_End_Date_Edit_Box_Maximum_Length   |
  		| <Vendor_End_Date_Edit_Box_Maximum_Length> |
  	And verify the Vendor End Date Edit Box Default text
  		| Vendor_End_Date_Edit_Box_Default_Text   |
  		| <Vendor_End_Date_Edit_Box_Default_Text> |
  	And input value into Vendor End Date Edit Box
			| Vendor_End_Date_Edit_Box_Value   |
			| <Vendor_End_Date_Edit_Box_Value> |
  	Examples: 
  		| Vendor_End_Date_Edit_Box_Maximum_Length | Vendor_End_Date_Edit_Box_Default_Text | Vendor_End_Date_Edit_Box_Value |
  		| 10                                      | mm/dd/yyyy                            | 06/06/2021    						     |
    	
  Scenario: Verify Cosmetic Drugs check box
  	Given User is on Customer Contract Creation page
  	When verify the Cosmetic drugs Check Box presence
  	Then verify the Cosmetic drugs Check Box enabled  	
    	
  Scenario: Verify Compound drugs check box
  	Given User is on Customer Contract Creation page
  	When verify the Compound drugs Check Box presence
  	Then verify the Compound drugs Check Box enabled
  	  	
  Scenario: Verify Multisource brand drugs check box
  	Given User is on Customer Contract Creation page
  	When verify the Multisource brand drugs Check Box presence
  	Then verify the Multisource brand drugs Check Box enabled  	
    	
  Scenario: Verify Vaccines check box
  	Given User is on Customer Contract Creation page
  	When verify the Vaccines Check Box presence
  	Then verify the Vaccines Check Box enabled  	
    	
  Scenario: Verify Over the counter drugs check box
  	Given User is on Customer Contract Creation page
  	When verify the Over the counter drugs Check Box presence
  	Then verify the Over the counter drugs Check Box enabled  	
    	
  Scenario: Verify Except insulins check box
  	Given User is on Customer Contract Creation page
  	When verify the Except insulins Check Box presence
  	Then verify the Except insulins Check Box disabled  	
    	
  Scenario: Verify Except diabetic supplies and test strips check box
  	Given User is on Customer Contract Creation page
  	When verify the Except diabetic supplies and test strips Check Box presence
  	Then verify the Except diabetic supplies and test strips Check Box disabled  	
    	
  Scenario Outline: verify Except insulins check box enabled
  	Given User is on Customer Contract Creation page
  	When click on the Over the counter drugs check box
  		| Over_The_Counter_Drugs   |
  		| <Over_The_Counter_Drugs> |
  	Then verify the Except insulins check box enabled  	
    Examples:
    	| Over_The_Counter_Drugs |
    	| check                  | 	
  
  Scenario: verify Except diabetic supplies and test strips check box enabled
  	Given User is on Customer Contract Creation page
  	When verify the Except diabetic supplies and test strips check box enabled  	
  	Then Except diabetic supplies and test strips check box should be enabled
    	  	
  Scenario Outline: Verify Monthly penalty Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Monthly penalty Edit Box presence
  	Then verify the Monthly penalty Edit Box enabled
  	And verify the Monthly penalty Edit Box maximum length
  		| Monthly_Penalty_Edit_Box_Maximum_Length     |
  		| <Vendor_Start_Date_Edit_Box_Maximum_Length> |  	
  	Examples: 
  		| Vendor_Start_Date_Edit_Box_Maximum_Length | 
  		| 16                                        |   	
    	
  Scenario: Verify Minimum claims to avoid penalty Edit Box is disabled
  	Given User is on Customer Contract Creation page
  	When verify the Minimum claims to avoid penalty Edit Box presence
  	Then verify the Minimum claims to avoid penalty Edit Box disabled
  
  Scenario: Verify Penalty Start date Edit Box is disabled
  	Given User is on Customer Contract Creation page
  	When verify the Penalty Start date Edit Box presence
  	Then verify the Penalty Start date Edit Box disabled
  
  Scenario: Verify Penalty End date Edit Box is disabled
  	Given User is on Customer Contract Creation page
  	When verify the Penalty End date Edit Box presence
  	Then verify the Penalty End date Edit Box disabled
  	
  Scenario Outline: Input value into Monthly penalty Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Monthly penalty Edit Box presence
  	Then input value into Monthly penalty Edit Box  	
  		| Monthly_Penalty_Edit_Box_Value   |
  		| <Monthly_Penalty_Edit_Box_Value> |  	
  	Examples: 
  		| Monthly_Penalty_Edit_Box_Value | 
  		| 1                              |		
  
  Scenario: Verify Minimum claims to avoid penalty Edit Box is enabled
  	Given User is on Customer Contract Creation page
  	When verify the Minimum claims to avoid penalty Edit Box is enabled
  	Then Minimum claims to avoid penalty Edit Box should be enabled
  
  Scenario Outline: Verify Minimum claims to avoid penalty Edit Box Max Length
  	Given User is on Customer Contract Creation page
  	When verify the Minimum claims to avoid penalty Edit Box presence
  	Then verify the Minimum claims to avoid penalty Edit Box Max Length
  		| Minimum_Claims_Max_Length   |
  		| <Minimum_Claims_Max_Length> |	 	
  	Examples:
  		| Minimum_Claims_Max_Length | 
  		| 9                         | 
 
  Scenario Outline: input value into Minimum claims to avoid penalty Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Minimum claims to avoid penalty Edit Box presence  	
  	And input value into Minimum claims to avoid penalty Edit Box
  		| Minimum_Claims_Edit_Value   |
  		| <Minimum_Claims_Edit_Value> |
  	Examples:
  		| Minimum_Claims_Edit_Value |
  		| 10                        |
  
  Scenario: Verify Penalty Start date Edit Box is enabled
  	Given User is on Customer Contract Creation page
  	When verify the Penalty Start date Edit Box presence
  	Then verify the Penalty Start date Edit Box is enabled
  
  Scenario Outline: Verify Penalty Start date Edit Box Max Length
  	Given User is on Customer Contract Creation page
  	When verify the Penalty Start date Edit Box presence
  	Then verify the Penalty Start date Edit Box max length
  		| Penalty_Start_Date_Edit_Box_Max_Length   |
  		| <Penalty_Start_Date_Edit_Box_Max_Length> |
  	Examples: 
  		| Penalty_Start_Date_Edit_Box_Max_Length |
  		| 10                                     |
  
  Scenario Outline: Verify Penalty Start date Edit Box Default Text
  	Given User is on Customer Contract Creation page
  	When verify the Penalty Start date Edit Box presence  	
  	Then verify the Penalty Start date Edit Box default text
  	  | Penalty_Start_Date_Edit_Box_Default_Text   |
  		| <Penalty_Start_Date_Edit_Box_Default_Text> |
  	Examples: 
  		| Penalty_Start_Date_Edit_Box_Default_Text |
  		| mm/dd/yyyy                             |
  
  Scenario Outline: input text into Penalty Start date Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Penalty Start date Edit Box presence
  	Then input value into Penalty Start date Edit Box
  		| Penalty_Start_Date_Edit_Box_Value   |
  		| <Penalty_Start_Date_Edit_Box_Value> |
  	Examples: 
  		| Penalty_Start_Date_Edit_Box_Value |
  		| 06/06/2021                        | 	
  
  Scenario: Verify Penalty End date Edit Box is enabled
  	Given User is on Customer Contract Creation page
  	When verify the Penalty End date Edit Box presence
  	Then verify the Penalty End date Edit Box is enabled
  
  Scenario Outline: Verify Penalty End date Edit Box Max Length
  	Given User is on Customer Contract Creation page
  	When verify the Penalty End date Edit Box presence
  	Then verify the Penalty End date Edit Box max length
  		| Penalty_End_Date_Edit_Box_Max_Length   |
  		| <Penalty_End_Date_Edit_Box_Max_Length> |
  	Examples: 
  		| Penalty_End_Date_Edit_Box_Max_Length |
  		| 10                                   |
  		
  Scenario Outline: Verify Penalty End date Edit Box Default Text
  	Given User is on Customer Contract Creation page
  	When verify the Penalty End date Edit Box presence  	
  	Then verify the Penalty End date Edit Box default text
  	  | Penalty_End_Date_Edit_Box_Default_Text   |
  		| <Penalty_End_Date_Edit_Box_Default_Text> |
  	Examples: 
  		| Penalty_End_Date_Edit_Box_Default_Text |
  		| mm/dd/yyyy                             |
  		
  Scenario Outline: input text into Penalty End date Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Penalty End date Edit Box presence
  	Then input value into Penalty End date Edit Box
  		| Penalty_End_Date_Edit_Box_Value   |
  		| <Penalty_End_Date_Edit_Box_Value> |
  	Examples: 
  		| Penalty_End_Date_Edit_Box_Value |
  		| 06/06/2021                      |	
  	
  Scenario: Verify Add button Disabled
  	Given User is on Customer Contract Creation page
  	When verify the Add button presence
  	Then verify the Add button disabled
  	
  Scenario: Verify Update button Disabled
  	Given User is on Customer Contract Creation page
  	When verify the Update button presence
  	Then verify the Update button disabled
  
  Scenario: Verify Remove button Disabled
  	Given User is on Customer Contract Creation page
  	When verify the Remove button presence
  	Then verify the Remove button disabled
  	
  Scenario: Verify Next button Disabled
  	Given User is on Customer Contract Creation page
  	When verify the Next button presence
  	Then verify the Next button disabled	
  
  Scenario: Verify Rate Details Table
  	Given User is on Customer Contract Creation page
  	When verify the Rate Details Table Presence
  	Then Rate Details Table should be displayed	
  
  Scenario Outline: verify Rate Details Start Date Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Rate Details Start Date Edit Box presence
  	Then verify the Rate Details Start Date Edit Box enabled
  	And verify the Rate Details Start Date Edit Box Max Length
  		| Start_Date_Edit_Box_Max_Length   |
  		| <Start_Date_Edit_Box_Max_Length> |
  	And verify the Rate Details Start Date Edit Box Default Text
  		| Start_Date_Edit_Box_DefaultText   |
  		| <Start_Date_Edit_Box_DefaultText> |
  	And input value into Rate Details Start Date Edit Box	
  		| Start_Date_Edit_Box_Value   |
  		| <Start_Date_Edit_Box_Value> |
  	Examples: 
  		| Start_Date_Edit_Box_Max_Length | Start_Date_Edit_Box_DefaultText | Start_Date_Edit_Box_Value |
  		| 10                             | mm/dd/yyyy                      | 06/06/2021                |  
  	
  Scenario Outline: verify Rate Details End Date Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Rate Details End Date Edit Box presence
  	Then verify the Rate Details End Date Edit Box enabled
  	And verify the Rate Details End Date Edit Box Max Length
  		| End_Date_Edit_Box_Max_Length   |
  		| <End_Date_Edit_Box_Max_Length> |
  	And verify the Rate Details End Date Edit Box Default Text
  		| End_Date_Edit_Box_DefaultText   |
  		| <End_Date_Edit_Box_DefaultText> |
  	And input value into Rate Details End Date Edit Box	
  		| End_Date_Edit_Box_Value   |
  		| <End_Date_Edit_Box_Value> |
  	Examples: 
  		| End_Date_Edit_Box_Max_Length | End_Date_Edit_Box_DefaultText | End_Date_Edit_Box_Value |
  		| 10                           | mm/dd/yyyy                    | 06/06/2021              |	
  	
  Scenario Outline: verify Rate Details Line of business List Box
  	Given User is on Customer Contract Creation page
  	When verify the Rate Details Line of business List Box presence
  	Then verify the Rate Details Line of business List Box enabled
  	And select value from Rate Details Line of business List Box
  		| Rate_Details_Line_Of_Business_List_Box_Value   |
  		| <Rate_Details_Line_Of_Business_List_Box_Value> | 
  	Examples:
  	  | Rate_Details_Line_Of_Business_List_Box_Value |
  	  | RDS Select Comprehensive										 | 	
  	
  Scenario Outline: verify Transparency List Box
  	Given User is on Customer Contract Creation page
  	When verify the Transparency List Box presence
  	Then verify the Transparency List Box enabled
  	And verify the Transparency List Box items
  		| Transparency_List_Box_items   |
  		| <Transparency_List_Box_items> |
  	And select value from Transparency List Box
  		| Transparency_List_Box_Value   |
  		| <Transparency_List_Box_Value> |  	
  	Examples:
  		| Transparency_List_Box_items            | Transparency_List_Box_Value |
  		|	Full Transparency*Partial Transparency | Full Transparency      		 |
  	
  Scenario Outline: verify Fee method List Box
  	Given User is on Customer Contract Creation page
  	When verify the Fee method List Box presence
  	Then verify the Fee method List Box enabled
  	And verify the Fee method List Box items
  		| Fee_method_List_Box_items   |
  		| <Fee_method_List_Box_items> |
  	And select value from Fee method List Box
  		| Fee_Method_List_Box_Value   |
  		| <Fee_Method_List_Box_Value> |	
  	Examples:
  		| Fee_method_List_Box_items | Fee_Method_List_Box_Value |
  		|	Additive*Multiplicative		|	Multiplicative					  |
  
  Scenario Outline: verify Vendor rebate share Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor rebate share Edit Box presence
  	Then verify the Vendor rebate share Edit Box enabled
  	And verify the Vendor rebate share Edit Box Max Length
  		| Vendor_Rebate_Share_Max_Length   |
  		| <Vendor_Rebate_Share_Max_Length> |  	
  	And input value into Vendor rebate share Edit Box	
  		| Vendor_Rebate_Share_Value   |
  		| <Vendor_Rebate_Share_Value> |
  	Examples: 
  		| Vendor_Rebate_Share_Max_Length | Vendor_Rebate_Share_Value |
  		| 8                              | 40                        |
  
  Scenario Outline: verify Admin fee Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Admin fee Edit Box presence
  	Then verify the Admin fee Edit Box enabled
  	And verify the Admin fee Edit Box Max Length
  		| Admin_Fee_Max_Length   |
  		| <Admin_Fee_Max_Length> |  	
  	And input value into Admin fee Edit Box	
  		| Admin_Fee_Value   |
  		| <Admin_Fee_Value> |
  	Examples: 
  		| Admin_Fee_Max_Length | Admin_Fee_Value |
  		| 8                    | 40              |
   	
  Scenario Outline: verify DST rebate share Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the DST rebate share Edit Box presence
  	Then verify the DST rebate share Edit Box enabled
  	And verify the DST rebate share Edit Box Max Length
  		| DST_Rebate_Share_Max_Length   |
  		| <DST_Rebate_Share_Max_Length> |  	
  	And input value into DST rebate share Edit Box	
  		| DST_Rebate_Share_Value   |
  		| <DST_Rebate_Share_Value> |
  	Examples: 
  		| DST_Rebate_Share_Max_Length | DST_Rebate_Share_Value |
  		| 8                           | 20                     |  	
    	
  Scenario: verify Customer rebate share Edit Box disabled
  	Given User is on Customer Contract Creation page
  	When verify the Customer rebate share Edit Box presence
  	Then verify the Customer rebate share Edit Box disabled  	
    	
  Scenario: verify DST revenue Edit Box disabled
  	Given User is on Customer Contract Creation page
  	When verify the DST revenue Edit Box presence
  	Then verify the DST revenue Edit Box disabled
  
  Scenario Outline: verify Vendor adj day supply option List Box
  	Given User is on Customer Contract Creation page
  	When verify the Vendor adj day supply option List Box presence
  	Then verify the Vendor adj day supply option List Box enabled
  	And verify the Vendor adj day supply option List Box items
  		| Vendor_adj_day_supply_option_List_Box_items   |
  		| <Vendor_adj_day_supply_option_List_Box_items> |
  	And select value from the Vendor adj day supply option List Box
  		| Vendor_adj_day_List_Box_Value   |
  		| <Vendor_adj_day_List_Box_Value> |
  	Examples:
  		| Vendor_adj_day_supply_option_List_Box_items | Vendor_adj_day_List_Box_Value |
  		|	Yes*No																			| Yes 								          |
  
  Scenario Outline: verify Customer adj day supply option List Box
  	Given User is on Customer Contract Creation page
  	When verify the Customer adj day supply option List Box presence
  	Then verify the Customer adj day supply option List Box enabled
  	And verify the Customer adj day supply option List Box items
  		| Customer_adj_day_supply_option_List_Box_items   |
  		| <Customer_adj_day_supply_option_List_Box_items> |
  	And select value from Customer adj day supply option List Box
  		| Customer_adj_day_List_Box_Value   |
  		| <Customer_adj_day_List_Box_Value> |
  	Examples:
  		| Customer_adj_day_supply_option_List_Box_items | Customer_adj_day_List_Box_Value |
  		|	Yes*No																				| Yes												      |
  
  Scenario Outline: verify Notes Edit Box
  	Given User is on Customer Contract Creation page
  	When verify the Notes Edit Box presence
  	Then verify the Notes Edit Box enabled
  	And verify the Notes Edit Box Max Length
  		| Notes_Max_Length   |
  		| <Notes_Max_Length> |  	
  	And input value into Notes Edit Box	
  		| Notes_Value   |
  		| <Notes_Value> |
  	Examples: 
  		| Notes_Max_Length | Notes_Value |
  		| 250              | Test Notes  |
  
  Scenario: Verify Add button enabled
  	Given User is on Customer Contract Creation page
  	When verify the Add button presence
  	Then verify the Add button enabled
 
  Scenario: Click on Add button
  	Given User is on Customer Contract Creation page
  	When verify the Add button presence
  	Then Click on Add button
  	
  Scenario: Verify Next button enabled
  	Given User is on Customer Contract Creation page
  	When verify the Next button presence
  	Then verify the Next button enable	
  
  Scenario Outline: Verify Update and Remove buttons enable After check operation in Rate Details Table
  	Given User is on Customer Contract Creation page
  	When click on matching check box
  		| Operation   | Start_Date   | End_Date   | Line_Of_Business   | Transparency   | Fee_Method   | Vendor_Rebate_Share   | Admin_Fee   | DST_Rebate_Share   |
  		| <Operation> | <Start_Date> | <End_Date> | <Line_Of_Business> | <Transparency> | <Fee_Method> | <Vendor_Rebate_Share> | <Admin_Fee> | <DST_Rebate_Share> |
  	Then verify the Update button enabled
  	Then verify the Remove button enabled
  	Examples: 
  		| Operation | Start_Date | End_Date   | Line_Of_Business         | Transparency      | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share |
  		| check     | 06/06/2021 | 06/06/2021	|	RDS Select Comprehensive | Full Transparency | Multiplicative	|	40				          | 40        | 20               |                   
  
  Scenario Outline: Verify Update and Remove buttons Disable After uncheck operation in Rate Details Table
  	Given User is on Customer Contract Creation page
  	When uncheck the selected check box
  		| Operation   | Start_Date   | End_Date   | Line_Of_Business   | Transparency   | Fee_Method   | Vendor_Rebate_Share   | Admin_Fee   | DST_Rebate_Share   |
  		| <Operation> | <Start_Date> | <End_Date> | <Line_Of_Business> | <Transparency> | <Fee_Method> | <Vendor_Rebate_Share> | <Admin_Fee> | <DST_Rebate_Share> | 
  	Then verify the Update button disabled
  	Then verify the Remove button disabled
  	Examples: 
  		| Operation | Start_Date | End_Date   | Line_Of_Business         | Transparency      | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share |
  		| uncheck   | 06/06/2021 | 06/06/2021	|	RDS Select Comprehensive | Full Transparency | Multiplicative	|	40				          | 40        | 20               |
   
  Scenario: Navigate to Gurantee Screen
  	Given User is on Customer Contract Creation page
  	When verify the Next button presence
  	Then Click on Next button in Contract Information Screen
    Then Guarantee screen should be displayed
 
  Scenario: Verify Add button is Disabled in Gurantee Screen 
  	Given User is on Gurantee screen
  	When Verify the Gurantee Add button present
  	Then Verify the Gurantee Add button disabled
  
  Scenario: Verify Next button is Disabled in Gurantee Screen
  	Given User is on Gurantee screen
  	When Verify the Gurantee Next button present
  	Then Verify the Gurantee Next button disabled
  	
  Scenario: Verify Previous button is Enabled in Gurantee Screen
  	Given User is on Gurantee screen
  	When Verify the Gurantee Previous button present
  	Then Verify the Gurantee Previous button enabled	
  	
  Scenario: Verify Update button is Disabled in Gurantee Screen
  	Given User is on Gurantee screen
  	When Verify the Gurantee Update button present
  	Then Verify the Gurantee Update button disabled	
  	
  Scenario: Verify Remove button is Disabled in Gurantee Screen
  	Given User is on Gurantee screen
  	When Verify the Gurantee Remove button present
  	Then Verify the Gurantee Remove button disabled	
  	
  Scenario: Verify Browse Notes button is Disabled in Gurantee Screen
  	Given User is on Gurantee screen
  	When Verify the Gurantee Browse Notes button present
  	Then Verify the Gurantee Browse Notes button disabled	
  	
  Scenario: Verify Gurantee Table is Presence in Gurantee Screen
  	Given User is on Gurantee screen
  	When Verify the Gurantee Table present
  	Then Gurantee Table should be displayed	
  	
  Scenario Outline: verify Guarantee Start Date Edit Box
  	Given User is on Gurantee screen
  	When verify the Guarantee Start Date Edit Box presence
  	Then verify the Guarantee Start Date Edit Box enabled
  	And verify the Guarantee Start Date Edit Box Max Length
  		| Guarantee_Start_Date_Edit_Box_Max_Length   |
  		| <Guarantee_Start_Date_Edit_Box_Max_Length> |
  	And verify the Guarantee Start Date Edit Box Default Text
  		| Guarantee_Start_Date_Edit_Box_DefaultText   |
  		| <Guarantee_Start_Date_Edit_Box_DefaultText> |
  	And input value into Guarantee Start Date Edit Box	
  		| Guarantee_Start_Date_Edit_Box_Value   |
  		| <Guarantee_Start_Date_Edit_Box_Value> |
  	Examples: 
  		| Guarantee_Start_Date_Edit_Box_Max_Length | Guarantee_Start_Date_Edit_Box_DefaultText | Guarantee_Start_Date_Edit_Box_Value |
  		| 10                                        | mm/dd/yyyy                                | 06/06/2021                          |  
  	
  Scenario Outline: verify Guarantee End Date Edit Box
  	Given User is on Gurantee screen
  	When verify the Guarantee End Date Edit Box presence
  	Then verify the Guarantee End Date Edit Box enabled
  	And verify the Guarantee End Date Edit Box Max Length
  		| Guarantee_End_Date_Edit_Box_Max_Length   |
  		| <Guarantee_End_Date_Edit_Box_Max_Length> |
  	And verify the Guarantee End Date Edit Box Default Text
  		| Guarantee_End_Date_Edit_Box_DefaultText   |
  		| <Guarantee_End_Date_Edit_Box_DefaultText> |
  	And input value into Guarantee End Date Edit Box	
  		| Guarantee_End_Date_Edit_Box_Value   |
  		| <Guarantee_End_Date_Edit_Box_Value> |
  	Examples: 
  		| Guarantee_End_Date_Edit_Box_Max_Length | Guarantee_End_Date_Edit_Box_DefaultText | Guarantee_End_Date_Edit_Box_Value |
  		| 10                                     | mm/dd/yyyy                              | 06/06/2021                        |
  
  Scenario Outline: verify Vendor formulary ID Edit Box
  	Given User is on Gurantee screen
  	When verify the Vendor formulary ID Edit Box presence
  	Then verify the Vendor formulary ID Edit Box enabled
  	And verify the Vendor formulary ID Edit Box Max Length
  		| Vendor_Formulary_ID_Edit_Box_Max_Length   |
  		| <Vendor_Formulary_ID_Edit_Box_Max_Length> |
  	And input value into Vendor formulary ID Edit Box	
  		| Vendor_Formulary_ID_Edit_Box_Value   |
  		| <Vendor_Formulary_ID_Edit_Box_Value> |
  	Examples: 
  		| Vendor_Formulary_ID_Edit_Box_Max_Length | Vendor_Formulary_ID_Edit_Box_Value |
  		| 6                                       | 1007                               |
  
  Scenario Outline: verify Vendor formulary type List Box
  	Given User is on Gurantee screen
  	When verify the Vendor formulary type List Box presence
  	Then verify the Vendor formulary type List Box enabled
  	And verify the Vendor formulary type List Box items
  		| Vendor_Formulary_Type_List_Box_items   |
  		| <Vendor_Formulary_Type_List_Box_items> |
  	And select value from Vendor formulary type List Box
  		| Vendor_Formulary_Type_List_Box_Value   |
  		| <Vendor_Formulary_Type_List_Box_Value> |
  	Examples:
  		| Vendor_Formulary_Type_List_Box_items                                                                                                                                                | Vendor_Formulary_Type_List_Box_Value |
  		|	Bronze*Custom*Custom with Improvements*Gold 4*Gold 5*Open/Non-Incentivized*Platinum*Premium*Premium Comprehensive*Select Base*Select Comprehensive*Select Focused*Standard Exchange | Select Base   											 |
  
  Scenario Outline: verify DST formulary type List Box
  	Given User is on Gurantee screen
  	When verify the DST formulary type List Box presence
  	Then verify the DST formulary type List Box enabled
  	And verify the DST formulary type List Box items
  		| DST_Formulary_Type_List_Box_items   |
  		| <DST_Formulary_Type_List_Box_items> |
  	And select value from DST formulary type List Box
  		| DST_Formulary_Type_List_Box_Value   |
  		| <DST_Formulary_Type_List_Box_Value> |
  	Examples:
  		| DST_Formulary_Type_List_Box_items                                                                                                                                                               | DST_Formulary_Type_List_Box_Value |
  		|	DST Standard Exchange*DST Standard Medicaid*Bronze*Custom*Custom with Improvements*Gold 4*Gold 5*Highly Managed 100*Managed 100*Platinum*Highly Managed 200*Managed 200*Managed 300*Managed 400 | Managed 100    										|
  
  Scenario Outline: verify Tier type Edit Box
  	Given User is on Gurantee screen
  	When verify the Tier type Edit Box presence
  	Then verify the Tier type Edit Box enabled
  	And verify the Tier type Edit Box Max Length
  		| Tier_Type_Edit_Box_Max_Length   |
  		| <Tier_Type_Edit_Box_Max_Length> |
  	And input value into Tier type Edit Box	
  		| Tier_Type_Edit_Box_Value   |
  		| <Tier_Type_Edit_Box_Value> |
  	Examples: 
  		| Tier_Type_Edit_Box_Max_Length | Tier_Type_Edit_Box_Value |
  		| 15                            | 1                        |
  
  Scenario Outline: verify Channel List Box
  	Given User is on Gurantee screen
  	When verify the Channel List Box presence
  	Then verify the Channel List Box enabled
  	And verify the Channel List Box items
  		| Channel_List_Box_items   |
  		| <Channel_List_Box_items> |
  	And select value from Channel List Box
  		| Channel_List_Box_Value   |
  		| <Channel_List_Box_Value> |
  	Examples:
  		| Channel_List_Box_items 																															| Channel_List_Box_Value |
  		|	Mail*Mail 30*Mail 90*Retail*Retail 30*Retail 90*Specialty*Specialty 30*Specialty 90 | Retail 90 					   |
  
  Scenario Outline: verify Guarantee Line of business List Box
  	Given User is on Gurantee screen
  	When verify the Guarantee Line of business List Box presence
  	Then verify the Guarantee Line of business List Box enabled  	
  	And select value from Guarantee Line of business List Box
  		| Guarantee_Line_Of_business_List_Box_Value   |
  		| <Guarantee_Line_Of_business_List_Box_Value> |
  	Examples:
  		| Guarantee_Line_Of_business_List_Box_Value |
  		| Commercial Tiered Incent.                 |
  
  Scenario Outline: verify Vendor brand guarantee Edit Box
  	Given User is on Gurantee screen
  	When verify the Vendor brand guarantee Edit Box presence
  	Then verify the Vendor brand guarantee Edit Box enabled
  	And verify the Vendor brand guarantee Edit Box Max Length
  		| Vendor_Brand_Guarantee_Edit_Box_Max_Length   |
  		| <Vendor_Brand_Guarantee_Edit_Box_Max_Length> |
  	And input value into Vendor brand guarantee Edit Box	
  		| Vendor_Brand_Guarantee_Edit_Box_Value   |
  		| <Vendor_Brand_Guarantee_Edit_Box_Value> |
  	Examples: 
  		| Vendor_Brand_Guarantee_Edit_Box_Max_Length |Vendor_Brand_Guarantee_Edit_Box_Value |
  		| 11                                         | 1                                    |
  
  Scenario Outline: verify Customer brand guarantee Edit Box
  	Given User is on Gurantee screen
  	When verify the Customer brand guarantee Edit Box presence
  	Then verify the Customer brand guarantee Edit Box enabled
  	And verify the Customer brand guarantee Edit Box Max Length
  		| Customer_Brand_Guarantee_Edit_Box_Max_Length   |
  		| <Customer_Brand_Guarantee_Edit_Box_Max_Length> |
  	And input value into Customer brand guarantee Edit Box	
  		| Customer_Brand_Guarantee_Edit_Box_Value   |
  		| <Customer_Brand_Guarantee_Edit_Box_Value> |
  	Examples: 
  		| Customer_Brand_Guarantee_Edit_Box_Max_Length | Customer_Brand_Guarantee_Edit_Box_Value |
  		| 11                                           | 1                                       |
  
  Scenario Outline: verify Benefit design List Box
  	Given User is on Gurantee screen
  	When verify the Benefit design List Box presence
  	Then verify the Benefit design List Box enabled
  	And verify the Benefit design List Box items
  		| Benefit_Design_List_Box_items   |
  		| <Benefit_Design_List_Box_items> |
  	And select value from Benefit design List Box
  		| Benefit_Design_List_Box_Value   |
  		| <Benefit_Design_List_Box_Value> |
  	Examples:
  		| Benefit_Design_List_Box_items 																											                                                       | Benefit_Design_List_Box_Value               |
  		|	Less than $10 copay or %10 coins difference*Greater than or equal to $10 copay or %10 coins between preferred and non-preferred brand drug | Less than $10 copay or %10 coins difference |
  		
  Scenario Outline: verify UM option List Box
  	Given User is on Gurantee screen
  	When verify the UM option List Box presence
  	Then verify the UM option List Box enabled
  	And verify the UM option List Box items
  		| UM_Option_List_Box_items   |
  		| <UM_Option_List_Box_items> |
  	And select value from UM option List Box
  		| UM_Option_List_Box_Value   |
  		| <UM_Option_List_Box_Value> |
  	Examples:
  		| UM_Option_List_Box_items 																														| UM_Option_List_Box_Value |
  		|	Custom + Targeted*Custom*Highly Managed*Highly Managed + Standard*Standard*Targeted | Highly Managed			     |
  
  Scenario Outline: verify Benefit design description notes Edit Box
  	Given User is on Gurantee screen
  	When verify the Benefit design description notes Edit Box presence
  	Then verify the Benefit design description notes Edit Box enabled
  	And verify the Benefit design description notes Edit Box Max Length
  		| Benefit_Design_Description_Notes_Edit_Box_Max_Length   |
  		| <Benefit_Design_Description_Notes_Edit_Box_Max_Length> |
  	And input value into Benefit design description notes Edit Box	
  		| Benefit_Design_Description_Notes_Edit_Box_Value   |
  		| <Benefit_Design_Description_Notes_Edit_Box_Value> |
  	Examples: 
  		| Benefit_Design_Description_Notes_Edit_Box_Max_Length | Benefit_Design_Description_Notes_Edit_Box_Value |
  		| 250                            											 | Test Benefit design description notes           |
  
  Scenario Outline: verify Plan design notes Edit Box
  	Given User is on Gurantee screen
  	When verify the Plan design notes Edit Box presence
  	Then verify the Plan design notes Edit Box enabled
  	And verify the Plan design notes Edit Box Max Length
  		| Plan_Design_Notes_Edit_Box_Max_Length   |
  		| <Plan_Design_Notes_Edit_Box_Max_Length> |
  	And input value into Plan design notes Edit Box	
  		| Plan_Design_Notes_Edit_Box_Value   |
  		| <Plan_Design_Notes_Edit_Box_Value> |
  	Examples: 
  		| Plan_Design_Notes_Edit_Box_Max_Length | Plan_Design_Notes_Edit_Box_Value |
  		| 250                                   | Test Plan Design notes           |
  
  Scenario Outline: verify UM option notes Edit Box
  	Given User is on Gurantee screen
  	When verify the UM option notes Edit Box presence
  	Then verify the UM option notes Edit Box enabled
  	And verify the UM option notes Edit Box Max Length
  		| UM_Option_Notes_Edit_Box_Max_Length   |
  		| <UM_Option_Notes_Edit_Box_Max_Length> |
  	And input value into UM option Notes Edit Box	
  		| UM_Option_Notes_Edit_Box_Value   |
  		| <UM_Option_Notes_Edit_Box_Value> |
  	Examples: 
  		| UM_Option_Notes_Edit_Box_Max_Length | UM_Option_Notes_Edit_Box_Value |
  		| 250                                 | Test UM option notes     |
  
  Scenario Outline: verify Formulary design notes Edit Box
  	Given User is on Gurantee screen
  	When verify the Formulary design notes Edit Box presence
  	Then verify the Formulary design notes Edit Box enabled
  	And verify the Formulary design notes Edit Box Max Length
  		| Formulary_Design_Notes_Edit_Box_Max_Length   |
  		| <Formulary_Design_Notes_Edit_Box_Max_Length> |
  	And input value into Formulary design notes Edit Box	
  		| Formulary_Design_Notes_Edit_Box_Value   |
  		| <Formulary_Design_Notes_Edit_Box_Value> |
  	Examples: 
  		| Formulary_Design_Notes_Edit_Box_Max_Length | Formulary_Design_Notes_Edit_Box_Value |
  		| 250                                        | Test Formulary design notes           |
  
  Scenario: Add button selection in Gurantee screen
  	Given User is on Gurantee screen
  	When Verify the Gurantee Add button present
  	Then click on Add button
  
  Scenario: Navigate to Membership Claim Counts Screen 
  	Given User is on Gurantee screen
  	When Verify the Gurantee Next button present
  	Then click on Next button in Guarantee screen
  	And Membership/Claim screen should be displayed
  
  Scenario: Verify Add button is disabled in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Add button is presence
  	Then verify the Membership Claim Counts Add button is disabled
  
  Scenario: Verify Update button is disabled in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Update button is presence
  	Then verify the Membership Claim Counts Update button is disabled
  
  Scenario: Verify Remove button is disabled in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Remove button is presence
  	Then verify the Membership Claim Counts Remove button is disabled
  
  Scenario: Verify Previous button is enabled in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Previous button is presence
  	Then verify the Membership Claim Counts Previous button is enabled
  	
  Scenario: Verify Next button is disabled in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Next button is presence
  	Then verify the Membership Claim Counts Next button is enabled
  
  Scenario: Verify Table presence in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Table is presence
  	Then Membership Claim Counts Table should be displayed
  
  Scenario Outline: verify Establish contractual membership/claim counts by List Box
  	Given User is on Gurantee screen
  	When verify the Establish contractual membership/claim counts by List Box presence
  	Then verify the Establish contractual membership/claim counts by List Box enabled
  	And verify the Establish contractual membership/claim counts by List Box items
  		| Establish_Contractual_Membership_List_Box_items   |
  		| <Establish_Contractual_Membership_List_Box_items> |
  	And select value from Establish contractual membership/claim counts by List Box
  		| Establish_Contractual_Membership_List_Box_Value   |
  		| <Establish_Contractual_Membership_List_Box_Value> |
  	Examples:
  		| Establish_Contractual_Membership_List_Box_items | Establish_Contractual_Membership_List_Box_Value |
  		|	Customer*Vendor Formulary ID                    | Vendor Formulary ID 					                  |
  
  Scenario Outline: verify Customer vendor formulary ID List Box
  	Given User is on Gurantee screen
  	When verify the Customer vendor formulary ID List Box presence
  	Then verify the Customer vendor formulary ID List Box enabled
  	And verify the Customer vendor formulary ID List Box items
  		| Customer_Vendor_Formulary_ID_List_Box_items   |
  		| <Customer_Vendor_Formulary_ID_List_Box_items> |
  	And select value from Customer vendor formulary ID List Box
  		| Customer_Vendor_Formulary_ID_List_Box_Value   |
  		| <Customer_Vendor_Formulary_ID_List_Box_Value> |
  	Examples:
  		| Customer_Vendor_Formulary_ID_List_Box_items | Customer_Vendor_Formulary_ID_List_Box_Value |
  		|	1007                                        | 1007                					              |
  
  Scenario Outline: verify Contractual membership count Edit Box
  	Given User is on Gurantee screen
  	When verify the Contractual membership count Edit Box presence
  	Then verify the Contractual membership count Edit Box enabled
  	And verify the Contractual membership count Edit Box Max Length
  		| Contractual_Membership_Count_Edit_Box_Max_Length   |
  		| <Contractual_Membership_Count_Edit_Box_Max_Length> |
  	And input value into Contractual membership count Edit Box	
  		| Contractual_Membership_Count_Edit_Box_Value   |
  		| <Contractual_Membership_Count_Edit_Box_Value> |
  	Examples: 
  		| Contractual_Membership_Count_Edit_Box_Max_Length | Contractual_Membership_Count_Edit_Box_Value |
  		| 11                                               | 1                                           |
  
  Scenario Outline: verify Membership percent threshold Edit Box
  	Given User is on Gurantee screen
  	When verify the Membership percent threshold Edit Box presence
  	Then verify the Membership percent threshold Edit Box enabled
  	And verify the Membership percent threshold Edit Box Max Length
  		| Membership_Percent_Threshold_Edit_Box_Max_Length   |
  		| <Membership_Percent_Threshold_Edit_Box_Max_Length> |
  	And input value into Membership percent threshold Edit Box	
  		| Membership_Percent_Threshold_Edit_Box_Value   |
  		| <Membership_Percent_Threshold_Edit_Box_Value> |
  	Examples: 
  		| Membership_Percent_Threshold_Edit_Box_Max_Length | Membership_Percent_Threshold_Edit_Box_Value |
  		| 8                                                | 1                                           |
  
  Scenario: Verify Contractual claim count edit box disabled 
  	Given User is on Membership/Claim Counts screen
  	When verify the Contractual claim count edit box presence
  	Then verify the Contractual claim count edit box disabled
  
  Scenario: Verify Claim percent threshold edit box disabled 
  	Given User is on Membership/Claim Counts screen
  	When verify the Claim percent threshold edit box presence
  	Then verify the Claim percent threshold edit box disabled 	
    	
  Scenario: Add button selection in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Add button is presence
  	Then Click on Add button in Membership Claim Counts screen
  	
  Scenario: Next button selection in Membership Claim Counts
  	Given User is on Membership/Claim Counts screen
  	When verify the Membership Claim Counts Next button is presence
  	Then click on Next button in Membership/Claim Counts screen
  	And Reporting screen should be displayed
  
	Scenario: Verify Add button is disabled in Reporting Panel
  	Given User is on Reporting screen
  	When verify the Reporting Add button is presence
  	Then verify the Reporting Add button is disabled
  
  Scenario: Verify Update button is disabled in Reporting Panel
  	Given User is on Reporting screen
  	When verify the Reporting Update button is presence
  	Then verify the Reporting Update button is disabled
  
  Scenario: Verify Remove button is disabled in Reporting Panel
  	Given User is on Reporting screen
  	When verify the Reporting Remove button is presence
  	Then verify the Reporting Remove button is disabled
  
  Scenario: Verify Previous button is enabled in Reporting Panel
  	Given User is on Reporting screen
  	When verify the Reporting Previous button is presence
  	Then verify the Reporting Previous button is enabled
  	
  Scenario: Verify Next button is disabled in Reporting Panel
  	Given User is on Reporting screen
  	When verify the Reporting Next button is presence
  	Then verify the Reporting Next button is disabled
  
  Scenario: Verify Table presence in Reporting Panel
  	Given User is on Reporting screen
  	When verify the Reporting Table is presence
  	Then Reporting Table should be displayed	
  	
  Scenario Outline: verify Package List Box
  	Given User is on Reporting screen
  	When verify the Package List Box presence
  	Then verify the Package List Box enabled
  	And verify the Package List Box items
  		| Package_List_Box_items   |
  		| <Package_List_Box_items> |
  	And select value from Package List Box
  		| Package_List_Box_Value   |
  		| <Package_List_Box_Value> |
  	Examples:
  		| Package_List_Box_items        | Package_List_Box_Value |
  		|	Custom*Standard*Standard Plus | Standard Plus          |	
  	
  Scenario Outline: verify Level List Box
  	Given User is on Reporting screen
  	When verify the Level List Box presence
  	Then verify the Level List Box enabled
  	And verify the Level List Box items
  		| Level_List_Box_items   |
  		| <Level_List_Box_items> |
  	And select value from Level List Box
  		| Level_List_Box_Value   |
  		| <Level_List_Box_Value> |
  	Examples:
  		| Level_List_Box_items                     | Level_List_Box_Value |
  		|	Account*Client*Custom*Customer*Group*LOB | Custom               |	
  	
  Scenario Outline: verify Reporting Start Date Edit Box
  	Given User is on Reporting screen
  	When verify the Reporting Start Date Edit Box presence
  	Then verify the Reporting Start Date Edit Box enabled
  	And verify the Reporting Start Date Edit Box Max Length
  		| Reporting_Start_Date_Edit_Box_Max_Length   |
  		| <Reporting_Start_Date_Edit_Box_Max_Length> |
  	And verify the Reporting Start Date Edit Box Default Text
  		| Reporting_Start_Date_Edit_Box_DefaultText   |
  		| <Reporting_Start_Date_Edit_Box_DefaultText> |
  	And input value into Reporting Start Date Edit Box	
  		| Reporting_Start_Date_Edit_Box_Value   |
  		| <Reporting_Start_Date_Edit_Box_Value> |
  	Examples: 
  		| Reporting_Start_Date_Edit_Box_Max_Length | Reporting_Start_Date_Edit_Box_DefaultText | Reporting_Start_Date_Edit_Box_Value |
  		| 10                                       | mm/dd/yyyy                                | 06/06/2021                          |  
  	
  Scenario Outline: verify Reporting End Date Edit Box
  	Given User is on Reporting screen
  	When verify the Reporting End Date Edit Box presence
  	Then verify the Reporting End Date Edit Box enabled
  	And verify the Reporting End Date Edit Box Max Length
  		| Reporting_End_Date_Edit_Box_Max_Length   |
  		| <Reporting_End_Date_Edit_Box_Max_Length> |
  	And verify the Reporting End Date Edit Box Default Text
  		| Reporting_End_Date_Edit_Box_DefaultText   |
  		| <Reporting_End_Date_Edit_Box_DefaultText> |
  	And input value into Reporting End Date Edit Box	
  		| Reporting_End_Date_Edit_Box_Value   |
  		| <Reporting_End_Date_Edit_Box_Value> |
  	Examples: 
  		| Reporting_End_Date_Edit_Box_Max_Length | Reporting_End_Date_Edit_Box_DefaultText | Reporting_End_Date_Edit_Box_Value |
  		| 10                                     | mm/dd/yyyy                              | 06/06/2021                        |	
  	
  Scenario Outline: verify Package notes Edit Box
  	Given User is on Reporting screen
  	When verify the Package notes Edit Box presence
  	Then verify the Package notes Edit Box enabled
  	And verify the Package notes Edit Box Max Length
  		| Package_Notes_Edit_Box_Max_Length   |
  		| <Package_Notes_Edit_Box_Max_Length> |
  	And input value into Package Notes Edit Box	
  		| Package_Notes_Edit_Box_Value   |
  		| <Package_Notes_Edit_Box_Value> |
  	Examples: 
  		| Package_Notes_Edit_Box_Max_Length | Package_Notes_Edit_Box_Value |
  		| 250                               | Test Package notes           |
  
  Scenario Outline: verify Level notes Edit Box
  	Given User is on Reporting screen
  	When verify the Level notes Edit Box presence
  	Then verify the Level notes Edit Box enabled
  	And verify the Level notes Edit Box Max Length
  		| Level_Notes_Edit_Box_Max_Length   |
  		| <Level_Notes_Edit_Box_Max_Length> |
  	And input value into Level notes Edit Box	
  		| Level_Notes_Edit_Box_Value   |
  		| <Level_Notes_Edit_Box_Value> |
  	Examples: 
  		| Level_Notes_Edit_Box_Max_Length | Level_Notes_Edit_Box_Value  |
  		| 250                             | Test Level notes            |	
  
  Scenario: Add button selection in Reporting Panel
  	Given User is on Reporting screen
  	When verify the Reporting Add button is presence
  	Then click on Add button in Reporting Panel
  			
  Scenario Outline: Verify Update and Remove buttons enable After check operation in Reporting Table 
  	Given User is on Reporting screen
  	When check the matching check box in Reporting Table
  		| Operation   | Package   | Level   | Start_Date   | End_Date   |
  		| <Operation> | <Package> | <Level> | <Start_Date> | <End_Date> | 
  	Then verify Update button enabled in Reporting panel
  	And verify Remove button enabled in Reporting panel 	
  	Examples:
  		| Operation | Package        | Level  | Start_Date | End_Date   |
  		| check     | Standard Plus  | Custom | 06/06/2021 | 06/06/2021 | 	
  		
  Scenario Outline: Verify Update and Remove buttons Disable After uncheck operation in Reporting Table 
  	Given User is on Reporting screen
  	When uncheck the matching check box in Reporting Table
  		| Operation   | Package   | Level   | Start_Date   | End_Date   |
  		| <Operation> | <Package> | <Level> | <Start_Date> | <End_Date> | 
  	Then verify Update button disabled in Reporting panel
  	And verify Remove button disabled in Reporting panel 	
  	Examples:
  		| Operation | Package        | Level  | Start_Date | End_Date   |
  		| uncheck   | Standard Plus  | Custom | 06/06/2021 | 06/06/2021 |		
  
  Scenario: navigate to Assignment Criteria Panel
  	Given User is on Reporting screen
  	When verify the Reporting Next button is presence
  	Then click on Next button in Reporting Screen
  	And Assignment Criteria screen should be displayed 
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  			  	
    	