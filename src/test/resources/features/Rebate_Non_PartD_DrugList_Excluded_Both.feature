@Regression
Feature: Rebate Non-Part D - Assign Tier Description By Customer and Excluded as Tier Description 

  Background: 
    Given User opens the browser and goes to RxNova URL
    When enter valid username, valid password and click on Login button
    Then navigates from Landing page to "Rebate" application

  Scenario Outline: Add the Contract Information details
    Given User is on Customer Contracts page
    When click on New button
    Then Customer Contract Creation page should be displayed
    And input the Vendor details in Contract Information screen
      | Vendor   | Vendor_Contract_Type   | Vendor_Claim_Basis   | Vendor_Day_Supply   | Client_Type   | Master_Customer_Set   | Customer_ID   | Contract_Name   | Reclassification_Drug_Vendor   | Internal_Or_External   |   Contract_Line_Of_Business | Contract_Type   | Claim_Basis   | Vendor_Start_Date   | Vendor_End_Date   | Cosmetic_Drugs   | Compound_Drugs   | Multisource_Brand_Drugs   | Vaccines   | Over_The_Counter_Drugs   | Except_Insulins   | Except_Diabetic_Supplies_And_Test_Strips   | Reclassify_specialty_claims_to_retail   | Reclassify_day_supply_break_at_34   | Reclassify_brand_claims_to_generic   | Monthly_Penalty   | Minimum_Penalty_Claims   | Penalty_Start_Date   | Penalty_End_Date   |
      | <Vendor> | <Vendor_Contract_Type> | <Vendor_Claim_Basis> | <Vendor_Day_Supply> | <Client_Type> | <Master_Customer_Set> | <Customer_ID> | <Contract_Name> | <Reclassification_Drug_Vendor> | <Internal_Or_External> | <Contract_Line_Of_Business> | <Contract_Type> | <Claim_Basis> | <Vendor_Start_Date> | <Vendor_End_Date> | <Cosmetic_Drugs> | <Compound_Drugs> | <Multisource_Brand_Drugs> | <Vaccines> | <Over_The_Counter_Drugs> | <Except_Insulins> | <Except_Diabetic_Supplies_And_Test_Strips> | <Reclassify_specialty_claims_to_retail> | <Reclassify_day_supply_break_at_34> | <Reclassify_brand_claims_to_generic> | <Monthly_Penalty> | <Minimum_Penalty_Claims> | <Penalty_Start_Date> | <Penalty_End_Date> |
    And submit the Rate details in Contract Information screen
      | Operation | RateDetails_Table_ExistingRecord | Rate_Details_Start_Date | Rate_Details_End_Date | Line_Of_Business              | Transparency         | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share | Customer_Rebate_Share | DST_Revenue | Vendor_Adj_Day_Supply_Option | Customer_Adj_Day_Supply_Option | Notes            |
      | Add       |                                  |                         |                       | Exchange Select Comprehensive | Partial Transparency | Multiplicative | 40                  | 40        | 20               | 40                    | 60          | No                           | No                             | New Test Notes12 |
    And click on Next button in Contract Information screen
    Then Guarantee screen should be displayed    
    Examples: 
      | Vendor | Vendor_Contract_Type               | Vendor_Claim_Basis        | Vendor_Day_Supply      | Client_Type     | Master_Customer_Set | Customer_ID | Contract_Name | Reclassification_Drug_Vendor | Internal_Or_External | Contract_Line_Of_Business | Contract_Type                      | Claim_Basis               | Vendor_Start_Date | Vendor_End_Date | Cosmetic_Drugs | Compound_Drugs | Multisource_Brand_Drugs| Vaccines | Over_The_Counter_Drugs | Except_Insulins | Except_Diabetic_Supplies_And_Test_Strips | Reclassify_specialty_claims_to_retail | Reclassify_day_supply_break_at_34 | Reclassify_brand_claims_to_generic | Monthly_Penalty | Minimum_Penalty_Claims | Penalty_Start_Date | Penalty_End_Date | 
      | Optum  | Pass Thru % with Minimum Guarantee | Rebated Brand Claims Only | Day Supply Break at 34 | 1 - Health Plan | Qtp_Master_1        | 0888        |               | Medi-Span                    | Both                 | Non-Part D                | Pass Thru % with Minimum Guarantee | Rebated Brand Claims Only |                   |                 |                |                |       								 |          | check                  |                 | check                                    |                                       |                                   | check                              | 1               | 10                     |                    |                  | 
	
  Scenario Outline: Add the Guarantee details
    Given User is on Gurantee screen
  	When submit the following details in Guarantee screen
  	  | Operation   | Guarantee_Panel_Existing_Record_Details   | Start_Date   | End_Date   | Vendor_Formulary_ID   | Vendor_Formulary_Type   | DST_Formulary_Type   | Tier_Type   | Channel   | Line_Of_Business   | Vendor_Brand_Guarantee   | Customer_Brand_Guarantee   | Benefit_Design   | UM_Option   | Benefit_Design_Desc_Notes   | Plan_Design_Notes   | UM_Option_Notes   | Formulary_Design_Notes   |
      | <Operation> | <Guarantee_Panel_Existing_Record_Details> | <Start_Date> | <End_Date> | <Vendor_Formulary_ID> | <Vendor_Formulary_Type> | <DST_Formulary_Type> | <Tier_Type> | <Channel> | <Line_Of_Business> | <Vendor_Brand_Guarantee> | <Customer_Brand_Guarantee> | <Benefit_Design> | <UM_Option> | <Benefit_Design_Desc_Notes> | <Plan_Design_Notes> | <UM_Option_Notes> | <Formulary_Design_Notes> |
  	Then click on Next button in Guarantee screen
  	Then Membership/Claim screen should be displayed	
    Examples: 
      | Operation | Guarantee_Panel_Existing_Record_Details | Start_Date | End_Date | Vendor_Formulary_ID | Vendor_Formulary_Type | DST_Formulary_Type | Tier_Type | Channel | Line_Of_Business              | Vendor_Brand_Guarantee | Customer_Brand_Guarantee | Benefit_Design                                                                                 | UM_Option | Benefit_Design_Desc_Notes              | Plan_Design_Notes       | UM_Option_Notes       | Formulary_Design_Notes       |
      | Add       |                                         |            |          | 1007                | Select Focused        | Managed 200        | 1         | Mail 90 | Exchange Select Comprehensive | 2                      | 3                        | Greater than or equal to $10 copay or %10 coins between preferred and non-preferred brand drug | Targeted  | New Benefit Design Description Notes12 | New Plan Design Notes12 | New UM Option Notes12 | New Formulary Design Notes12 |
      
  Scenario Outline: Add the Membership/Claim Counts details
    Given User is on Membership/Claim Counts screen
  	When submit the following details in Membership/Claim Counts screen
  	  | Operation   | MembershipClaimCounts_Existing_Record_Details   | Establish_Contractual_Membership   | Customer_Or_Formulary_ID   | Contractual_Membership_Count   | Membership_Percent_Threshold   | Contractual_Claim_Count   | Claim_Percent_Threshold   |
      | <Operation> | <MembershipClaimCounts_Existing_Record_Details> | <Establish_Contractual_Membership> | <Customer_Or_Formulary_ID> | <Contractual_Membership_Count> | <Membership_Percent_Threshold> | <Contractual_Claim_Count> | <Claim_Percent_Threshold> |
  	Then click on Next button in Membership/Claim Counts screen
  	Then Reporting screen should be displayed
    Examples: 
      | Operation | MembershipClaimCounts_Existing_Record_Details | Establish_Contractual_Membership | Customer_Or_Formulary_ID | Contractual_Membership_Count | Membership_Percent_Threshold | Contractual_Claim_Count | Claim_Percent_Threshold |
      | Add       |                                               | Vendor Formulary ID              | 1007                     | 1                            | 1                            |                         |                         |
	
  Scenario Outline: Add the Reporting details
    Given User is on Reporting screen
  	When submit the following details in Reporting screen
  	  | Operation   | Reporting_Existing_Record_Details   | Package   | Level   | Start_Date   | End_Date   | Package_Notes   | Level_Notes   |
      | <Operation> | <Reporting_Existing_Record_Details> | <Package> | <Level> | <Start_Date> | <End_Date> | <Package_Notes> | <Level_Notes> |
  	Then click on Next button in Reporting Screen
  	Then Assignment Criteria screen should be displayed
    Examples: 
      | Operation | Reporting_Existing_Record_Details | Package  | Level | Start_Date | End_Date | Package_Notes       | Level_Notes       |
      | Add       |                                   | Standard | LOB   |            |          | New Package Notes12 | New Level Notes12 |
      
  Scenario Outline: Add the Vendor Formulary ID Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Vendor Formulary ID Assignment details
      | Operation   | Selected_Assignment_Details   | Assign_Vendor_Formulary_ID_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Vendor_Formulary_ID   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Vendor_Formulary_ID_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Vendor_Formulary_ID> |
  	Then verify Selected Vendor Formulary ID Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Vendor_Formulary_ID   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Vendor_Formulary_ID> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Vendor_Formulary_ID_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Vendor_Formulary_ID | Assign_By | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Customer                      |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | 1007                         | Customer  | 0888              |                        |                    |                 |                      |
     
  Scenario Outline: Add the Line of Business Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Line of Business Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Line_Of_Business_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Line_Of_Business   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Line_Of_Business_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Line_Of_Business> |
  	Then verify Selected Line of Business Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Line_Of_Business   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Line_Of_Business> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Line_Of_Business_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Line_Of_Business     | Assign_By | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Customer                   |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Exchange Select Comprehensive | Customer  | 0888              |                        |                    |                 |                      |   
 
  Scenario Outline: Add the Hospice Facility Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Hospice Facility Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Hospice_Facility_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Hospice_Facility   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Hospice_Facility_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Hospice_Facility> |
  	Then verify Selected Hospice Facility Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Hospice_Facility   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Hospice_Facility> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Hospice_Facility_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Hospice_Facility | Assign_By     | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Coverage Code              | C11210         | C21210         |                           |                      | C11210*C21210            |              |                |                |                  |                      |               |             |                   |                 |                   | No                        | Coverage Code |                   | C11210 C21210          |                    |                 |                      |    
      
  Scenario Outline: Add the Prior Authorization Program Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Prior Authorization Program Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Prior_Authorization_Program_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Prior_Authorization_Program   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Prior_Authorization_Program_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Prior_Authorization_Program> |
  	Then verify Selected Prior Authorization Program Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Prior_Authorization_Program   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Prior_Authorization_Program> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Prior_Authorization_Program_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Prior_Authorization_Program | Assign_By | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name            |    
      | Add       |                             | Client                                |                |                |                           |                      |                          |              |                |                |                  |                      | 1             |             |                   |                 | 1                 | None                                 | Client    |                   |                        |                    | 1               | AUTOMATION DO NOT USE - CLIENT1 |
      
  Scenario Outline: Add the Step Therapy Program Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Step Therapy Program Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Step_Therapy_Program_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Step_Therapy_Program   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Step_Therapy_Program_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Step_Therapy_Program> |
  	Then verify Selected Step Therapy Program Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Step_Therapy_Program   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Step_Therapy_Program> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Step_Therapy_Program_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Step_Therapy_Program | Assign_By | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name            |    
      | Add       |                             | Client                         |                |                |                           |                      |                          |              |                |                |                  |                      | 1             |             |                   |                 | 1                 | None                          | Client    |                   |                        |                    | 1               | AUTOMATION DO NOT USE - CLIENT1 |
      
  Scenario Outline: Add the Focused UM Bundle-Diabetes Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Focused UM Bundle-Diabetes Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Focused_UM_Bundle_Diabetes_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Focused_UM_Bundle_Diabetes   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Focused_UM_Bundle_Diabetes_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Focused_UM_Bundle_Diabetes> |
  	Then verify Selected Focused UM Bundle-Diabetes Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Focused_UM_Bundle_Diabetes   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Focused_UM_Bundle_Diabetes> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Focused_UM_Bundle_Diabetes_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Diabetes | Assign_By     | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Coverage Code                        | C11210         | C21210         |                           |                      | C11210*C21210            |              |                |                |                  |                      |               |             |                   |                 |                   | N - Non-Standard UM                 | Coverage Code |                   | C11210 C21210          |                    |                 |                      |    
      
  Scenario Outline: Add the Focused UM Bundle-Respiratory Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Focused UM Bundle-Respiratory Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Focused_UM_Bundle_Respiratory_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Focused_UM_Bundle_Respiratory   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Focused_UM_Bundle_Respiratory_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Focused_UM_Bundle_Respiratory> |
  	Then verify Selected Focused UM Bundle-Respiratory Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Focused_UM_Bundle_Respiratory   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Focused_UM_Bundle_Respiratory> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Focused_UM_Bundle_Respiratory_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Respiratory | Assign_By     | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Coverage Code                           | C11210         | C21210         |                           |                      | C11210*C21210            |              |                |                |                  |                      |               |             |                   |                 |                   | N - Non-Standard UM                    | Coverage Code |                   | C11210 C21210          |                    |                 |                      |    
      
  Scenario Outline: Add the Focused UM Bundle-Specialty Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Focused UM Bundle-Specialty Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Focused_UM_Bundle_Specialty_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Focused_UM_Bundle_Specialty   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_Focused_UM_Bundle_Specialty_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Focused_UM_Bundle_Specialty> |
  	Then verify Selected Focused UM Bundle-Specialty Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Focused_UM_Bundle_Specialty   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Focused_UM_Bundle_Specialty> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Focused_UM_Bundle_Specialty_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Specialty | Assign_By     | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Coverage Code                         | C11210         | C21210         |                           |                      | C11210*C21210            |              |                |                |                  |                      |               |             |                   |                 |                   | N - Non-Standard UM                  | Coverage Code |                   | C11210 C21210          |                    |                 |                      |
      
  Scenario Outline: Add the Focused UM Bundle-Miscellaneous Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Focused UM Bundle-Miscellaneous Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_Focused_UM_Bundle_Miscellaneous_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_Focused_UM_Bundle_Miscellaneous   |
 	    | <Operation> | <Selected_Assignment_Details> | <Assign_Focused_UM_Bundle_Miscellaneous_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_Focused_UM_Bundle_Miscellaneous> |
  	Then verify Selected Focused UM Bundle-Miscellaneous Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_Focused_UM_Bundle_Miscellaneous   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_Focused_UM_Bundle_Miscellaneous> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_Focused_UM_Bundle_Miscellaneous_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Miscellaneous | Assign_By     | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Coverage Code                             | C11210         | C21210         |                           |                      | C11210*C21210            |              |                |                |                  |                      |               |             |                   |                 |                   | N - Non-Standard UM                      | Coverage Code |                   | C11210 C21210          |                    |                 |                      |
      
  Scenario Outline: Add the TNF/RA UM Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following TNF/RA UM Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_TNF_RA_UM_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_TNF_RA_UM   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_TNF_RA_UM_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_TNF_RA_UM> |
  	Then verify Selected TNF/RA UM Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_TNF_RA_UM   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_TNF_RA_UM> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_TNF_RA_UM_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_TNF_RA_UM   | Assign_By     | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Coverage Code       | C11210         | C21210         |                           |                      | C11210*C21210            |              |                |                |                  |                      |               |             |                   |                 |                   | N - Criteria Not Met | Coverage Code |                   | C11210 C21210          |                    |                 |                      |   
      
  Scenario Outline: Add the HCV Harvoni UM with ST Assignment details
    Given User is on Assignment Criteria screen
    When submit the following HCV Harvoni UM with ST Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_HCV_Harvoni_UM_With_ST_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_HCV_Harvoni_UM_With_ST   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_HCV_Harvoni_UM_With_ST_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_HCV_Harvoni_UM_With_ST> |
  	Then verify Selected HCV Harvoni UM with ST Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_HCV_Harvoni_UM_With_ST   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_HCV_Harvoni_UM_With_ST> |  	
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_HCV_Harvoni_UM_With_ST_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Harvoni_UM_With_ST                         | Assign_By | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Drug List                        |                |                |                           |                      |                          | FLID02046    |                |                |                  | FLID02046            |               |             |                   |                 |                   | B – Preferred, 1 of 2 or less with fibrosis restriction | Drug List |                   |                        | FLID02046          |                 |                      |     
      
  Scenario Outline: Add the HCV Solvaldi UM without ST Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following HCV Solvaldi UM without ST Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_HCV_Solvaldi_UM_Without_ST_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_HCV_Solvaldi_UM_Without_ST   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_HCV_Solvaldi_UM_Without_ST_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_HCV_Solvaldi_UM_Without_ST> |
  	Then verify Selected HCV Solvaldi UM without ST Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_HCV_Solvaldi_UM_Without_ST   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_HCV_Solvaldi_UM_Without_ST> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_HCV_Solvaldi_UM_Without_ST_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Solvaldi_UM_Without_ST | Assign_By | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name            |    
      | Add       |                             | Client                               |                |                |                           |                      |                          |              |                |                |                  |                      | 1             |             |                   |                 | 1                 | C – Not Preferred Parity            | Client    |                   |                        |                    | 1               | AUTOMATION DO NOT USE - CLIENT1 |     
      
  Scenario Outline: Add the HCV Mavyret Tiering Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following HCV Mavyret Tiering Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_HCV_Mavyret_Tiering_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_HCV_Mavyret_Tiering   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_HCV_Mavyret_Tiering_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_HCV_Mavyret_Tiering> |
  	Then verify Selected HCV Mavyret Tiering Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_HCV_Mavyret_Tiering   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_HCV_Mavyret_Tiering> |
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_HCV_Mavyret_Tiering_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Mavyret_Tiering | Assign_By | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Drug List                     |                |                |                           |                      |                          | FLID02046    |                |                |                  | FLID02046            |               |             |                   |                 |                   | D - Disadvantaged            | Drug List |                   |                        | FLID02046          |                 |                      |    
      
  Scenario Outline: Add the HCV Epclusa UM Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following HCV Epclusa UM Assignment details
  	  | Operation   | Selected_Assignment_Details   | Assign_HCV_Epclusa_UM_By   | Coverage_Code1   | Coverage_Code2   | Coverage_Code_Description   | Coverage_Code_Status   | Available_Coverage_Codes   | Drug_List_ID   | Drug_List_Name   | Drug_List_Type   | Drug_List_Status   | Available_Drug_Lists   | Client_Number   | Client_Name   | Client_Start_Date   | Client_End_Date   | Available_Clients   | Assigned_HCV_Epclusa_UM   |
      | <Operation> | <Selected_Assignment_Details> | <Assign_HCV_Epclusa_UM_By> | <Coverage_Code1> | <Coverage_Code2> | <Coverage_Code_Description> | <Coverage_Code_Status> | <Available_Coverage_Codes> | <Drug_List_ID> | <Drug_List_Name> | <Drug_List_Type> | <Drug_List_Status> | <Available_Drug_Lists> | <Client_Number> | <Client_Name> | <Client_Start_Date> | <Client_End_Date> | <Available_Clients> | <Assigned_HCV_Epclusa_UM> |
  	Then verify Selected HCV Epclusa UM Assignment details
  	  | Assign_By   | Selected_Customer   | Selected_Coverage_Code   | Selected_Drug_List   | Selected_Client   | Selected_Client_Name   | Assigned_HCV_Epclusa_UM   |
  	  | <Assign_By> | <Selected_Customer> | <Selected_Coverage_Code> | <Selected_Drug_List> | <Selected_Client> | <Selected_Client_Name> | <Assigned_HCV_Epclusa_UM> |  	
    Examples: 
      | Operation | Selected_Assignment_Details | Assign_HCV_Epclusa_UM_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Epclusa_UM                                 | Assign_By     | Selected_Customer | Selected_Coverage_Code | Selected_Drug_List | Selected_Client | Selected_Client_Name |    
      | Add       |                             | Coverage Code            | C11210         | C21210         |                           |                      | C11210*C21210            |              |                |                |                  |                      |               |             |                   |                 |                   | B – Disadvantaged or Fibrosis Restriction or ST Harvoni | Coverage Code |                   | C11210 C21210          |                    |                 |                      | 
      
  Scenario Outline: Add the Tier Description Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Tier Description Assignment details
  	  | Operation   | Tier_Description_Assignment_Details   | Assign_Tier_Description_By   | Customer   | Drug_List   | Tier   | Description   |
      | <Operation> | <Tier_Description_Assignment_Details> | <Assign_Tier_Description_By> | <Customer> | <Drug_List> | <Tier> | <Description> |
  	Then verify Tier Description Assignment details
  	  | Assign_By   | Customer   | Drug_List   | Tier   | Description   |
  	  | <Assign_By> | <Customer> | <Drug_List> | <Tier> | <Description> |  	
    Examples: 
      | Operation | Tier_Description_Assignment_Details | Assign_Tier_Description_By | Customer | Drug_List | Tier   | Description | Assign_By |
      | Add       |                                     | Drug List                  |          | FLID02046 | Tier 2 | Excluded    | Drug List |
      
  Scenario Outline: Add the Guarantee Code Assignment details
    Given User is on Assignment Criteria screen
  	When submit the following Guarantee Code Assignment details
  	  | Operation   | Guarantee_Code_Assignment_Details   | Assign_Guarantee_Code_By   | Customer   | Client   | Drug_List   | Guarantee_Code   |
      | <Operation> | <Guarantee_Code_Assignment_Details> | <Assign_Guarantee_Code_By> | <Customer> | <Client> | <Drug_List> | <Guarantee_Code> |
  	Then verify Guarantee Code Assignment details
  	  | Assign_By   | Customer   | Client   | Drug_List   | Guarantee_Code   |
  	  | <Assign_By> | <Customer> | <Client> | <Drug_List> | <Guarantee_Code> | 
     	
    Examples: 
      | Operation | Guarantee_Code_Assignment_Details | Assign_Guarantee_Code_By | Customer | Client | Drug_List | Guarantee_Code | Assign_By |
      | Add       |                                   | Drug List                |          |        | FLID02046 | 1234           | Drug List |
      
  Scenario Outline: Add the Exclude Claim details
    Given User is on Assignment Criteria screen
  	When submit the following Exclude Claim details
  	  | Operation   | Selected_Claims_To_Exclude   | Exclude_Claims_By   | Client   | Coverage_Code1   | Coverage_Code2   | Group   |
      | <Operation> | <Selected_Claims_To_Exclude> | <Exclude_Claims_By> | <Client> | <Coverage_Code1> | <Coverage_Code2> | <Group> |
   	Then verify Selected Claims to Exclude details
  	  | Exclude_By   | Client   | Coverage_Code1   | Coverage_Code2   | Group   |
  	  | <Exclude_By> | <Client> | <Coverage_Code1> | <Coverage_Code2> | <Group> |  	  	
    Examples: 
      | Operation | Selected_Claims_To_Exclude | Exclude_Claims_By | Client | Coverage_Code1 | Coverage_Code2 | Group | Exclude_By |
      | Add       |                            | Client            | 1      |                |                |       | Client     |
      
  Scenario: Navigate to Authorized Brand Alternatives screen
  	Given User is on Assignment Criteria screen
  	When click on Next button in Assignment Criteria screen
  	Then Authorized Brand Alternatives screen should be displayed 
  
  Scenario: Add the Authorized Brand Alternatives details
    Given User is on Authorized Brand Alternatives screen
  	When submit the following Authorized Brand Alternatives details
  	  | Operation | Vendor_Formulary_ID | Authorized_Brand_Alternatives                                   |
      | Add       | 1007  			        | 00002773701*INSULIN LISPRO 100 UNIT/ML VL*2019-04-30*9999-12-31 |
  	Then click on Save button
 
  Scenario Outline: Search and View Contract Information details
    Given User navigates to Customer Contracts page
    When search for existing contract with following details
      | Search_By   | Search_By_Customer_ID   | Search_By_Contract_ID   | Search_By_Contract_Name   |
      | <Search_By> | <Search_By_Customer_ID> | <Search_By_Contract_ID> | <Search_By_Contract_Name> |
    Then Contract tab should be displayed
    And verify Vendor details in Contract Information screen
      | Vendor   | Vendor_Contract_Type   | Vendor_Claim_Basis   | Vendor_Day_Supply   | Client_Type   | Master_Customer_Set   | Customer_ID   | Contract_Name   | Reclassification_Drug_Vendor   | Contract_ID   | Internal_Or_External   |   Contract_Line_Of_Business | Contract_Type   | Claim_Basis   | Vendor_Start_Date   | Vendor_End_Date   | Reclassify_Claims   | Reclassify_Only   | Monthly_Penalty   | Minimum_Penalty_Claims   | Penalty_Start_Date   | Penalty_End_Date   |
      | <Vendor> | <Vendor_Contract_Type> | <Vendor_Claim_Basis> | <Vendor_Day_Supply> | <Client_Type> | <Master_Customer_Set> | <Customer_ID> | <Contract_Name> | <Reclassification_Drug_Vendor> | <Contract_ID> | <Internal_Or_External> | <Contract_Line_Of_Business> | <Contract_Type> | <Claim_Basis> | <Vendor_Start_Date> | <Vendor_End_Date> | <Reclassify_Claims> | <Reclassify_Only> | <Monthly_Penalty> | <Minimum_Penalty_Claims> | <Penalty_Start_Date> | <Penalty_End_Date> |
    And verify Rate details in Contract Information screen
      | Rate_Details_Start_Date | Rate_Details_End_Date | Line_Of_Business              | Transparency         | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share | Customer_Rebate_Share | DST_Revenue | Vendor_Adj_Day_Supply_Option | Customer_Adj_Day_Supply_Option | Notes            |
      |                         |                       | Exchange Select Comprehensive | Partial Transparency | Multiplicative | 40                  | 40        | 20               | 40                    | 60          | No                           | No                             | New Test Notes12 |         
    Examples: 
      | Search_By   | Search_By_Customer_ID | Search_By_Contract_ID | Search_By_Contract_Name | Vendor | Vendor_Contract_Type               | Vendor_Claim_Basis        | Vendor_Day_Supply      | Client_Type     | Master_Customer_Set | Customer_ID | Contract_Name | Reclassification_Drug_Vendor | Contract_ID | Internal_Or_External | Contract_Line_Of_Business | Contract_Type                      | Claim_Basis               | Vendor_Start_Date | Vendor_End_Date | Reclassify_Claims                                               | Reclassify_Only                    | Monthly_Penalty | Minimum_Penalty_Claims | Penalty_Start_Date | Penalty_End_Date | 
      | Customer ID | 0888                  |                       |                         | Optum  | Pass Thru % with Minimum Guarantee | Rebated Brand Claims Only | Day Supply Break at 34 | 1 - Health Plan | Qtp_Master_1        | 888         |               | Medi-Span                    |             | Both                 | Non-Part D                | Pass Thru % with Minimum Guarantee | Rebated Brand Claims Only |                   |                 | Over the counter drugs*Except diabetic supplies and test strips | Reclassify brand claims to generic | $1.00           | 10                     |                    |                  | 
          
  Scenario Outline: View Guarantee details
    Given User is on Contract Tab
    When verify and expand the Guarantee panel
	  	| Panel_Name   |
	  	| <Panel_Name> |
    Then verify Guarantee details
      | Start_Date   | End_Date   | Vendor_Formulary_ID   | Vendor_Formulary_Type   | DST_Formulary_Type   | Tier_Type   | Channel   | Line_Of_Business   | Vendor_Brand_Guarantee   | Customer_Brand_Guarantee   | Benefit_Design   | UM_Option   | Benefit_Design_Desc_Notes   | Plan_Design_Notes   | UM_Option_Notes   | Formulary_Design_Notes   |
      | <Start_Date> | <End_Date> | <Vendor_Formulary_ID> | <Vendor_Formulary_Type> | <DST_Formulary_Type> | <Tier_Type> | <Channel> | <Line_Of_Business> | <Vendor_Brand_Guarantee> | <Customer_Brand_Guarantee> | <Benefit_Design> | <UM_Option> | <Benefit_Design_Desc_Notes> | <Plan_Design_Notes> | <UM_Option_Notes> | <Formulary_Design_Notes> |        
    Examples: 
      | Panel_Name | Start_Date | End_Date | Vendor_Formulary_ID | Vendor_Formulary_Type | DST_Formulary_Type | Tier_Type | Channel | Line_Of_Business              | Vendor_Brand_Guarantee | Customer_Brand_Guarantee | Benefit_Design                                                                                 | UM_Option | Benefit_Design_Desc_Notes              | Plan_Design_Notes       | UM_Option_Notes       | Formulary_Design_Notes       |
      | Guarantee  |            |          | 1007                | Select Focused        | Managed 200        | 1         | Mail 90 | Exchange Select Comprehensive | 2                      | 3                        | Greater than or equal to $10 copay or %10 coins between preferred and non-preferred brand drug | Targeted  | New Benefit Design Description Notes12 | New Plan Design Notes12 | New UM Option Notes12 | New Formulary Design Notes12 |
 
  Scenario Outline: View Membership/Claim Counts details
    Given User is on Contract Tab
    When verify and expand the Membership/Claim Counts panel
	  	| Panel_Name   |
	  	| <Panel_Name> |
    Then verify Membership/Claim Counts details
      | Customer_Or_Formulary_ID   | Customer_ID   | Vendor_Formulary_ID   | Contractual_Membership_Count   | Membership_Percent_Threshold   | Contractual_Claim_Count   | Claim_Percent_Threshold   |
      | <Customer_Or_Formulary_ID> | <Customer_ID> | <Vendor_Formulary_ID> | <Contractual_Membership_Count> | <Membership_Percent_Threshold> | <Contractual_Claim_Count> | <Claim_Percent_Threshold> |       
    Examples: 
      | Panel_Name              | Customer_Or_Formulary_ID | Customer_ID | Vendor_Formulary_ID | Contractual_Membership_Count | Membership_Percent_Threshold | Contractual_Claim_Count | Claim_Percent_Threshold |
      | Membership/Claim Counts | Vendor Formulary ID      |             | 1007                | 1                            | 1                            |                         |                         |          
 
  Scenario Outline: View Reporting details
    Given User is on Contract Tab
    When verify and expand the Reporting panel
	  	| Panel_Name   |
	  	| <Panel_Name> |
    Then verify Reporting details
      | Package   | Level   | Start_Date   | End_Date   | Package_Notes   | Level_Notes   |
      | <Package> | <Level> | <Start_Date> | <End_Date> | <Package_Notes> | <Level_Notes> |       
    Examples: 
      | Panel_Name | Package  | Level | Start_Date | End_Date | Package_Notes       | Level_Notes       |
      | Reporting  | Standard | LOB   |            |          | New Package Notes12 | New Level Notes12 |
 
  Scenario Outline: View Vendor formulary ID details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Vendor formulary ID details
      | Vendor_Formulary_ID_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Vendor_Formulary_ID   |
      | <Vendor_Formulary_ID_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Vendor_Formulary_ID> |    
    Examples: 
      | Panel_Name          | Vendor_Formulary_ID_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Vendor_Formulary_ID |
      | Assignment Criteria | Customer               | 888      |               |           |        |             | 1007                         |
  
  Scenario Outline: View Line of business details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Line of business details
      | Line_Of_Business_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Line_Of_Business   |
      | <Line_Of_Business_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Line_Of_Business> |    
    Examples: 
      | Panel_Name          | Line_Of_Business_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Line_Of_Business     |
      | Assignment Criteria | Customer            | 888      |               |           |        |             | Exchange Select Comprehensive |    
      
  Scenario Outline: View Hospice facility details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Hospice facility details
      | Hospice_Facility_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Hospice_Facility   |
      | <Hospice_Facility_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Hospice_Facility> |    
    Examples: 
      | Panel_Name          | Hospice_Facility_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Hospice_Facility |
      | Assignment Criteria | Coverage Code       |          | C11210 C21210 |           |        |             | No                        |
      
  Scenario Outline: View Prior authorization program details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Prior authorization program details
      | Prior_Authorization_Program_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Prior_Authorization_Program   |
      | <Prior_Authorization_Program_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Prior_Authorization_Program> |    
    Examples: 
      | Panel_Name          | Prior_Authorization_Program_By | Customer | Coverage_Code | Drug_List | Client | Client_Name                     | Assigned_Prior_Authorization_Program |
      | Assignment Criteria | Client                         |          |               |           | 1      | AUTOMATION DO NOT USE - CLIENT1 | None                                 |
      
  Scenario Outline: View Step therapy program details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
   	  | Panel_Name   |
      | <Panel_Name> |
    Then verify Step therapy program details
      | Step_Therapy_Program_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Step_Therapy_Program   |
      | <Step_Therapy_Program_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Step_Therapy_Program> |    
    Examples: 
      | Panel_Name          | Step_Therapy_Program_By | Customer | Coverage_Code | Drug_List | Client | Client_Name                     | Assigned_Step_Therapy_Program |
      | Assignment Criteria | Client                  |          |               |           | 1      | AUTOMATION DO NOT USE - CLIENT1 | None                          |
      
  Scenario Outline: View Focused UM bundle-diabetes details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
   	  | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-diabetes details
      | Focused_UM_Bundle_Diabetes_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Diabetes   |
      | <Focused_UM_Bundle_Diabetes_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Diabetes> |    
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Diabetes_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Diabetes |
      | Assignment Criteria | Coverage Code                 |          | C11210 C21210 |           |        |             | N - Non-Standard UM                 |
      
  Scenario Outline: View Focused UM bundle-respiratory details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-respiratory details
      | Focused_UM_Bundle_Respiratory_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Respiratory   |
      | <Focused_UM_Bundle_Respiratory_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Respiratory> |    
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Respiratory_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Respiratory |
      | Assignment Criteria | Coverage Code                    |          | C11210 C21210 |           |        |             | N - Non-Standard UM                    |
      
  Scenario Outline: View Focused UM bundle-specialty details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-specialty details
      | Focused_UM_Bundle_Specialty   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Specialty   |
      | <Focused_UM_Bundle_Specialty> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Specialty> |    
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Specialty | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Specialty |
      | Assignment Criteria | Coverage Code               |          | C11210 C21210 |           |        |             | N - Non-Standard UM                  |
      
  Scenario Outline: View Focused UM bundle-miscellaneous details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-miscellaneous details
      | Focused_UM_Bundle_Miscellaneous_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Miscellaneous   |
      | <Focused_UM_Bundle_Miscellaneous_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Miscellaneous> |    
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Miscellaneous_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Miscellaneous |
      | Assignment Criteria | Coverage Code                      |          | C11210 C21210 |           |        |             | N - Non-Standard UM                      |
      
  Scenario Outline: View TNF/RA UM details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify TNF/RA UM details
      | TNF_RA_UM_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_TNF_RA_UM   |
      | <TNF_RA_UM_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_TNF_RA_UM> |    
    Examples: 
      | Panel_Name          | TNF_RA_UM_By  | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_TNF_RA_UM   |
      | Assignment Criteria | Coverage Code |          | C11210 C21210 |           |        |             | N - Criteria Not Met |
      
  Scenario Outline: View HCV Harvoni UM with ST details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Harvoni UM with ST details
      | HCV_Harvoni_UM_With_ST   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Harvoni_UM_With_ST   |
      | <HCV_Harvoni_UM_With_ST> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Harvoni_UM_With_ST> |    
    Examples: 
      | Panel_Name          | HCV_Harvoni_UM_With_ST | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_HCV_Harvoni_UM_With_ST                         |
      | Assignment Criteria | Drug List              |          |               | FLID02046 |        |             | B – Preferred, 1 of 2 or less with fibrosis restriction |
      
  Scenario Outline: View HCV Solvaldi UM without ST details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Solvaldi UM without ST details
      | HCV_Solvaldi_UM_Without_ST   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Solvaldi_UM_Without_ST   |
      | <HCV_Solvaldi_UM_Without_ST> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Solvaldi_UM_Without_ST> |    
    Examples: 
      | Panel_Name          | HCV_Solvaldi_UM_Without_ST | Customer | Coverage_Code | Drug_List | Client | Client_Name                     | Assigned_HCV_Solvaldi_UM_Without_ST |
      | Assignment Criteria | Client                     |          |               |           | 1      | AUTOMATION DO NOT USE - CLIENT1 | C – Not Preferred Parity            |
      
  Scenario Outline: View HCV Mavyret tiering details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Mavyret tiering details
      | HCV_Mavyret_Tiering_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Mavyret_Tiering   |
      | <HCV_Mavyret_Tiering_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Mavyret_Tiering> |    
    Examples: 
      | Panel_Name          | HCV_Mavyret_Tiering_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_HCV_Mavyret_Tiering |
      | Assignment Criteria | Drug List              |          |               | FLID02046 |        |             | D - Disadvantaged            |
      
  Scenario Outline: View HCV Epclusa UM details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Epclusa UM details
      | HCV_Epclusa_UM_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Epclusa_UM   |
      | <HCV_Epclusa_UM_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Epclusa_UM> |    
    Examples:    
      | Panel_Name          | HCV_Epclusa_UM_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_HCV_Epclusa_UM                                 |
      | Assignment Criteria | Coverage Code     |          | C11210 C21210 |           |        |             | B – Disadvantaged or Fibrosis Restriction or ST Harvoni |
      
  Scenario Outline: View Tier description assignment details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Tier description assignment details
      | Tier_Description_By   | Customer   | Drug_List   | Tier   | Description   |
      | <Tier_Description_By> | <Customer> | <Drug_List> | <Tier> | <Description> |  
    Examples: 
      | Panel_Name          | Tier_Description_By | Customer | Drug_List | Tier   | Description |
      | Assignment Criteria | Drug List           |          | FLID02046 | Tier 2 | Excluded    |
      
  Scenario Outline: View Guarantee code assignment details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Guarantee code assignment details
      | View_Guarantee_Code_By   | Customer   | Client   | Drug_List   | Guarantee_Code   |
      | <View_Guarantee_Code_By> | <Customer> | <Client> | <Drug_List> | <Guarantee_Code> |  
    Examples: 
      | Panel_Name          | View_Guarantee_Code_By | Customer | Client | Drug_List | Guarantee_Code |
      | Assignment Criteria | Drug List              |          |        | FLID02046 | 1234           |      
      
  Scenario Outline: View Excluded claims details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Excluded claims details
      | Exclude_Claims_By   | Client   | Coverage_Code1   | Coverage_Code2   | Group   |
      | <Exclude_Claims_By> | <Client> | <Coverage_Code1> | <Coverage_Code2> | <Group> | 
    Examples: 
      | Panel_Name          | Exclude_Claims_By | Client | Coverage_Code1 | Coverage_Code2 | Group |
      | Assignment Criteria | Client		        | 1      |                |                |       |
     
  Scenario Outline: View Authorized Brand Alternatives details
    Given User is on Contract Tab
    When verify and expand the Authorized Brand Alternatives panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Authorized Brand Alternatives details
      | Vendor_Formulary_ID   | ABA_NDC   | ABA_Description   | Start_Date   | End_Date   |
      | <Vendor_Formulary_ID> | <ABA_NDC> | <ABA_Description> | <Start_Date> | <End_Date> |    
    Examples: 
      | Panel_Name                    | Vendor_Formulary_ID | ABA_NDC     | ABA_Description               | Start_Date | End_Date   |
      | Authorized Brand Alternatives | 1007                | 00002773701 | INSULIN LISPRO 100 UNIT/ML VL | 2019-04-30 | 9999-12-31 |
 
 Scenario Outline: Search and Update Contract Information details
  	Given User navigates to Customer Contracts page
  	When search for existing contract with following details
      | Search_By   | Search_By_Customer_ID   | Search_By_Contract_ID   | Search_By_Contract_Name   |
      | <Search_By> | <Search_By_Customer_ID> | <Search_By_Contract_ID> | <Search_By_Contract_Name> |
    Then Contract tab should be displayed
    And update the following Vendor details in Contract Information screen     
      | Vendor_Contract_Type   | Vendor_Claim_Basis   | Vendor_Day_Supply   | Client_Type   | Contract_Name   | Reclassification_Drug_Vendor   | Contract_Type   | Claim_Basis   | Vendor_Start_Date   | Vendor_End_Date   | Cosmetic_Drugs   | Compound_Drugs   | Multisource_Brand_Drugs   | Vaccines   | Over_The_Counter_Drugs   | Except_Insulins   | Except_Diabetic_Supplies_And_Test_Strips   | Reclassify_specialty_claims_to_retail   | Reclassify_day_supply_break_at_34   | Reclassify_brand_claims_to_generic    | Monthly_Penalty   | Minimum_Claims_To_Avoid_Penalty   | Penalty_Start_Date   | Penalty_End_Date   |
      | <Vendor_Contract_Type> | <Vendor_Claim_Basis> | <Vendor_Day_Supply> | <Client_Type> | <Contract_Name> | <Reclassification_Drug_Vendor> | <Contract_Type> | <Claim_Basis> | <Vendor_Start_Date> | <Vendor_End_Date> | <Cosmetic_Drugs> | <Compound_Drugs> | <Multisource_Brand_Drugs> | <Vaccines> | <Over_The_Counter_Drugs> | <Except_Insulins> | <Except_Diabetic_Supplies_And_Test_Strips> | <Reclassify_specialty_claims_to_retail> | <Reclassify_day_supply_break_at_34> | <Reclassify_brand_claims_to_generic>  | <Monthly_Penalty> | <Minimum_Claims_To_Avoid_Penalty> | <Penalty_Start_Date> | <Penalty_End_Date> |
  	And update the following Rate details in Contract Information screen
  	  | Operation | RateDetails_Table_ExistingRecord                                           | Rate_Details_Start_Date | Rate_Details_End_Date | Line_Of_Business      | Transparency      | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share | Customer_Rebate_Share | DST_Revenue | Vendor_Adj_Day_Supply_Option | Customer_Adj_Day_Supply_Option | Notes               |
  	  | Update    | Exchange Select Comprehensive*Partial Transparency*Multiplicative*40*40*20 |        			           | 						           | Exchange Open/Covered | Full Transparency |                |    	 	 		          |   	      |   			         |    				           |    		     | Yes 							            | Yes							               | Update Test Notes12 |
  	  | Remove    | Exchange Open/Covered*Full Transparency*Multiplicative*40*40*20            |						             |                       |                       |                   |                |                     |           |                  |                       |             |                              |                                |                     |
  	  | Add       |        						                                                         |        			           |                       | Exchange Open/Covered | Full Transparency | Multiplicative | 40                  | 40   	 	  |	20			         |   		                 |   			     | Yes  					  	          | Yes 							             | Update Test Notes12 |
 	Examples: 
 	    | Search_By   | Search_By_Customer_ID | Search_By_Contract_ID | Search_By_Contract_Name | Vendor_Contract_Type | Vendor_Claim_Basis | Vendor_Day_Supply      | Client_Type | Contract_Name | Reclassification_Drug_Vendor | Contract_Type   | Claim_Basis | Vendor_Start_Date | Vendor_End_Date | Cosmetic_Drugs | Compound_Drugs | Multisource_Brand_Drugs| Vaccines | Over_The_Counter_Drugs | Except_Insulins | Except_Diabetic_Supplies_And_Test_Strips | Reclassify_specialty_claims_to_retail | Reclassify_day_supply_break_at_34 | Reclassify_brand_claims_to_generic | Monthly_Penalty | Minimum_Claims_To_Avoid_Penalty | Penalty_Start_Date | Penalty_End_Date | 
  	  | Customer ID | 0888	  	 		        | 					            |	 				                | Fixed Guarantee      | All Claims         | Day Supply Break at 84 | 			       |	             | FDB      				            | Fixed Guarantee | All Claims  |	             	    |          		    |                |                | check                  | check    | check                  |                 | check                                    | check                                 |                                   | uncheck                            |                 |     	  	 				               |    	 	 		        |         		     |  
  
  Scenario Outline: Update Guarantee Screen Details
  	Given User is on Contract Tab
  	When verify and expand the Guarantee panel
  	  | Panel_Name   |
  	  | <Panel_Name> |
  	Then update the following details in Guarantee panel 
  	  | Operation | Guarantee_Existing_Record_Details                                             | Start_Date | EndDate | Vendor_Formulary_ID | Vendor_Formulary_Type | DSTFor_mulary_Type | Tier_Type | Channel   | Line_Of_Business      | Vendor_Brand_Guarantee | Customer_Brand_Guarantee | Benefit_Design                              | UM_Option         | Benefit_Design_Description_Notes          | Plan_Design_Notes          | UM_Option_Notes           | Formulary_Design_Notes          |
  	  | Update    | 1007*Select Focused*Managed 200*1*Mail 90*Exchange Select Comprehensive*2*3   |	           |      	 |				             | Standard Exchange     | Managed 300        | 2		      | Retail    | Exchange Open/Covered |	3				               | 4					              | Less than $10 copay or %10 coins difference | Custom + Targeted | Update Benefit Design Description Notes12 | Update Plan Design Notes12 | Update UM Options Notes12 | Update Formulary Design Notes12 |
      | Remove    | 1007*Standard Exchange*Managed 300*2*Retail 90*Exchange Open/Covered*3*4      |            |         |                     |                       |                    |           |           |                       |                        |                          |                                             |                   |                                           |                            |                           |                                 |
      | Add       |					                                                                      |            |         | 1007                | Standard Exchange     | Managed 300        | 2		      | Retail 90 | Exchange Open/Covered |	3				               | 4					              | Less than $10 copay or %10 coins difference | Custom + Targeted | Update Benefit Design Description Notes12 | Update Plan Design Notes12 | Update UM Options Notes12 | Update Formulary Design Notes12 |
    Examples: 
      | Panel_Name | 
      | Guarantee  | 
	  
  Scenario Outline: Update Membership Claim Counts Screen Details
  	Given User is on Contract Tab
  	When verify and expand the Membership/Claim Counts panel
  	  | Panel_Name   |
  	  | <Panel_Name> |   	
  	Then update the following details in Membership/Claim Counts panel 
  	  | Operation | MembershipClaimCounts_Existing_Record_Details | Establish_Contractual_Membership | Customer_Or_Formulary_ID | Contractual_Membership_Count | Membership_Percent_Threshold | Contractual_Claim_Count | Claim_Percent_Threshold |
      | Update    | 1007*1*1                                      |                                  |                          | 11                           | 16                           |                         |                         |
      | Remove    | 1007*11*16                                    |                                  |                          |                              |                              |                         |                         |    
      | Add       |                                               | Vendor Formulary ID              | 1007                     | 11                           | 16                           |                         |                         |  	
  	Examples: 
  	  | Panel_Name              | 
      | Membership/Claim Counts | 
      
  Scenario Outline: Update Reporting Screen Details
  	Given User is on Contract Tab  	  	
  	When verify and expand the Reporting panel
  	  | Panel_Name   |
  	  | <Panel_Name> |
  	Then update the following details in Reporting panel
  	  | Operation | Reporting_Existing_Record_Details | Package  | Level   | Start_Date | End_Date | Package_Notes          | Level_Notes          |
  	  | Update    | Standard*LOB                      | Standard | Account |            |          | Update Package Notes12 | Update Level Notes12 | 
      | Remove    | Standard*Account                  |          |         |            |          |                        |                      |
      | Add       |                                   | Standard | Account |            |          | Update Package Notes12 | Update Level Notes12 |  	
  	Examples: 
  	  | Panel_Name | 
      | Reporting  | 
      
  Scenario Outline: Update Vendor Formulary ID Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Vendor Formulary ID Assignment details   	
  	  | Operation | Selected_Assignment_Details | Assign_Vendor_Formulary_ID_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Vendor_Formulary_ID |
      | Update    | 888*1007                    |                               |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | 1007                         |
  	  | Remove    | 888*1007                    |                               |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                              |
  	  | Add       |                             | Customer                      |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | 1007                         |
  	Examples: 
  	  | Panel_Name          |
	  	| Assignment Criteria |  		                 
  
  Scenario Outline: Update the Line of Business Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |											     	
  	Then update the following Line of Business Assignment details
  	  | Operation | Selected_Assignment_Details        | Assign_Line_Of_Business_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Line_Of_Business |
  	  | Update    | 888*Exchange Select Comprehensive  |                            |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Exchange Open/Covered     |
  	  | Remove    | 888*Exchange Open/Covered          |                            |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                           |       
  	  | Add       |                                    | Customer                   |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Exchange Open/Covered     | 
  	Examples: 
  	  | Panel_Name          |
	  	| Assignment Criteria |
  
  
  Scenario Outline: Update the Hospice Facility Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Hospice Facility Assignment details
  	  | Operation | Selected_Assignment_Details | Assign_Hospice_Facility_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Hospice_Facility |
  	  | Update    | C11210 C21210*No            |                            |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Yes                       |
      | Remove    | C11210 C21210*Yes           |                            |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                           |
  	  | Add       |                             | Coverage Code              | C11311         | C21311         |                           |                      | C11311*C21311            |              |                |                |                  |                      |               |             |                   |                 |                   | Yes                       |   	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  
  Scenario Outline: Update the Prior Authorization Program Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Prior Authorization Program Assignment details
  	  | Operation | Selected_Assignment_Details | Assign_Prior_Authorization_Program_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Prior_Authorization_Program |
  	  | Update    | 1                           |                                       |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Standard PA                          |
  	  | Remove    | 1                           |                                       |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                      |
  	  | Add       |                             | Client                                |                |                |                           |                      |                          |              |                |                |                  |                      | 2             |             |                   |                 | 2                 | Standard PA                          |
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  
  Scenario Outline: Update the Step Therapy Program Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Step Therapy Program Assignment details
  	  | Operation | Selected_Assignment_Details | Assign_Step_Therapy_Program_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Step_Therapy_Program |
  	  | Update    | 1                           |                                |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Standard ST                   |
  	  | Remove    | 1                           |                                |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                               |
  	  | Add       |                             | Client                         |                |                |                           |                      |                          |              |                |                |                  |                      | 2             |             |                   |                 | 2                 | Standard ST                   |   	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  
  Scenario Outline: Update the Focused UM Bundle-Diabetes Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Focused UM Bundle-Diabetes Assignment details
  	  | Operation | Selected_Assignment_Details       | Assign_Focused_UM_Bundle_Diabetes_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Diabetes |
  	  | Update    | C11210 C21210*N - Non-Standard UM |                                      |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                     |
			| Remove    | C11210 C21210*Y - Standard UM     |                                      |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                     |
			| Add       |                                   | Coverage Code                        | C11311         | C21311         |                           |                      | C11311*C21311            |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                     |   	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
 
  Scenario Outline: Update Focused UM Bundle-Respiratory Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Focused UM Bundle-Respiratory Assignment details
  	  | Operation | Selected_Assignment_Details       | Assign_Focused_UM_Bundle_Respiratory_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Respiratory |
  	  | Update    | C11210 C21210*N - Non-Standard UM |                                         |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                        |
	    | Remove    | C11210 C21210*Y - Standard UM     |                                         |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                        |
	    | Add       |                                   | Coverage Code                           | C11311         | C21311         |                           |                      | C11311*C21311            |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                        |  
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  
  Scenario Outline: Update Focused UM Bundle-Specialty Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Focused UM Bundle-Specialty Assignment details
  	  | Operation | Selected_Assignment_Details       | Assign_Focused_UM_Bundle_Specialty_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Specialty |
  	  | Update    | C11210 C21210*N - Non-Standard UM |                                       |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                      |
	    | Remove    | C11210 C21210*Y - Standard UM     |                                       |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                      |
	    | Add       |                                   | Coverage Code                         | C11311         | C21311         |                           |                      | C11311*C21311            |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                      |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  		
  Scenario Outline: Update Focused UM Bundle-Miscellaneous Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Focused UM Bundle-Miscellaneous Assignment details
  	  | Operation | Selected_Assignment_Details       | Assign_Focused_UM_Bundle_Miscellaneous_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_Focused_UM_Bundle_Miscellaneous |
  	  | Update    | C11210 C21210*N - Non-Standard UM |                                           |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                          |
	    | Remove    | C11210 C21210*Y - Standard UM     |                                           |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                          |
	    | Add       |                                   | Coverage Code                             | C11311         | C21311         |                           |                      | C11311*C21311            |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Standard UM                          |  	  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
    
  Scenario Outline: Update TNF/RA UM Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following TNF/RA UM Assignment details
  	  | Operation | Selected_Assignment_Details        | Assign_TNF_RA_UM_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_TNF_RA_UM |
  	  | Update    | C11210 C21210*N - Criteria Not Met |                     |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Criteria Met   |
	    | Remove    | C11210 C21210*Y - Criteria Met     |                     |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                    |
	    | Add       |                                    | Coverage Code       | C11311         | C21311         |                           |                      | C11311*C21311            |              |                |                |                  |                      |               |             |                   |                 |                   | Y - Criteria Met   |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  		
  Scenario Outline: Update HCV Harvoni UM with ST Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following HCV Harvoni UM with ST Assignment details
  	  | Operation | Selected_Assignment_Details                                          | Assign_HCV_Harvoni_UM_With_ST_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Harvoni_UM_With_ST                            |
  	  | Update    | FLID02046*B – Preferred, 1 of 2 or less with fibrosis restriction    |                                  |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | C - Preferred, 1 of 3 or more without fibrosis restriction |
  	  | Remove    | FLID02046*C - Preferred, 1 of 3 or more without fibrosis restriction |                                  |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                                            |
  	  | Add       |                                                                      | Drug List                        |                |                |                           |                      |                          | FLID25305    |                |                |                  | FLID25305            |               |             |                   |                 |                   | C - Preferred, 1 of 3 or more without fibrosis restriction |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
 
  Scenario Outline: Update HCV Solvaldi UM without ST Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following HCV Solvaldi UM without ST Assignment details
  	  | Operation | Selected_Assignment_Details | Assign_HCV_Solvaldi_UM_Without_ST_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Solvaldi_UM_Without_ST |
  	  | Update    | 1                           |                                      |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | A – No Fibrosis Restriction         |
  	  | Remove    | 1                           |                                      |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                     |
  	  | Add       |                             | Client                               |                |                |                           |                      |                          |              |                |                |                  |                      | 2             |             |                   |                 | 2                 | A – No Fibrosis Restriction         |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  	
  Scenario Outline: Update HCV Mavyret Tiering Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following HCV Mavyret Tiering Assignment details
  	  | Operation | Selected_Assignment_Details                             | Assign_HCV_Mavyret_Tiering_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Mavyret_Tiering                  |
  	  | Update    | FLID02046*D - Disadvantaged                             |                               |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | A – Not Disadvantaged/No Fibrosis Restriction |
  	  | Remove    | FLID02046*A – Not Disadvantaged/No Fibrosis Restriction |                               |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                               |
  	  | Add       |                                                         | Drug List                     |                |                |                           |                      |                          | FLID25305    |                |                |                  | FLID25305            |               |             |                   |                 |                   | A – Not Disadvantaged/No Fibrosis Restriction |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  
  Scenario Outline: Update HCV Epclusa UM Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following HCV Epclusa UM Assignment details
  	  | Operation | Selected_Assignment_Details                                                    | Assign_HCV_Epclusa_UM_By | Coverage_Code1 | Coverage_Code2 | Coverage_Code_Description | Coverage_Code_Status | Available_Coverage_Codes | Drug_List_ID | Drug_List_Name | Drug_List_Type | Drug_List_Status | Available_Drug_Lists | Client_Number | Client_Name | Client_Start_Date | Client_End_Date | Available_Clients | Assigned_HCV_Epclusa_UM                                          |
  	  | Update    | C11210 C21210*B – Disadvantaged or Fibrosis Restriction or ST Harvoni          |                          |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   | A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction |
  	  | Remove    | C11210 C21210*A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction |                          |                |                |                           |                      |                          |              |                |                |                  |                      |               |             |                   |                 |                   |                                                                  |
  	  | Add       |                                                                                | Coverage Code            | C11311         | C21311         |                           |                      | C11311*C21311            |              |                |                |                  |                      |               |             |                   |                 |                   | A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |								                  		
  		
  Scenario Outline: Update Tier Description Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Tier Description Assignment details
  	  | Operation | Tier_Description_Assignment_Details | Assign_Tier_Description_By | Customer | Drug_List | Tier   | Description   |
      | Update    | FLID02046*Tier 2*Excluded           |                            |          | FLID25305 | Tier 3 | $0 Cost Share |
      | Remove    | FLID25305*Tier 3*$0 Cost Share      |                            |          |           |        |               |
      | Add       |                                     | Drug List                  |          | FLID25305 | Tier 3 | $0 Cost Share |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
 			
  Scenario Outline: Update Guarantee Code Assignment Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following Guarantee Code Assignment details
  	  | Operation | Guarantee_Code_Assignment_Details | Assign_Guarantee_Code_By | Customer | Client | Drug_List | Guarantee_Code |
      | Update    | FLID02046*1234                    |                          |          |        | FLID25305 | 2345           |
      | Remove    | FLID25305*2345                    |                          |          |        |           |                |
  	  | Add       |                                   | Drug List                |          |        | FLID25305 | 2345           |  	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |  		
  	
  Scenario Outline: Update Selected Claims to Exclude Details
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
  	  | <Panel_Name> |
  	Then update the following Selected Claims to Exclude details
  	  | Operation | Selected_Claims_To_Exclude | Exclude_Claims_By | Client | Coverage_Code1 | Coverage_Code2 | Group |
      | Update    | 1                          |                   | 2      |                |                |       |
      | Remove    | 2                          |                   |        |                |                |       |
      | Add       |                            | Client            | 2      |                |                |       |   	
  	Examples: 
  	  | Panel_Name          |
	    | Assignment Criteria |
				
  Scenario Outline: Update Authorized Brand Alternatives
  	Given User is on Contract Tab
  	When verify and expand the Assignment Criteria panel
  	  | Panel_Name   |
      | <Panel_Name> |
  	Then update the following details in Authorized Brand Alternatives screen		 
  	  | Operation | Vendor_Formulary_ID | Authorized_Brand_Alternatives                                          |
      | Remove    |       			        | 1007*00002773701*INSULIN LISPRO 100 UNIT/ML VL*2019-04-30*9999-12-31   |
  	  | Add       | 1007                | 00002775201*INSULIN LISPRO JR 100 UNIT/ML*2020-04-08*9999-12-31        |															
	Examples:
  	  | Panel_Name                    |
  	  | Authorized Brand Alternatives |
  
  
  Scenario: Navigate to Claim File Summary Tab
  	Given User is on Contract Tab
    When click on Claim File Summary Tab
    Then Claim File Summary Tab should be displayed
    
  Scenario Outline: Run the prelim process and verify the results in Claim File Summary Tab
  	Given User is in Claim File Summary Tab
    When verify and expand the Claim File Summary Pannel
    	| Panel_Name   |
    	| <Panel_Name> |      
    Then perform the Run Preliminary Extract process and verify the complete status
    And verify the Claim File Summary Preliminary extraction results
    	| Primary_Results_As_Of   | Total_number_of_claims_included_on_the_file   | Claims_missing_vendor_formulary_ID   | Claims_missing_line_of_business   | Claims_with_vendor_formulary_ID   | Claims_with_line_of_business   | 
    	| <Primary_Results_As_Of> | <Total_number_of_claims_included_on_the_file> | <Claims_missing_vendor_formulary_ID> | <Claims_missing_line_of_business> | <Claims_with_vendor_formulary_ID> | <Claims_with_line_of_business> |
    Examples: 
      | Panel_Name                   | Primary_Results_As_Of                             | Total_number_of_claims_included_on_the_file    | Claims_missing_vendor_formulary_ID    | Claims_missing_line_of_business    | Claims_with_vendor_formulary_ID    | Claims_with_line_of_business    |
      | Preliminary Claim Extraction | Preliminary results as of^05/17/2021 - 06/16/2021 | Total number of claims included on the file:^1 | Claims missing vendor formulary ID:^0 | Claims missing line of business:^0 | Claims with vendor formulary ID:^0 | Claims with line of business:^0 |	  
  
  Scenario: Navigate to Benefit File Summary Tab
		Given User is on Contract Tab
		When click on Benefit File Summary Tab
		Then Benefit File Summary Tab should be displayed
		
	Scenario Outline:  verify the prelim results in Benefit File Summary Tab
		Given User is in Benefit File Summary Tab
		When verify and expand the Benefit File Summary Tab
			| Panel_Name  |
			|<Panel_Name> |
		Then select the required Line Of Business
			| Line_Of_Business   |
			| <Line_Of_Business> |
		And perform the Benefit Run Preliminary Extract process and verify the complete status
		And verify the Benefit File Summary Prelim Results
			| Prelim_Results_As_of   | Prelim_Results_Process_Date   | Prelim_Results_Vendor_Formulary_ID   | Prelim_Results_Line_Of_Business   | Prelim_Results_Tier_Selection   | Prelim_Results_Hospice_Facility   | Prelim_Results_Prior_Authorization_Program   | Prelim_Results_Step_Therapy_Program   | Prelim_Results_UM_Bundle_Diabetes   | Prelim_Results_UM_Bundle_Respiratory   | Prelim_Results_UM_Bundle_Specialty   | Prelim_Results_UM_Bundle_Miscellaneous   | Prelim_Results_TNFRA_UM   | Prelim_Results_HCV_Harvoni_UM_with_ST   | Prelim_Results_HCV_Solvaldi_UM_without_ST   | Prelim_Results_HCV_Mavyret_Tiering   | Prelim_Results_HCV_Epclusa_UM   | 
			| <Prelim_Results_As_of> | <Prelim_Results_Process_Date> | <Prelim_Results_Vendor_Formulary_ID> | <Prelim_Results_Line_Of_Business> | <Prelim_Results_Tier_Selection> | <Prelim_Results_Hospice_Facility> | <Prelim_Results_Prior_Authorization_Program> | <Prelim_Results_Step_Therapy_Program> | <Prelim_Results_UM_Bundle_Diabetes> | <Prelim_Results_UM_Bundle_Respiratory> | <Prelim_Results_UM_Bundle_Specialty> | <Prelim_Results_UM_Bundle_Miscellaneous> | <Prelim_Results_TNFRA_UM> | <Prelim_Results_HCV_Harvoni_UM_with_ST> | <Prelim_Results_HCV_Solvaldi_UM_without_ST> | <Prelim_Results_HCV_Mavyret_Tiering> | <Prelim_Results_HCV_Epclusa_UM> | 		 
		Examples: 
		  | Panel_Name               | Line_Of_Business | Prelim_Results_As_of                               | Prelim_Results_Process_Date | Prelim_Results_Vendor_Formulary_ID  | Prelim_Results_Line_Of_Business  | Prelim_Results_Tier_Selection  | Prelim_Results_Hospice_Facility  | Prelim_Results_Prior_Authorization_Program  | Prelim_Results_Step_Therapy_Program  | Prelim_Results_UM_Bundle_Diabetes  | Prelim_Results_UM_Bundle_Respiratory  | Prelim_Results_UM_Bundle_Specialty  | Prelim_Results_UM_Bundle_Miscellaneous  | Prelim_Results_TNFRA_UM   | Prelim_Results_HCV_Harvoni_UM_with_ST  | Prelim_Results_HCV_Solvaldi_UM_without_ST  | Prelim_Results_HCV_Mavyret_Tiering  | Prelim_Results_HCV_Epclusa_UM   | #Final_Results_As_of                          | Final_Results_Process_Date | Final_Results_Vendor_Formulary_ID   | Final_Results_Line_Of_Business   | Final_Results_Tier_Selection   | Final_Results_Hospice_Facility   | Final_Results_Prior_Authorization_Program   | Final_Results_Step_Therapy_Program   | Final_Results_UM_Bundle_Diabetes   | Final_Results_UM_Bundle_Respiratory   | Final_Results_UM_Bundle_Specialty   | Final_Results_UM_Bundle_Miscellaneous   | Final_Results_TNFRA_UM    | Final_Results_HCV_Harvoni_UM_with_ST   | Final_Results_HCV_Solvaldi_UM_without_ST   | Final_Results_HCV_Mavyret_Tiering   | Final_Results_HCV_Epclusa_UM   |
		  | Preliminary Benefit File | Non-Part D       | Preliminary results as of:^05/01/2021 - 05/31/2021 | Process date:^05/05/2021    | CAGs missing vendor formulary ID:^0 | CAGs missing line of business:^0 | CAGs missing tier selection:^0 | CAGs missing hospice facility:^0 | CAGs missing prior authorization program:^0 | CAGs missing step therapy program:^0 | CAGs missing UM bundle-diabetes:^0 | CAGs missing UM bundle-respiratory:^0 | CAGs missing UM bundle-specialty:^0 | CAGs missing UM bundle-miscellaneous:^0 | CAGs missing TNF/RA UM:^0 | CAGs missing HCV Harvoni UM with ST:^0 | CAGs missing HCV Solvaldi UM without ST:^0 | CAGs missing HCV Mavyret tiering:^0 | CAGs missing HCV Epclusa UM:^0  | #Final results as of:^03/01/2021 - 03/31/2021 | Process date:^04/06/2021   | CAGs missing vendor formulary ID:^0 | CAGs missing line of business:^0 | CAGs missing tier selection:^0 | CAGs missing hospice facility:^0 | CAGs missing prior authorization program:^0 | CAGs missing step therapy program:^0 | CAGs missing UM bundle-diabetes:^0 | CAGs missing UM bundle-respiratory:^0 | CAGs missing UM bundle-specialty:^0 | CAGs missing UM bundle-miscellaneous:^0 | CAGs missing TNF/RA UM:^0 | CAGs missing HCV Harvoni UM with ST:^0 | CAGs missing HCV Solvaldi UM without ST:^0 | CAGs missing HCV Mavyret tiering:^0 | CAGs missing HCV Epclusa UM:^0 | 
  
  Scenario Outline: Search and View After Updating the Contract Information details
    Given User navigates to Customer Contracts page
    When search for existing contract with following details
      | Search_By   | Search_By_Customer_ID   | Search_By_Contract_ID   | Search_By_Contract_Name   |
      | <Search_By> | <Search_By_Customer_ID> | <Search_By_Contract_ID> | <Search_By_Contract_Name> |
    Then Contract tab should be displayed
    And verify Vendor details in Contract Information screen
      | Vendor   | Vendor_Contract_Type   | Vendor_Claim_Basis   | Vendor_Day_Supply   | Client_Type   | Master_Customer_Set   | Customer_ID   | Contract_Name   | Reclassification_Drug_Vendor   | Contract_ID   | Internal_Or_External   |   Contract_Line_Of_Business | Contract_Type   | Claim_Basis   | Vendor_Start_Date   | Vendor_End_Date   | Reclassify_Claims   | Reclassify_Only   | Monthly_Penalty   | Minimum_Penalty_Claims   | Penalty_Start_Date   | Penalty_End_Date   |
      | <Vendor> | <Vendor_Contract_Type> | <Vendor_Claim_Basis> | <Vendor_Day_Supply> | <Client_Type> | <Master_Customer_Set> | <Customer_ID> | <Contract_Name> | <Reclassification_Drug_Vendor> | <Contract_ID> | <Internal_Or_External> | <Contract_Line_Of_Business> | <Contract_Type> | <Claim_Basis> | <Vendor_Start_Date> | <Vendor_End_Date> | <Reclassify_Claims> | <Reclassify_Only> | <Monthly_Penalty> | <Minimum_Penalty_Claims> | <Penalty_Start_Date> | <Penalty_End_Date> |
    And verify Rate details in Contract Information screen
      | Rate_Details_Start_Date | Rate_Details_End_Date | Line_Of_Business      | Transparency      | Fee_Method     | Vendor_Rebate_Share | Admin_Fee | DST_Rebate_Share | Customer_Rebate_Share | DST_Revenue | Vendor_Adj_Day_Supply_Option | Customer_Adj_Day_Supply_Option | Notes               |
      |                         |                       | Exchange Open/Covered | Full Transparency | Multiplicative | 40                  | 40        | 20               | 40                    | 60          | Yes                          | Yes                            | Update Test Notes12 |   
    Examples: 
      | Search_By   | Search_By_Customer_ID | Search_By_Contract_ID | Search_By_Contract_Name | Vendor | Vendor_Contract_Type | Vendor_Claim_Basis | Vendor_Day_Supply      | Client_Type     | Master_Customer_Set | Customer_ID | Contract_Name | Reclassification_Drug_Vendor | Contract_ID | Internal_Or_External | Contract_Line_Of_Business | Contract_Type   | Claim_Basis | Vendor_Start_Date | Vendor_End_Date | Reclassify_Claims                | Reclassify_Only                       | Monthly_Penalty | Minimum_Penalty_Claims | Penalty_Start_Date | Penalty_End_Date | 
      | Customer ID | 0888                  |                       |                         | Optum  | Fixed Guarantee      | All Claims         | Day Supply Break at 84 | 1 - Health Plan | Qtp_Master_1        | 888         |               | FDB                          |             | Both                 | Non-Part D                | Fixed Guarantee | All Claims  |                   |                 | Multisource brand drugs*Vaccines | Reclassify specialty claims to retail | $1.00           | 10                     |                    |                  | 
          
  Scenario Outline: View Guarantee details
    Given User is on Contract Tab
    When verify and expand the Guarantee panel
	    | Panel_Name   |
	  	| <Panel_Name> |
    Then verify Guarantee details
      | Start_Date   | End_Date   | Vendor_Formulary_ID   | Vendor_Formulary_Type   | DST_Formulary_Type   | Tier_Type   | Channel   | Line_Of_Business   | Vendor_Brand_Guarantee   | Customer_Brand_Guarantee   | Benefit_Design   | UM_Option   | Benefit_Design_Desc_Notes   | Plan_Design_Notes   | UM_Option_Notes   | Formulary_Design_Notes   |
      | <Start_Date> | <End_Date> | <Vendor_Formulary_ID> | <Vendor_Formulary_Type> | <DST_Formulary_Type> | <Tier_Type> | <Channel> | <Line_Of_Business> | <Vendor_Brand_Guarantee> | <Customer_Brand_Guarantee> | <Benefit_Design> | <UM_Option> | <Benefit_Design_Desc_Notes> | <Plan_Design_Notes> | <UM_Option_Notes> | <Formulary_Design_Notes> |       
    Examples: 
      | Panel_Name | Start_Date | End_Date | Vendor_Formulary_ID | Vendor_Formulary_Type | DST_Formulary_Type | Tier_Type | Channel | Line_Of_Business      | Vendor_Brand_Guarantee | Customer_Brand_Guarantee | Benefit_Design                              | UM_Option         | Benefit_Design_Desc_Notes                 | Plan_Design_Notes          | UM_Option_Notes           | Formulary_Design_Notes          |
      | Guarantee  |            |          | 1007                | Standard Exchange     | Managed 300        | 2         | Retail  | Exchange Open/Covered | 3                      | 4                        | Less than $10 copay or %10 coins difference | Custom + Targeted | Update Benefit Design Description Notes12 | Update Plan Design Notes12 | Update UM Options Notes12 | Update Formulary Design Notes12 |
 
  Scenario Outline: View Membership/Claim Counts details
    Given User is on Contract Tab
    When verify and expand the Membership/Claim Counts panel
	  	| Panel_Name   | 
	  	| <Panel_Name> |
    Then verify Membership/Claim Counts details
      | Customer_Or_Formulary_ID   | Customer_ID   | Vendor_Formulary_ID   | Contractual_Membership_Count   | Membership_Percent_Threshold   | Contractual_Claim_Count   | Claim_Percent_Threshold   |
      | <Customer_Or_Formulary_ID> | <Customer_ID> | <Vendor_Formulary_ID> | <Contractual_Membership_Count> | <Membership_Percent_Threshold> | <Contractual_Claim_Count> | <Claim_Percent_Threshold> |       
    Examples: 
      | Panel_Name              | Customer_Or_Formulary_ID | Customer_ID | Vendor_Formulary_ID | Contractual_Membership_Count | Membership_Percent_Threshold | Contractual_Claim_Count | Claim_Percent_Threshold |
      | Membership/Claim Counts | Vendor Formulary ID      | 1007        |                     | 11                           | 16                           |                         |                         |          
 
  Scenario Outline: View Reporting details
    Given User is on Contract Tab
    When verify and expand the Reporting panel
	  	| Panel_Name   |
	  	| <Panel_Name> |
    Then verify Reporting details
      | Package   | Level   | Start_Date   | End_Date   | Package_Notes   | Level_Notes   |
      | <Package> | <Level> | <Start_Date> | <End_Date> | <Package_Notes> | <Level_Notes> |       
    Examples: 
      | Panel_Name | Package  | Level   | Start_Date | End_Date | Package_Notes          | Level_Notes          |
      | Reporting  | Standard | Account |            |          | Update package Notes12 | Update Level Notes12 |
 
  Scenario Outline: View Vendor formulary ID details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Vendor formulary ID details
      | Vendor_Formulary_ID_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Vendor_Formulary_ID   |
      | <Vendor_Formulary_ID_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Vendor_Formulary_ID> |       
    Examples: 
      | Panel_Name          | Vendor_Formulary_ID_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Vendor_Formulary_ID |
      | Assignment Criteria | Customer               | 888      |               |           |        |             | 1007                         |
      
  Scenario Outline: View Line of business details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Line of business details
      | Line_Of_Business_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Line_Of_Business   |
      | <Line_Of_Business_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Line_Of_Business> |       
    Examples: 
      | Panel_Name          | Line_Of_Business_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Line_Of_Business |
      | Assignment Criteria | Customer            | 888      |               |           |        |             | Exchange Open/Covered     |
      
  Scenario Outline: View Hospice facility details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Hospice facility details
      | Hospice_Facility_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Hospice_Facility   |
      | <Hospice_Facility_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Hospice_Facility> |       
    Examples: 
      | Panel_Name          | Hospice_Facility_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Hospice_Facility |
      | Assignment Criteria | Coverage Code       |          | C11311 C21311 |           |        |             | Yes                       |
      
  Scenario Outline: View Prior authorization program details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Prior authorization program details
      | Prior_Authorization_Program_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Prior_Authorization_Program   |
      | <Prior_Authorization_Program_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Prior_Authorization_Program> |       
    Examples: 
      | Panel_Name          | Prior_Authorization_Program_By | Customer | Coverage_Code | Drug_List | Client | Client_Name                     | Assigned_Prior_Authorization_Program |
      | Assignment Criteria | Client                         |          |               |           | 2      | AUTOMATION DO NOT USE - CLIENT2 | Standard PA                          |
      
  Scenario Outline: View Step therapy program details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
   	  | Panel_Name   |
      | <Panel_Name> |
    Then verify Step therapy program details
      | Step_Therapy_Program_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Step_Therapy_Program   |
      | <Step_Therapy_Program_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Step_Therapy_Program> |       
    Examples: 
      | Panel_Name          | Step_Therapy_Program_By | Customer | Coverage_Code | Drug_List | Client | Client_Name                     | Assigned_Step_Therapy_Program |
      | Assignment Criteria | Client                  |          |               |           | 2      | AUTOMATION DO NOT USE - CLIENT2 | Standard ST                   |
      
  Scenario Outline: View Focused UM bundle-diabetes details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
   	  | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-diabetes details
      | Focused_UM_Bundle_Diabetes_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Diabetes   |
      | <Focused_UM_Bundle_Diabetes_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Diabetes> |       
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Diabetes_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Diabetes |
      | Assignment Criteria | Coverage Code                 |          | C11311 C21311 |           |        |             | Y - Standard UM                     |
      
  Scenario Outline: View Focused UM bundle-respiratory details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-respiratory details
      | Focused_UM_Bundle_Respiratory_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Respiratory   |
      | <Focused_UM_Bundle_Respiratory_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Respiratory> |       
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Respiratory_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Respiratory |
      | Assignment Criteria | Coverage Code                    |          | C11311 C21311 |           |        |             | Y - Standard UM                        |
      
  Scenario Outline: View Focused UM bundle-specialty details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-specialty details
      | Focused_UM_Bundle_Specialty   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Specialty   |
      | <Focused_UM_Bundle_Specialty> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Specialty> |       
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Specialty | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Specialty |
      | Assignment Criteria | Coverage Code               |          | C11311 C21311 |           |        |             | Y - Standard UM                      |
      
  Scenario Outline: View Focused UM bundle-miscellaneous details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Focused UM bundle-miscellaneous details
      | Focused_UM_Bundle_Miscellaneous_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_Focused_UM_Bundle_Miscellaneous   |
      | <Focused_UM_Bundle_Miscellaneous_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_Focused_UM_Bundle_Miscellaneous> |       
    Examples: 
      | Panel_Name          | Focused_UM_Bundle_Miscellaneous_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_Focused_UM_Bundle_Miscellaneous |
      | Assignment Criteria | Coverage Code                      |          | C11311 C21311 |           |        |             | Y - Standard UM                          |
      
  Scenario Outline: View TNF/RA UM details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify TNF/RA UM details
      | TNF_RA_UM_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_TNF_RA_UM   |
      | <TNF_RA_UM_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_TNF_RA_UM> |       
    Examples: 
      | Panel_Name          | TNF_RA_UM_By  | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_TNF_RA_UM |
      | Assignment Criteria | Coverage Code |          | C11311 C21311 |           |        |             | Y - Criteria Met   |
      
  Scenario Outline: View HCV Harvoni UM with ST details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Harvoni UM with ST details
      | HCV_Harvoni_UM_With_ST   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Harvoni_UM_With_ST   |
      | <HCV_Harvoni_UM_With_ST> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Harvoni_UM_With_ST> |       
    Examples: 
      | Panel_Name          | HCV_Harvoni_UM_With_ST | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_HCV_Harvoni_UM_With_ST                            |
      | Assignment Criteria | Drug List              |          |               | FLID25305 |        |             | C - Preferred, 1 of 3 or more without fibrosis restriction |
      
  Scenario Outline: View HCV Solvaldi UM without ST details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Solvaldi UM without ST details
      | HCV_Solvaldi_UM_Without_ST   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Solvaldi_UM_Without_ST   |
      | <HCV_Solvaldi_UM_Without_ST> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Solvaldi_UM_Without_ST> |       
    Examples: 
      | Panel_Name          | HCV_Solvaldi_UM_Without_ST | Customer | Coverage_Code | Drug_List | Client | Client_Name                     | Assigned_HCV_Solvaldi_UM_Without_ST |
      | Assignment Criteria | Client                     |          |               |           | 2      | AUTOMATION DO NOT USE - CLIENT2 | A – No Fibrosis Restriction         |
      
  Scenario Outline: View HCV Mavyret tiering details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Mavyret tiering details
      | HCV_Mavyret_Tiering_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Mavyret_Tiering   |
      | <HCV_Mavyret_Tiering_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Mavyret_Tiering> |       
    Examples: 
      | Panel_Name          | HCV_Mavyret_Tiering_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_HCV_Mavyret_Tiering                  |
      | Assignment Criteria | Drug List              |          |               | FLID25305 |        |             | A – Not Disadvantaged/No Fibrosis Restriction |
      
  Scenario Outline: View HCV Epclusa UM details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify HCV Epclusa UM details
      | HCV_Epclusa_UM_By   | Customer   | Coverage_Code   | Drug_List   | Client   | Client_Name   | Assigned_HCV_Epclusa_UM   |
      | <HCV_Epclusa_UM_By> | <Customer> | <Coverage_Code> | <Drug_List> | <Client> | <Client_Name> | <Assigned_HCV_Epclusa_UM> |       
    Examples:    
      | Panel_Name          | HCV_Epclusa_UM_By | Customer | Coverage_Code | Drug_List | Client | Client_Name | Assigned_HCV_Epclusa_UM                                          |
      | Assignment Criteria | Coverage Code     |          | C11311 C21311 |           |        |             | A – Not Disadvantaged, No ST Harvoni and No Fibrosis Restriction |
      
  Scenario Outline: View Tier description assignment details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Tier description assignment details
      | Tier_Description_By   | Customer   | Drug_List   | Tier   | Description   |
      | <Tier_Description_By> | <Customer> | <Drug_List> | <Tier> | <Description> |     
    Examples: 
      | Panel_Name          | Tier_Description_By | Customer | Drug_List | Tier   | Description   |
      | Assignment Criteria | Drug List           |          | FLID25305 | Tier 3 | $0 Cost Share |
      
  Scenario Outline: View Guarantee code assignment details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Guarantee code assignment details
      | View_Guarantee_Code_By   | Customer   | Client   | Drug_List   | Guarantee_Code   |
      | <View_Guarantee_Code_By> | <Customer> | <Client> | <Drug_List> | <Guarantee_Code> |     
    Examples: 
      | Panel_Name          | View_Guarantee_Code_By | Customer | Drug_List | Guarantee_Code |
      | Assignment Criteria | Drug List              |          | FLID25305 | 2345           |      
      
  Scenario Outline: View Excluded claims details
    Given User is on Contract Tab
    When verify and expand the Assignment Criteria panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Excluded claims details
      | Exclude_Claims_By   | Client   | Coverage_Code1   | Coverage_Code2   | Group   |
      | <Exclude_Claims_By> | <Client> | <Coverage_Code1> | <Coverage_Code2> | <Group> | 
    Examples: 
      | Panel_Name          | Exclude_Claims_By | Client | Coverage_Code1 | Coverage_Code2 | Group |
      | Assignment Criteria | Client		        | 2      |                |                |       |
     
  Scenario Outline: View Authorized Brand Alternatives details
    Given User is on Contract Tab
    When verify and expand the Authorized Brand Alternatives panel
      | Panel_Name   |
      | <Panel_Name> |
    Then verify Authorized Brand Alternatives details
      | Vendor_Formulary_ID   | ABA_NDC   | ABA_Description   | Start_Date   | End_Date   |
      | <Vendor_Formulary_ID> | <ABA_NDC> | <ABA_Description> | <Start_Date> | <End_Date> |    
    Examples: 
      | Panel_Name                    | Vendor_Formulary_ID | ABA_NDC     | ABA_Description               | Start_Date | End_Date   |
      | Authorized Brand Alternatives | 1007                | 00002775201 | INSULIN LISPRO JR 100 UNIT/ML | 2020-04-08 | 9999-12-31 | 