@Regression
Feature: Rebate PartD UI Validation 

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
    	| 0886*0888*1415*1416*1419*1424*1427*1428*1429*1430*1435*1436*1444*1445*1448*1449*1557 | 0886                   |  	
    	
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
    	
  Scenario: Verify Cosmetic Drugs Check Box
  	Given User is on Customer Contract Creation page
  	When verify the Cosmetic drugs Check Box presence
  	Then verify the Cosmetic drugs Check Box enabled  	
    	
  Scenario: Verify Compound Drugs check box
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
    	
  Scenario: verify Reclassify specialty claims to retail check box enabled
  	Given User is on Customer Contract Creation page
  	When verify the Reclassify specialty claims to retail check box presence  	
  	Then verify Reclassify specialty claims to retail check box should be enabled
  	
  Scenario: verify Reclassify day supply break at 34 check box enabled
  	Given User is on Customer Contract Creation page
  	When verify the Reclassify day supply break at 34 check box presence  	
  	Then verify Reclassify day supply break at 34 check box should be enabled
  
  Scenario: verify Reclassify brand claims to generic check box enabled
  	Given User is on Customer Contract Creation page
  	When verify the Reclassify brand claims to generic check box presence  	
  	Then verify Reclassify brand claims to generic check box should be enabled  	
    	
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
  		
  Scenario Outline: verify Rate Details LOB list items for Padt D
  	Given User is on Customer Contract Creation page
  	When verify the Rate Details Line of business List Box presence
  	Then verify the Rate Details Line of business List Box Items
  		| Rate_Details_Line_Of_Business_List_Box_Items  |
  		|<Rate_Details_Line_Of_Business_List_Box_Items> |
  	Examples: 
  		| Rate_Details_Line_Of_Business_List_Box_Items |
  		|	Medicare Part D*Medicare Part D - Closed  	 |		
  		
  Scenario Outline: verify Rate Details Line of business List Box
  	Given User is on Customer Contract Creation page
  	When verify the Rate Details Line of business List Box presence
  	Then verify the Rate Details Line of business List Box enabled
  	And select value from Rate Details Line of business List Box
  		| Rate_Details_Line_Of_Business_List_Box_Value   |
  		| <Rate_Details_Line_Of_Business_List_Box_Value> | 
  	Examples:
  	  | Rate_Details_Line_Of_Business_List_Box_Value |
  	  | Medicare Part D        										   |			
  		
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
  		
  Scenario: verify Vendor adj day supply option list box 
  	Given User is on Customer Contract Creation page
  	When verify the Vendor adj day supply option List Box presence
  	Then verify the Vendor adj day supply option List box disabled
  
  Scenario: verify Customer adj day supply option list box
  	Given User is on Customer Contract Creation page
  	When verify the Customer adj day supply option List Box presence
  	Then verify the Customer adj day supply option List Box disabled		
  		
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
  	Then verify the Next button enabled	
  
  Scenario Outline: Verify Update and Remove buttons enabled After check operation in Rate Details Table
  	Given User is on Customer Contract Creation page
  	When click on matching check box
  		| Operation   | Start_Date   | End_Date   | Line_Of_Business   | Transparency   | Fee_Method   | Vendor_Rebate_Share   | Admin_Fee   | DST_Rebate_Share   |
  		| <Operation> | <Start_Date> | <End_Date> | <Line_Of_Business> | <Transparency> | <Fee_Method> | <Vendor_Rebate_Share> | <Admin_Fee> | <DST_Rebate_Share> |
  	Then verify the Update button enabled
  	And verify the Remove button enabled
  	Examples: 
  		| Operation | Start_Date | End_Date   | Line_Of_Business  | Transparency      | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share |
  		| check     | 06/06/2021 | 06/06/2021	|	Medicare Part D   | Full Transparency | Multiplicative	|	40				          | 40        | 20               |                   
  
  Scenario Outline: Verify Update and Remove buttons Disabled After uncheck operation in Rate Details Table
  	Given User is on Customer Contract Creation page
  	When uncheck the selected check box
  		| Operation   | Start_Date   | End_Date   | Line_Of_Business   | Transparency   | Fee_Method   | Vendor_Rebate_Share   | Admin_Fee   | DST_Rebate_Share   |
  		| <Operation> | <Start_Date> | <End_Date> | <Line_Of_Business> | <Transparency> | <Fee_Method> | <Vendor_Rebate_Share> | <Admin_Fee> | <DST_Rebate_Share> | 
  	Then verify the Update button disabled
  	And verify the Remove button disabled
  	Examples: 
  		| Operation | Start_Date | End_Date   | Line_Of_Business | Transparency      | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share |
  		| uncheck   | 06/06/2021 | 06/06/2021	|	Medicare Part D  | Full Transparency | Multiplicative	|	40				          | 40        | 20               |
   
  Scenario: Navigate to Gurantee Screen
  	Given User is on Customer Contract Creation page
  	When verify the Next button presence
  	Then Click on Next button in Contract Information Screen
    And Guarantee Screen should be displayed		
  		
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
  		| Medicare Part D                 					|
  
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
  		| Vendor_Brand_Guarantee_Edit_Box_Max_Length | Vendor_Brand_Guarantee_Edit_Box_Value |
  		| 11                                         | 1                                     |
  
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
  	
  Scenario: Navigate to Reporting Screen
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
  
  Scenario Outline: Verify Assign vendor formulary ID by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign vendor formulary ID by List Box presence
    Then verify the Assign vendor formulary ID by List Box enabled
    And verify the default item displaying in Assign vendor formulary ID by List Box
      | Assign_Vendor_Formulary_ID_By_List_Box_Default_Item   |
      | <Assign_Vendor_Formulary_ID_By_List_Box_Default_Item> | 
    And verify the Assign vendor formulary ID by List Box items
      | Assign_Vendor_Formulary_ID_By_List_Box_Items   |
      | <Assign_Vendor_Formulary_ID_By_List_Box_Items> |
      
    Examples: 
      | Assign_Vendor_Formulary_ID_By_List_Box_Default_Item | Assign_Vendor_Formulary_ID_By_List_Box_Items |               
      | Customer                                            | Customer*Coverage Code*Drug List*Client      |
      
  Scenario Outline: Verify Assigned vendor formulary ID Edit Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned vendor formulary ID Edit Box presence
    Then verify the Assigned vendor formulary ID Edit Box enabled
    And verify the Assigned vendor formulary ID Edit Box maximum length  
      | Assigned_Vendor_Formulary_ID_Edit_Box_Max_Length   |
      | <Assigned_Vendor_Formulary_ID_Edit_Box_Max_Length> |
          
    Examples: 
      | Assigned_Vendor_Formulary_ID_Edit_Box_Max_Length |               
      | 6                                                |
      
  Scenario Outline: Verify Available Coverage Code Table in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign vendor formulary ID by List Box
   	  | Assign_Vendor_Formulary_ID_By   |
   	  | <Assign_Vendor_Formulary_ID_By> |  
    Then verify the Available Coverage Code Table Presence in Vendor Formulary ID Assignment
    And verify the Available Coverage Code Table Pagination Presence in Vendor Formulary ID Assignment
          
    Examples: 
      | Assign_Vendor_Formulary_ID_By |               
      | Coverage Code                 |
      
  Scenario: Verify Coverage Code1 Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Coverage Code1 Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Coverage Code2 Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Description Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Description Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Coverage Code Status Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario Outline: Verify Available Drug List Table in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign vendor formulary ID by List Box
   	  | Assign_Vendor_Formulary_ID_By   |
   	  | <Assign_Vendor_Formulary_ID_By> |  
    Then verify the Available Drug List Table Presence in Vendor Formulary ID Assignment
    And verify the Available Drug List Table Pagination Presence in Vendor Formulary ID Assignment
          
    Examples: 
      | Assign_Vendor_Formulary_ID_By |               
      | Drug List                     |
	
	Scenario: Verify Drug List ID Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Drug List ID Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Name Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Name Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Type Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Type Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Drug List Status Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Drug List Status Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario Outline: Verify Available Client Table in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign vendor formulary ID by List Box
   	  | Assign_Vendor_Formulary_ID_By   |
   	  | <Assign_Vendor_Formulary_ID_By> |  
    Then verify the Available Client Table Presence in Vendor Formulary ID Assignment
          
    Examples: 
      | Assign_Vendor_Formulary_ID_By |               
      | Client                        |
	
	Scenario: Verify Client Number Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Client Number Edit Box enabled in Vendor Formulary ID Assignment
      
	Scenario: Verify Client Name Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Client Name Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Start Date Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Vendor Formulary ID Assignment
    Then verify the Start Date Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify End Date Edit Box in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Vendor Formulary ID Assignment
    Then verify the End Date Edit Box enabled in Vendor Formulary ID Assignment
      
  Scenario: Verify Add button Disabled in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Vendor Formulary ID Assignment
    Then verify the Add button disabled in Vendor Formulary ID Assignment
    
  Scenario Outline: Verify Add button Enabled in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
  	When input the following Vendor Formulary ID Assignment details
  	  | Assign_Vendor_Formulary_ID_By   | Assigned_Vendor_Formulary_ID   |
  	  | <Assign_Vendor_Formulary_ID_By> | <Assigned_Vendor_Formulary_ID> |  
    Then verify the Add button enabled in Vendor Formulary ID Assignment
    And click on Add button in Vendor Formulary ID Assignment
          
    Examples: 
      | Assign_Vendor_Formulary_ID_By | Assigned_Vendor_Formulary_ID |               
      | Customer                      | 1007                         |
      
  Scenario: Verify Assign vendor formulary ID by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign vendor formulary ID by List Box disabled
    Then Assign vendor formulary ID by List Box should be disabled
  
  Scenario: Verify Selected Vendor Formulary ID Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Vendor Formulary ID Assignment Table Presence
    Then Selected Vendor Formulary ID Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Vendor Formulary ID Assignment
    Then verify the Remove button disabled in Vendor Formulary ID Assignment
    
  Scenario: Verify Update button Disabled in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Vendor Formulary ID Assignment
    Then verify the Update button disabled in Vendor Formulary ID Assignment
    
  Scenario Outline: Verify Remove button Enabled in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Vendor Formulary ID Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Vendor Formulary ID Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*1007                   |
      
  Scenario Outline: Verify Update button Enabled in Vendor Formulary ID Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Vendor Formulary ID Assignment
   	Then click on Selected Vendor Formulary ID Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*1007                   |
      
  Scenario: Verify Previous button Enabled in Assignment Criteria screen
    Given User is on Assignment Criteria screen
   	When verify the Previous button presence in Assignment Criteria screen
    Then verify the Previous button enabled in Assignment Criteria screen
    
  Scenario: Verify Next button Enabled in Assignment Criteria screen
    Given User is on Assignment Criteria screen
   	When verify the Next button presence in Assignment Criteria screen
    Then verify the Next button enabled in Assignment Criteria screen

  Scenario Outline: Verify Assign line of business by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign line of business by List Box presence
    Then verify the Assign line of business by List Box enabled
    And verify the default item displaying in Assign line of business by List Box
      | Assign_Line_Of_Business_By_List_Box_Default_Item   |
      | <Assign_Line_Of_Business_By_List_Box_Default_Item> | 
    And verify the Assign line of business by List Box items
      | Assign_Line_Of_Business_By_List_Box_Items   |
      | <Assign_Line_Of_Business_By_List_Box_Items> |
      
    Examples: 
      | Assign_Line_Of_Business_By_List_Box_Default_Item | Assign_Line_Of_Business_By_List_Box_Items |               
      | Customer                                         | Customer*Coverage Code*Drug List*Client   |
      
  Scenario Outline: Verify Assigned line of business List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned line of business List Box presence
    Then verify the Assigned line of business List Box enabled
    And verify the Assigned line of business List Box items  
      | Assigned_Line_Of_Business_List_Box_Items   |
      | <Assigned_Line_Of_Business_List_Box_Items> |
          
    Examples: 
      | Assigned_Line_Of_Business_List_Box_Items |               
      | Medicare Part D                          |
      
  Scenario Outline: Verify Available Coverage Code Table in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign line of business by List Box
   	  | Assign_Line_Of_Business_By   |
   	  | <Assign_Line_Of_Business_By> |  
    Then verify the Available Coverage Code Table Presence in Line Of Business Assignment
    And verify the Available Coverage Code Table Pagination Presence in Line Of Business Assignment
          
    Examples: 
      | Assign_Line_Of_Business_By |               
      | Coverage Code              |
      
  Scenario: Verify Coverage Code1 Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Line Of Business Assignment
    Then verify the Coverage Code1 Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Line Of Business Assignment
    Then verify the Coverage Code2 Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Description Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Line Of Business Assignment
    Then verify the Description Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Line Of Business Assignment
    Then verify the Coverage Code Status Edit Box enabled in Line Of Business Assignment
      
  Scenario Outline: Verify Available Drug List Table in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign line of business by List Box
   	  | Assign_Line_Of_Business_By   |
   	  | <Assign_Line_Of_Business_By> |  
    Then verify the Available Drug List Table Presence in Line Of Business Assignment
    And verify the Available Drug List Table Pagination Presence in Line Of Business Assignment
          
    Examples: 
      | Assign_Line_Of_Business_By |               
      | Drug List                  |
	
	Scenario: Verify Drug List ID Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Line Of Business Assignment
    Then verify the Drug List ID Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Name Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Line Of Business Assignment
    Then verify the Name Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Type Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Line Of Business Assignment
    Then verify the Type Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Drug List Status Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Line Of Business Assignment
    Then verify the Drug List Status Edit Box enabled in Line Of Business Assignment
      
  Scenario Outline: Verify Available Client Table in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign line of business by List Box
   	  | Assign_Line_Of_Business_By   |
   	  | <Assign_Line_Of_Business_By> |  
    Then verify the Available Client Table Presence in Line Of Business Assignment
          
    Examples: 
      | Assign_Line_Of_Business_By |               
      | Client                     |
	
	Scenario: Verify Client Number Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Line Of Business Assignment
    Then verify the Client Number Edit Box enabled in Line Of Business Assignment
      
	Scenario: Verify Client Name Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Line Of Business Assignment
    Then verify the Client Name Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Start Date Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Line Of Business Assignment
    Then verify the Start Date Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify End Date Edit Box in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Line Of Business Assignment
    Then verify the End Date Edit Box enabled in Line Of Business Assignment
      
  Scenario: Verify Add button Disabled in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Line Of Business Assignment
    Then verify the Add button disabled in Line Of Business Assignment
    
  Scenario Outline: Verify Add button Enabled in Line Of Business Assignment
    Given User is on Assignment Criteria screen
  	When input the following Line Of Business Assignment details
  	  | Assign_Line_Of_Business_By   | Assigned_Line_Of_Business   |
  	  | <Assign_Line_Of_Business_By> | <Assigned_Line_Of_Business> |  
    Then verify the Add button enabled in Line Of Business Assignment
    And click on Add button in Line Of Business Assignment
          
    Examples: 
      | Assign_Line_Of_Business_By | Assigned_Line_Of_Business |               
      | Customer                   | Medicare Part D           |
      
  Scenario: Verify Assign line of business by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign line of business by List Box disabled
    Then Assign line of business by List Box should be disabled      
      
  Scenario: Verify Selected Line Of Business Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Line Of Business Assignment Table Presence
    Then Selected Line Of Business Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Line Of Business Assignment
    Then verify the Remove button disabled in Line Of Business Assignment
    
  Scenario: Verify Update button Disabled in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Line Of Business Assignment
    Then verify the Update button disabled in Line Of Business Assignment
    
  Scenario Outline: Verify Remove button Enabled in Line Of Business Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Line Of Business Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Line Of Business Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Medicare Part D        |
      
  Scenario Outline: Verify Update button Enabled in Line Of Business Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Line Of Business Assignment
   	Then click on Selected Line Of Business Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Medicare Part D        |

	Scenario Outline: Verify Assign hospice facility by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign hospice facility by List Box presence
    Then verify the Assign hospice facility by List Box enabled
    And verify the default item displaying in Assign hospice facility by List Box
      | Assign_Hospice_Facility_By_List_Box_Default_Item   |
      | <Assign_Hospice_Facility_By_List_Box_Default_Item> | 
    And verify the Assign hospice facility by List Box items
      | Assign_Hospice_Facility_By_List_Box_Items   |
      | <Assign_Hospice_Facility_By_List_Box_Items> |
      
    Examples: 
      | Assign_Hospice_Facility_By_List_Box_Default_Item | Assign_Hospice_Facility_By_List_Box_Items |               
      | Customer                                         | Customer*Coverage Code*Drug List*Client   |
      
  Scenario Outline: Verify Assigned hospice facility List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned hospice facility List Box presence
    Then verify the Assigned hospice facility List Box enabled
    And verify the Assigned hospice facility List Box items  
      | Assigned_Hospice_Facility_List_Box_Items   |
      | <Assigned_Hospice_Facility_List_Box_Items> |
          
    Examples: 
      | Assigned_Hospice_Facility_List_Box_Items |               
      | Yes*No                                   |
      
  Scenario Outline: Verify Available Coverage Code Table in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign hospice facility by List Box
   	  | Assign_Hospice_Facility_By   |
   	  | <Assign_Hospice_Facility_By> |  
    Then verify the Available Coverage Code Table Presence in Hospice Facility Assignment
    And verify the Available Coverage Code Table Pagination Presence in Hospice Facility Assignment
          
    Examples: 
      | Assign_Hospice_Facility_By |               
      | Coverage Code              |
      
  Scenario: Verify Coverage Code1 Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Hospice Facility Assignment
    Then verify the Coverage Code1 Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Hospice Facility Assignment
    Then verify the Coverage Code2 Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Description Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Hospice Facility Assignment
    Then verify the Description Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Hospice Facility Assignment
    Then verify the Coverage Code Status Edit Box enabled in Hospice Facility Assignment
      
  Scenario Outline: Verify Available Drug List Table in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign hospice facility by List Box
   	  | Assign_Hospice_Facility_By   |
   	  | <Assign_Hospice_Facility_By> |  
    Then verify the Available Drug List Table Presence in Hospice Facility Assignment
    And verify the Available Drug List Table Pagination Presence in Hospice Facility Assignment
          
    Examples: 
      | Assign_Hospice_Facility_By |               
      | Drug List                  |
	
	Scenario: Verify Drug List ID Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Hospice Facility Assignment
    Then verify the Drug List ID Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Name Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Hospice Facility Assignment
    Then verify the Name Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Type Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Hospice Facility Assignment
    Then verify the Type Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Drug List Status Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Hospice Facility Assignment
    Then verify the Drug List Status Edit Box enabled in Hospice Facility Assignment
      
  Scenario Outline: Verify Available Client Table in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign hospice facility by List Box
   	  | Assign_Hospice_Facility_By   |
   	  | <Assign_Hospice_Facility_By> |  
    Then verify the Available Client Table Presence in Hospice Facility Assignment
          
    Examples: 
      | Assign_Hospice_Facility_By |               
      | Client                     |
	
	Scenario: Verify Client Number Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Hospice Facility Assignment
    Then verify the Client Number Edit Box enabled in Hospice Facility Assignment
      
	Scenario: Verify Client Name Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Hospice Facility Assignment
    Then verify the Client Name Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Start Date Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Hospice Facility Assignment
    Then verify the Start Date Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify End Date Edit Box in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Hospice Facility Assignment
    Then verify the End Date Edit Box enabled in Hospice Facility Assignment
      
  Scenario: Verify Add button Disabled in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Hospice Facility Assignment
    Then verify the Add button disabled in Hospice Facility Assignment
    
  Scenario Outline: Verify Add button Enabled in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
  	When input the following Hospice Facility Assignment details
  	  | Assign_Hospice_Facility_By   | Assigned_Hospice_Facility   |
  	  | <Assign_Hospice_Facility_By> | <Assigned_Hospice_Facility> |  
    Then verify the Add button enabled in Hospice Facility Assignment
    And click on Add button in Hospice Facility Assignment
          
    Examples: 
      | Assign_Hospice_Facility_By | Assigned_Hospice_Facility |               
      | Customer                   | Yes                       |
      
  Scenario: Verify Assign hospice facility by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign hospice facility by List Box disabled
    Then Assign hospice facility by List Box should be disabled  
  
  Scenario: Verify Selected Hospice Facility Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Hospice Facility Assignment Table Presence
    Then Selected Hospice Facility Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Hospice Facility Assignment
    Then verify the Remove button disabled in Hospice Facility Assignment
    
  Scenario: Verify Update button Disabled in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Hospice Facility Assignment
    Then verify the Update button disabled in Hospice Facility Assignment
    
  Scenario Outline: Verify Remove button Enabled in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Hospice Facility Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Hospice Facility Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Yes                    |
      
  Scenario Outline: Verify Update button Enabled in Hospice Facility Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Hospice Facility Assignment
   	Then click on Selected Hospice Facility Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Yes                    |

	Scenario Outline: Verify Assign prior authorization program by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign prior authorization program by List Box presence
    Then verify the Assign prior authorization program by List Box enabled
    And verify the default item displaying in Assign prior authorization program by List Box
      | Assign_Prior_Authorization_Program_By_List_Box_Default_Item   |
      | <Assign_Prior_Authorization_Program_By_List_Box_Default_Item> | 
    And verify the Assign prior authorization program by List Box items
      | Assign_Prior_Authorization_Program_By_List_Box_Items   |
      | <Assign_Prior_Authorization_Program_By_List_Box_Items> |
      
    Examples: 
      | Assign_Prior_Authorization_Program_By_List_Box_Default_Item | Assign_Prior_Authorization_Program_By_List_Box_Items |               
      | Customer                                                    | Customer*Coverage Code*Drug List*Client              |
      
  Scenario Outline: Verify Assigned prior authorization program List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned prior authorization program List Box presence
    Then verify the Assigned prior authorization program List Box enabled
    And verify the Assigned prior authorization program List Box items  
      | Assigned_Prior_Authorization_Program_List_Box_Items   |
      | <Assigned_Prior_Authorization_Program_List_Box_Items> |
          
    Examples: 
      | Assigned_Prior_Authorization_Program_List_Box_Items |               
      | Standard PA*Custom PA*None                          |
      
  Scenario Outline: Verify Available Coverage Code Table in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign prior authorization program by List Box
   	  | Assign_Prior_Authorization_Program_By   |
   	  | <Assign_Prior_Authorization_Program_By> |  
    Then verify the Available Coverage Code Table Presence in Prior Authorization Program Assignment
    And verify the Available Coverage Code Table Pagination Presence in Prior Authorization Program Assignment
          
    Examples: 
      | Assign_Prior_Authorization_Program_By |               
      | Coverage Code                         |
      
  Scenario: Verify Coverage Code1 Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Prior Authorization Program Assignment
    Then verify the Coverage Code1 Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Prior Authorization Program Assignment
    Then verify the Coverage Code2 Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Description Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Prior Authorization Program Assignment
    Then verify the Description Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Prior Authorization Program Assignment
    Then verify the Coverage Code Status Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario Outline: Verify Available Drug List Table in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign prior authorization program by List Box
   	  | Assign_Prior_Authorization_Program_By   |
   	  | <Assign_Prior_Authorization_Program_By> |  
    Then verify the Available Drug List Table Presence in Prior Authorization Program Assignment
    And verify the Available Drug List Table Pagination Presence in Prior Authorization Program Assignment
          
    Examples: 
      | Assign_Prior_Authorization_Program_By |               
      | Drug List                             |
	
	Scenario: Verify Drug List ID Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Prior Authorization Program Assignment
    Then verify the Drug List ID Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Name Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Prior Authorization Program Assignment
    Then verify the Name Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Type Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Prior Authorization Program Assignment
    Then verify the Type Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Drug List Status Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Prior Authorization Program Assignment
    Then verify the Drug List Status Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario Outline: Verify Available Client Table in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign prior authorization program by List Box
   	  | Assign_Prior_Authorization_Program_By   |
   	  | <Assign_Prior_Authorization_Program_By> |  
    Then verify the Available Client Table Presence in Prior Authorization Program Assignment
          
    Examples: 
      | Assign_Prior_Authorization_Program_By |               
      | Client                                |
	
	Scenario: Verify Client Number Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Prior Authorization Program Assignment
    Then verify the Client Number Edit Box enabled in Prior Authorization Program Assignment
      
	Scenario: Verify Client Name Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Prior Authorization Program Assignment
    Then verify the Client Name Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Start Date Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Prior Authorization Program Assignment
    Then verify the Start Date Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify End Date Edit Box in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Prior Authorization Program Assignment
    Then verify the End Date Edit Box enabled in Prior Authorization Program Assignment
      
  Scenario: Verify Add button Disabled in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Prior Authorization Program Assignment
    Then verify the Add button disabled in Prior Authorization Program Assignment
    
  Scenario Outline: Verify Add button Enabled in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
  	When input the following Prior Authorization Program Assignment details
  	  | Assign_Prior_Authorization_Program_By   | Assigned_Prior_Authorization_Program   |
  	  | <Assign_Prior_Authorization_Program_By> | <Assigned_Prior_Authorization_Program> |  
    Then verify the Add button enabled in Prior Authorization Program Assignment
    And click on Add button in Prior Authorization Program Assignment
          
    Examples: 
      | Assign_Prior_Authorization_Program_By | Assigned_Prior_Authorization_Program |               
      | Customer                              | Standard PA                          |
      
  Scenario: Verify Assign prior authorization program by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign prior authorization program by List Box disabled
    Then Assign prior authorization program by List Box should be disabled 
  
  Scenario: Verify Selected Prior Authorization Program Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Prior Authorization Program Assignment Table Presence
    Then Selected Prior Authorization Program Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Prior Authorization Program Assignment
    Then verify the Remove button disabled in Prior Authorization Program Assignment
    
  Scenario: Verify Update button Disabled in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Prior Authorization Program Assignment
    Then verify the Update button disabled in Prior Authorization Program Assignment
    
  Scenario Outline: Verify Remove button Enabled in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Prior Authorization Program Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Prior Authorization Program Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Standard PA            |
      
  Scenario Outline: Verify Update button Enabled in Prior Authorization Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Prior Authorization Program Assignment
   	Then click on Selected Prior Authorization Program Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Standard PA            |

	Scenario Outline: Verify Assign step therapy program by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign step therapy program by List Box presence
    Then verify the Assign step therapy program by List Box enabled
    And verify the default item displaying in Assign step therapy program by List Box
      | Assign_Step_Therapy_Program_By_List_Box_Default_Item   |
      | <Assign_Step_Therapy_Program_By_List_Box_Default_Item> | 
    And verify the Assign step therapy program by List Box items
      | Assign_Step_Therapy_Program_By_List_Box_Items   |
      | <Assign_Step_Therapy_Program_By_List_Box_Items> |
      
    Examples: 
      | Assign_Step_Therapy_Program_By_List_Box_Default_Item | Assign_Step_Therapy_Program_By_List_Box_Items |               
      | Customer                                             | Customer*Coverage Code*Drug List*Client       |
      
  Scenario Outline: Verify Assigned step therapy program List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned step therapy program List Box presence
    Then verify the Assigned step therapy program List Box enabled
    And verify the Assigned step therapy program List Box items  
      | Assigned_Step_Therapy_Program_List_Box_Items   |
      | <Assigned_Step_Therapy_Program_List_Box_Items> |
          
    Examples: 
      | Assigned_Step_Therapy_Program_List_Box_Items |               
      | Standard ST*Custom ST*None                   |
      
  Scenario Outline: Verify Available Coverage Code Table in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign step therapy program by List Box
   	  | Assign_Step_Therapy_Program_By   |
   	  | <Assign_Step_Therapy_Program_By> |  
    Then verify the Available Coverage Code Table Presence in Step Therapy Program Assignment
    And verify the Available Coverage Code Table Pagination Presence in Step Therapy Program Assignment
          
    Examples: 
      | Assign_Step_Therapy_Program_By |               
      | Coverage Code                  |
      
  Scenario: Verify Coverage Code1 Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Step Therapy Program Assignment
    Then verify the Coverage Code1 Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Step Therapy Program Assignment
    Then verify the Coverage Code2 Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Description Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Step Therapy Program Assignment
    Then verify the Description Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Step Therapy Program Assignment
    Then verify the Coverage Code Status Edit Box enabled in Step Therapy Program Assignment
      
  Scenario Outline: Verify Available Drug List Table in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign step therapy program by List Box
   	  | Assign_Step_Therapy_Program_By   |
   	  | <Assign_Step_Therapy_Program_By> |  
    Then verify the Available Drug List Table Presence in Step Therapy Program Assignment
    And verify the Available Drug List Table Pagination Presence in Step Therapy Program Assignment
          
    Examples: 
      | Assign_Step_Therapy_Program_By |               
      | Drug List                      |
	
	Scenario: Verify Drug List ID Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Step Therapy Program Assignment
    Then verify the Drug List ID Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Name Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Step Therapy Program Assignment
    Then verify the Name Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Type Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Step Therapy Program Assignment
    Then verify the Type Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Drug List Status Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Step Therapy Program Assignment
    Then verify the Drug List Status Edit Box enabled in Step Therapy Program Assignment
      
  Scenario Outline: Verify Available Client Table in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign step therapy program by List Box
   	  | Assign_Step_Therapy_Program_By   |
   	  | <Assign_Step_Therapy_Program_By> |  
    Then verify the Available Client Table Presence in Step Therapy Program Assignment
          
    Examples: 
      | Assign_Step_Therapy_Program_By |               
      | Client                         |
	
	Scenario: Verify Client Number Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Step Therapy Program Assignment
    Then verify the Client Number Edit Box enabled in Step Therapy Program Assignment
      
	Scenario: Verify Client Name Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Step Therapy Program Assignment
    Then verify the Client Name Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Start Date Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Step Therapy Program Assignment
    Then verify the Start Date Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify End Date Edit Box in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Step Therapy Program Assignment
    Then verify the End Date Edit Box enabled in Step Therapy Program Assignment
      
  Scenario: Verify Add button Disabled in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Step Therapy Program Assignment
    Then verify the Add button disabled in Step Therapy Program Assignment
    
  Scenario Outline: Verify Add button Enabled in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
  	When input the following Step Therapy Program Assignment details
  	  | Assign_Step_Therapy_Program_By   | Assigned_Step_Therapy_Program   |
  	  | <Assign_Step_Therapy_Program_By> | <Assigned_Step_Therapy_Program> |  
    Then verify the Add button enabled in Step Therapy Program Assignment
    And click on Add button in Step Therapy Program Assignment
          
    Examples: 
      | Assign_Step_Therapy_Program_By | Assigned_Step_Therapy_Program |               
      | Customer                       | Standard ST                   |
      
  Scenario: Verify Assign step therapy program by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign step therapy program by List Box disabled
    Then Assign step therapy program by List Box should be disabled 
  
  Scenario: Verify Selected Step Therapy Program Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Step Therapy Program Assignment Table Presence
    Then Selected Step Therapy Program Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Step Therapy Program Assignment
    Then verify the Remove button disabled in Step Therapy Program Assignment
    
  Scenario: Verify Update button Disabled in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Step Therapy Program Assignment
    Then verify the Update button disabled in Step Therapy Program Assignment
    
  Scenario Outline: Verify Remove button Enabled in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Step Therapy Program Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Step Therapy Program Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Standard ST            |
      
  Scenario Outline: Verify Update button Enabled in Step Therapy Program Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Step Therapy Program Assignment
   	Then click on Selected Step Therapy Program Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Standard ST            |

	Scenario Outline: Verify Assign focused UM bundle-diabetes by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-diabetes by List Box presence
    Then verify the Assign focused UM bundle-diabetes by List Box enabled
    And verify the default item displaying in Assign focused UM bundle-diabetes by List Box
      | Assign_Focused_UM_Bundle_Diabetes_By_List_Box_Default_Item   |
      | <Assign_Focused_UM_Bundle_Diabetes_By_List_Box_Default_Item> | 
    And verify the Assign focused UM bundle-diabetes by List Box items
      | Assign_Focused_UM_Bundle_Diabetes_By_List_Box_Items   |
      | <Assign_Focused_UM_Bundle_Diabetes_By_List_Box_Items> |
      
    Examples: 
      | Assign_Focused_UM_Bundle_Diabetes_By_List_Box_Default_Item | Assign_Focused_UM_Bundle_Diabetes_By_List_Box_Items |               
      | Customer                                                   | Customer*Coverage Code*Drug List*Client             |
      
  Scenario Outline: Verify Assigned focused UM bundle-diabetes List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned focused UM bundle-diabetes List Box presence
    Then verify the Assigned focused UM bundle-diabetes List Box enabled
    And verify the Assigned focused UM bundle-diabetes List Box items  
      | Assigned_Focused_UM_Bundle_Diabetes_List_Box_Items   |
      | <Assigned_Focused_UM_Bundle_Diabetes_List_Box_Items> |
          
    Examples: 
      | Assigned_Focused_UM_Bundle_Diabetes_List_Box_Items |               
      | Y - Standard UM*N - Non-Standard UM                |
      
  Scenario Outline: Verify Available Coverage Code Table in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-diabetes by List Box
   	  | Assign_Focused_UM_Bundle_Diabetes_By   |
   	  | <Assign_Focused_UM_Bundle_Diabetes_By> |  
    Then verify the Available Coverage Code Table Presence in Focused UM Bundle-Diabetes Assignment
    And verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Diabetes Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Diabetes_By |               
      | Coverage Code                        |
      
  Scenario: Verify Coverage Code1 Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Description Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Description Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario Outline: Verify Available Drug List Table in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-diabetes by List Box
   	  | Assign_Focused_UM_Bundle_Diabetes_By   |
   	  | <Assign_Focused_UM_Bundle_Diabetes_By> |  
    Then verify the Available Drug List Table Presence in Focused UM Bundle-Diabetes Assignment
    And verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Diabetes Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Diabetes_By |               
      | Drug List                            |
	
	Scenario: Verify Drug List ID Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Drug List ID Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Name Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Name Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Type Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Type Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Drug List Status Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Drug List Status Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario Outline: Verify Available Client Table in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-diabetes by List Box
   	  | Assign_Focused_UM_Bundle_Diabetes_By   |
   	  | <Assign_Focused_UM_Bundle_Diabetes_By> |  
    Then verify the Available Client Table Presence in Focused UM Bundle-Diabetes Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Diabetes_By |               
      | Client                               | 
	
	Scenario: Verify Client Number Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Client Number Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
	Scenario: Verify Client Name Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Client Name Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Start Date Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Start Date Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify End Date Edit Box in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Focused UM Bundle-Diabetes Assignment
    Then verify the End Date Edit Box enabled in Focused UM Bundle-Diabetes Assignment
      
  Scenario: Verify Add button Disabled in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Add button disabled in Focused UM Bundle-Diabetes Assignment
    
  Scenario Outline: Verify Add button Enabled in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
  	When input the following Focused UM Bundle-Diabetes Assignment details
  	  | Assign_Focused_UM_Bundle_Diabetes_By   | Assigned_Focused_UM_Bundle_Diabetes   |
  	  | <Assign_Focused_UM_Bundle_Diabetes_By> | <Assigned_Focused_UM_Bundle_Diabetes> |  
    Then verify the Add button enabled in Focused UM Bundle-Diabetes Assignment
    And click on Add button in Focused UM Bundle-Diabetes Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Diabetes_By | Assigned_Focused_UM_Bundle_Diabetes |               
      | Customer                             | Y - Standard UM                     |
      
  Scenario: Verify Assign focused UM bundle-diabetes by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-diabetes by List Box disabled
    Then Assign focused UM bundle-diabetes by List Box should be disabled 
  
  Scenario: Verify Selected Focused UM Bundle-Diabetes Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Focused UM Bundle-Diabetes Assignment Table Presence
    Then Selected Focused UM Bundle-Diabetes Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Remove button disabled in Focused UM Bundle-Diabetes Assignment
    
  Scenario: Verify Update button Disabled in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Focused UM Bundle-Diabetes Assignment
    Then verify the Update button disabled in Focused UM Bundle-Diabetes Assignment
    
  Scenario Outline: Verify Remove button Enabled in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Focused UM Bundle-Diabetes Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Focused UM Bundle-Diabetes Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Y - Standard UM        |
      
  Scenario Outline: Verify Update button Enabled in Focused UM Bundle-Diabetes Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Focused UM Bundle-Diabetes Assignment
   	Then click on Selected Focused UM Bundle-Diabetes Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Y - Standard UM        |

  Scenario Outline: Verify Assign focused UM bundle-respiratory by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-respiratory by List Box presence
    Then verify the Assign focused UM bundle-respiratory by List Box enabled
    And verify the default item displaying in Assign focused UM bundle-respiratory by List Box
      | Assign_Focused_UM_Bundle_Respiratory_By_List_Box_Default_Item   |
      | <Assign_Focused_UM_Bundle_Respiratory_By_List_Box_Default_Item> | 
    And verify the Assign focused UM bundle-respiratory by List Box items
      | Assign_Focused_UM_Bundle_Respiratory_By_List_Box_Items   |
      | <Assign_Focused_UM_Bundle_Respiratory_By_List_Box_Items> |
      
    Examples: 
      | Assign_Focused_UM_Bundle_Respiratory_By_List_Box_Default_Item | Assign_Focused_UM_Bundle_Respiratory_By_List_Box_Items |               
      | Customer                                                      | Customer*Coverage Code*Drug List*Client                |
      
  Scenario Outline: Verify Assigned focused UM bundle-respiratory List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned focused UM bundle-respiratory List Box presence
    Then verify the Assigned focused UM bundle-respiratory List Box enabled
    And verify the Assigned focused UM bundle-respiratory List Box items  
      | Assigned_Focused_UM_Bundle_Respiratory_List_Box_Items   |
      | <Assigned_Focused_UM_Bundle_Respiratory_List_Box_Items> |
          
    Examples: 
      | Assigned_Focused_UM_Bundle_Respiratory_List_Box_Items |               
      | Y - Standard UM*N - Non-Standard UM                   |
      
  Scenario Outline: Verify Available Coverage Code Table in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-respiratory by List Box
   	  | Assign_Focused_UM_Bundle_Respiratory_By   |
   	  | <Assign_Focused_UM_Bundle_Respiratory_By> |  
    Then verify the Available Coverage Code Table Presence in Focused UM Bundle-Respiratory Assignment
    And verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Respiratory Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Respiratory_By |               
      | Coverage Code                           |
      
  Scenario: Verify Coverage Code1 Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Description Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Description Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario Outline: Verify Available Drug List Table in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-respiratory by List Box
   	  | Assign_Focused_UM_Bundle_Respiratory_By   |
   	  | <Assign_Focused_UM_Bundle_Respiratory_By> |  
    Then verify the Available Drug List Table Presence in Focused UM Bundle-Respiratory Assignment
    And verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Respiratory Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Respiratory_By |               
      | Drug List                               |
	
	Scenario: Verify Drug List ID Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Drug List ID Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Name Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Name Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Type Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Type Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Drug List Status Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Drug List Status Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario Outline: Verify Available Client Table in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-respiratory by List Box
   	  | Assign_Focused_UM_Bundle_Respiratory_By   |
   	  | <Assign_Focused_UM_Bundle_Respiratory_By> |  
    Then verify the Available Client Table Presence in Focused UM Bundle-Respiratory Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Respiratory_By |               
      | Client                                  | 
	
	Scenario: Verify Client Number Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Client Number Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
	Scenario: Verify Client Name Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Client Name Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Start Date Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Start Date Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify End Date Edit Box in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Focused UM Bundle-Respiratory Assignment
    Then verify the End Date Edit Box enabled in Focused UM Bundle-Respiratory Assignment
      
  Scenario: Verify Add button Disabled in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Add button disabled in Focused UM Bundle-Respiratory Assignment
    
  Scenario Outline: Verify Add button Enabled in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
  	When input the following Focused UM Bundle-Respiratory Assignment details
  	  | Assign_Focused_UM_Bundle_Respiratory_By   | Assigned_Focused_UM_Bundle_Respiratory   |
  	  | <Assign_Focused_UM_Bundle_Respiratory_By> | <Assigned_Focused_UM_Bundle_Respiratory> |  
    Then verify the Add button enabled in Focused UM Bundle-Respiratory Assignment
    And click on Add button in Focused UM Bundle-Respiratory Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Respiratory_By | Assigned_Focused_UM_Bundle_Respiratory |               
      | Customer                                | Y - Standard UM                        |
      
  Scenario: Verify Assign focused UM bundle-respiratory by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-respiratory by List Box disabled
    Then Assign focused UM bundle-respiratory by List Box should be disabled 
  
  Scenario: Verify Selected Focused UM Bundle-Respiratory Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Focused UM Bundle-Respiratory Assignment Table Presence
    Then Selected Focused UM Bundle-Respiratory Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Remove button disabled in Focused UM Bundle-Respiratory Assignment
    
  Scenario: Verify Update button Disabled in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Focused UM Bundle-Respiratory Assignment
    Then verify the Update button disabled in Focused UM Bundle-Respiratory Assignment
    
  Scenario Outline: Verify Remove button Enabled in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Focused UM Bundle-Respiratory Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Focused UM Bundle-Respiratory Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Y - Standard UM        |
      
  Scenario Outline: Verify Update button Enabled in Focused UM Bundle-Respiratory Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Focused UM Bundle-Respiratory Assignment
   	Then click on Selected Focused UM Bundle-Respiratory Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Y - Standard UM        |

	Scenario Outline: Verify Assign focused UM bundle-specialty by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-specialty by List Box presence
    Then verify the Assign focused UM bundle-specialty by List Box enabled
    And verify the default item displaying in Assign focused UM bundle-specialty by List Box
      | Assign_Focused_UM_Bundle_Specialty_By_List_Box_Default_Item   |
      | <Assign_Focused_UM_Bundle_Specialty_By_List_Box_Default_Item> | 
    And verify the Assign focused UM bundle-specialty by List Box items
      | Assign_Focused_UM_Bundle_Specialty_By_List_Box_Items   |
      | <Assign_Focused_UM_Bundle_Specialty_By_List_Box_Items> |
      
    Examples: 
      | Assign_Focused_UM_Bundle_Specialty_By_List_Box_Default_Item | Assign_Focused_UM_Bundle_Specialty_By_List_Box_Items |               
      | Customer                                                    | Customer*Coverage Code*Drug List*Client              |
      
  Scenario Outline: Verify Assigned focused UM bundle-specialty List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned focused UM bundle-specialty List Box presence
    Then verify the Assigned focused UM bundle-specialty List Box enabled
    And verify the Assigned focused UM bundle-specialty List Box items  
      | Assigned_Focused_UM_Bundle_Specialty_List_Box_Items   |
      | <Assigned_Focused_UM_Bundle_Specialty_List_Box_Items> |
          
    Examples: 
      | Assigned_Focused_UM_Bundle_Specialty_List_Box_Items |               
      | Y - Standard UM*N - Non-Standard UM                 |
      
  Scenario Outline: Verify Available Coverage Code Table in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-specialty by List Box
   	  | Assign_Focused_UM_Bundle_Specialty_By   |
   	  | <Assign_Focused_UM_Bundle_Specialty_By> |  
    Then verify the Available Coverage Code Table Presence in Focused UM Bundle-Specialty Assignment
    And verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Specialty Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Specialty_By |               
      | Coverage Code                         |
      
  Scenario: Verify Coverage Code1 Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Description Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Description Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario Outline: Verify Available Drug List Table in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-specialty by List Box
   	  | Assign_Focused_UM_Bundle_Specialty_By   |
   	  | <Assign_Focused_UM_Bundle_Specialty_By> |  
    Then verify the Available Drug List Table Presence in Focused UM Bundle-Specialty Assignment
    And verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Specialty Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Specialty_By |               
      | Drug List                             |
	
	Scenario: Verify Drug List ID Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Drug List ID Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Name Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Name Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Type Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Type Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Drug List Status Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Drug List Status Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario Outline: Verify Available Client Table in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-specialty by List Box
   	  | Assign_Focused_UM_Bundle_Specialty_By   |
   	  | <Assign_Focused_UM_Bundle_Specialty_By> |  
    Then verify the Available Client Table Presence in Focused UM Bundle-Specialty Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Specialty_By |               
      | Client                                | 
	
	Scenario: Verify Client Number Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Client Number Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
	Scenario: Verify Client Name Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Client Name Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Start Date Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the Start Date Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify End Date Edit Box in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Focused UM Bundle-Specialty Assignment
    Then verify the End Date Edit Box enabled in Focused UM Bundle-Specialty Assignment
      
  Scenario: Verify Add button Disabled in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Focused UM Bundle-Specialty Assignment
    Then verify the Add button disabled in Focused UM Bundle-Specialty Assignment
    
  Scenario Outline: Verify Add button Enabled in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
  	When input the following Focused UM Bundle-Specialty Assignment details
  	  | Assign_Focused_UM_Bundle_Specialty_By   | Assigned_Focused_UM_Bundle_Specialty   |
  	  | <Assign_Focused_UM_Bundle_Specialty_By> | <Assigned_Focused_UM_Bundle_Specialty> |  
    Then verify the Add button enabled in Focused UM Bundle-Specialty Assignment
    And click on Add button in Focused UM Bundle-Specialty Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Specialty_By | Assigned_Focused_UM_Bundle_Specialty |               
      | Customer                              | Y - Standard UM                      |
      
  Scenario: Verify Assign focused UM bundle-specialty by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-specialty by List Box disabled
    Then Assign focused UM bundle-specialty by List Box should be disabled
  
  Scenario: Verify Selected Focused UM Bundle-Specialty Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Focused UM Bundle-Specialty Assignment Table Presence
    Then Selected Focused UM Bundle-Specialty Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Focused UM Bundle-Specialty Assignment
    Then verify the Remove button disabled in Focused UM Bundle-Specialty Assignment
    
  Scenario: Verify Update button Disabled in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Focused UM Bundle-Specialty Assignment
    Then verify the Update button disabled in Focused UM Bundle-Specialty Assignment
    
  Scenario Outline: Verify Remove button Enabled in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Focused UM Bundle-Specialty Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Focused UM Bundle-Specialty Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Y - Standard UM        |
      
  Scenario Outline: Verify Update button Enabled in Focused UM Bundle-Specialty Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Focused UM Bundle-Specialty Assignment
   	Then click on Selected Focused UM Bundle-Specialty Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Y - Standard UM        |

	Scenario Outline: Verify Assign focused UM bundle-miscellaneous by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-miscellaneous by List Box presence
    Then verify the Assign focused UM bundle-miscellaneous by List Box enabled
    And verify the default item displaying in Assign focused UM bundle-miscellaneous by List Box
      | Assign_Focused_UM_Bundle_Miscellaneous_By_List_Box_Default_Item   |
      | <Assign_Focused_UM_Bundle_Miscellaneous_By_List_Box_Default_Item> | 
    And verify the Assign focused UM bundle-miscellaneous by List Box items
      | Assign_Focused_UM_Bundle_Miscellaneous_By_List_Box_Items   |
      | <Assign_Focused_UM_Bundle_Miscellaneous_By_List_Box_Items> |
      
    Examples: 
      | Assign_Focused_UM_Bundle_Miscellaneous_By_List_Box_Default_Item | Assign_Focused_UM_Bundle_Miscellaneous_By_List_Box_Items |               
      | Customer                                                        | Customer*Coverage Code*Drug List*Client                  |
      
  Scenario Outline: Verify Assigned focused UM bundle-miscellaneous List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned focused UM bundle-miscellaneous List Box presence
    Then verify the Assigned focused UM bundle-miscellaneous List Box enabled
    And verify the Assigned focused UM bundle-miscellaneous List Box items  
      | Assigned_Focused_UM_Bundle_Miscellaneous_List_Box_Items   |
      | <Assigned_Focused_UM_Bundle_Miscellaneous_List_Box_Items> |
          
    Examples: 
      | Assigned_Focused_UM_Bundle_Miscellaneous_List_Box_Items |               
      | Y - Standard UM*N - Non-Standard UM                     |
      
  Scenario Outline: Verify Available Coverage Code Table in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-miscellaneous by List Box
   	  | Assign_Focused_UM_Bundle_Miscellaneous_By   |
   	  | <Assign_Focused_UM_Bundle_Miscellaneous_By> |  
    Then verify the Available Coverage Code Table Presence in Focused UM Bundle-Miscellaneous Assignment
    And verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Miscellaneous Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Miscellaneous_By |               
      | Coverage Code                             |
      
  Scenario: Verify Coverage Code1 Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Description Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Description Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario Outline: Verify Available Drug List Table in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-miscellaneous by List Box
   	  | Assign_Focused_UM_Bundle_Miscellaneous_By   |
   	  | <Assign_Focused_UM_Bundle_Miscellaneous_By> |  
    Then verify the Available Drug List Table Presence in Focused UM Bundle-Miscellaneous Assignment
    And verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Miscellaneous Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Miscellaneous_By |               
      | Drug List                                 |
	
	Scenario: Verify Drug List ID Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Drug List ID Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Name Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Name Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Type Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Type Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Drug List Status Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Drug List Status Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario Outline: Verify Available Client Table in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign focused UM bundle-miscellaneous by List Box
   	  | Assign_Focused_UM_Bundle_Miscellaneous_By   |
   	  | <Assign_Focused_UM_Bundle_Miscellaneous_By> |  
    Then verify the Available Client Table Presence in Focused UM Bundle-Miscellaneous Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Miscellaneous_By |               
      | Client                                    | 
	
	Scenario: Verify Client Number Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Client Number Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
	Scenario: Verify Client Name Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Client Name Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Start Date Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Start Date Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify End Date Edit Box in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the End Date Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment
      
  Scenario: Verify Add button Disabled in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Add button disabled in Focused UM Bundle-Miscellaneous Assignment
    
  Scenario Outline: Verify Add button Enabled in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
  	When input the following Focused UM Bundle-Miscellaneous Assignment details
  	  | Assign_Focused_UM_Bundle_Miscellaneous_By   | Assigned_Focused_UM_Bundle_Miscellaneous   |
  	  | <Assign_Focused_UM_Bundle_Miscellaneous_By> | <Assigned_Focused_UM_Bundle_Miscellaneous> |  
    Then verify the Add button enabled in Focused UM Bundle-Miscellaneous Assignment
    And click on Add button in Focused UM Bundle-Miscellaneous Assignment
          
    Examples: 
      | Assign_Focused_UM_Bundle_Miscellaneous_By | Assigned_Focused_UM_Bundle_Miscellaneous |               
      | Customer                                  | Y - Standard UM                          |
      
  Scenario: Verify Assign focused UM bundle-miscellaneous by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign focused UM bundle-miscellaneous by List Box disabled
    Then Assign focused UM bundle-miscellaneous by List Box should be disabled
  
  Scenario: Verify Selected Focused UM Bundle-Miscellaneous Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected Focused UM Bundle-Miscellaneous Assignment Table Presence
    Then Selected Focused UM Bundle-Miscellaneous Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Remove button disabled in Focused UM Bundle-Miscellaneous Assignment
    
  Scenario: Verify Update button Disabled in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Focused UM Bundle-Miscellaneous Assignment
    Then verify the Update button disabled in Focused UM Bundle-Miscellaneous Assignment
    
  Scenario Outline: Verify Remove button Enabled in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected Focused UM Bundle-Miscellaneous Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Focused UM Bundle-Miscellaneous Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Y - Standard UM        |
      
  Scenario Outline: Verify Update button Enabled in Focused UM Bundle-Miscellaneous Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Focused UM Bundle-Miscellaneous Assignment
   	Then click on Selected Focused UM Bundle-Miscellaneous Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Y - Standard UM        |

	Scenario Outline: Verify Assign TNF/RA UM by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign TNF/RA UM by List Box presence
    Then verify the Assign TNF/RA UM by List Box enabled
    And verify the default item displaying in Assign TNF/RA UM by List Box
      | Assign_TNFRAUM_By_List_Box_Default_Item   |
      | <Assign_TNFRAUM_By_List_Box_Default_Item> | 
    And verify the Assign TNF/RA UM by List Box items
      | Assign_TNFRAUM_By_List_Box_Items   |
      | <Assign_TNFRAUM_By_List_Box_Items> |
      
    Examples: 
      | Assign_TNFRAUM_By_List_Box_Default_Item | Assign_TNFRAUM_By_List_Box_Items        |               
      | Customer                                | Customer*Coverage Code*Drug List*Client |
      
  Scenario Outline: Verify Assigned TNF/RA UM List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned TNF/RA UM List Box presence
    Then verify the Assigned TNF/RA UM List Box enabled
    And verify the Assigned TNF/RA UM List Box items  
      | Assigned_TNFRAUM_List_Box_Items   |
      | <Assigned_TNFRAUM_List_Box_Items> |
          
    Examples: 
      | Assigned_TNFRAUM_List_Box_Items       |               
      | Y - Criteria Met*N - Criteria Not Met |
      
  Scenario Outline: Verify Available Coverage Code Table in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign TNF/RA UM by List Box
   	  | Assign_TNFRAUM_By   |
   	  | <Assign_TNFRAUM_By> |  
    Then verify the Available Coverage Code Table Presence in TNF/RA UM Assignment
    And verify the Available Coverage Code Table Pagination Presence in TNF/RA UM Assignment
          
    Examples: 
      | Assign_TNFRAUM_By |               
      | Coverage Code     |
      
  Scenario: Verify Coverage Code1 Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in TNF/RA UM Assignment
    Then verify the Coverage Code1 Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in TNF/RA UM Assignment
    Then verify the Coverage Code2 Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Description Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in TNF/RA UM Assignment
    Then verify the Description Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in TNF/RA UM Assignment
    Then verify the Coverage Code Status Edit Box enabled in TNF/RA UM Assignment
      
  Scenario Outline: Verify Available Drug List Table in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign TNF/RA UM by List Box
  	  | Assign_TNFRAUM_By   |
   	  | <Assign_TNFRAUM_By> | 
    Then verify the Available Drug List Table Presence in TNF/RA UM Assignment
    And verify the Available Drug List Table Pagination Presence in TNF/RA UM Assignment
          
    Examples: 
      | Assign_TNFRAUM_By |               
      | Drug List         |
	
	Scenario: Verify Drug List ID Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in TNF/RA UM Assignment
    Then verify the Drug List ID Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Name Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in TNF/RA UM Assignment
    Then verify the Name Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Type Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in TNF/RA UM Assignment
    Then verify the Type Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Drug List Status Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in TNF/RA UM Assignment
    Then verify the Drug List Status Edit Box enabled in TNF/RA UM Assignment
      
  Scenario Outline: Verify Available Client Table in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign TNF/RA UM by List Box
   	  | Assign_TNFRAUM_By   |
   	  | <Assign_TNFRAUM_By> |  
    Then verify the Available Client Table Presence in TNF/RA UM Assignment
          
    Examples: 
      | Assign_TNFRAUM_By |               
      | Client            | 
	
	Scenario: Verify Client Number Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in TNF/RA UM Assignment
    Then verify the Client Number Edit Box enabled in TNF/RA UM Assignment
      
	Scenario: Verify Client Name Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in TNF/RA UM Assignment
    Then verify the Client Name Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Start Date Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in TNF/RA UM Assignment
    Then verify the Start Date Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify End Date Edit Box in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in TNF/RA UM Assignment
    Then verify the End Date Edit Box enabled in TNF/RA UM Assignment
      
  Scenario: Verify Add button Disabled in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in TNF/RA UM Assignment
    Then verify the Add button disabled in TNF/RA UM Assignment
    
  Scenario Outline: Verify Add button Enabled in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
  	When input the following TNF/RA UM Assignment details
  	  | Assign_TNFRAUM_By   | Assigned_TNFRAUM   |
  	  | <Assign_TNFRAUM_By> | <Assigned_TNFRAUM> |  
    Then verify the Add button enabled in TNF/RA UM Assignment
    And click on Add button in TNF/RA UM Assignment
          
    Examples: 
      | Assign_TNFRAUM_By | Assigned_TNFRAUM |               
      | Customer          | Y - Criteria Met |
      
  Scenario: Verify Assign TNF/RA UM by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign TNF/RA UM by List Box disabled
    Then Assign TNF/RA UM by List Box should be disabled
  
  Scenario: Verify Selected TNF/RA UM Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected TNF/RA UM Assignment Table Presence
    Then Selected TNF/RA UM Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in TNF/RA UM Assignment
    Then verify the Remove button disabled in TNF/RA UM Assignment
    
  Scenario: Verify Update button Disabled in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in TNF/RA UM Assignment
    Then verify the Update button disabled in TNF/RA UM Assignment
    
  Scenario Outline: Verify Remove button Enabled in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected TNF/RA UM Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in TNF/RA UM Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Y - Criteria Met       |
      
  Scenario Outline: Verify Update button Enabled in TNF/RA UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in TNF/RA UM Assignment
   	Then click on Selected TNF/RA UM Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Y - Criteria Met       |           

  Scenario Outline: Verify Assign HCV Harvoni UM with ST by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Harvoni UM with ST by List Box presence
    Then verify the Assign HCV Harvoni UM with ST by List Box enabled
    And verify the default item displaying in Assign HCV Harvoni UM with ST by List Box
      | Assign_HCV_Harvoni_UM_With_ST_By_List_Box_Default_Item   |
      | <Assign_HCV_Harvoni_UM_With_ST_By_List_Box_Default_Item> | 
    And verify the Assign HCV Harvoni UM with ST by List Box items
      | Assign_HCV_Harvoni_UM_With_ST_By_List_Box_Items   |
      | <Assign_HCV_Harvoni_UM_With_ST_By_List_Box_Items> |
      
    Examples: 
      | Assign_HCV_Harvoni_UM_With_ST_By_List_Box_Default_Item | Assign_HCV_Harvoni_UM_With_ST_By_List_Box_Items |               
      | Customer                                               | Customer*Coverage Code*Drug List*Client         |
      
  Scenario Outline: Verify Assigned HCV Harvoni UM with ST List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned HCV Harvoni UM with ST List Box presence
    Then verify the Assigned HCV Harvoni UM with ST List Box enabled
    And verify the Assigned HCV Harvoni UM with ST List Box items  
      | Assigned_HCV_Harvoni_UM_With_ST_List_Box_Items   |
      | <Assigned_HCV_Harvoni_UM_With_ST_List_Box_Items> |
          
    Examples: 
      | Assigned_HCV_Harvoni_UM_With_ST_List_Box_Items                                                                                                                                                                                                                            |               
      | A – Preferred, 1 of 2 or less without fibrosis restriction*B – Preferred, 1 of 2 or less with fibrosis restriction*C - Preferred, 1 of 3 or more without fibrosis restriction*D – Preferred, 1 of 3 or more with fibrosis restriction*E – Disadvantaged/Non-Preferred*N/A |
      
  Scenario Outline: Verify Available Coverage Code Table in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Harvoni UM with ST by List Box
   	  | Assign_HCV_Harvoni_UM_With_ST_By   |
   	  | <Assign_HCV_Harvoni_UM_With_ST_By> |  
    Then verify the Available Coverage Code Table Presence in HCV Harvoni UM with ST Assignment
    And verify the Available Coverage Code Table Pagination Presence in HCV Harvoni UM with ST Assignment
          
    Examples: 
      | Assign_HCV_Harvoni_UM_With_ST_By |               
      | Coverage Code                    |
      
  Scenario: Verify Coverage Code1 Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Coverage Code1 Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Coverage Code2 Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Description Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Description Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Coverage Code Status Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario Outline: Verify Available Drug List Table in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Harvoni UM with ST by List Box
   	  | Assign_HCV_Harvoni_UM_With_ST_By   |
   	  | <Assign_HCV_Harvoni_UM_With_ST_By> |  
    Then verify the Available Drug List Table Presence in HCV Harvoni UM with ST Assignment
    And verify the Available Drug List Table Pagination Presence in HCV Harvoni UM with ST Assignment
          
    Examples: 
      | Assign_HCV_Harvoni_UM_With_ST_By |               
      | Drug List                        |
	
	Scenario: Verify Drug List ID Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Drug List ID Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Name Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Name Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Type Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Type Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Drug List Status Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Drug List Status Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario Outline: Verify Available Client Table in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Harvoni UM with ST by List Box
   	  | Assign_HCV_Harvoni_UM_With_ST_By   |
   	  | <Assign_HCV_Harvoni_UM_With_ST_By> |  
    Then verify the Available Client Table Presence in HCV Harvoni UM with ST Assignment
          
    Examples: 
      | Assign_HCV_Harvoni_UM_With_ST_By |               
      | Client                           |
	
	Scenario: Verify Client Number Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Client Number Edit Box enabled in HCV Harvoni UM with ST Assignment
      
	Scenario: Verify Client Name Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Client Name Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Start Date Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the Start Date Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify End Date Edit Box in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in HCV Harvoni UM with ST Assignment
    Then verify the End Date Edit Box enabled in HCV Harvoni UM with ST Assignment
      
  Scenario: Verify Add button Disabled in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in HCV Harvoni UM with ST Assignment
    Then verify the Add button disabled in HCV Harvoni UM with ST Assignment
    
  Scenario Outline: Verify Add button Enabled in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
  	When input the following HCV Harvoni UM with ST Assignment details
  	  | Assign_HCV_Harvoni_UM_With_ST_By   | Assigned_HCV_Harvoni_UM_With_ST   |
  	  | <Assign_HCV_Harvoni_UM_With_ST_By> | <Assigned_HCV_Harvoni_UM_With_ST> |  
    Then verify the Add button enabled in HCV Harvoni UM with ST Assignment
    And click on Add button in HCV Harvoni UM with ST Assignment
          
    Examples: 
      | Assign_HCV_Harvoni_UM_With_ST_By | Assigned_HCV_Harvoni_UM_With_ST                            |               
      | Customer                         | A – Preferred, 1 of 2 or less without fibrosis restriction |
      
  Scenario: Verify Assign HCV Harvoni UM with ST by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Harvoni UM with ST by List Box disabled
    Then Assign HCV Harvoni UM with ST by List Box should be disabled
  
  Scenario: Verify Selected HCV Harvoni UM with ST Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected HCV Harvoni UM with ST Assignment Table Presence
    Then Selected HCV Harvoni UM with ST Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in HCV Harvoni UM with ST Assignment
    Then verify the Remove button disabled in HCV Harvoni UM with ST Assignment
    
  Scenario: Verify Update button Disabled in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in HCV Harvoni UM with ST Assignment
    Then verify the Update button disabled in HCV Harvoni UM with ST Assignment
    
  Scenario Outline: Verify Remove button Enabled in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected HCV Harvoni UM with ST Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in HCV Harvoni UM with ST Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details                                     |               
      | check     | 0886*A – Preferred, 1 of 2 or less without fibrosis restriction |
      
  Scenario Outline: Verify Update button Enabled in HCV Harvoni UM with ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in HCV Harvoni UM with ST Assignment
   	Then click on Selected HCV Harvoni UM with ST Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details                                     |               
      | uncheck   | 0886*A – Preferred, 1 of 2 or less without fibrosis restriction |

	Scenario Outline: Verify Assign HCV Solvaldi UM without ST by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Solvaldi UM without ST by List Box presence
    Then verify the Assign HCV Solvaldi UM without ST by List Box enabled
    And verify the default item displaying in Assign HCV Solvaldi UM without ST by List Box
      | Assign_HCV_Solvaldi_UM_Without_ST_By_List_Box_Default_Item   |
      | <Assign_HCV_Solvaldi_UM_Without_ST_By_List_Box_Default_Item> | 
    And verify the Assign HCV Solvaldi UM without ST by List Box items
      | Assign_HCV_Solvaldi_UM_Without_ST_By_List_Box_Items   |
      | <Assign_HCV_Solvaldi_UM_Without_ST_By_List_Box_Items> |
      
    Examples: 
      | Assign_HCV_Solvaldi_UM_Without_ST_By_List_Box_Default_Item | Assign_HCV_Solvaldi_UM_Without_ST_By_List_Box_Items |               
      | Customer                                                   | Customer*Coverage Code*Drug List*Client             |
      
  Scenario Outline: Verify Assigned HCV Solvaldi UM without ST List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned HCV Solvaldi UM without ST List Box presence
    Then verify the Assigned HCV Solvaldi UM without ST List Box enabled
    And verify the Assigned HCV Solvaldi UM without ST List Box items  
      | Assigned_HCV_Solvaldi_UM_Without_ST_List_Box_Items   |
      | <Assigned_HCV_Solvaldi_UM_Without_ST_List_Box_Items> |
          
    Examples: 
      | Assigned_HCV_Solvaldi_UM_Without_ST_List_Box_Items                                |               
      | A – No Fibrosis Restriction*B – Fibrosis Restriction*C – Not Preferred Parity*N/A |
      
  Scenario Outline: Verify Available Coverage Code Table in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Solvaldi UM without ST by List Box
   	  | Assign_HCV_Solvaldi_UM_Without_ST_By   |
   	  | <Assign_HCV_Solvaldi_UM_Without_ST_By> |  
    Then verify the Available Coverage Code Table Presence in HCV Solvaldi UM without ST Assignment
    And verify the Available Coverage Code Table Pagination Presence in HCV Solvaldi UM without ST Assignment
          
    Examples: 
      | Assign_HCV_Solvaldi_UM_Without_ST_By |               
      | Coverage Code                        |
      
  Scenario: Verify Coverage Code1 Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Coverage Code1 Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Coverage Code2 Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Description Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Description Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Coverage Code Status Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario Outline: Verify Available Drug List Table in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Solvaldi UM without ST by List Box
   	  | Assign_HCV_Solvaldi_UM_Without_ST_By   |
   	  | <Assign_HCV_Solvaldi_UM_Without_ST_By> |  
    Then verify the Available Drug List Table Presence in HCV Solvaldi UM without ST Assignment
    And verify the Available Drug List Table Pagination Presence in HCV Solvaldi UM without ST Assignment
          
    Examples: 
      | Assign_HCV_Solvaldi_UM_Without_ST_By |               
      | Drug List                            |
	
	Scenario: Verify Drug List ID Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Drug List ID Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Name Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Name Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Type Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Type Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Drug List Status Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Drug List Status Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario Outline: Verify Available Client Table in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Solvaldi UM without ST by List Box
   	  | Assign_HCV_Solvaldi_UM_Without_ST_By   |
   	  | <Assign_HCV_Solvaldi_UM_Without_ST_By> |  
    Then verify the Available Client Table Presence in HCV Solvaldi UM without ST Assignment
          
    Examples: 
      | Assign_HCV_Solvaldi_UM_Without_ST_By |               
      | Client                               |
	
	Scenario: Verify Client Number Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Client Number Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
	Scenario: Verify Client Name Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Client Name Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Start Date Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the Start Date Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify End Date Edit Box in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in HCV Solvaldi UM without ST Assignment
    Then verify the End Date Edit Box enabled in HCV Solvaldi UM without ST Assignment
      
  Scenario: Verify Add button Disabled in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in HCV Solvaldi UM without ST Assignment
    Then verify the Add button disabled in HCV Solvaldi UM without ST Assignment
    
  Scenario Outline: Verify Add button Enabled in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
  	When input the following HCV Solvaldi UM without ST Assignment details
  	  | Assign_HCV_Solvaldi_UM_Without_ST_By   | Assigned_HCV_Solvaldi_UM_Without_ST   |
  	  | <Assign_HCV_Solvaldi_UM_Without_ST_By> | <Assigned_HCV_Solvaldi_UM_Without_ST> |  
    Then verify the Add button enabled in HCV Solvaldi UM without ST Assignment
    And click on Add button in HCV Solvaldi UM without ST Assignment
          
    Examples: 
      | Assign_HCV_Solvaldi_UM_Without_ST_By | Assigned_HCV_Solvaldi_UM_Without_ST |               
      | Customer                             | A – No Fibrosis Restriction         |
      
  Scenario: Verify Assign HCV Solvaldi UM without ST by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Solvaldi UM without ST by List Box disabled
    Then Assign HCV Solvaldi UM without ST by List Box should be disabled
  
  Scenario: Verify Selected HCV Solvaldi UM without ST Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected HCV Solvaldi UM without ST Assignment Table Presence
    Then Selected HCV Solvaldi UM without ST Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in HCV Solvaldi UM without ST Assignment
    Then verify the Remove button disabled in HCV Solvaldi UM without ST Assignment
    
  Scenario: Verify Update button Disabled in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in HCV Solvaldi UM without ST Assignment
    Then verify the Update button disabled in HCV Solvaldi UM without ST Assignment
    
  Scenario Outline: Verify Remove button Enabled in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected HCV Solvaldi UM without ST Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in HCV Solvaldi UM without ST Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details      |               
      | check     | 0886*A – No Fibrosis Restriction |
      
  Scenario Outline: Verify Update button Enabled in HCV Solvaldi UM without ST Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in HCV Solvaldi UM without ST Assignment
   	Then click on Selected HCV Solvaldi UM without ST Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details      |               
      | uncheck   | 0886*A – No Fibrosis Restriction |

	Scenario Outline: Verify Assign HCV Mavyret tiering by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Mavyret tiering by List Box presence
    Then verify the Assign HCV Mavyret tiering by List Box enabled
    And verify the default item displaying in Assign HCV Mavyret tiering by List Box
      | Assign_HCV_Mavyret_Tiering_By_List_Box_Default_Item   |
      | <Assign_HCV_Mavyret_Tiering_By_List_Box_Default_Item> | 
    And verify the Assign HCV Mavyret tiering by List Box items
      | Assign_HCV_Mavyret_Tiering_By_List_Box_Items   |
      | <Assign_HCV_Mavyret_Tiering_By_List_Box_Items> |
      
    Examples: 
      | Assign_HCV_Mavyret_Tiering_By_List_Box_Default_Item | Assign_HCV_Mavyret_Tiering_By_List_Box_Items |               
      | Customer                                            | Customer*Coverage Code*Drug List*Client      |
      
  Scenario Outline: Verify Assigned HCV Mavyret tiering List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned HCV Mavyret tiering List Box presence
    Then verify the Assigned HCV Mavyret tiering List Box enabled
    And verify the Assigned HCV Mavyret tiering List Box items  
      | Assigned_HCV_Mavyret_Tiering_List_Box_Items   |
      | <Assigned_HCV_Mavyret_Tiering_List_Box_Items> |
          
    Examples: 
      | Assigned_HCV_Mavyret_Tiering_List_Box_Items                                                                                                                                                  |               
      | A – Not Disadvantaged/No Fibrosis Restriction*B – Not Disadvantaged/Fibrosis Restriction Prior to 1/1/18*C – Not Disadvantaged/Fibrosis Restriction On or After 1/1/18*D - Disadvantaged*N/A |
      
  Scenario Outline: Verify Available Coverage Code Table in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Mavyret tiering by List Box
   	  | Assign_HCV_Mavyret_Tiering_By   |
   	  | <Assign_HCV_Mavyret_Tiering_By> |  
    Then verify the Available Coverage Code Table Presence in HCV Mavyret Tiering Assignment
    And verify the Available Coverage Code Table Pagination Presence in HCV Mavyret Tiering Assignment
          
    Examples: 
      | Assign_HCV_Mavyret_Tiering_By |               
      | Coverage Code                 |
      
  Scenario: Verify Coverage Code1 Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Coverage Code1 Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Coverage Code2 Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Description Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Description Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Coverage Code Status Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario Outline: Verify Available Drug List Table in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Mavyret tiering by List Box
   	  | Assign_HCV_Mavyret_Tiering_By   |
   	  | <Assign_HCV_Mavyret_Tiering_By> |  
    Then verify the Available Drug List Table Presence in HCV Mavyret Tiering Assignment
    And verify the Available Drug List Table Pagination Presence in HCV Mavyret Tiering Assignment
          
    Examples: 
      | Assign_HCV_Mavyret_Tiering_By |               
      | Drug List                     |
	
	Scenario: Verify Drug List ID Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Drug List ID Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Name Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Name Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Type Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Type Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Drug List Status Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Drug List Status Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario Outline: Verify Available Client Table in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Mavyret tiering by List Box
   	  | Assign_HCV_Mavyret_Tiering_By   |
   	  | <Assign_HCV_Mavyret_Tiering_By> |  
    Then verify the Available Client Table Presence in HCV Mavyret Tiering Assignment
          
    Examples: 
      | Assign_HCV_Mavyret_Tiering_By |               
      | Client                        |
	
	Scenario: Verify Client Number Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Client Number Edit Box enabled in HCV Mavyret Tiering Assignment
      
	Scenario: Verify Client Name Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Client Name Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Start Date Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the Start Date Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify End Date Edit Box in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in HCV Mavyret Tiering Assignment
    Then verify the End Date Edit Box enabled in HCV Mavyret Tiering Assignment
      
  Scenario: Verify Add button Disabled in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in HCV Mavyret Tiering Assignment
    Then verify the Add button disabled in HCV Mavyret Tiering Assignment
    
  Scenario Outline: Verify Add button Enabled in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
  	When input the following HCV Mavyret Tiering Assignment details
  	  | Assign_HCV_Mavyret_Tiering_By   | Assigned_HCV_Mavyret_Tiering   |
  	  | <Assign_HCV_Mavyret_Tiering_By> | <Assigned_HCV_Mavyret_Tiering> |  
    Then verify the Add button enabled in HCV Mavyret Tiering Assignment
    And click on Add button in HCV Mavyret Tiering Assignment
          
    Examples: 
      | Assign_HCV_Mavyret_Tiering_By | Assigned_HCV_Mavyret_Tiering                  |               
      | Customer                      | A – Not Disadvantaged/No Fibrosis Restriction |
      
  Scenario: Verify Assign HCV Mavyret tiering by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Mavyret tiering by List Box disabled
    Then Assign HCV Mavyret tiering by List Box should be disabled
  
  Scenario: Verify Selected HCV Mavyret Tiering Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected HCV Mavyret Tiering Assignment Table Presence
    Then Selected HCV Mavyret Tiering Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in HCV Mavyret Tiering Assignment
    Then verify the Remove button disabled in HCV Mavyret Tiering Assignment
    
  Scenario: Verify Update button Disabled in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in HCV Mavyret Tiering Assignment
    Then verify the Update button disabled in HCV Mavyret Tiering Assignment
    
  Scenario Outline: Verify Remove button Enabled in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected HCV Mavyret Tiering Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in HCV Mavyret Tiering Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details                        |               
      | check     | 0886*A – Not Disadvantaged/No Fibrosis Restriction |
      
  Scenario Outline: Verify Update button Enabled in HCV Mavyret Tiering Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in HCV Mavyret Tiering Assignment
   	Then click on Selected HCV Mavyret Tiering Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details                        |               
      | uncheck   | 0886*A – Not Disadvantaged/No Fibrosis Restriction |

	Scenario Outline: Verify Assign HCV Epclusa UM by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Epclusa UM by List Box presence
    Then verify the Assign HCV Epclusa UM by List Box enabled
    And verify the default item displaying in Assign HCV Epclusa UM by List Box
      | Assign_HCV_Epclusa_UM_By_List_Box_Default_Item   |
      | <Assign_HCV_Epclusa_UM_By_List_Box_Default_Item> | 
    And verify the Assign HCV Epclusa UM by List Box items
      | Assign_HCV_Epclusa_UM_By_List_Box_Items   |
      | <Assign_HCV_Epclusa_UM_By_List_Box_Items> |
      
    Examples: 
      | Assign_HCV_Epclusa_UM_By_List_Box_Default_Item | Assign_HCV_Epclusa_UM_By_List_Box_Items |               
      | Customer                                       | Customer*Coverage Code*Drug List*Client |
      
  Scenario Outline: Verify Assigned HCV Epclusa UM List Box
    Given User is on Assignment Criteria screen
   	When verify the Assigned HCV Epclusa UM List Box presence
    Then verify the Assigned HCV Epclusa UM List Box enabled
    And verify the Assigned HCV Epclusa UM List Box items  
      | Assigned_HCV_Epclusa_UM_List_Box_Items   |
      | <Assigned_HCV_Epclusa_UM_List_Box_Items> |
          
    Examples: 
      | Assigned_HCV_Epclusa_UM_List_Box_Items                                                                                       |               
      | A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction*B – Disadvantaged or Fibrosis Restriction or ST Harvoni*N/A |
      
  Scenario Outline: Verify Available Coverage Code Table in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Epclusa UM by List Box
   	  | Assign_HCV_Epclusa_UM_By   |
   	  | <Assign_HCV_Epclusa_UM_By> |  
    Then verify the Available Coverage Code Table Presence in HCV Epclusa UM Assignment
    And verify the Available Coverage Code Table Pagination Presence in HCV Epclusa UM Assignment
          
    Examples: 
      | Assign_HCV_Epclusa_UM_By |               
      | Coverage Code            |
      
  Scenario: Verify Coverage Code1 Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code1 Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Coverage Code1 Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Coverage Code2 Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Coverage Code2 Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Description Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Description Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Description Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Coverage Code Status Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code Status Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Coverage Code Status Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario Outline: Verify Available Drug List Table in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Epclusa UM by List Box
   	  | Assign_HCV_Epclusa_UM_By   |
   	  | <Assign_HCV_Epclusa_UM_By> |  
    Then verify the Available Drug List Table Presence in HCV Epclusa UM Assignment
    And verify the Available Drug List Table Pagination Presence in HCV Epclusa UM Assignment
          
    Examples: 
      | Assign_HCV_Epclusa_UM_By |               
      | Drug List                |
	
	Scenario: Verify Drug List ID Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List ID Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Drug List ID Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Name Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Name Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Name Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Type Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Type Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Type Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Drug List Status Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Drug List Status Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Drug List Status Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario Outline: Verify Available Client Table in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign HCV Epclusa UM by List Box
   	  | Assign_HCV_Epclusa_UM_By   |
   	  | <Assign_HCV_Epclusa_UM_By> |  
    Then verify the Available Client Table Presence in HCV Epclusa UM Assignment
          
    Examples: 
      | Assign_HCV_Epclusa_UM_By |               
      | Client                   |
	
	Scenario: Verify Client Number Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Number Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Client Number Edit Box enabled in HCV Epclusa UM Assignment
      
	Scenario: Verify Client Name Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Client Name Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Client Name Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Start Date Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Start Date Edit Box presence in HCV Epclusa UM Assignment
    Then verify the Start Date Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify End Date Edit Box in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the End Date Edit Box presence in HCV Epclusa UM Assignment
    Then verify the End Date Edit Box enabled in HCV Epclusa UM Assignment
      
  Scenario: Verify Add button Disabled in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in HCV Epclusa UM Assignment
    Then verify the Add button disabled in HCV Epclusa UM Assignment
    
  Scenario Outline: Verify Add button Enabled in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
  	When input the following HCV Epclusa UM Assignment details
  	  | Assign_HCV_Epclusa_UM_By   | Assigned_HCV_Epclusa_UM   |
  	  | <Assign_HCV_Epclusa_UM_By> | <Assigned_HCV_Epclusa_UM> |  
    Then verify the Add button enabled in HCV Epclusa UM Assignment
    And click on Add button in HCV Epclusa UM Assignment
          
    Examples: 
      | Assign_HCV_Epclusa_UM_By | Assigned_HCV_Epclusa_UM                                          |               
      | Customer                 | A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction |
      
  Scenario: Verify Assign HCV Epclusa UM by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign HCV Epclusa UM by List Box disabled
    Then Assign HCV Epclusa UM by List Box should be disabled
  
  Scenario: Verify Selected HCV Epclusa UM Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Selected HCV Epclusa UM Assignment Table Presence
    Then Selected HCV Epclusa UM Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in HCV Epclusa UM Assignment
    Then verify the Remove button disabled in HCV Epclusa UM Assignment
    
  Scenario: Verify Update button Disabled in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in HCV Epclusa UM Assignment
    Then verify the Update button disabled in HCV Epclusa UM Assignment
    
  Scenario Outline: Verify Remove button Enabled in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
  	When click on Selected HCV Epclusa UM Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in HCV Epclusa UM Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details                                           |               
      | check     | 0886*A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction |
      
  Scenario Outline: Verify Update button Enabled in HCV Epclusa UM Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in HCV Epclusa UM Assignment
   	Then click on Selected HCV Epclusa UM Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details                                           |               
      | uncheck   | 0886*A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction |
  
  Scenario Outline: Verify Assign tier description by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign tier description by List Box presence
    Then verify the Assign tier description by List Box enabled
    And verify the default item displaying in Assign tier description by List Box
      | Assign_Tier_Description_By_List_Box_Default_Item   |
      | <Assign_Tier_Description_By_List_Box_Default_Item> | 
    And verify the Assign tier description by List Box items
      | Assign_Tier_Description_By_List_Box_Items   |
      | <Assign_Tier_Description_By_List_Box_Items> |
      
    Examples: 
      | Assign_Tier_Description_By_List_Box_Default_Item | Assign_Tier_Description_By_List_Box_Items |               
      | Customer                                         | Customer*Drug List                        |
      
  Scenario Outline: Verify Customer Edit Box in Tier Description Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign tier description by List Box
   	  | Assign_Tier_Description_By   |
   	  | <Assign_Tier_Description_By> |  
  	Then verify the Customer Edit Box presence in Tier Description Assignment
    And verify the Customer Edit Box enabled in Tier Description Assignment
		And verify the Customer Edit Box maximum length in Tier Description Assignment  
      | Customer_Edit_Box_Max_Length   |
      | <Customer_Edit_Box_Max_Length> | 
          
    Examples: 
      | Assign_Tier_Description_By | Customer_Edit_Box_Max_Length |              
      | Customer                   | 4                            |

  Scenario Outline: Verify Drug List Edit Box in Tier Description Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign tier description by List Box
   	  | Assign_Tier_Description_By   |
   	  | <Assign_Tier_Description_By> |  
  	Then verify the Drug List Edit Box presence in Tier Description Assignment
    And verify the Drug List Edit Box enabled in Tier Description Assignment
		And verify the Drug List Edit Box maximum length in Tier Description Assignment  
      | Drug_List_Edit_Box_Max_Length   |
      | <Drug_List_Edit_Box_Max_Length> | 
          
    Examples: 
      | Assign_Tier_Description_By | Drug_List_Edit_Box_Max_Length |              
      | Drug List                  | 9                             |

  Scenario Outline: Verify Tier List Box
    Given User is on Assignment Criteria screen
   	When verify the Tier List Box presence
    Then verify the Tier List Box enabled
    And verify the Tier List Box items  
      | Tier_List_Box_Items   |
      | <Tier_List_Box_Items> |
          
    Examples: 
      | Tier_List_Box_Items                                                    |               
      | Tier 1*Tier 2*Tier 3*Tier 4*Tier 5*Tier 6*Tier 7*Tier 8*Tier 9*Tier 10 |
	  
	  
  Scenario Outline: Verify Description List Box
    Given User is on Assignment Criteria screen
   	When verify the Description List Box presence
    Then verify the Description List Box enabled
    And verify the Description List Box items  
      | Description_List_Box_Items   |
      | <Description_List_Box_Items> |
          
    Examples: 
      | Description_List_Box_Items                                                                                                                                                                                                                                              |               
      | Generics*Brands*Pref Generics*Pref Brands*NP Generics*NP Brands*Pref Specialty*NP Specialty*Specialty Generics*Specialty Pref Bnds*Specialty NP Bnds*Excluded*$0 Cost Share*Non Formulary*Formulary*Covered*Not Covered*Specialty Pref Gen*Specialty NP Gen*None*Custom |

  Scenario: Verify Add button Disabled in Tier Description Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Tier Description Assignment
    Then verify the Add button disabled in Tier Description Assignment
    
  Scenario Outline: Verify Add button Enabled in Tier Description Assignment
    Given User is on Assignment Criteria screen
  	When input the following Tier Description Assignment details
  	  | Assign_Tier_Description_By   | Customer   | Tier   | Description   |
  	  | <Assign_Tier_Description_By> | <Customer> | <Tier> | <Description> |  
    Then verify the Add button enabled in Tier Description Assignment
    And click on Add button in Tier Description Assignment
          
    Examples: 
      | Assign_Tier_Description_By | Customer | Tier   | Description |               
      | Customer                   | 0886     | Tier 1 | Generics    |
      
  Scenario: Verify Assign tier description by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign tier description by List Box disabled
    Then Assign tier description by List Box should be disabled
  
  Scenario: Verify Tier Description Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Tier Description Assignment Table Presence
    Then Tier Description Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Tier Description Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Tier Description Assignment
    Then verify the Remove button disabled in Tier Description Assignment
    
  Scenario: Verify Update button Disabled in Tier Description Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Tier Description Assignment
    Then verify the Update button disabled in Tier Description Assignment
    
  Scenario Outline: Verify Remove button Enabled in Tier Description Assignment
    Given User is on Assignment Criteria screen
  	When click on Tier Description Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Tier Description Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*Tier 1*Generics        |
      
  Scenario Outline: Verify Update button Enabled in Tier Description Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Tier Description Assignment
   	Then click on Tier Description Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*Tier 1*Generics        |

  Scenario Outline: Verify Assign guarantee code by List Box
    Given User is on Assignment Criteria screen
   	When verify the Assign guarantee code by List Box presence
    Then verify the Assign guarantee code by List Box enabled
    And verify the default item displaying in Assign guarantee code by List Box
      | Assign_Guarantee_Code_By_List_Box_Default_Item   |
      | <Assign_Guarantee_Code_By_List_Box_Default_Item> | 
    And verify the Assign guarantee code by List Box items
      | Assign_Guarantee_Code_By_List_Box_Items   |
      | <Assign_Guarantee_Code_By_List_Box_Items> |
      
    Examples: 
      | Assign_Guarantee_Code_By_List_Box_Default_Item | Assign_Guarantee_Code_By_List_Box_Items |               
      | Customer                                       | Customer*Client*Coverage Code*Drug List |
      
  Scenario Outline: Verify Customer Edit Box in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign guarantee code by List Box
   	  | Assign_Guarantee_Code_By   |
   	  | <Assign_Guarantee_Code_By> |  
  	Then verify the Customer Edit Box presence in Guarantee Code Assignment
    And verify the Customer Edit Box enabled in Guarantee Code Assignment
		And verify the Customer Edit Box maximum length in Guarantee Code Assignment   
      | Customer_Edit_Box_Max_Length   |
      | <Customer_Edit_Box_Max_Length> | 
          
    Examples: 
      | Assign_Guarantee_Code_By | Customer_Edit_Box_Max_Length |              
      | Customer                 | 4                            |
	  
  Scenario Outline: Verify Client Edit Box in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign guarantee code by List Box
   	  | Assign_Guarantee_Code_By   |
   	  | <Assign_Guarantee_Code_By> |  
  	Then verify the Client Edit Box presence in Guarantee Code Assignment
    And verify the Client Edit Box enabled in Guarantee Code Assignment
		And verify the Client Edit Box maximum length in Guarantee Code Assignment  
      | Client_Edit_Box_Max_Length   |
      | <Client_Edit_Box_Max_Length> | 
          
    Examples: 
      | Assign_Guarantee_Code_By | Client_Edit_Box_Max_Length |              
      | Client                   | 5                          |

  Scenario Outline: Verify Coverage Code1 Edit Box in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign guarantee code by List Box
   	  | Assign_Guarantee_Code_By   |
   	  | <Assign_Guarantee_Code_By> |  
  	Then verify the Coverage Code1 Edit Box presence in Guarantee Code Assignment
    And verify the Coverage Code1 Edit Box enabled in Guarantee Code Assignment
		And verify the Coverage Code1 Edit Box maximum length in Guarantee Code Assignment  
      | Coverage_Code1_Edit_Box_Max_Length   |
      | <Coverage_Code1_Edit_Box_Max_Length> | 
          
    Examples: 
      | Assign_Guarantee_Code_By | Coverage_Code1_Edit_Box_Max_Length |              
      | Coverage Code            | 6                                  |

  Scenario Outline: Verify Coverage Code2 Edit Box in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Guarantee Code Assignment
    Then verify the Coverage Code2 Edit Box enabled in Guarantee Code Assignment
    And verify the Coverage Code2 Edit Box maximum length in Guarantee Code Assignment  
      | Coverage_Code2_Edit_Box_Max_Length   |
      | <Coverage_Code2_Edit_Box_Max_Length> | 
          
    Examples: 
      | Coverage_Code2_Edit_Box_Max_Length |              
      | 6                                  | 	

  Scenario Outline: Verify Drug List Edit Box in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When select value from Assign guarantee code by List Box
   	  | Assign_Guarantee_Code_By   |
   	  | <Assign_Guarantee_Code_By> |  
  	Then verify the Drug List Edit Box presence in Guarantee Code Assignment
    And verify the Drug List Edit Box enabled in Guarantee Code Assignment
          
    Examples: 
      | Assign_Guarantee_Code_By |             
      | Drug List                |

  Scenario Outline: Verify Guarantee code Edit Box
    Given User is on Assignment Criteria screen
   	When verify the Guarantee code Edit Box presence in Guarantee Code Assignment
    Then verify the Guarantee code Edit Box enabled in Guarantee Code Assignment
    And verify the Guarantee code Edit Box maximum length in Guarantee Code Assignment  
      | Guarantee_Code_Edit_Box_Max_Length   |
      | <Guarantee_Code_Edit_Box_Max_Length> |
          
    Examples: 
      | Guarantee_Code_Edit_Box_Max_Length |               
      | 4                                  |

  Scenario: Verify Add button Disabled in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Guarantee Code Assignment
    Then verify the Add button disabled in Guarantee Code Assignment
    
  Scenario Outline: Verify Add button Enabled in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
  	When input the following Guarantee Code Assignment details
  	  | Assign_Guarantee_Code_By   | Customer   | Guarantee_Code   |
  	  | <Assign_Guarantee_Code_By> | <Customer> | <Guarantee_Code> |  
    Then verify the Add button enabled in Guarantee Code Assignment
    And click on Add button in Guarantee Code Assignment
          
    Examples: 
      | Assign_Guarantee_Code_By | Customer | Guarantee_Code |               
      | Customer                 | 0886     | 1234           |
      
  Scenario: Verify Assign guarantee code by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Assign guarantee code by List Box disabled
    Then Assign guarantee code by List Box should be disabled
  
  Scenario: Verify Guarantee Code Assignment Table
    Given User is on Assignment Criteria screen
    When verify the Guarantee Code Assignment Table Presence
    Then Guarantee Code Assignment Table should be displayed

  Scenario: Verify Remove button Disabled in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Guarantee Code Assignment
    Then verify the Remove button disabled in Guarantee Code Assignment
    
  Scenario: Verify Update button Disabled in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Guarantee Code Assignment
    Then verify the Update button disabled in Guarantee Code Assignment
    
  Scenario Outline: Verify Remove button Enabled in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
  	When click on Guarantee Code Assignment check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
    Then verify the Remove button enabled in Guarantee Code Assignment
          
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | check     | 0886*1234                   |
      
  Scenario Outline: Verify Update button Enabled in Guarantee Code Assignment
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Guarantee Code Assignment
   	Then click on Guarantee Code Assignment Check box
  	  | Operation   | Selected_Assignment_Details   |
  	  | <Operation> | <Selected_Assignment_Details> |  
  	  
    Examples: 
      | Operation | Selected_Assignment_Details |               
      | uncheck   | 0886*1234                   |

  Scenario Outline: Verify Exclude claims by List Box
    Given User is on Assignment Criteria screen
   	When verify the Exclude claims by List Box presence
    Then verify the Exclude claims by List Box enabled
    And verify the default item displaying in Exclude claims by List Box
      | Exclude_Claims_By_List_Box_Default_Item   |
      | <Exclude_Claims_By_List_Box_Default_Item> | 
    And verify the Exclude claims by List Box items
      | Exclude_Claims_By_List_Box_Items   |
      | <Exclude_Claims_By_List_Box_Items> |
      
    Examples: 
      | Exclude_Claims_By_List_Box_Default_Item | Exclude_Claims_By_List_Box_Items |               
      | Client                                  | Client*Coverage Code*Group       |
      
  Scenario Outline: Verify Client Edit Box in Exclude Claims
    Given User is on Assignment Criteria screen
   	When select value from Exclude claims by List Box
   	  | Exclude_Claims_By   |
   	  | <Exclude_Claims_By> |  
  	Then verify the Client Edit Box presence in Exclude Claims
    And verify the Client Edit Box enabled in Exclude Claims
		And verify the Client Edit Box maximum length in Exclude Claims  
      | Client_Edit_Box_Max_Length   |
      | <Client_Edit_Box_Max_Length> | 
          
    Examples: 
      | Exclude_Claims_By | Client_Edit_Box_Max_Length |              
      | Client            | 5                          |

  Scenario Outline: Verify Coverage Code1 Edit Box in Exclude Claims
    Given User is on Assignment Criteria screen
   	When select value from Exclude claims by List Box
   	  | Exclude_Claims_By   |
   	  | <Exclude_Claims_By> |  
  	Then verify the Coverage Code1 Edit Box presence in Exclude Claims
    And verify the Coverage Code1 Edit Box enabled in Exclude Claims
		And verify the Coverage Code1 Edit Box maximum length in Exclude Claims  
      | Coverage_Code1_Edit_Box_Max_Length   |
      | <Coverage_Code1_Edit_Box_Max_Length> | 
          
    Examples: 
      | Exclude_Claims_By | Coverage_Code1_Edit_Box_Max_Length |              
      | Coverage Code     | 6                                  |

  Scenario Outline: Verify Coverage Code2 Edit Box in Exclude Claims
    Given User is on Assignment Criteria screen
   	When verify the Coverage Code2 Edit Box presence in Exclude Claims
    Then verify the Coverage Code2 Edit Box enabled in Exclude Claims
    And verify the Coverage Code2 Edit Box maximum length in Exclude Claims  
      | Coverage_Code2_Edit_Box_Max_Length   |
      | <Coverage_Code2_Edit_Box_Max_Length> | 
          
    Examples: 
      | Coverage_Code2_Edit_Box_Max_Length |              
      | 6                                  | 	

  Scenario Outline: Verify Group Edit Box in Exclude Claims
    Given User is on Assignment Criteria screen
   	When select value from Exclude claims by List Box
   	  | Exclude_Claims_By   |
   	  | <Exclude_Claims_By> |  
  	Then verify the Group Edit Box presence in Exclude Claims
    And verify the Group Edit Box enabled in Exclude Claims
		And verify the Group Edit Box maximum length in Exclude Claims  
      | Group_Edit_Box_Max_Length   |
      | <Group_Edit_Box_Max_Length> | 
          
    Examples: 
      | Exclude_Claims_By | Group_Edit_Box_Max_Length |              
      | Group             | 7                         |

  Scenario: Verify Add button Disabled in Exclude Claims
    Given User is on Assignment Criteria screen
   	When verify the Add button presence in Exclude Claims
    Then verify the Add button disabled in Exclude Claims
    
  Scenario Outline: Verify Add button Enabled in Exclude Claims
    Given User is on Assignment Criteria screen
  	When input the following Exclude Claims details
  	  | Exclude_Claims_By   | Client   |
  	  | <Exclude_Claims_By> | <Client> |
    Then verify the Add button enabled in Exclude Claims
    And click on Add button in Exclude Claims
          
    Examples: 
      | Exclude_Claims_By | Client |
      | Client            | 1      |
      
  Scenario: Verify Exclude claims by List Box Disabled
    Given User is on Assignment Criteria screen
   	When verify the Exclude claims by List Box disabled
    Then Exclude claims by List Box should be disabled
  
  Scenario: Verify Selected Claims to Exclude Table
    Given User is on Assignment Criteria screen
    When verify the Selected Claims to Exclude Table Presence
    Then Selected Claims to Exclude Table should be displayed

  Scenario: Verify Remove button Disabled in Exclude Claims
    Given User is on Assignment Criteria screen
   	When verify the Remove button presence in Exclude Claims
    Then verify the Remove button disabled in Exclude Claims
    
  Scenario: Verify Update button Disabled in Exclude Claims
    Given User is on Assignment Criteria screen
   	When verify the Update button presence in Exclude Claims
    Then verify the Update button disabled in Exclude Claims
    
  Scenario Outline: Verify Remove button Enabled in Exclude Claims
    Given User is on Assignment Criteria screen
  	When click on Selected Claims to Exclude check box
  	  | Operation   | Selected_Claims_To_Exclude_Details   |
  	  | <Operation> | <Selected_Claims_To_Exclude_Details> |  
    Then verify the Remove button enabled in Exclude Claims
          
    Examples: 
      | Operation | Selected_Claims_To_Exclude_Details |               
      | check     | 1                                  |
      
  Scenario Outline: Verify Update button Enabled in Exclude Claims
    Given User is on Assignment Criteria screen
   	When verify the Update button enabled in Exclude Claims
   	Then click on Selected Claims To Exclude Check box
  	  | Operation   | Selected_Claims_To_Exclude_Details   |
  	  | <Operation> | <Selected_Claims_To_Exclude_Details> |  
  	  
    Examples: 
      | Operation | Selected_Claims_To_Exclude_Details |               
      | uncheck   | 1                                  |
      
  Scenario: Navigate to Authorized Brand Alternatives screen
  	Given User is on Assignment Criteria screen
  	When click on Next button in Assignment Criteria screen
  	Then Authorized Brand Alternatives screen should be displayed
 	
 	Scenario Outline: Verify Vendor formulary ID List Box in Authorized Brand Alternatives screen
    Given User is on Authorized Brand Alternatives screen
  	When verify the Vendor formulary ID List Box presence in Authorized Brand Alternatives screen
    Then verify the Vendor formulary ID List Box enabled in Authorized Brand Alternatives screen
    And verify the Vendor formulary ID List Box items in Authorized Brand Alternatives screen
      | Vendor_Formulary_ID_List_Box_Items   |
      | <Vendor_Formulary_ID_List_Box_Items> |
      
    Examples: 
      | Vendor_Formulary_ID_List_Box_Items |               
      | 1007                               |
      
  Scenario: Verify Available Authorized Brand Alternatives Table
    Given User is on Authorized Brand Alternatives screen
    When verify the Available Authorized Brand Alternatives Table Presence
    Then verify the Available Authorized Brand Alternatives Table Pagination Presence
      
  Scenario: Verify Add button Disabled in Authorized Brand Alternatives panel
    Given User is on Authorized Brand Alternatives screen
   	When verify the Add button presence in Authorized Brand Alternatives screen
    Then verify the Add button disabled in Authorized Brand Alternatives screen
    
  Scenario Outline: Verify Add button Enabled in Authorized Brand Alternatives screen
    Given User is on Authorized Brand Alternatives screen
  	When input the following Authorized Brand Alternatives details
  	  | Operation   |  Vendor_Formulary_ID  | Authorized_Brand_Alternatives   |
  	  | <Operation> | <Vendor_Formulary_ID> | <Authorized_Brand_Alternatives> |  
    Then verify the Add button enabled in Authorized Brand Alternatives screen
    And click on Add button in Authorized Brand Alternatives screen
          
    Examples: 
      | Operation | Vendor_Formulary_ID | Authorized_Brand_Alternatives                                   |
      | check     | 1007			          | 00002773701*INSULIN LISPRO 100 UNIT/ML VL*2019-04-30*9999-12-31 |
      
  Scenario: Verify Selected Authorized Brand Alternatives Table
    Given User is on Authorized Brand Alternatives screen
    When verify the Selected Authorized Brand Alternatives Table Presence
    Then Selected Authorized Brand Alternatives Table should be displayed
    
  Scenario: Verify Remove button Disabled in Authorized Brand Alternatives screen
    Given User is on Authorized Brand Alternatives screen
   	When verify the Remove button presence in Authorized Brand Alternatives screen
    Then verify the Remove button disabled in Authorized Brand Alternatives screen
    
  Scenario Outline: Verify Remove button Enabled in Authorized Brand Alternatives screen
    Given User is on Authorized Brand Alternatives screen
  	When click on Selected Authorized Brand Alternatives check box
  	  | Operation   | Selected_Authorized_Brand_Alternatives_Details   |
  	  | <Operation> | <Selected_Authorized_Brand_Alternatives_Details> |  
    Then verify the Remove button enabled in Authorized Brand Alternatives screen
          
    Examples: 
      | Operation | Selected_Authorized_Brand_Alternatives_Details                       |
      | check     | 1007*00002773701*INSULIN LISPRO 100 UNIT/ML VL*2019-04-30*9999-12-31 |
      
  Scenario Outline: Verify Remove button Disabled in Authorized Brand Alternatives screen
    Given User is on Authorized Brand Alternatives screen
  	When click on Selected Authorized Brand Alternatives check box
  	  | Operation   | Selected_Authorized_Brand_Alternatives_Details   |
  	  | <Operation> | <Selected_Authorized_Brand_Alternatives_Details> |  
    Then verify the Remove button disabled in Authorized Brand Alternatives screen  
  	  
    Examples: 
      | Operation | Selected_Authorized_Brand_Alternatives_Details                       |              
      | uncheck   | 1007*00002773701*INSULIN LISPRO 100 UNIT/ML VL*2019-04-30*9999-12-31 |
      
  Scenario: Verify Previous button Enabled in Authorized Brand Alternatives screen
    Given User is on Authorized Brand Alternatives screen
   	When verify the Previous button presence in Authorized Brand Alternatives screen
    Then verify the Previous button enabled in Authorized Brand Alternatives screen 
  
  Scenario: Verify Save button Enabled in Authorized Brand Alternatives screen
    Given User is on Authorized Brand Alternatives screen
   	When verify the Save button presence in Authorized Brand Alternatives screen
    Then verify the Save button enabled in Authorized Brand Alternatives screen 
            