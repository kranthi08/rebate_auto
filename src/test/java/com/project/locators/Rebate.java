package com.project.locators;

public class Rebate 
{
		public class CustomerContracts
		{
			public static final String CustomerContracts_New_Button = "newBtn";
			public static final String CustomerContracts_Search_Form = "//form[@name='searchForm']";			
			public static final String CustomerContracts_Search_Edit = "criteria.queryKey";		//	ng-model
			
			public static final String CustomerContracts_MCSAbbreviation_Link = "MCS Abbreviation";   
			public static final String CustomerContracts_FileAdmin_Link = "File Admin";		
			public static final String CustomerContracts_ExternalFiles_Link = "External Files"; 	
			public static final String CustomerContracts_AuthorizedBrandAlternatives_Link = "Authorized Brand Alternatives";
			public static final String CustomerContracts_SearchResultsTable = "//*[@ng-controller='contractResultsCtrl']//table";
		}
		
		public class AddContractInformationPanel
		{
			public static final String ContractInformation_Add_Vendor_List = "contract.vendorId";		//	ng-model
			public static final String ContractInformation_Add_VendorContractType_List = "contract.vendorContractType";		//	ng-model
			public static final String ContractInformation_Add_VendorClaimBasis_List = "contract.vendorClaimBasis";		//	ng-model
			public static final String ContractInformation_Add_VendorDaySupply_List = "contract.vendorDaySupply";		//	ng-model
			public static final String ContractInformation_Add_ClientType = "contract.clientType"; //	ng-model
			public static final String ContractInformation_Add_MasterCustomerSet_List = "masterCustomerSet";		//	ng-model
			public static final String ContractInformation_Add_CustomerID_List = "contract.customerId";		//	ng-model
			public static final String ContractInformation_Add_ContractName_Edit = "contract.contractName";		//	ng-model
			public static final String ContractInformation_Add_ReclassificationDrugVendor_List = "contract.drugVendor";		//	ng-model			
			public static final String ContractInformation_Add_Internal_External_List = "contract.contractScope";		//	ng-model						
			public static final String ContractInformation_Add_ContractLineOfBusiness_List = "contract.contractLob";		//	ng-model							
			public static final String ContractInformation_Add_ContractType_List = "contract.contractType";		//	ng-model							
			public static final String ContractInformation_Add_ClaimBasis_List = "contract.claimBasis";		//	ng-model
			public static final String ContractInformation_Add_ContractStartDate_Edit = "contract.startDate";		//	ng-model
			public static final String ContractInformation_Add_ContractEndDate_Edit = "contract.endDate";		//	ng-model			
			
			public static final String ContractInformation_Add_CosmeticDrugs_CheckBox = "//*[text()='Cosmetic drugs']//parent::*/input";		// x-path
			public static final String ContractInformation_Add_CompoundDrugs_CheckBox = "//*[text()='Compound drugs']//parent::*/input";	// x-path
			public static final String ContractInformation_Add_MultisourceBrandDrugs_CheckBox = "//*[text()='Multisource brand drugs']//parent::*/input";		// x-path
			public static final String ContractInformation_Add_Vaccines_CheckBox = "//*[text()='Vaccines']//parent::*/input";		// x-path
			public static final String ContractInformation_Add_OverTheCounterDrugs_CheckBox = "//*[text()='Over the counter drugs']//parent::*/input";	// x-path
			public static final String ContractInformation_Add_ExceptInsulins_CheckBox = "//*[text()='Except insulins']//parent::*/input";		// x-path
			public static final String ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox = "//*[text()='Except diabetic supplies and test strips']//parent::*/input";	// x-path
			public static final String ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox = "//*[text()='Reclassify specialty claims to retail']//parent::*/input"; 	// x-path
			public static final String ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox = "//*[text()='Reclassify day supply break at 34']//parent::*/input"; 	// x-path
			public static final String ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox = "//*[text()='Reclassify brand claims to generic']//parent::*/input"; 	// x-path			
			
			public static final String ContractInformation_Add_MonthlyPenalty_Edit = "contract.penalty.monthlyPenalty";	//	ng-model
			public static final String ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit = "contract.penalty.avoidPenalty";	//	ng-model
			public static final String ContractInformation_Add_PenaltyStartDate_Edit = "contract.penalty.startDate";	//	ng-model
			public static final String ContractInformation_Add_PenaltyEndDate_Edit = "contract.penalty.endDate";	//	ng-model			
			
			public static final String ContractInformation_Add_RateDetails_StartDate_Edit = "customerRateDetailsdata.startDate"; 	//	ng-model
			public static final String ContractInformation_Add_RateDetails_EndDate_Edit = "customerRateDetailsdata.endDate"; 	//	ng-model
			public static final String ContractInformation_Add_RateDetails_LineOfBusiness_List = "customerRateDetailsdata.vendorLOBTypeID"; 	//	ng-model
			public static final String ContractInformation_Add_Transparency_List = "customerRateDetailsdata.transparency"; 	//	ng-model
			public static final String ContractInformation_Add_FeeMethod_List = "customerRateDetailsdata.feeMethod"; 	//	ng-model
			public static final String ContractInformation_Add_VendorRebateShare_Edit = "customerRateDetailsdata.vendorRebateShare"; 	//	ng-model
			public static final String ContractInformation_Add_AdminFee_Edit = "customerRateDetailsdata.adminFee"; 	//	ng-model
			public static final String ContractInformation_Add_DSTRebateShare_Edit = "customerRateDetailsdata.dstRebateShare"; 		//	ng-model
			public static final String ContractInformation_Add_CustomerRebateShare_Edit = "customerRateDetailsdata.customerRebateShare"; 	//	ng-model
			public static final String ContractInformation_Add_DSTRevenue_Edit = "customerRateDetailsdata.calDSTrevenue"; 	//	ng-model			
			public static final String ContractInformation_Add_VendorAdjDaySupplyOption_Edit = "customerRateDetailsdata.adjVendorDaySupplyOption"; 	//	ng-model
			public static final String ContractInformation_Add_CustomerAdjDaySupplyOption_Edit = "customerRateDetailsdata.adjCustomerDaySupplyOption"; 	//	ng-model
			public static final String ContractInformation_Add_Notes_Edit = "customerRateDetailsdata.rateNotes"; 	//	ng-model
			
			public static final String ContractInformation_Add_Button = "//button[@ng-click='addOrUpdateRateDetail()']"; 			
			public static final String ContractInformation_Add_Next_Button = "//button[contains(@ng-class,'enabledRateNext')]";			
			public static final String ContractInformation_Add_RateDetails_Table = "//table[@ng-table='custContraTableParams']";
			public static final String ContractInformation_Add_Remove_Button = "//*[@ng-controller='rateDetailCtrl']//button[@ng-click='removeDatas()']";
			public static final String ContractInformation_Add_Update_Button = "//*[@ng-controller='rateDetailCtrl']//button[@ng-click='updateBtnClick()']";
			
		   
		}
		
		public class AddGuaranteePanel
		{
			public static final String Guarantee_Add_StartDate_Edit = "guarantee.startDate";		//	ng-model
			public static final String Guarantee_Add_EndDate_Edit = "guarantee.endDate";		//	ng-model
			public static final String Guarantee_Add_VendorFormularyID_Edit = "guarantee.vendorFmyId";		//	ng-model			
			public static final String Guarantee_Add_VendorFormularyType_List = "guarantee.vendorFmyTypeId"; //	ng-model
			public static final String Guarantee_Add_DSTFormularyType_List = "guarantee.argusFmyTypeId";	//	ng-model
			public static final String Guarantee_Add_TierType_Edit = "guarantee.tierType";		//	ng-model
			public static final String Guarantee_Add_Channel_List = "guarantee.channelId"; 	//	ng-model
			public static final String Guarantee_Add_LineOfBusiness_List = "guarantee.lob"; 	//	ng-model
			public static final String Guarantee_Add_VendorBrandGuarantee_Edit = "guarantee.vendorGuarantee"; 	//	ng-model
			public static final String Guarantee_Add_CustomerBrandGuarantee_Edit = "guarantee.argusGuarantee"; 	//	ng-model
			public static final String Guarantee_Add_BenefitDesign_List = "guarantee.benefitDesign"; 	//	ng-model
			public static final String Guarantee_Add_UMOption_List = "guarantee.umOptionId"; 	//	ng-model
			public static final String Guarantee_Add_BenefitDesignDescriptionNotes_Edit = "guarantee.benifitDesignDespNotes"; 	//	ng-model
			public static final String Guarantee_Add_PlanDesignNotes_Edit = "guarantee.planDesignNotes"; 	//	ng-model
			public static final String Guarantee_Add_UMOptionNotes_Edit = "guarantee.umOptionNotes"; 		//	ng-model
			public static final String Guarantee_Add_FormularyDesignNotes_Edit = "guarantee.fmyDesignNotes"; 		//	ng-model
			public static final String Guarantee_Add_Add_Button = "//button[@ng-click='addOrUpdateGuarantee()']"; 	 
			public static final String Guarantee_Add_Next_Button = "//*[@id='guaranteeSelection']//button[@class='arg-btn arg-btn-start nextBtn']";
			public static final String Guarantee_Add_Previous_Button = "//*[@id='guaranteeSelection']//button[@class='arg-btn arg-btn-start prevBtn']";
			public static final String Guarantee_Add_Remove_Button = "//*[@id='guaranteeSelection']//button[@ng-click='removeDatas()']";
			public static final String Guarantee_Add_Update_Button = "//*[@id='guaranteeSelection']//button[@ng-click='updateBtnClick()']";
			public static final String Guarantee_Add_BrowseNotes_Button = "//*[@id='guaranteeSelection']//button[@ng-click='browseNoteBtnClick()']";
			public static final String Guarantee_Add_GuaranteePanel_Table = "//*[@id='guaranteeSelection']//table";
		}
		
		public class AddMembershipClaimCountsPanel
		{
			public static final String MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List = "membershipClaimCounts.establishType"; 	//	ng-model
			public static final String MembershipClaimCounts_Add_CustomerVendorFormularyID_By_Customer_List = "membershipClaimCounts.customerId"; 	//	ng-model
			public static final String MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List = "membershipClaimCounts.vendorFormularyId";
			public static final String MembershipClaimCounts_Add_ContractualMembershipCount_Edit = "membershipClaimCounts.countMembership";		//	ng-model
			public static final String MembershipClaimCounts_Add_MembershipPercentThreshold_Edit = "membershipClaimCounts.percentMembership"; 	//	ng-model
			public static final String MembershipClaimCounts_Add_ContractualClaimCount_Edit = "membershipClaimCounts.countClaim";  	//	ng-model
			public static final String MembershipClaimCounts_Add_ClaimPercentThreshold_Edit = "membershipClaimCounts.percentClaim";  	//	ng-model			
			public static final String MembershipClaimCounts_Add_Add_Button = "//button[@ng-click='addOrUpdateMembershipClaimCounts()']"; 	
			public static final String MembershipClaimCounts_Add_Next_Button = "//*[@id='membershipClaimCountsSelection']//button[@class='arg-btn arg-btn-start nextBtn']";
			public static final String MembershipClaimCounts_Add_Previous_Button = "//*[@id='membershipClaimCountsSelection']//button[@class='arg-btn arg-btn-start prevBtn']";
			public static final String MembershipClaimCounts_Add_Remove_Button = "//*[@id='membershipClaimCountsSelection']//button[@ng-click='removeDatas()']";
			public static final String MembershipClaimCounts_Add_Update_Button = "//*[@id='membershipClaimCountsSelection']//button[@ng-click='updateBtnClick()']";			
			public static final String MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table = "//*[@id='membershipClaimCountsSelection']//table";
		}
		
		public class AddReportingPanel
		{
			public static final String Reporting_Add_Package_List = "reporting.packageTypeId";  	//	ng-model
			public static final String Reporting_Add_Level_List = "reporting.levelTypeId";  	//	ng-model
			public static final String Reporting_Add_StartDate_Edit = "reporting.startDate";  	//	ng-model
			public static final String Reporting_Add_EndDate_Edit = "reporting.endDate";  	//	ng-model
			public static final String Reporting_Add_PackageNotes_Edit = "reporting.packageNotes";  	//	ng-model
			public static final String Reporting_Add_LevelNotes_Edit = "reporting.levelNotes";  	//	ng-model			
			public static final String Reporting_Add_Add_Button = "//button[contains(@ng-click,'addOrUpdateReporting')]"; 	
			public static final String Reporting_Add_Next_Button = "//*[@id='reportingSelection']//button[@class='arg-btn arg-btn-start nextBtn']";
			public static final String Reporting_Add_Previous_Button = "//*[@id='reportingSelection']//button[@class='arg-btn arg-btn-start prevBtn']";
			public static final String Reporting_Add_Remove_Button = "//*[@id='reportingSelection']//button[@ng-click='removeDatas()']";
			public static final String Reporting_Add_Update_Button = "//*[@id='reportingSelection']//button[@ng-click='updateBtnClick()']";			
			public static final String Reporting_Add_ReportingPanel_Table = "//*[@id='reportingSelection']//table";
			
		}
		
		public class AddVendorFormularyIDAssignment
		{
			public static final String AssignmentCriteria_Add_AssignVendorFormularyIDBy_List = "extractionCriteria.formularyAssignTypeCd"; 	//	ng-model
			public static final String AssignmentCriteria_Add_AssignedVendorFormularyID_Edit = "selectedExtFrmlryCrit.assignedVFID";  	//	ng-model
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_CoverageCode1_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_CoverageCode2_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_Description_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='description']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_CoverageCodeStatus_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_DrugListID_Edit = "//table[@name='formularyDrugListTable']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_Name_Edit = "//table[@name='formularyDrugListTable']//input[@name='name']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_Type_Edit = "//table[@name='formularyDrugListTable']//input[@name='type']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_DrugListStatus_Edit = "//table[@name='formularyDrugListTable']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_ClientNumber_Edit = "//table[@name='formularyClientTable']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_ClientName_Edit = "//table[@name='formularyClientTable']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_ClientStartDate_Edit = "//table[@name='formularyClientTable']//input[@name='startDate']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_ClientEndDate_Edit = "//table[@name='formularyClientTable']//input[@name='endDate']";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateExtFrmlryCrit')]";
			public static final String AssignmentCriteria_Add_VendorFormularyID_SelectedAssignment_Table = "//table[@name='extCritFormularyTable']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_Remove_Button = "//*[@ng-controller='extractionCriteriaFormularyCtrl']//button[text()='Remove']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_Update_Button = "//*[@ng-controller='extractionCriteriaFormularyCtrl']//button[text()='Update']";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableCoverageCode_Table = "//table[@name='formularyCoverageCodeTable']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableCoverageCode_Table_Pagination = "//table[@name='formularyCoverageCodeTable']/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableDrugList_Table = "//table[@name='formularyDrugListTable']";
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableDrugList_Table_Pagination = "//table[@name='formularyDrugListTable']/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableClient_Table = "//table[@name='formularyClientTable']";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableCoverageCodes_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_VendorFormularyID_SelectedCoverageCodes_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableDrugList_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_VendorFormularyID_SelectedDrugList_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_VendorFormularyID_AvailableClient_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_VendorFormularyID_SelectedClient_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
			
			public static final String AssignmentCriteria_Add_Previous_Button = "//*[@id='extractionCriteriaSelection']//*[text()='Previous']";
			public static final String AssignmentCriteria_Add_Next_Button = "//*[@id='extractionCriteriaSelection']//*[text()='Next']";
	
		}
		
		public class AddLineOfBusinessAssignment
		{
			public static final String AssignmentCriteria_Add_AssignLineOfBusinessBy_List = "extractionLOBCriteria.lobAssignTypeCd";  //	ng-model
			public static final String AssignmentCriteria_Add_AssignedLineOfBusiness_List = "extractionLOBCriteria.vendorLOBTypeId";  //	ng-model
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_CoverageCode1_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_CoverageCode2_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_Description_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='description']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_CoverageCodeStatus_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_DrugListID_Edit = "//table[@name='lobDrugListTable']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_Name_Edit = "//table[@name='lobDrugListTable']//input[@name='name']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_Type_Edit = "//table[@name='lobDrugListTable']//input[@name='type']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_DrugListStatus_Edit = "//table[@name='lobDrugListTable']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_ClientNumber_Edit = "//table[@name='lobClientTable']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_ClientName_Edit = "//table[@name='lobClientTable']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_ClientStartDate_Edit = "//table[@name='lobClientTable']//input[@name='startDate']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_ClientEndDate_Edit = "//table[@name='lobClientTable']//input[@name='endDate']";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_Add_Button = "//*[@name='extCritLobForm']//button[contains(@ng-click,'ClickFun.addOrUpdateExtLOBCrit')]";
			public static final String AssignmentCriteria_Add_LineOfBusiness_SelectedAssignment_Table = "//table[@name='extCritLOBTable']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_Remove_Button = "//*[@ng-controller='extractionCriteriaLobCtrl']//button[text()='Remove']"; 
			public static final String AssignmentCriteria_Add_LineOfBusiness_Update_Button = "//*[@ng-controller='extractionCriteriaLobCtrl']//button[text()='Update']";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableCoverageCode_Table = "//table[@name='lobCoverageCodeTable']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableCoverageCode_Table_Pagination = "//table[@name='lobCoverageCodeTable']/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableDrugList_Table = "//table[@name='lobDrugListTable']";
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableDrugList_Table_Pagination = "//table[@name='lobDrugListTable']/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableClient_Table = "//table[@name='lobClientTable']";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableCoverageCodes_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_LineOfBusiness_SelectedCoverageCodes_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableDrugList_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_LineOfBusiness_SelectedDrugList_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_LineOfBusiness_AvailableClient_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_LineOfBusiness_SelectedClient_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Selected clients')]";				
		}
		
		public class AddHospiceFacility
		{
			public static final String AssignmentCriteria_Add_AssignHospiceFacilityBy_List = "hospiceFacility_type";  //	by.Id
			public static final String AssignmentCriteria_Add_AssignedHospiceFacility_List = "hospiceFacility_option";  //	by.Id
			
			public static final String AssignmentCriteria_Add_HospiceFacility_CoverageCode1_Edit = "//form[@name='hospiceFacilityForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_HospiceFacility_CoverageCode2_Edit = "//form[@name='hospiceFacilityForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_HospiceFacility_Description_Edit = "//form[@name='hospiceFacilityForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_HospiceFacility_CoverageCodeStatus_Edit = "//form[@name='hospiceFacilityForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_DrugListID_Edit = "//form[@name='hospiceFacilityForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_HospiceFacility_Name_Edit = "//form[@name='hospiceFacilityForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_HospiceFacility_Type_Edit = "//form[@name='hospiceFacilityForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_HospiceFacility_DrugListStatus_Edit = "//form[@name='hospiceFacilityForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_ClientNumber_Edit = "//form[@name='hospiceFacilityForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_HospiceFacility_ClientName_Edit = "//form[@name='hospiceFacilityForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_HospiceFacility_ClientStartDate_Edit = "//form[@name='hospiceFacilityForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_HospiceFacility_ClientEndDate_Edit = "//form[@name='hospiceFacilityForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_Add_Button = "//button[@type='submit' and contains(@ng-class,'hospiceFacilityForm')]";
			public static final String AssignmentCriteria_Add_HospiceFacility_SelectedAssignment_Table = "//*[contains(text(),'Hospice Facility')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_HospiceFacility_Remove_Button = "//*[contains(text(),'Hospice Facility Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_HospiceFacility_Update_Button = "//*[contains(text(),'Hospice Facility Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
		
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableCoverageCode_Table = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableCoverageCode_Table_Pagination = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableDrugList_Table = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableDrugList_Table_Pagination = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableClient_Table = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'client')]";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableCoverageCodes_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_HospiceFacility_SelectedCoverageCodes_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableDrugList_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_HospiceFacility_SelectedDrugList_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_HospiceFacility_AvailableClient_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_HospiceFacility_SelectedClient_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		
		}
		
		public class AddPriorAuthorizationProgram
		{
			public static final String AssignmentCriteria_Add_AssignPriorAuthorizationProgramBy_List = "priorAuth_type"; 	//	by.Id
			public static final String AssignmentCriteria_Add_AssignedPriorAuthorizationProgram_List = "priorAuth_option";	 	//	by.Id
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_CoverageCode1_Edit = "//form[@name='priorAuthForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_CoverageCode2_Edit = "//form[@name='priorAuthForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_Description_Edit = "//form[@name='priorAuthForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_CoverageCodeStatus_Edit = "//form[@name='priorAuthForm']//input[@name='status']";		 
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_DrugListID_Edit = "//form[@name='priorAuthForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_Name_Edit = "//form[@name='priorAuthForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_Type_Edit = "//form[@name='priorAuthForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_DrugListStatus_Edit = "//form[@name='priorAuthForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_ClientNumber_Edit = "//form[@name='priorAuthForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_ClientName_Edit = "//form[@name='priorAuthForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_ClientStartDate_Edit = "//form[@name='priorAuthForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_ClientEndDate_Edit = "//form[@name='priorAuthForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_Add_Button = "//button[@type='submit' and contains(@ng-class,'priorAuthForm')]";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_SelectedAssignment_Table = "//*[contains(text(),'Prior Authorization Program')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_Remove_Button = "//*[contains(text(),'Prior Authorization Program')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_Update_Button = "//*[contains(text(),'Prior Authorization Program')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableCoverageCode_Table = "//form[@name='priorAuthForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableCoverageCode_Table_Pagination = "//form[@name='priorAuthForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableDrugList_Table = "//form[@name='priorAuthForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableDrugList_Table_Pagination = "//form[@name='priorAuthForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableClient_Table = "//form[@name='priorAuthForm']//table[contains(@ng-table,'client')]";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableCoverageCodes_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_SelectedCoverageCodes_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableDrugList_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_SelectedDrugList_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_AvailableClient_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_PriorAuthorizationProgram_SelectedClient_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
									 
		}
		
		public class AddStepTherapyProgram
		{
			public static final String AssignmentCriteria_Add_AssignStepTherapyProgramBy_List = "stepTherapy_type";		//	by.Id
			public static final String AssignmentCriteria_Add_AssignedStepTherapyProgram_List = "stepTherapy_option";		//	by.Id
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_CoverageCode1_Edit = "//form[@name='stepTherapyForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_CoverageCode2_Edit = "//form[@name='stepTherapyForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_Description_Edit = "//form[@name='stepTherapyForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_CoverageCodeStatus_Edit = "//form[@name='stepTherapyForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_DrugListID_Edit = "//form[@name='stepTherapyForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_Name_Edit = "//form[@name='stepTherapyForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_Type_Edit = "//form[@name='stepTherapyForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_DrugListStatus_Edit = "//form[@name='stepTherapyForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_ClientNumber_Edit = "//form[@name='stepTherapyForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_ClientName_Edit = "//form[@name='stepTherapyForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_ClientStartDate_Edit = "//form[@name='stepTherapyForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_ClientEndDate_Edit = "//form[@name='stepTherapyForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_Add_Button = "//button[@type='submit' and contains(@ng-class,'stepTherapyForm')]"; 
			public static final String AssignmentCriteria_Add_StepTherapyProgram_SelectedAssignment_Table   =  "//*[contains(text(),'Step Therapy Program')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_Remove_Button = "//*[contains(text(),'Step Therapy Program Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_Update_Button = "//*[contains(text(),'Step Therapy Program Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
				
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableCoverageCode_Table = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableCoverageCode_Table_Pagination = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableDrugList_Table = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableDrugList_Table_Pagination = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableClient_Table = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'client')]";
		
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableCoverageCodes_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_SelectedCoverageCodes_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableDrugList_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_SelectedDrugList_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_StepTherapyProgram_AvailableClient_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_StepTherapyProgram_SelectedClient_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		}
		
		public class AddFocusedUMBundleDiabetes
		{
			public static final String AssignmentCriteria_Add_AssignFocusedUMBundleDiabetesBy_List = "fubDiabetes_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedFocusedUMBundleDiabetes_List = "fubDiabetes_option";	// by.id
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode1_Edit = "//form[@name='fubDiabetesForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode2_Edit = "//form[@name='fubDiabetesForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_Description_Edit = "//form[@name='fubDiabetesForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCodeStatus_Edit = "//form[@name='fubDiabetesForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListID_Edit = "//form[@name='fubDiabetesForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_Name_Edit = "//form[@name='fubDiabetesForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_Type_Edit = "//form[@name='fubDiabetesForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListStatus_Edit = "//form[@name='fubDiabetesForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientNumber_Edit = "//form[@name='fubDiabetesForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientName_Edit = "//form[@name='fubDiabetesForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientStartDate_Edit = "//form[@name='fubDiabetesForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientEndDate_Edit = "//form[@name='fubDiabetesForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubDiabetesForm')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedAssignment_Table   =  "//*[contains(text(),'Focused UM Bundle-Diabetes')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_Remove_Button = "//*[contains(text(),'Focused UM Bundle-Diabetes')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_Update_Button = "//*[contains(text(),'Focused UM Bundle-Diabetes')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
					
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCode_Table = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCode_Table_Pagination = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Table = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Table_Pagination = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableClient_Table = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'client')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCodes_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedCoverageCodes_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedDrugList_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableClient_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedClient_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
			
		}
		
		public class AddFocusedUMBundleRespiratory
		{
			public static final String AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List = "fubRespiratory_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedFocusedUMBundleRespiratory_List = "fubRespiratory_option";	// by.id
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode1_Edit = "//form[@name='fubRespiratoryForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode2_Edit = "//form[@name='fubRespiratoryForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_Description_Edit = "//form[@name='fubRespiratoryForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCodeStatus_Edit = "//form[@name='fubRespiratoryForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListID_Edit = "//form[@name='fubRespiratoryForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_Name_Edit = "//form[@name='fubRespiratoryForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_Type_Edit = "//form[@name='fubRespiratoryForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListStatus_Edit = "//form[@name='fubRespiratoryForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientNumber_Edit = "//form[@name='fubRespiratoryForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientName_Edit = "//form[@name='fubRespiratoryForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientStartDate_Edit = "//form[@name='fubRespiratoryForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientEndDate_Edit = "//form[@name='fubRespiratoryForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubRespiratoryForm')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedAssignment_Table =  "//*[contains(text(),'Focused UM Bundle-Respiratory')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_Remove_Button = "//*[contains(text(),'Focused UM Bundle-Respiratory')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_Update_Button = "//*[contains(text(),'Focused UM Bundle-Respiratory')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table_Pagination = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table_Pagination = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableClient_Table = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'client')]";
		
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCodes_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedCoverageCodes_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedDrugList_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableClient_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedClient_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		}
		
		public class AddFocusedUMBundleSpecialty
		{
			public static final String AssignmentCriteria_Add_AssignFocusedUMBundleSpecialtyBy_List = "fubSpecialty_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedFocusedUMBundleSpecialty_List = "fubSpecialty_option";	// by.id
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_CoverageCode1_Edit = "//form[@name='fubSpecialtyForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_CoverageCode2_Edit = "//form[@name='fubSpecialtyForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_Description_Edit = "//form[@name='fubSpecialtyForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_CoverageCodeStatus_Edit = "//form[@name='fubSpecialtyForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_DrugListID_Edit = "//form[@name='fubSpecialtyForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_Name_Edit = "//form[@name='fubSpecialtyForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_Type_Edit = "//form[@name='fubSpecialtyForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_DrugListStatus_Edit = "//form[@name='fubSpecialtyForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_ClientNumber_Edit = "//form[@name='fubSpecialtyForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_ClientName_Edit = "//form[@name='fubSpecialtyForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_ClientStartDate_Edit = "//form[@name='fubSpecialtyForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_ClientEndDate_Edit = "//form[@name='fubSpecialtyForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubSpecialtyForm')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_SelectedAssignment_Table =  "//*[contains(text(),'Focused UM Bundle-Specialty')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_Remove_Button = "//*[contains(text(),'Focused UM Bundle-Specialty')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_Update_Button = "//*[contains(text(),'Focused UM Bundle-Specialty')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableCoverageCode_Table = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableCoverageCode_Table_Pagination = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableDrugList_Table = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableDrugList_Table_Pagination = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableClient_Table = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'client')]";
		
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableCoverageCodes_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_SelectedCoverageCodes_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableDrugList_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_SelectedDrugList_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_AvailableClient_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleSpecialty_SelectedClient_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		
		}
		
		public class AddFocusedUMBundleMiscellaneous
		{
			public static final String AssignmentCriteria_Add_AssignFocusedUMBundleMiscellaneousBy_List = "fubMiscellaneous_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedFocusedUMBundleMiscellaneous_List = "fubMiscellaneous_option";	// by.id
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_CoverageCode1_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_CoverageCode2_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_Description_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_CoverageCodeStatus_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_DrugListID_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_Name_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_Type_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_DrugListStatus_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_ClientNumber_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_ClientName_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_ClientStartDate_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_ClientEndDate_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubMiscellaneousForm')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_SelectedAssignment_Table =  "//*[contains(text(),'Focused UM Bundle-Miscellaneous')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_Remove_Button = "//*[contains(text(),'Focused UM Bundle-Miscellaneous')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_Update_Button = "//*[contains(text(),'Focused UM Bundle-Miscellaneous')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]"; 			
		
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableCoverageCode_Table = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableCoverageCode_Table_Pagination = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableDrugList_Table = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableDrugList_Table_Pagination = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableClient_Table = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'client')]";
		
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableCoverageCodes_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_SelectedCoverageCodes_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableDrugList_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_SelectedDrugList_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_AvailableClient_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_FocusedUMBundleMiscellaneous_SelectedClient_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
			
		}
		
		public class AddTNFRAUM
		{
			public static final String AssignmentCriteria_Add_AssignTNFRAUMBy_List = "tnf_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedTNFRAUM_List = "tnf_option";	// by.id
			
			public static final String AssignmentCriteria_Add_TNFRAUM_CoverageCode1_Edit = "//form[@name='tnfForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_TNFRAUM_CoverageCode2_Edit = "//form[@name='tnfForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_TNFRAUM_Description_Edit = "//form[@name='tnfForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_TNFRAUM_CoverageCodeStatus_Edit = "//form[@name='tnfForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_TNFRAUM_DrugListID_Edit = "//form[@name='tnfForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_TNFRAUM_Name_Edit = "//form[@name='tnfForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_TNFRAUM_Type_Edit = "//form[@name='tnfForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_TNFRAUM_DrugListStatus_Edit = "//form[@name='tnfForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_TNFRAUM_ClientNumber_Edit = "//form[@name='tnfForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_TNFRAUM_ClientName_Edit = "//form[@name='tnfForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_TNFRAUM_ClientStartDate_Edit = "//form[@name='tnfForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_TNFRAUM_ClientEndDate_Edit = "//form[@name='tnfForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_TNFRAUM_Add_Button = "//button[@type='submit' and contains(@ng-class,'tnfForm')]";
			public static final String AssignmentCriteria_Add_TNFRAUM_SelectedAssignment_Table =  "//*[contains(text(),'TNF/RA UM')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_TNFRAUM_Remove_Button = "//*[contains(text(),'TNF/RA UM')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_TNFRAUM_Update_Button = "//*[contains(text(),'TNF/RA UM')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
		
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableCoverageCode_Table = "//form[@name='tnfForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableCoverageCode_Table_Pagination = "//form[@name='tnfForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableDrugList_Table = "//form[@name='tnfForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableDrugList_Table_Pagination = "//form[@name='tnfForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableClient_Table = "//form[@name='tnfForm']//table[contains(@ng-table,'client')]";
		
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableCoverageCodes_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_TNFRAUM_SelectedCoverageCodes_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableDrugList_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_TNFRAUM_SelectedDrugList_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_TNFRAUM_AvailableClient_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_TNFRAUM_SelectedClient_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		}
		
		public class AddHCVHarvoniUMWithST
		{
			public static final String AssignmentCriteria_Add_AssignHCVHarvoniUMWithSTBy_List = "hcvHarvoni_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedHCVHarvoniUMWithST_List = "hcvHarvoni_option";	// by.id
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_CoverageCode1_Edit = "//form[@name='hcvHarvoniForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_CoverageCode2_Edit = "//form[@name='hcvHarvoniForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_Description_Edit = "//form[@name='hcvHarvoniForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_CoverageCodeStatus_Edit = "//form[@name='hcvHarvoniForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_DrugListID_Edit = "//form[@name='hcvHarvoniForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_Name_Edit = "//form[@name='hcvHarvoniForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_Type_Edit = "//form[@name='hcvHarvoniForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_DrugListStatus_Edit = "//form[@name='hcvHarvoniForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_ClientNumber_Edit = "//form[@name='hcvHarvoniForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_ClientName_Edit = "//form[@name='hcvHarvoniForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_ClientStartDate_Edit = "//form[@name='hcvHarvoniForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_ClientEndDate_Edit = "//form[@name='hcvHarvoniForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvHarvoniForm')]";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_SelectedAssignment_Table =  "//*[contains(text(),'HCV Harvoni UM with ST')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_Remove_Button = "//*[contains(text(),'HCV Harvoni UM with ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_Update_Button = "//*[contains(text(),'HCV Harvoni UM with ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableCoverageCode_Table = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableCoverageCode_Table_Pagination = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableDrugList_Table = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableDrugList_Table_Pagination = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableClient_Table = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'client')]";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableCoverageCodes_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_SelectedCoverageCodes_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableDrugList_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_SelectedDrugList_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_AvailableClient_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_HCVHarvoniUMWithST_SelectedClient_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
			
			
		}
		
		public class AddHCVSolvaldiUMWithoutST
		{
			public static final String AssignmentCriteria_Add_AssignHCVSolvaldiUMWithoutSTBy_List = "hcvSolvaldi_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedHCVSolvaldiUMWithoutST_List = "hcvSolvaldi_option";	// by.id
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_CoverageCode1_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_CoverageCode2_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_Description_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_CoverageCodeStatus_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_DrugListID_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_Name_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_Type_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_DrugListStatus_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_ClientNumber_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_ClientName_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_ClientStartDate_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_ClientEndDate_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvSolvaldiForm')]";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_SelectedAssignment_Table =  "//*[contains(text(),'HCV Solvaldi UM without ST')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_Remove_Button = "//*[contains(text(),'HCV Solvaldi UM without ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_Update_Button = "//*[contains(text(),'HCV Solvaldi UM without ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
					
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableCoverageCode_Table = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableCoverageCode_Table_Pagination = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableDrugList_Table = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableDrugList_Table_Pagination = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableClient_Table = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'client')]";
									
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableCoverageCodes_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_SelectedCoverageCodes_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableDrugList_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_SelectedDrugList_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_AvailableClient_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_HCVSolvaldiUMWithoutST_SelectedClient_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
			
		}
		
		public class AddHCVMavyretTiering
		{
			public static final String AssignmentCriteria_Add_AssignHCVMavyretTieringBy_List = "hcvMavyret_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedHCVMavyretTiering_List = "hcvMavyret_option";	// by.id
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_CoverageCode1_Edit = "//form[@name='hcvMavyretForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_CoverageCode2_Edit = "//form[@name='hcvMavyretForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_Description_Edit = "//form[@name='hcvMavyretForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_CoverageCodeStatus_Edit = "//form[@name='hcvMavyretForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_DrugListID_Edit = "//form[@name='hcvMavyretForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_Name_Edit = "//form[@name='hcvMavyretForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_Type_Edit = "//form[@name='hcvMavyretForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_DrugListStatus_Edit = "//form[@name='hcvMavyretForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_ClientNumber_Edit = "//form[@name='hcvMavyretForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_ClientName_Edit = "//form[@name='hcvMavyretForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_ClientStartDate_Edit = "//form[@name='hcvMavyretForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_ClientEndDate_Edit = "//form[@name='hcvMavyretForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvMavyretForm')]";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_SelectedAssignment_Table =  "//*[contains(text(),'HCV Mavyret Tiering')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_Remove_Button = "//*[contains(text(),'HCV Mavyret Tiering')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_Update_Button = "//*[contains(text(),'HCV Mavyret Tiering')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableCoverageCode_Table = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableCoverageCode_Table_Pagination = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableDrugList_Table = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableDrugList_Table_Pagination = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableClient_Table = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'client')]";
						
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableCoverageCodes_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_SelectedCoverageCodes_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableDrugList_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_SelectedDrugList_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_AvailableClient_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_HCVMavyretTiering_SelectedClient_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		
		}
		
		public class AddHCVEpclusaUM
		{
			public static final String AssignmentCriteria_Add_AssignHCVEpclusaUMBy_List = "hcvEpclusa_type";		// by.id
			public static final String AssignmentCriteria_Add_AssignedHCVEpclusaUM_List = "hcvEpclusa_option";	// by.id
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_CoverageCode1_Edit = "//form[@name='hcvEpclusaForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_CoverageCode2_Edit = "//form[@name='hcvEpclusaForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_Description_Edit = "//form[@name='hcvEpclusaForm']//input[@name='description']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_CoverageCodeStatus_Edit = "//form[@name='hcvEpclusaForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_DrugListID_Edit = "//form[@name='hcvEpclusaForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_Name_Edit = "//form[@name='hcvEpclusaForm']//input[@name='name']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_Type_Edit = "//form[@name='hcvEpclusaForm']//input[@name='type']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_DrugListStatus_Edit = "//form[@name='hcvEpclusaForm']//input[@name='status']";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_ClientNumber_Edit = "//form[@name='hcvEpclusaForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_ClientName_Edit = "//form[@name='hcvEpclusaForm']//input[@name='clientName']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_ClientStartDate_Edit = "//form[@name='hcvEpclusaForm']//input[@name='startDt']";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_ClientEndDate_Edit = "//form[@name='hcvEpclusaForm']//input[@name='endDt']";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvEpclusaForm')]";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_SelectedAssignment_Table = "//*[contains(text(),'HCV Epclusa UM')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_Remove_Button = "//*[contains(text(),' HCV Epclusa UM')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_Update_Button = "//*[contains(text(),' HCV Epclusa UM')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableCoverageCode_Table = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'coverageCode')]";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableCoverageCode_Table_Pagination = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'coverageCode')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableDrugList_Table = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'drugList')]";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableDrugList_Table_Pagination = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'drugList')]/following-sibling::*//*[contains(@class,'pagination')]";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableClient_Table = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'client')]";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableCoverageCodes_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_SelectedCoverageCodes_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableDrugList_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_SelectedDrugList_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
			
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_AvailableClient_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Available clients')]";
			public static final String AssignmentCriteria_Add_HCVEpclusaUM_SelectedClient_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		
		}
		
		public class AddTierDescription
		{
			public static final String AssignmentCriteria_Add_AssignTierDescriptionBy_List = "extractionTierCriteria.tierAssignTypeCd";		//by-model
			
			public static final String AssignmentCriteria_Add_TierDescription_Customer_Edit = "validCustomerId"; 	//by-model
			public static final String AssignmentCriteria_Add_TierDescription_DrugList_Edit = "selectedExtTierCrit.drugListId";  	//by-model
			
			public static final String AssignmentCriteria_Add_TierDescription_Tier_List = "selectedExtTierCrit.tier";  	//by-model
			public static final String AssignmentCriteria_Add_TierDescription_Description_List = "selectedExtTierCrit.description";  //by-model
			
			public static final String AssignmentCriteria_Add_TierDescription_Add_Button = "//form[@name='extCritTierForm']//*[@ng-click='ClickFun.addOrUpdateExtLOBCrit()']";
			public static final String AssignmentCriteria_Add_TierDescriptionAssignment_Table = "//*[@ng-controller='tierAssignmentCriteriaCtrl']//table";
			public static final String AssignmentCriteria_Add_TierDescription_Remove_Button = "//*[@ng-controller='tierAssignmentCriteriaCtrl']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_TierDescription_Update_Button = "//*[@ng-controller='tierAssignmentCriteriaCtrl']//button[contains(text(),'Update')]";
		}
		
		public class AddGuaranteeCodeAssignment
		{
			public static final String AssignmentCriteria_Add_AssignGuaranteeCodeBy_List = "//form[@name='extCritGrnteeForm']//select[@name='typeCode']";
			public static final String AssignmentCriteria_Add_GuaranteeCode_Customer_Edit = "//form[@name='extCritGrnteeForm']//input[@name='customerId']";
			public static final String AssignmentCriteria_Add_GuaranteeCode_DrugList_Edit = "//form[@name='extCritGrnteeForm']//input[@name='drugListName']";
			public static final String AssignmentCriteria_Add_GuaranteeCode_Client_Edit = "//form[@name='extCritGrnteeForm']//input[@name='clientId']";
			public static final String AssignmentCriteria_Add_GuaranteeCode_CoverageCode1_Edit = "//form[@name='extCritGrnteeForm']//input[@name='coverageCode1']";
			public static final String AssignmentCriteria_Add_GuaranteeCode_CoverageCode2_Edit = "//form[@name='extCritGrnteeForm']//input[@name='coverageCode2']";
			public static final String AssignmentCriteria_Add_GuaranteeCode_GuaranteeCode_Edit = "//form[@name='extCritGrnteeForm']//input[@name='guaranteeCode']"; //ng-model
			
			public static final String AssignmentCriteria_Add_GuaranteeCode_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateExtGrnteeCrit')]";
			public static final String AssignmentCriteria_Add_GuaranteeCodeAssignment_Table = "//*[@ng-controller='assignmentguaranteeCtrl']//table";
			public static final String AssignmentCriteria_Add_GuaranteeCode_Remove_Button = "//button[contains(@ng-click,'ClickFun.removeExtGrnteeCrit()')]";
			public static final String AssignmentCriteria_Add_GuaranteeCode_Update_Button = "//*[@ng-controller='assignmentguaranteeCtrl']//button[contains(text(),'Update')]";
		}
		
		public class AddExcludeClaims
		{
			public static final String AssignmentCriteria_Add_ExcludeClaimsBy_List = "extractionExcludeCriteria.typeCode"; //ng-model
			
			public static final String AssignmentCriteria_Add_ExcludeClaims_Client_Edit = "selectedExcClaimCrit.clientId"; //ng-model			
			public static final String AssignmentCriteria_Add_ExcludeClaims_CoverageCode1_Edit = "selectedExcClaimCrit.coverageCode1"; //ng-model
			public static final String AssignmentCriteria_Add_ExcludeClaims_CoverageCode2_Edit = "selectedExcClaimCrit.coverageCode2"; //ng-model			
			public static final String AssignmentCriteria_Add_ExcludeClaims_Group_Edit = "selectedExcClaimCrit.intlGroupId"; //ng-model
			
			public static final String AssignmentCriteria_Add_ExcludeClaims_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateExcClaimCrit')]";
			public static final String AssignmentCriteria_Add_ExcludeClaims_Table = "//*[@ng-controller='extractionCriteriaExcludeCtrl']//table";
			public static final String AssignmentCriteria_Add_ExcludeClaims_Remove_Button = "//*[@ng-controller='extractionCriteriaExcludeCtrl']//button[contains(text(),'Remove')]";
			public static final String AssignmentCriteria_Add_ExcludeClaims_Update_Button = "//*[@ng-controller='extractionCriteriaExcludeCtrl']//button[contains(text(),'Update')]";					
			
		}
		
		public class AddNumberOfTiersAssignment
		{
			public static final String AssignmentCriteria_Add_AssignNumberOfTiersBy_List = "nbrOfTiersCriteria.assignmentLevelCd"; //ng-model
			public static final String AssignmentCriteria_Add_NumberOfTiers_Customer_Edit = "//form[@name='assignNbrOfTiersCritForm']//input[@name='customerId']";
			public static final String AssignmentCriteria_Add_NumberOfTiers_DrugList_Edit = "selectedNbrOfTiersCrit.drugListIdentifyingShtNm"; //ng-model
			public static final String AssignmentCriteria_Add_NumberOfTiers_Edit = "editNbrOfTiers"; //ng-model
			
			public static final String AssignmentCriteria_Add_NumberOfTiers_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateNumberOfTiersCrit')]";
			public static final String AssignmentCriteria_Add_NumberOfTiersAssignment_Table = "//*[@name='assgnNbrOfTiersTable']";
			public static final String AssignmentCriteria_Add_NumberOfTiers_Remove_Button = "//button[contains(@ng-click,'ClickFun.removeNumberOfTiersCrit()')]";
			public static final String AssignmentCriteria_Add_NumberOfTiers_Update_Button = "//*[@ng-click='updateNbrOfTiersBtnClick()']";
		}
		
		public class AddAuthorizedBrandAlternativesPanel
		{
			public static final String AuthorizedBrandAlternatives_Add_VendorFormularyID_List = "vendor_frmly_id"; 	//ID
			public static final String AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table= "//*[@name='authorizedBrandAlternativesTable']";
			public static final String AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table_Pagination= "//*[@name='authorizedBrandAlternativesTable']/following-sibling::*//*[contains(@class,'pagination')]"; 
			public static final String AuthorizedBrandAlternatives_Add_Add_Button= "//button[contains(@ng-click,'addAuthorizedBrandAlternatives')]";
			public static final String AuthorizedBrandAlternatives_Add_Remove_Button= "//button[contains(@ng-click,'removeAbaExcCrit()')]"; 
			public static final String AuthorizedBrandAlternatives_Add_SelectedAuthorizedBrandAlternatives_Table= "//*[@name='authorizedBrandAlternativesExcCritTable']"; 
			public static final String AuthorizedBrandAlternatives_Add_Save_Button= "//button[contains(@ng-click,'saveContract')]";
			public static final String AuthorizedBrandAlternatives_Add_Previous_Button = "//*[@id='authorizedBrandAlternativesExcSelection']//following-sibling::*/button[text()='Previous']";
			
		}
	
		public class ViewContractInformationPanel {
			public static final String ContractInformation_View_Update_Button = "(//*[@ng-controller='customerContractCtrl']//button[text()='Update'])[1]";
			public static final String ContractInformation_View_ContractInformationPanel_Table = "//form[@name='contractForm']//div[@class='panel-border ng-scope']";
			public static final String ContractInformation_View_ReclassifyClaims_Table = "(//div[@class='reclassify'])[1]";
			public static final String ContractInformation_View_ReclassifyOnly_Table = "(//div[@class='reclassify'])[2]";
			public static final String ContractInformation_View_Penalty_Table = "//*[@class='penalty']//*[@class='form-group']";
			public static final String ContractInformation_View_RateDetails_Table = "//*[@ng-table='custContraTableParams']";
			public static final String ContractInformation_View_Save_Button = "//*[@ng-controller='rebateCtrl']//button[text()='Save']";
			public static final String ContractInformation_View_Cancel_Button = "//*[@ng-controller='rebateCtrl']//button[text()='Cancel']";
		}
		
		public class ViewGuaranteePanel {
			public static final String Guarantee_View_Update_Button = "(//*[@ng-controller='guaranteeCtrl']//button[text()='Update'])[1]";
			public static final String Guarantee_View_GuaranteePanel_Table = "//*[@id='guaranteeSelection']//table";
			public static final String Guarantee_View_GuaranteePanel = "//*[@ng-controller='guaranteeCtrl']//*[@aria-controls='guaranteeSelection']";
			public static final String Guarantee_View_BrowseNotes_Button = "//button[contains(@ng-click,'browseNoteBtn')]";
			public static final String Guarantee_View_BrowseNotes_BenefitDesignDescriptionNotes_Edit = "//textarea[@ng-model='guaranteeNote.benifitDesignDespNotes']";  // xpath
			public static final String Guarantee_View_BrowseNotes_PlanDesignNotes_Edit = "//textarea[@ng-model='guaranteeNote.planDesignNotes']";  //	xpath
			public static final String Guarantee_View_BrowseNotes_UMOptionNotes_Edit = "//textarea[@ng-model='guaranteeNote.umOptionNotes']";  //	xpath
			public static final String Guarantee_View_BrowseNotes_FormularyDesignNotes_Edit = "//textarea[@ng-model='guaranteeNote.fmyDesignNotes']";  //xpath
			public static final String Guarantee_View_BrowseNotes_Close_Button = "//*[@name='noteForm']//button[text()='Close']";
		}
		
		public class ViewMembershipClaimCountsPanel {
			public static final String MembershipClaimCounts_View_Update_Button = "(//*[@ng-controller='membershipClaimCountsCtrl']//button[text()='Update'])[1]";
			public static final String MembershipClaimCounts_View_MembershipClaimCountsPanel_Table = "//*[@id='membershipClaimCountsSelection']//table";
			public static final String MembershipClaimCounts_View_MembershipClaimCountsPanel = "//*[@ng-controller='membershipClaimCountsCtrl']//*[@aria-controls='membershipClaimCountsSelection']";
		}
		
		public class ViewReportingPanel {
			public static final String Reporting_View_Update_Button = "(//*[@ng-controller='reportingCtrl']//button[text()='Update'])[1]";
			public static final String Reporting_View_ReportingPanel_Table = "//*[@id='reportingSelection']//table";
			public static final String Reporting_View_ReportingPanel = "//*[@ng-controller='reportingCtrl']//*[@aria-controls='reportingSelection']";
		}
		
		public class ViewVendorFormularyID {
			public static final String AssignmentCriteria_View_Update_Button = "(//*[@ng-controller='extractionCriteriaCtrl']//button[text()='Update'])[1]";
			public static final String AssignmentCriteria_View_AssignmentCriteriaPanel = "//*[@ng-controller='extractionCriteriaCtrl']//*[@aria-controls='extractionCriteriaSelection']";
			public static final String AssignmentCriteria_View_VendorFormularyID_Table = "//*[@name='extCritFormularyTable']";			
		}
		
		public class ViewLineOfBusiness {
			public static final String AssignmentCriteria_View_LineOfBusiness_Table = "//*[@ng-controller='extractionCriteriaLobCtrl']//*[@name='extCritLOBTable']";			
		}
		
		public class ViewHospiceFacility {
			public static final String AssignmentCriteria_View_HospiceFacility_Table = "//*[@id='extractionCriteriaSelection']//*[text()='Hospice facility:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewPriorAuthorizationProgram {
			public static final String AssignmentCriteria_View_PriorAuthorizationProgram_Table = "//*[@id='extractionCriteriaSelection']//*[text()='Prior authorization program:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewStepTherapyProgram {
			public static final String AssignmentCriteria_View_StepTherapyProgram_Table = "//*[@id='extractionCriteriaSelection']//*[text()='Step therapy program:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewFocusedUMBundleDiabetes {
			public static final String AssignmentCriteria_View_FocusedUMBundleDiabetes_Table = "//*[@id='extractionCriteriaSelection']//*[text()='Focused UM bundle-diabetes:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewFocusedUMBundleRespiratory {
			public static final String AssignmentCriteria_View_FocusedUMBundleRespiratory_Table = "//*[@id='extractionCriteriaSelection']//*[text()='Focused UM bundle-respiratory:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewFocusedUMBundleSpecialty {
			public static final String AssignmentCriteria_View_FocusedUMBundleSpecialty_Table = "//*[@id='extractionCriteriaSelection']//*[text()='Focused UM bundle-specialty:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewFocusedUMBundleMiscellaneous {
			public static final String AssignmentCriteria_View_FocusedUMBundleMiscellaneous_Table = "//*[@id='extractionCriteriaSelection']//*[text()='Focused UM bundle-miscellaneous:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewTNFRAUM {
			public static final String AssignmentCriteria_View_TNFRAUM_Table = "//*[@id='extractionCriteriaSelection']//*[text()='TNF/RA UM:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewHCVHarvoniUMWithST {
			public static final String AssignmentCriteria_View_HCVHarvoniUMWithST_Table = "//*[@id='extractionCriteriaSelection']//*[text()='HCV Harvoni UM with ST:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewHCVSolvaldiUMWithoutST {
			public static final String AssignmentCriteria_View_HCVSolvaldiUMWithoutST_Table = "//*[@id='extractionCriteriaSelection']//*[text()='HCV Solvaldi UM without ST:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewHCVMavyretTiering {
			public static final String AssignmentCriteria_View_HCVMavyretTiering_Table = "//*[@id='extractionCriteriaSelection']//*[text()='HCV Mavyret tiering:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewHCVEpclusaUM {
			public static final String AssignmentCriteria_View_HCVEpclusaUM_Table = "//*[@id='extractionCriteriaSelection']//*[text()='HCV Epclusa UM:']/parent::*/following-sibling::*/table";			
		}
		
		public class ViewTierDescriptionAssignment {
			public static final String AssignmentCriteria_View_TierDescriptionAssignment_Table = "//*[@ng-controller='tierAssignmentCriteriaCtrl']//*[@name='extCritLOBTable']";
		}
		
		public class ViewGuaranteeCodeAssignment {
			public static final String AssignmentCriteria_View_GuaranteeCodeAssignment_Table = "//*[@name='extCritGuaranteeTable']";
		}		
		
		public class ViewExcludedClaims {
			public static final String AssignmentCriteria_View_ExcludedClaims_Table = "//*[@name='extCritExcClaimTable']";
		}
		
		public class ViewNumberOfTiersAssignment {
			public static final String AssignmentCriteria_View_NumberOfTiersAssignment_Table = "//*[@name='assgnNbrOfTiersTable']";
		}
		
		public class ViewAuthorizedBrandAlternativesPanel {
			public static final String AuthorizedBrandAlternatives_View_Update_Button = "//*[@ng-controller='authorizedBrandAlternativesExcCtrl']//button[text()='Update']";
			public static final String AuthorizedBrandAlternatives_View_AuthorizedBrandAlternativesPanel = "//*[@ng-controller='authorizedBrandAlternativesExcCtrl']//*[@aria-controls='authorizedBrandAlternativesExcSelection']";
			public static final String AuthorizedBrandAlternatives_View_ReportingDetails_Table = "//*[@name='authorizedBrandAlternativesExcCritTable']";			
		}
		
		//************************************************* Update ****************************************************************************************
		
		public class UpdateContractInformationPanel	{
			public static final String ContractInformation_Update_VendorContractType_List = "contract.vendorContractType";		//	ng-model
			public static final String ContractInformation_Update_VendorClaimBasis_List = "contract.vendorClaimBasis";		//	ng-model			
			public static final String ContractInformation_Update_VendorDaySupply_List = "contract.vendorDaySupply";		//	ng-model
			public static final String ContractInformation_Update_ClientType = "contract.clientType";
			public static final String ContractInformation_Update_ContractName_Edit = "contract.contractName";		//	ng-model			
			public static final String ContractInformation_Update_ReclassificationDrugVendor_List = "contract.drugVendor";		//	ng-model										
			public static final String ContractInformation_Update_ContractType_List = "contract.contractType";		//	ng-model			
			public static final String ContractInformation_Update_ClaimBasis_List = "contract.claimBasis";		//	ng-model			
			public static final String ContractInformation_Update_ContractStartDate_Edit = "contract.startDate";		//	ng-model			
			public static final String ContractInformation_Update_ContractEndDate_Edit = "contract.endDate";		//	ng-model			
			public static final String ContractInformation_Update_CosmeticDrugs_CheckBox = "//*[text()='Cosmetic drugs']//parent::*/input";
			public static final String ContractInformation_Update_CompoundDrugs_CheckBox = "//*[text()='Compound drugs']//parent::*/input";
			public static final String ContractInformation_Update_MultisourceBrandDrugs_CheckBox = "//*[text()='Multisource brand drugs']//parent::*/input";
			public static final String ContractInformation_Update_Vaccines_CheckBox = "//*[text()='Vaccines']//parent::*/input";
			public static final String ContractInformation_Update_OverTheCounterDrugs_CheckBox = "//*[text()='Over the counter drugs']//parent::*/input";
			public static final String ContractInformation_Update_ExceptInsulins_CheckBox = "//*[text()='Except insulins']//parent::*/input";
			public static final String ContractInformation_Update_ExceptDiabeticSuppliesAndTestStrips_CheckBox = "//*[text()=Except diabetic supplies and test strips']//parent::*/input";
			public static final String ContractInformation_Update_ReclassifySpecialtyClaimsToRetail_CheckBox = "//*[text()='Reclassify specialty claims to retail']//parent::*/input";
			public static final String ContractInformation_Update_ReclassifyDaySupplyBreakAt34_CheckBox = "//*[text()='Reclassify day supply break at 34']//parent::*/input";
			public static final String ContractInformation_Update_ReclassifyBrandClaimsToGeneric_CheckBox = "//*[text()='Reclassify brand claims to generic']//parent::*/input";			
			public static final String ContractInformation_Update_MonthlyPenalty_Edit = "contract.penalty.monthlyPenalty";	//	ng-model
			public static final String ContractInformation_Update_MinimumClaimsToAvoidPenalty_Edit = "contract.penalty.avoidPenalty";	//	ng-model
			public static final String ContractInformation_Update_PenaltyStartDate_Edit = "contract.penalty.startDate";	//	ng-model
			public static final String ContractInformation_Update_PenaltyEndDate_Edit = "contract.penalty.endDate";	//	ng-model			
			public static final String ContractInformation_Update_RateDetails_StartDate_Edit = "customerRateDetailsdata.startDate"; 	//	ng-model
			public static final String ContractInformation_Update_RateDetails_EndDate_Edit = "customerRateDetailsdata.endDate"; 	//	ng-model			
			public static final String ContractInformation_Update_RateDetails_LineOfBusiness_List = "customerRateDetailsdata.vendorLOBTypeID"; 	//	ng-model
			public static final String ContractInformation_Update_Transparency_List = "customerRateDetailsdata.transparency"; 	//	ng-model
			public static final String ContractInformation_Update_FeeMethod_List = "customerRateDetailsdata.feeMethod"; 	//	ng-model			
			public static final String ContractInformation_Update_VendorRebateShare_Edit = "customerRateDetailsdata.vendorRebateShare"; 	//	ng-model
			public static final String ContractInformation_Update_AdminFee_Edit = "customerRateDetailsdata.adminFee"; 	//	ng-model
			public static final String ContractInformation_Update_DSTRebateShare_Edit = "customerRateDetailsdata.dstRebateShare"; 		//	ng-model			
			public static final String ContractInformation_Update_CustomerRebateShare_Edit = "customerRateDetailsdata.customerRebateShare"; 	//	ng-model
			public static final String ContractInformation_Update_DSTRevenue_Edit = "customerRateDetailsdata.calDSTrevenue"; 	//	ng-model			
			public static final String ContractInformation_Update_VendorAdjDaySupplyOption_List = "customerRateDetailsdata.adjVendorDaySupplyOption"; 	//	ng-model
			public static final String ContractInformation_Update_CustomerAdjDaySupplyOption_List = "customerRateDetailsdata.adjCustomerDaySupplyOption"; 	//	ng-model			
			public static final String ContractInformation_Update_Notes_Edit = "customerRateDetailsdata.rateNotes"; 	//	ng-model			
			public static final String ContractInformation_Update_ContractInformationPanel_Update_Button = "//*[@ng-controller='customerContractCtrl']//*[@class='panel-title']//following-sibling::button[text()='Update']";
			public static final String ContractInformation_Update_AddOrUpdate_Button = "//button[contains(@ng-click,'addOrUpdateRateDetail')]";
			public static final String ContractInformation_Update_RateDetails_Table = "//table[@ng-table='custContraTableParams']";
			public static final String ContractInformation_Update_RateDetails_Table_Remove_Button ="//*[@ng-controller='rateDetailCtrl']//button[text()='Remove']";
			public static final String ContractInformation_Update_RateDetails_Table_Update_Button ="//*[@ng-controller='rateDetailCtrl']//button[text()='Update']";	
			public static final String ContractInformation_Update_Save_Button= "//*[@class='rebate-container']//button[text()='Save']";
		}
		
		public class UpdateGuaranteePanel	{
			public static final String Guarantee_Update_StartDate_Edit = "guarantee.startDate";		//	ng-model
			public static final String Guarantee_Update_EndDate_Edit = "guarantee.endDate";		//	ng-model
			public static final String Guarantee_Update_VendorFormularyID_Edit = "guarantee.vendorFmyId";		//	ng-model			
			public static final String Guarantee_Update_VendorFormularyType_List = "guarantee.vendorFmyTypeId"; //	ng-model
			public static final String Guarantee_Update_DSTFormularyType_List = "guarantee.argusFmyTypeId";	//	ng-model
			public static final String Guarantee_Update_TierType_Edit = "guarantee.tierType";		//	ng-model
			public static final String Guarantee_Update_Channel_List = "guarantee.channelId"; 	//	ng-model
			public static final String Guarantee_Update_LineOfBusiness_List = "guarantee.lob"; 	//	ng-model
			public static final String Guarantee_Update_VendorBrandGuarantee_Edit = "guarantee.vendorGuarantee"; 	//	ng-model
			public static final String Guarantee_Update_CustomerBrandGuarantee_Edit = "guarantee.argusGuarantee"; 	//	ng-model
			public static final String Guarantee_Update_BenefitDesign_List = "guarantee.benefitDesign"; 	//	ng-model
			public static final String Guarantee_Update_UMOption_List = "guarantee.umOptionId"; 	//	ng-model
			public static final String Guarantee_Update_BenefitDesignDescriptionNotes_Edit = "guarantee.benifitDesignDespNotes"; 	//	ng-model
			public static final String Guarantee_Update_PlanDesignNotes_Edit = "guarantee.planDesignNotes"; 	//	ng-model
			public static final String Guarantee_Update_UMOptionNotes_Edit = "guarantee.umOptionNotes"; 		//	ng-model
			public static final String Guarantee_Update_FormularyDesignNotes_Edit = "guarantee.fmyDesignNotes"; 		//	ng-model			
			public static final String Guarantee_Update_GuaranteePanel_Update_Button = "//*[@ng-controller='guaranteeCtrl']//button[contains(@ng-click,'updateForm')]";
			public static final String Guarantee_Update_AddOrUpdateButton = "//button[contains(@ng-click,'addOrUpdateGuarantee')]";
			public static final String Guarantee_Update_GuaranteePanel_Table = "//*[@id='guaranteeSelection']//table";
			public static final String Guarantee_Update_Table_Remove_Button = "//*[@id='guaranteeSelection']//button[text()='Remove']";
			public static final String Guarantee_Update_Table_Update_Button = "//*[@id='guaranteeSelection']//button[text()='Update']";
			public static final String Guarantee_Update_Table_BrowseNotes_Button = "//button[contains(@ng-click,'browseNoteBtnClick')]";
			public static final String Guarantee_Update_Save_Button= "//*[@class='rebate-container']//button[text()='Save']";
		}
		
		public class UpdateMembershipClaimCountsPanel {
			public static final String MembershipClaimCounts_Update_EstablishContractualMembershipClaimCountsBy_List = "membershipClaimCounts.establishType"; 	//	ng-model
			public static final String MembershipClaimCounts_Update_CustomerVendorFormularyID_By_Customer_List = "membershipClaimCounts.customerId"; //	ng-model
			public static final String MembershipClaimCounts_Update_CustomerVendorFormularyID_By_VendorFormularyID_List = "membershipClaimCounts.vendorFormularyId"; //	ng-model			
			public static final String MembershipClaimCounts_Update_ContractualMembershipCount_Edit = "membershipClaimCounts.countMembership";		//	ng-model
			public static final String MembershipClaimCounts_Update_MembershipPercentThreshold_Edit = "membershipClaimCounts.percentMembership"; 	//	ng-model
			public static final String MembershipClaimCounts_Update_ContractualClaimCount_Edit = "membershipClaimCounts.countClaim";  	//	ng-model
			public static final String MembershipClaimCounts_Update_ClaimPercentThreshold_Edit = "membershipClaimCounts.percentClaim";  	//	ng-model
			public static final String MembershipClaimCounts_Update_Update_Button_At_MCCountsPanel= "//*[@ng-controller='membershipClaimCountsCtrl']//button[contains(@ng-click,'updateForm')]";
			public static final String MembershipClaimCounts_Update_AddOrUpdateButton = "//button[contains(@ng-click,'addOrUpdateMembershipClaimCounts')]"; 	
			public static final String MembershipClaimCounts_Update_MembershipClaimCountsPanel_Table = "//*[@id='membershipClaimCountsSelection']//table";
			public static final String MembershipClaimCounts_Update_Table_Remove_Button = "//*[@id='membershipClaimCountsSelection']//button[text()='Remove']";
			public static final String MembershipClaimCounts_Update_Table_Update_Button = "//*[@id='membershipClaimCountsSelection']//button[text()='Update']";
			public static final String MembershipClaimCounts_Update_Save_Button= "//*[@class='rebate-container']//button[text()='Save']";
			
		}
		
		public class UpdateReportingPanel 
		{
			public static final String Reporting_Update_Package_List = "reporting.packageTypeId";  	//	ng-model
			public static final String Reporting_Update_Level_List = "reporting.levelTypeId";  	//	ng-model
			public static final String Reporting_Update_StartDate_Edit = "reporting.startDate";  	//	ng-model
			public static final String Reporting_Update_EndDate_Edit = "reporting.endDate";  	//	ng-model
			public static final String Reporting_Update_PackageNotes_Edit = "reporting.packageNotes";  	//	ng-model
			public static final String Reporting_Update_LevelNotes_Edit = "reporting.levelNotes";  	//	ng-model
			public static final String Reporting_Update_Update_Button_At_ReportingPanel= "//*[@ng-controller='reportingCtrl']//button[contains(@ng-click,'updateForm')]";
			public static final String Reporting_Update_AddOrUpdateButton = "//button[contains(@ng-click,'addOrUpdateReporting')]"; 	
			public static final String Reporting_Update_ReportingPanel_Table = "//*[@id='reportingSelection']//table";
			public static final String Reporting_Update_Table_Remove_Button = "//*[@id='reportingSelection']//button[text()='Remove']";
			public static final String Reporting_Update_Table_Update_Button = "//*[@id='reportingSelection']//button[text()='Update']";
			public static final String Reporting_Update_Save_Button= "//*[@class='rebate-container']//button[text()='Save']";
		}
		
		public class UpdateVendorFormularyIDAssignment {
            public static final String AssignmentCriteria_Update_AssignVendorFormularyIDBy_List = "extractionCriteria.formularyAssignTypeCd";        //       ng-model
            public static final String AssignmentCriteria_Update_AssignedVendorFormularyID_Edit = "selectedExtFrmlryCrit.assignedVFID";       //       ng-model
            
            public static final String AssignmentCriteria_Update_VendorFormularyID_AvailableCoverageCode_Table = "//table[@name='formularyCoverageCodeTable']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_AvailableCoverageCodes_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_VendorFormularyID_SelectedCoverageCodes_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_VendorFormularyID_CoverageCode1_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_CoverageCode2_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_Description_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='description']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_CoverageCodeStatus_Edit = "//table[@name='formularyCoverageCodeTable']//input[@name='status']";          
            
            public static final String AssignmentCriteria_Update_VendorFormularyID_AvailableDrugList_Table = "//table[@name='formularyDrugListTable']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_AvailableDrugList_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_VendorFormularyID_SelectedDrugList_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_VendorFormularyID_DrugListID_Edit = "//table[@name='formularyDrugListTable']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_Name_Edit = "//table[@name='formularyDrugListTable']//input[@name='name']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_Type_Edit = "//table[@name='formularyDrugListTable']//input[@name='type']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_DrugListStatus_Edit = "//table[@name='formularyDrugListTable']//input[@name='status']";          
            
            public static final String AssignmentCriteria_Update_VendorFormularyID_AvailableClient_Table = "//table[@name='formularyClientTable']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_AvailableClient_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_VendorFormularyID_SelectedClient_Label= "//form[@name='extCritFrmlryForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_VendorFormularyID_ClientNumber_Edit = "//table[@name='formularyClientTable']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_ClientName_Edit = "//table[@name='formularyClientTable']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_ClientStartDate_Edit = "//table[@name='formularyClientTable']//input[@name='startDate']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_ClientEndDate_Edit = "//table[@name='formularyClientTable']//input[@name='endDate']";          
            
            public static final String AssignmentCriteria_Update_VendorFormularyID_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateExtFrmlryCrit')]";
            public static final String AssignmentCriteria_Update_VendorFormularyID_SelectedAssignment_Table = "//table[@name='extCritFormularyTable']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_Remove_Button = "//*[@ng-controller='extractionCriteriaFormularyCtrl']//button[text()='Remove']";
            public static final String AssignmentCriteria_Update_VendorFormularyID_Update_Button = "//*[@ng-controller='extractionCriteriaFormularyCtrl']//button[text()='Update']";
        }
		
		public class UpdateLineOfBusinessAssignment {
		    public static final String AssignmentCriteria_Update_AssignLineOfBusinessBy_List = "extractionLOBCriteria.lobAssignTypeCd";  //       ng-model
		    public static final String AssignmentCriteria_Update_AssignedLineOfBusiness_List = "extractionLOBCriteria.vendorLOBTypeId";  //       ng-model
		    
		    public static final String AssignmentCriteria_Update_LineOfBusiness_AvailableCoverageCode_Table = "//table[@name='lobCoverageCodeTable']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_AvailableCoverageCodes_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_SelectedCoverageCodes_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_CoverageCode1_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='coverageCode1']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_CoverageCode2_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='coverageCode2']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_Description_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='description']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_CoverageCodeStatus_Edit = "//table[@name='lobCoverageCodeTable']//input[@name='status']";
		      
		    public static final String AssignmentCriteria_Update_LineOfBusiness_AvailableDrugList_Table = "//table[@name='lobDrugListTable']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_AvailableDrugList_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_SelectedDrugList_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_DrugListID_Edit = "//table[@name='lobDrugListTable']//input[@name='drugListName']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_Name_Edit = "//table[@name='lobDrugListTable']//input[@name='name']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_Type_Edit = "//table[@name='lobDrugListTable']//input[@name='type']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_DrugListStatus_Edit = "//table[@name='lobDrugListTable']//input[@name='status']";
		      
		    public static final String AssignmentCriteria_Update_LineOfBusiness_AvailableClient_Table = "//table[@name='lobClientTable']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_AvailableClient_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Available clients')]";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_SelectedClient_Label= "//form[@name='extCritLobForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_ClientNumber_Edit = "//table[@name='lobClientTable']//input[@name='clientId']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_ClientName_Edit = "//table[@name='lobClientTable']//input[@name='clientName']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_ClientStartDate_Edit = "//table[@name='lobClientTable']//input[@name='startDate']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_ClientEndDate_Edit = "//table[@name='lobClientTable']//input[@name='endDate']";
		      
		    public static final String AssignmentCriteria_Update_LineOfBusiness_Add_Button = "saveOrUpdateBtnTextForLob";      // ng-bind
		    public static final String AssignmentCriteria_Update_LineOfBusiness_SelectedAssignment_Table = "//table[@name='extCritLOBTable']";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_Remove_Button = "//button[contains(@ng-click,'ClickFun.removeExtLOBCrit')]";
		    public static final String AssignmentCriteria_Update_LineOfBusiness_Update_Button = "(//button[contains(@ng-click,'ClickFun.updateBtnClickLOB')])[1]";		    
                                               
        }
		
		public class UpdateHospiceFacility {
	        public static final String AssignmentCriteria_Update_AssignHospiceFacilityBy_List = "hospiceFacility_type";  //       by.Id
	        public static final String AssignmentCriteria_Update_AssignedHospiceFacility_List = "hospiceFacility_option";  //     by.Id
	          
	        public static final String AssignmentCriteria_Update_HospiceFacility_AvailableCoverageCode_Table = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'coverageCode')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_AvailableCoverageCodes_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_SelectedCoverageCodes_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_CoverageCode1_Edit = "//form[@name='hospiceFacilityForm']//input[@name='coverageCode1']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_CoverageCode2_Edit = "//form[@name='hospiceFacilityForm']//input[@name='coverageCode2']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_Description_Edit = "//form[@name='hospiceFacilityForm']//input[@name='description']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_CoverageCodeStatus_Edit = "//form[@name='hospiceFacilityForm']////input[@name='status']";
	          
	        public static final String AssignmentCriteria_Update_HospiceFacility_AvailableDrugList_Table = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'drugList')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_AvailableDrugList_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_SelectedDrugList_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_DrugListID_Edit = "//form[@name='hospiceFacilityForm']//input[@name='drugListName']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_Name_Edit = "//form[@name='hospiceFacilityForm']//input[@name='name']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_Type_Edit = "//form[@name='hospiceFacilityForm']//input[@name='type']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_DrugListStatus_Edit = "//form[@name='hospiceFacilityForm']//input[@name='status']";
	          
	        public static final String AssignmentCriteria_Update_HospiceFacility_AvailableClient_Table = "//form[@name='hospiceFacilityForm']//table[contains(@ng-table,'client')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_AvailableClient_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Available clients')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_SelectedClient_Label= "//form[@name='hospiceFacilityForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_ClientNumber_Edit = "//form[@name='hospiceFacilityForm']//input[@name='clientId']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_ClientName_Edit = "//form[@name='hospiceFacilityForm']//input[@name='clientName']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_ClientStartDate_Edit = "//form[@name='hospiceFacilityForm']//input[@name='startDt']";
	      	public static final String AssignmentCriteria_Update_HospiceFacility_ClientEndDate_Edit = "//form[@name='hospiceFacilityForm']//input[@name='endDt']";
	          
	        public static final String AssignmentCriteria_Update_HospiceFacility_Add_Button = "//button[@type='submit' and contains(@ng-class,'hospiceFacilityForm')]";
	        //public static final String AssignmentCriteria_Update_HospiceFacility_SelectedAssignment_Table = "//*[contains(text(),'Hospice Facility Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//table";
	        public static final String AssignmentCriteria_Update_HospiceFacility_SelectedAssignment_Table = "//*[contains(text(),'Hospice Facility Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//table[@ng-table='vm[vm.tableOptions.criteria.name].table']";
	        public static final String AssignmentCriteria_Update_HospiceFacility_Remove_Button = "//*[contains(text(),'Hospice Facility Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
	        public static final String AssignmentCriteria_Update_HospiceFacility_Update_Button = "//*[contains(text(),'Hospice Facility Assignment')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
                  
        }
		
		public class UpdatePriorAuthorizationProgram {
            public static final String AssignmentCriteria_Update_AssignPriorAuthorizationProgramBy_List = "priorAuth_type";         //          by.Id
            public static final String AssignmentCriteria_Update_AssignedPriorAuthorizationProgram_List = "priorAuth_option";             //       by.Id
                  
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_AvailableCoverageCode_Table = "//form[@name='priorAuthForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_AvailableCoverageCodes_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_SelectedCoverageCodes_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_CoverageCode1_Edit = "//form[@name='priorAuthForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_CoverageCode2_Edit = "//form[@name='priorAuthForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_Description_Edit = "//form[@name='priorAuthForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_CoverageCodeStatus_Edit = "//form[@name='priorAuthForm']//input[@name='status']";              
                  
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_AvailableDrugList_Table = "//form[@name='priorAuthForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_AvailableDrugList_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_SelectedDrugList_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_DrugListID_Edit = "//form[@name='priorAuthForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_Name_Edit = "//form[@name='priorAuthForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_Type_Edit = "//form[@name='priorAuthForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_DrugListStatus_Edit = "//form[@name='priorAuthForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_AvailableClient_Table = "//form[@name='priorAuthForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_AvailableClient_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_SelectedClient_Label= "//form[@name='priorAuthForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_ClientNumber_Edit = "//form[@name='priorAuthForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_ClientName_Edit = "//form[@name='priorAuthForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_ClientStartDate_Edit = "//form[@name='priorAuthForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_ClientEndDate_Edit = "//form[@name='priorAuthForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_Add_Button = "//button[@type='submit' and contains(@ng-class,'priorAuthForm')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_SelectedAssignment_Table = "//*[contains(text(),'Prior Authorization Program')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//table[@ng-table='vm[vm.tableOptions.criteria.name].table']";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_Remove_Button = "//*[contains(text(),'Prior Authorization Program')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_PriorAuthorizationProgram_Update_Button = "//*[contains(text(),'Prior Authorization Program')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
        }
		
		public class UpdateStepTherapyProgram {
            public static final String AssignmentCriteria_Update_AssignStepTherapyProgramBy_List = "stepTherapy_type";             //          by.Id
            public static final String AssignmentCriteria_Update_AssignedStepTherapyProgram_List = "stepTherapy_option";           //          by.Id
                  
            public static final String AssignmentCriteria_Update_StepTherapyProgram_AvailableCoverageCode_Table = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_AvailableCoverageCodes_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_SelectedCoverageCodes_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_CoverageCode1_Edit = "//form[@name='stepTherapyForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_CoverageCode2_Edit = "//form[@name='stepTherapyForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_Description_Edit = "//form[@name='stepTherapyForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_CoverageCodeStatus_Edit = "//form[@name='stepTherapyForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_StepTherapyProgram_AvailableDrugList_Table = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_AvailableDrugList_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_SelectedDrugList_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_DrugListID_Edit = "//form[@name='stepTherapyForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_Name_Edit = "//form[@name='stepTherapyForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_Type_Edit = "//form[@name='stepTherapyForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_DrugListStatus_Edit = "//form[@name='stepTherapyForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_StepTherapyProgram_AvailableClient_Table = "//form[@name='stepTherapyForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_AvailableClient_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_SelectedClient_Label= "//form[@name='stepTherapyForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_ClientNumber_Edit = "//form[@name='stepTherapyForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_ClientName_Edit = "//form[@name='stepTherapyForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_ClientStartDate_Edit = "//form[@name='stepTherapyForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_ClientEndDate_Edit = "//form[@name='stepTherapyForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_StepTherapyProgram_Add_Button = "//button[@type='submit' and contains(@ng-class,'stepTherapyForm')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_SelectedAssignment_Table = "//*[contains(text(),'Step Therapy Program')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";  
            public static final String AssignmentCriteria_Update_StepTherapyProgram_Remove_Button = "//span[contains(text(),'Step Therapy Program')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_StepTherapyProgram_Update_Button   = "//span[contains(text(),'Step Therapy Program')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
             
        }
		
		public class UpdateFocusedUMBundleDiabetes {
            public static final String AssignmentCriteria_Update_AssignFocusedUMBundleDiabetesBy_List = "fubDiabetes_type";             // by.id
            public static final String AssignmentCriteria_Update_AssignedFocusedUMBundleDiabetes_List = "fubDiabetes_option"; // by.id
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_AvailableCoverageCode_Table = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_AvailableCoverageCodes_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_SelectedCoverageCodes_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_CoverageCode1_Edit = "//form[@name='fubDiabetesForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_CoverageCode2_Edit = "//form[@name='fubDiabetesForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_Description_Edit = "//form[@name='fubDiabetesForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_CoverageCodeStatus_Edit = "//form[@name='fubDiabetesForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_AvailableDrugList_Table = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_AvailableDrugList_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_SelectedDrugList_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_DrugListID_Edit = "//form[@name='fubDiabetesForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_Name_Edit = "//form[@name='fubDiabetesForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_Type_Edit = "//form[@name='fubDiabetesForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_DrugListStatus_Edit = "//form[@name='fubDiabetesForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_AvailableClient_Table = "//form[@name='fubDiabetesForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_AvailableClient_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_SelectedClient_Label= "//form[@name='fubDiabetesForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_ClientNumber_Edit = "//form[@name='fubDiabetesForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_ClientName_Edit = "//form[@name='fubDiabetesForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_ClientStartDate_Edit = "//form[@name='fubDiabetesForm']//input[@name='startDt']";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_ClientEndDate_Edit = "//form[@name='fubDiabetesForm']//input[@name='endDt']";
                  
          	public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubDiabetesForm')]";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_SelectedAssignment_Table = "//*[contains(text(),'UM Bundle-Diabetes')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_Remove_Button = "//span[contains(text(),'Focused UM Bundle-Diabetes')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Remove')]";
          	//public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_Update_Button = "//span[contains(text(),'Focused UM Bundle-Diabetes Assignment')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleDiabetes_Update_Button = "//span[contains(text(),'Focused UM Bundle-Diabetes')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
		}
		
		public class UpdateFocusedUMBundleRespiratory {
            public static final String AssignmentCriteria_Update_AssignFocusedUMBundleRespiratoryBy_List = "fubRespiratory_type";               // by.id
            public static final String AssignmentCriteria_Update_AssignedFocusedUMBundleRespiratory_List = "fubRespiratory_option";   // by.id
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_AvailableCoverageCode_Table = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_AvailableCoverageCodes_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_SelectedCoverageCodes_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_CoverageCode1_Edit = "//form[@name='fubRespiratoryForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_CoverageCode2_Edit = "//form[@name='fubRespiratoryForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_Description_Edit = "//form[@name='fubRespiratoryForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_CoverageCodeStatus_Edit = "//form[@name='fubRespiratoryForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_AvailableDrugList_Table = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_AvailableDrugList_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_SelectedDrugList_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_DrugListID_Edit = "//form[@name='fubRespiratoryForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_Name_Edit = "//form[@name='fubRespiratoryForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_Type_Edit = "//form[@name='fubRespiratoryForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_DrugListStatus_Edit = "//form[@name='fubRespiratoryForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_AvailableClient_Table = "//form[@name='fubRespiratoryForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_AvailableClient_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_SelectedClient_Label= "//form[@name='fubRespiratoryForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_ClientNumber_Edit = "//form[@name='fubRespiratoryForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_ClientName_Edit = "//form[@name='fubRespiratoryForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_ClientStartDate_Edit = "//form[@name='fubRespiratoryForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_ClientEndDate_Edit = "//form[@name='fubRespiratoryForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubRespiratoryForm')]";
           	public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_SelectedAssignment_Table = "//*[contains(text(),'UM Bundle-Respiratory')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_Remove_Button = "//span[contains(text(),'Focused UM Bundle-Respiratory')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleRespiratory_Update_Button = "//span[contains(text(),'Focused UM Bundle-Respiratory')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
		}
		
		public class UpdateFocusedUMBundleSpecialty {
            public static final String AssignmentCriteria_Update_AssignFocusedUMBundleSpecialtyBy_List = "fubSpecialty_type";            // by.id
            public static final String AssignmentCriteria_Update_AssignedFocusedUMBundleSpecialty_List = "fubSpecialty_option"; // by.id
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_AvailableCoverageCode_Table = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_AvailableCoverageCodes_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_SelectedCoverageCodes_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_CoverageCode1_Edit = "//form[@name='fubSpecialtyForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_CoverageCode2_Edit = "//form[@name='fubSpecialtyForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_Description_Edit = "//form[@name='fubSpecialtyForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_CoverageCodeStatus_Edit = "//form[@name='fubSpecialtyForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_AvailableDrugList_Table = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_AvailableDrugList_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_SelectedDrugList_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_DrugListID_Edit = "//form[@name='fubSpecialtyForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_Name_Edit = "//form[@name='fubRespiratoryForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_Type_Edit = "//form[@name='fubSpecialtyForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_DrugListStatus_Edit = "//form[@name='fubSpecialtyForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_AvailableClient_Table = "//form[@name='fubSpecialtyForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_AvailableClient_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_SelectedClient_Label= "//form[@name='fubSpecialtyForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_ClientNumber_Edit = "//form[@name='fubSpecialtyForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_ClientName_Edit = "//form[@name='fubSpecialtyForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_ClientStartDate_Edit = "//form[@name='fubSpecialtyForm']//input[@name='startDt']";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_ClientEndDate_Edit = "//form[@name='fubSpecialtyForm']//input[@name='endDt']";
                  
          	public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubSpecialtyForm')]";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_SelectedAssignment_Table = "//*[contains(text(),'UM Bundle-Specialty')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_Remove_Button = "//span[contains(text(),'Focused UM Bundle-Specialty')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Remove')]";
          	public static final String AssignmentCriteria_Update_FocusedUMBundleSpecialty_Update_Button = "//span[contains(text(),'Focused UM Bundle-Specialty')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
		}		
		
		public class UpdateFocusedUMBundleMiscellaneous {
            public static final String AssignmentCriteria_Update_AssignFocusedUMBundleMiscellaneousBy_List = "fubMiscellaneous_type";            // by.id
            public static final String AssignmentCriteria_Update_AssignedFocusedUMBundleMiscellaneous_List = "fubMiscellaneous_option";          // by.id
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_AvailableCoverageCode_Table = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_AvailableCoverageCodes_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_SelectedCoverageCodes_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_CoverageCode1_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_CoverageCode2_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_Description_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_CoverageCodeStatus_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_AvailableDrugList_Table = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_AvailableDrugList_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_SelectedDrugList_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_DrugListID_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_Name_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_Type_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_DrugListStatus_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_AvailableClient_Table = "//form[@name='fubMiscellaneousForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_AvailableClient_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_SelectedClient_Label= "//form[@name='fubMiscellaneousForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_ClientNumber_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_ClientName_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_ClientStartDate_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_ClientEndDate_Edit = "//form[@name='fubMiscellaneousForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_Add_Button = "//button[@type='submit' and contains(@ng-class,'fubMiscellaneousForm')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_SelectedAssignment_Table = "//*[contains(text(),'UM Bundle-Miscellaneous')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_Remove_Button = "//span[contains(text(),'Focused UM Bundle-Miscellaneous')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_FocusedUMBundleMiscellaneous_Update_Button = "//span[contains(text(),'Focused UM Bundle-Miscellaneous')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
		}
		
		public class UpdateTNFRAUM {
            public static final String AssignmentCriteria_Update_AssignTNFRAUMBy_List = "tnf_type";    // by.id
            public static final String AssignmentCriteria_Update_AssignedTNFRAUM_List = "tnf_option";  // by.id
                  
            public static final String AssignmentCriteria_Update_TNFRAUM_AvailableCoverageCode_Table = "//form[@name='tnfForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_AvailableCoverageCodes_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_SelectedCoverageCodes_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_CoverageCode1_Edit = "//form[@name='tnfForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_TNFRAUM_CoverageCode2_Edit = "//form[@name='tnfForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_TNFRAUM_Description_Edit = "//form[@name='tnfForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_TNFRAUM_CoverageCodeStatus_Edit = "//form[@name='tnfForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_TNFRAUM_AvailableDrugList_Table = "//form[@name='tnfForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_AvailableDrugList_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_SelectedDrugList_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_DrugListID_Edit = "//form[@name='tnfForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_TNFRAUM_Name_Edit = "//form[@name='tnfForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_TNFRAUM_Type_Edit = "//form[@name='tnfForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_TNFRAUM_DrugListStatus_Edit = "//form[@name='tnfForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_TNFRAUM_AvailableClient_Table = "//form[@name='tnfForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_AvailableClient_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_SelectedClient_Label= "//form[@name='tnfForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_ClientNumber_Edit = "//form[@name='tnfForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_TNFRAUM_ClientName_Edit = "//form[@name='tnfForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_TNFRAUM_ClientStartDate_Edit = "//form[@name='tnfForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_TNFRAUM_ClientEndDate_Edit = "//form[@name='tnfForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_TNFRAUM_Add_Button = "//button[@type='submit' and contains(@ng-class,'tnfForm')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_SelectedAssignment_Table = "//*[contains(text(),'TNF/RA')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
            public static final String AssignmentCriteria_Update_TNFRAUM_Remove_Button = "//span[contains(text(),'TNF/RA')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_TNFRAUM_Update_Button = "//span[contains(text(),'TNF/RA')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/button[contains(text(),'Update')]";
		}		
		
		public class UpdateHCVHarvoniUMWithST {
            public static final String AssignmentCriteria_Update_AssignHCVHarvoniUMWithSTBy_List = "hcvHarvoni_type";            // by.id
            public static final String AssignmentCriteria_Update_AssignedHCVHarvoniUMWithST_List = "hcvHarvoni_option"; // by.id
                 
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_AvailableCoverageCode_Table = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_AvailableCoverageCodes_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_SelectedCoverageCodes_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_CoverageCode1_Edit = "//form[@name='hcvHarvoniForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_CoverageCode2_Edit = "//form[@name='hcvHarvoniForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_Description_Edit = "//form[@name='hcvHarvoniForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_CoverageCodeStatus_Edit = "//form[@name='hcvHarvoniForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_AvailableDrugList_Table = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_AvailableDrugList_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_SelectedDrugList_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_DrugListID_Edit = "//form[@name='hcvHarvoniForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_Name_Edit = "//form[@name='hcvHarvoniForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_Type_Edit = "//form[@name='hcvHarvoniForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_DrugListStatus_Edit = "//form[@name='hcvHarvoniForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_AvailableClient_Table = "//form[@name='hcvHarvoniForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_AvailableClient_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_SelectedClient_Label= "//form[@name='hcvHarvoniForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_ClientNumber_Edit = "//form[@name='hcvHarvoniForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_ClientName_Edit = "//form[@name='hcvHarvoniForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_ClientStartDate_Edit = "//form[@name='hcvHarvoniForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_ClientEndDate_Edit = "//form[@name='hcvHarvoniForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvHarvoniForm')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_SelectedAssignment_Table = "//*[contains(text(),'HCV Harvoni UM with ST')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_Remove_Button = "//*[contains(text(),'HCV Harvoni UM with ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_HCVHarvoniUMWithST_Update_Button = "//*[contains(text(),'HCV Harvoni UM with ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";                  
        }
        
        public class UpdateHCVSolvaldiUMWithoutST {
            public static final String AssignmentCriteria_Update_AssignHCVSolvaldiUMWithoutSTBy_List = "hcvSolvaldi_type";                // by.id
            public static final String AssignmentCriteria_Update_AssignedHCVSolvaldiUMWithoutST_List = "hcvSolvaldi_option";     // by.id
                  
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_AvailableCoverageCode_Table = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_AvailableCoverageCodes_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_SelectedCoverageCodes_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_CoverageCode1_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_CoverageCode2_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_Description_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_CoverageCodeStatus_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_AvailableDrugList_Table = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_AvailableDrugList_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_SelectedDrugList_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_DrugListID_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_Name_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_Type_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_DrugListStatus_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_AvailableClient_Table = "//form[@name='hcvSolvaldiForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_AvailableClient_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_SelectedClient_Label= "//form[@name='hcvSolvaldiForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_ClientNumber_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_ClientName_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_ClientStartDate_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_ClientEndDate_Edit = "//form[@name='hcvSolvaldiForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvSolvaldiForm')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_SelectedAssignment_Table = "//*[contains(text(),'HCV Solvaldi UM without ST')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_Remove_Button = "//*[contains(text(),'HCV Solvaldi UM without ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_HCVSolvaldiUMWithoutST_Update_Button = "//*[contains(text(),'HCV Solvaldi UM without ST')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
        }
        
        public class UpdateHCVMavyretTiering {
            public static final String AssignmentCriteria_Update_AssignHCVMavyretTieringBy_List = "hcvMavyret_type";               // by.id
            public static final String AssignmentCriteria_Update_AssignedHCVMavyretTiering_List = "hcvMavyret_option";    // by.id
                  
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_AvailableCoverageCode_Table = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_AvailableCoverageCodes_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_SelectedCoverageCodes_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_CoverageCode1_Edit = "//form[@name='hcvMavyretForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_CoverageCode2_Edit = "//form[@name='hcvMavyretForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_Description_Edit = "//form[@name='hcvMavyretForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_CoverageCodeStatus_Edit = "//form[@name='hcvMavyretForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_AvailableDrugList_Table = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_AvailableDrugList_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_SelectedDrugList_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_DrugListID_Edit = "//form[@name='hcvMavyretForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_Name_Edit = "//form[@name='hcvMavyretForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_Type_Edit = "//form[@name='hcvMavyretForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_DrugListStatus_Edit = "//form[@name='hcvMavyretForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_AvailableClient_Table = "//form[@name='hcvMavyretForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_AvailableClient_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_SelectedClient_Label= "//form[@name='hcvMavyretForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_ClientNumber_Edit = "//form[@name='hcvMavyretForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_ClientName_Edit = "//form[@name='hcvMavyretForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_ClientStartDate_Edit = "//form[@name='hcvMavyretForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_ClientEndDate_Edit = "//form[@name='hcvMavyretForm']//input[@name='endDt']";
                  
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvMavyretForm')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_SelectedAssignment_Table = "//*[contains(text(),'HCV Mavyret Tiering')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_Remove_Button = "//*[contains(text(),'HCV Mavyret Tiering')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_HCVMavyretTiering_Update_Button = "//*[contains(text(),'HCV Mavyret Tiering')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
        }
        
        public class UpdateHCVEpclusaUM {
            public static final String AssignmentCriteria_Update_AssignHCVEpclusaUMBy_List = "hcvEpclusa_type";             // by.id
            public static final String AssignmentCriteria_Update_AssignedHCVEpclusaUM_List = "hcvEpclusa_option"; // by.id
               
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_AvailableCoverageCode_Table = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'coverageCode')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_AvailableCoverageCodes_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Available coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_SelectedCoverageCodes_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Selected coverage codes')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_CoverageCode1_Edit = "//form[@name='hcvEpclusaForm']//input[@name='coverageCode1']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_CoverageCode2_Edit = "//form[@name='hcvEpclusaForm']//input[@name='coverageCode2']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_Description_Edit = "//form[@name='hcvEpclusaForm']//input[@name='description']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_CoverageCodeStatus_Edit = "//form[@name='hcvEpclusaForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_AvailableDrugList_Table = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'drugList')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_AvailableDrugList_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Available drug lists')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_SelectedDrugList_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Selected drug lists')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_DrugListID_Edit = "//form[@name='hcvEpclusaForm']//input[@name='drugListName']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_Name_Edit = "//form[@name='hcvEpclusaForm']//input[@name='name']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_Type_Edit = "//form[@name='hcvEpclusaForm']//input[@name='type']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_DrugListStatus_Edit = "//form[@name='hcvEpclusaForm']//input[@name='status']";
                  
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_AvailableClient_Table = "//form[@name='hcvEpclusaForm']//table[contains(@ng-table,'client')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_AvailableClient_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Available clients')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_SelectedClient_Label= "//form[@name='hcvEpclusaForm']//following-sibling::*/label[contains(text(),'Selected clients')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_ClientNumber_Edit = "//form[@name='hcvEpclusaForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_ClientName_Edit = "//form[@name='hcvEpclusaForm']//input[@name='clientName']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_ClientStartDate_Edit = "//form[@name='hcvEpclusaForm']//input[@name='startDt']";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_ClientEndDate_Edit = "//form[@name='hcvEpclusaForm']//input[@name='endDt']";
                  
           	public static final String AssignmentCriteria_Update_HCVEpclusaUM_Add_Button = "//button[@type='submit' and contains(@ng-class,'hcvEpclusaForm')]";
           	public static final String AssignmentCriteria_Update_HCVEpclusaUM_SelectedAssignment_Table = "//*[contains(text(),' HCV Epclusa UM')]//ancestor::*[@class='col-md-9 ng-scope']//following-sibling::*/table";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_Remove_Button = "//*[contains(text(),' HCV Epclusa UM')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_HCVEpclusaUM_Update_Button = "//*[contains(text(),' HCV Epclusa UM')]//ancestor::*[@ng-repeat='criteria in vm.assignmentCriteria']//button[contains(text(),'Update')]";
        }
        
        public class UpdateTierDescription {
            public static final String AssignmentCriteria_Update_AssignTierDescriptionBy_List = "extractionTierCriteria.tierAssignTypeCd";            //by-model
                  
            public static final String AssignmentCriteria_Update_TierDescription_Customer_Edit = "validCustomerId";        //by-model
            public static final String AssignmentCriteria_Update_TierDescription_DrugList_Edit = "selectedExtTierCrit.drugListId";  //by-model
                  
            public static final String AssignmentCriteria_Update_TierDescription_Tier_List = "selectedExtTierCrit.tier";         //by-model
            public static final String AssignmentCriteria_Update_TierDescription_Description_List = "selectedExtTierCrit.description";  //by-model
                  
            public static final String AssignmentCriteria_Update_TierDescription_Add_Button = "//form[@name='extCritTierForm']//*[text()='Add' or text()='Update']";
            public static final String AssignmentCriteria_Update_TierDescriptionAssignment_Table = "//*[@ng-controller='tierAssignmentCriteriaCtrl']//table"; 
            public static final String AssignmentCriteria_Update_TierDescription_Remove_Button = "//*[@ng-controller='tierAssignmentCriteriaCtrl']//button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_TierDescription_Update_Button = "//*[@ng-controller='tierAssignmentCriteriaCtrl']//button[contains(text(),'Update')]";
        }
        
        public class UpdateGuaranteeCodeAssignment {
            public static final String AssignmentCriteria_Update_AssignGuaranteeCodeBy_List = "//form[@name='extCritGrnteeForm']//select[@name='typeCode']";    //ng-model
            public static final String AssignmentCriteria_Update_GuaranteeCode_Customer_Edit = "//form[@name='extCritGrnteeForm']//input[@name='customerId']";
            public static final String AssignmentCriteria_Update_GuaranteeCode_DrugList_Edit = "//form[@name='extCritGrnteeForm']//input[@name='drugListId']";
            public static final String AssignmentCriteria_Update_GuaranteeCode_Client_Edit = "//form[@name='extCritGrnteeForm']//input[@name='clientId']";
            public static final String AssignmentCriteria_Update_GuaranteeCode_GuaranteeCode_Edit = "//form[@name='extCritGrnteeForm']//input[@name='guaranteeCode']";   //ng-model
                  
            public static final String AssignmentCriteria_Update_GuaranteeCode_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateExtGrnteeCrit')]";
            public static final String AssignmentCriteria_Update_GuaranteeCodeAssignment_Table = "//*[@ng-controller='assignmentguaranteeCtrl']//table";
            public static final String AssignmentCriteria_Update_GuaranteeCode_Remove_Button = "//button[contains(@ng-click,'ClickFun.removeExtGrnteeCrit()')]";
            public static final String AssignmentCriteria_Update_GuaranteeCode_Update_Button = "//*[@ng-controller='assignmentguaranteeCtrl']//button[contains(text(),'Update')]";
        }
        
        public class UpdateExcludeClaims {
            public static final String AssignmentCriteria_Update_ExcludeClaimsBy_List = "extractionExcludeCriteria.typeCode"; //ng-model
                  
            public static final String AssignmentCriteria_Update_ExcludeClaims_Client_Edit = "selectedExcClaimCrit.clientId"; //ng-model                             
            public static final String AssignmentCriteria_Update_ExcludeClaims_CoverageCode1_Edit = "selectedExcClaimCrit.coverageCode1"; //ng-model
            public static final String AssignmentCriteria_Update_ExcludeClaims_CoverageCode2_Edit = "selectedExcClaimCrit.coverageCode2"; //ng-model                            
            public static final String AssignmentCriteria_Update_ExcludeClaims_Group_Edit = "selectedExcClaimCrit.intlGroupId"; //ng-model
                  
            public static final String AssignmentCriteria_Update_ExcludeClaims_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateExcClaimCrit')]";
            public static final String AssignmentCriteria_Update_ExcludeClaims_Table = "//*[@ng-controller='extractionCriteriaExcludeCtrl']//table";
            public static final String AssignmentCriteria_Update_ExcludeClaims_Remove_Button = "//*[@ng-controller='extractionCriteriaExcludeCtrl']//button[contains(text(),'Remove')]";
            public static final String AssignmentCriteria_Update_ExcludeClaims_Update_Button = "//*[@ng-controller='extractionCriteriaExcludeCtrl']//button[contains(text(),'Update')]";
        }
        
        public class UpdateNumberOfTiersAssignment
		{
			public static final String AssignmentCriteria_Update_AssignNumberOfTiersBy_List = "nbrOfTiersCriteria.assignmentLevelCd"; //ng-model
			public static final String AssignmentCriteria_Update_NumberOfTiers_Customer_Edit = "//form[@name='assignNbrOfTiersCritForm']//input[@name='customerId']";
			public static final String AssignmentCriteria_Update_NumberOfTiers_DrugList_Edit = "selectedNbrOfTiersCrit.drugListIdentifyingShtNm"; //ng-model
			public static final String AssignmentCriteria_Update_NumberOfTiers_Edit = "editNbrOfTiers"; //ng-model
			
			public static final String AssignmentCriteria_Update_NumberOfTiers_Add_Button = "//button[contains(@ng-click,'ClickFun.addOrUpdateNumberOfTiersCrit')]";
			public static final String AssignmentCriteria_Update_NumberOfTiersAssignment_Table = "//*[@name='assgnNbrOfTiersTable']";
			public static final String AssignmentCriteria_Update_NumberOfTiers_Remove_Button = "//button[contains(@ng-click,'ClickFun.removeNumberOfTiersCrit()')]";
			public static final String AssignmentCriteria_Update_NumberOfTiers_Update_Button = "//*[@ng-click='updateNbrOfTiersBtnClick()']";
		}
        
        public class UpdateAuthorizedBrandAlternativesPanel {
            public static final String AuthorizedBrandAlternatives_Update_VendorFormularyID_List = "vendor_frmly_id";     //ID
            public static final String AuthorizedBrandAlternatives_Update_AvailableAuthorizedBrandAlternatives_Table = "//*[@name='authorizedBrandAlternativesTable']"; 
            public static final String AuthorizedBrandAlternatives_Update_Add_Button = "//button[contains(@ng-click,'addAuthorizedBrandAlternatives')]";
            public static final String AuthorizedBrandAlternatives_Update_SelectedAuthBrandAlternatives_Table = "//*[@name='authorizedBrandAlternativesExcCritTable']";
            public static final String AuthorizedBrandAlternatives_Update_Remove_Button = "//button[contains(@ng-click,'removeAbaExcCrit()')]";
                  
            public static final String AuthorizedBrandAlternatives_Update_Save_Button= "//*[@ng-controller='rebateCtrl']//*[text()='Save']";
            public static final String AuthorizedBrandAlternatives_Update_Cancel_Button = "//*[@ng-controller='rebateCtrl']//*[text()='Cancel']";
        }
        
        public class MasterCustomerSetAbbreviationPage
        {
        	public static final String MasterCustomerSetAbbreviation_Home_MCS_Search_Table = "//*[@id='mcsAbbrSelection']//table";
        	public static final String MasterCustomerSetAbbreviation_Home_Update_Button = "(//button[contains(@ng-click,'changeToUpdateModel')])[1]";
        	public static final String MasterCustomerSetAbbreviation_MasterCustomerSet_List = "mcsAbbr.mcsId";	//ng-model
        	public static final String MasterCustomerSetAbbreviation_Master_Abbreviation_Edit = "mcsAbbr.masterAbbr"; //ng-model
        	public static final String MasterCustomerSetAbbreviation_AddorUpdate_Button = "//button[contains(@ng-click,'addOrUpdateMcsAbbr')]";
        	
        	public static final String MasterCustomerSetAbbreviation_Save_Button = "//button[contains(@ng-click,'saveMcsAbbr')]"; 
        	public static final String MasterCustomerSetAbbreviation_Cancel_Button = "(//button[@class='arg-btn arg-btn-start' and contains(@ng-click,'cancel(true)')])[1]"; 
        	
        	public static final String MasterCustomerSetAbbreviation_Update_Button = "//form[@name='mcsAbbrForm']//following-sibling::*/button[contains(@ng-click,'updateBtnClick')]"; 
        	public static final String MasterCustomerSetAbbreviation_Remove_Button = "//form[@name='mcsAbbrForm']//following-sibling::*/button[contains(@ng-click,'removeDatas')]";
        	
        	public static final String MasterCustomerSetAbbreviation_MCSAbbreviation_Label = "//label[text()='Master Customer Set Abbreviation']";
        	
        }
        
        public class FileAdminPage
        {
        	public static final String FileAdmin_Home_MasterCustomerSet_List = "vm.form.mcs";	//ng-model
        	public static final String FileAdmin_Home_FileType_List = "vm.form.fileType";	//ng-model
        	public static final String FileAdmin_Home_Status_List = "vm.form.status";	//ng-model
        	public static final String FileAdmin_Home_FromDate_Edit = "vm.form.fromDate";	//ng-model
        	public static final String FileAdmin_Home_ToDate_Edit = "vm.form.toDate";	//ng-model
        	public static final String FileAdmin_Home_Search_Button = "//form[@name='fileAdminForm']//button[text()='Search']";
        	public static final String FileAdmin_Home_Search_Results_Table = "//*[@name='fileAdminForm']//following-sibling::*/table";	//"fileAdminTable"; 	// id
        	public static final String FileAdmin_Home_Search_Results_Table_NoRecords = "//*[@name='fileAdminForm']//following-sibling::*/table";
        	
        	public static final String FileAdmin_Browse_Error_Details_Title = "//div[@class='show-modal-content error-details-modal-content']//div[@class='dialog-header']";
        	public static final String FileAdmin_Browse_Error_Details_Dialog_Body = "//div[@class='show-modal-content error-details-modal-content']//div[@class='dialog-body']";
        	
        	public static final String FileAdmin_Browse_Error_Details_Dialog = "//div[@class='show-modal-content error-details-modal-content']";
        	public static final String FileAdmin_Browse_Error_Details_Dialog_Close_Button = "//*[@class='show-modal-content error-details-modal-content']//following-sibling::*/button[text()='Close']";
     	
        }
        
        public class ClaimFileSummaryTab
        {
        	public static final String ClaimFileSummary_Link = "//li[@ng-click='showClaimFileSummaryTab()']";  // xpath
        	public static final String ClaimFileSummary_ClaimFileSummary_Element = "//span[text()='Preliminary Claim Extraction']";
        	public static final String ClaimFileSummary_ClaimFileSummary_Panel = "//*[@class='prelimClaimCollapsePanel' and @aria-controls='prelimClaimExtractionSelection']";
        	//public static final String ClaimFileSummary_TraingleSymbol_Preliminary_Claim_Extraction = "//div[@class='prelimClaimCollapsePanel']//span[@class='glyphicon glyphicon-triangle-right']";
        	public static final String ClaimFileSummary_RunPreliminaryExtract_Button = "//*[@name='prelimClaimExtractionForm']//button[text()='Run Preliminary Extract']";
        	public static final String ClaimFileSummary_Refresh_Button = "refresh-btn"; // id
        	public static final String ClaimFileSummary_Preliminary_Results = "//form[@name='prelimClaimExtractionForm']//div[@class='pre-result-preliminary']";
        }
        
        public class BenefitFileSummaryTab
        {
        	public static final String BenefitFileSummary_Link = "//li[@ng-click='showBenefitFileSummaryTab()']";  // xpath
        	public static final String BenefitFileSummary_Preliminary_Benefit_File_Element = "//span[text()='Preliminary Benefit File']";
        	public static final String BenefitFileSummary_Preliminary_Benefit_File_Panel = "//*[@class='prelimBenefitCollapsePanel' and @aria-controls='prelimBenefitExtractionSelection']";
        	public static final String BenefitFileSummary_Contract_Line_Of_Business_List = "lob_type"; //id
        	public static final String BenefitFileSummary_RunPreliminaryExtract_Button = "//*[@name='prelimBenefitFileForm']//button[text()='Run Preliminary Extract']";
        	public static final String BenefitFileSummary_Refresh_Button = "//*[@name='prelimBenefitFileForm']//*[@id='refresh-btn']"; // id
        	public static final String BenefitFileSummary_Preliminary_Results = "	//form[@name='prelimBenefitFileForm']//div[@class='pre-result-preliminary']";
        	public static final String BenefitFileSummary_Final_Results = "//form[@name='prelimBenefitFileForm']//div[@class='pre-result-final']";
        	
        }
        
        public class PaymentDetails_PaymentAdjustmentPanel
        {
        	//public static final String PaymentDetails_Link = "//*[@ng-click='showPaymentDetailsTab()']";  // xpath
        	public static final String PaymentDetails_Link = "//*[@class='pl1']//li[text()='Payment Details']";  // xpath
        	public static final String PaymentDetails_PaymentAdjustment_element = "//span[text()='Payment Adjustments']";
        	public static final String PaymentDetails_PaymentAdjustment_Panel = "//*[@ng-controller='paymentAdjustmentsCtrl as vm']//*[@aria-controls='paymentAdjustmentsSelection']";        	
        	public static final String PaymentDetails_PaymentAdjustment_Panel_Update_Button = "//button[@ng-click='vm.changeToUpdateModal()']";
        	public static final String PaymentDetails_PaymentAdjustment_Name_Edit = "//form[@name='vm.paymentAdjustmentsForm']//*[@name='name']"; 
        	public static final String PaymentDetails_PaymentAdjustment_StartDate_Edit = "//form[@name='vm.paymentAdjustmentsForm']//*[@id='startDate']"; 
        	public static final String PaymentDetails_PaymentAdjustment_EndDate = "//form[@name='vm.paymentAdjustmentsForm']//*[@id='endDate']";
        	public static final String PaymentDetails_PaymentAdjustment_Initial_Adjustment_Edit = "initialAdjustment"; //id
        	public static final String PaymentDetails_PaymentAdjustment_Adjustment_Type_List = "adjustmentType"; //id
        	public static final String PaymentDetails_PaymentAdjustment_Notes_Edit = "//form[@name='vm.paymentAdjustmentsForm']//*[@name='notes']"; 
        	public static final String PaymentDetails_PaymentAdjustment_AddOrUpdate_Button = "//form[@name='vm.paymentAdjustmentsForm']//div[@class='text-right mb15']//button";
        	
        	public static final String PaymentDetails_PaymentAdjustment_Table = "//table[@data-ng-table='vm.paymentAdjustmentsTable']";
        	public static final String PaymentDetails_PaymentAdjustment_Table_Update_Button = "//button[@ng-click='vm.update()']";
        	public static final String PaymentDetails_PaymentAdjustment_Table_Remove_Button = "//button[@ng-click='vm.update()']//following-sibling::button[@ng-click='vm.remove()']";
        	public static final String PaymentDetails_PaymentAdjustment_Table_ClaimDetail_Button = "//button[@ng-click='vm.claimDetail()']";
        	public static final String PaymentDetails_PaymentAdjustment_Table_ImportClaimDetail_Button = "//button[@ng-click='vm.importClaimDetail()']";
        	public static final String PaymentDetails_PaymentAdjustment_Save = "//*[@id='paymentAdjustmentsSelection']//*[@class='text-right mt15 ng-scope']//button[contains(text(),'Save')]";
        	public static final String PaymentDetails_PaymentAdjustment_Cancel = "//*[@id='paymentAdjustmentsSelection']//*[@class='text-right mt15 ng-scope']//button[contains(text(),'Cancel')]";
        	
        	public static final String PaymentDetails_PaymentAdjustment_Choose = "//*[@class='show-modal-content import-claim-detail-modal-content']//button[@type='file' and @ngf-select='vm.file.browse($file)']";
        	public static final String PaymentDetails_PaymentAdjustment_Upload = "//button[@ng-click='vm.file.upload()']";
        	
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetails_Adjustment_Claims_Label = "//label[text()='Adjustment Claims']";
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_AdjustmentDetails = "(//*[@ng-controller='claimDetailCtrl as vm']//*[@class='panel-border']//header)[1]" ;
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_Table = "//table[@ng-table='vm.adjustmentClaims.table']";
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_AllocationDate_Edit = "allocationDate"; // name
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_ReconcileSelectedClaims_Button = "//*[@name='allocationDate']//following-sibling::button[contains(text(),'Reconcile Selected Claims')]";
        	
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_Table = "//table[@ng-table='vm.reconciledClaims.table']";
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveAllocationDate_Edit = "removeAllocationDate";
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveReconcileClaims_Button = "//button[contains(@ng-class,'vm.removeReconcileClaimsForm')]";
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Save_Button = "//*[@ng-controller='claimDetailCtrl as vm']//button[text()='Save']";
        	public static final String PaymentDetails_PaymentAdjustment_ClaimDetail_Cancel_Button = "//*[@ng-controller='claimDetailCtrl as vm']//button[text()='Cancel']";
        	
        }
        
        public class MasterCustomerSetPaymentInformationPanel
		{
			public static final String PaymentDetails_Tab = "//*[@ng-click='showPaymentDetailsTab()']";
			public static final String MCSPI_Update_Button = "//*[@ng-controller='paymentInformationCtrl']//*[text()='Update']";
			public static final String MCSPI_MasterCustomerSetPaymentInformationPanel = "//*[@ng-controller='paymentInformationCtrl']//*[@aria-controls='paymentInformationSelection']";
			public static final String MCSPI_PaymentFrequency_Frequency_List = "vm.form.frequencyId"; //ng-model
			public static final String MCSPI_PaymentFrequency_StartDate_Edit = "vm.form.startDt"; //ng-model
			public static final String MCSPI_PaymentFrequency_EndDate_Edit = "vm.form.endDt"; //ng-model
			public static final String MCSPI_PaymentFrequency_Notes_Edit = "//*[@name='paymentFqForm']//*[@name='notes']"; 
			public static final String MCSPI_PaymentFrequency_Add_Button = "//*[@name='paymentFqForm']//button[text()='Add' or 'Update']";
			public static final String MCSPI_PaymentFrequency_Table = "//*[@ng-table='vm.pfTable']";
			public static final String MCSPI_PaymentFrequency_Remove_Button = "//*[contains(@ng-controller,'paymentFrequencyCtrl')]//*[contains(text(),'Remove')]";
			public static final String MCSPI_PaymentFrequency_Update_Button = "//*[contains(@ng-controller,'paymentFrequencyCtrl')]//*[contains(text(),'Update')]";
			
			public static final String MCSPI_PaymentHistory_Date_Edit = "paymentHistory.date"; //ng-model
			public static final String MCSPI_PaymentHistory_Amount_Edit = "paymentHistory.amount"; //ng-model
			public static final String MCSPI_PaymentHistory_Payee_List = "paymentHistory.payee"; //ng-model
			public static final String MCSPI_PaymentHistory_PaymentType_List = "paymentHistory.paymentType"; //ng-model
			public static final String MCSPI_PaymentHistory_Channel_List = "paymentHistory.channel"; //ng-model
			public static final String MCSPI_PaymentHistory_SubmitDate_Edit = "paymentHistory.submitDt"; //ng-model
			public static final String MCSPI_PaymentHistory_PaymentIdentifier_Edit = "paymentHistory.paymentIdentifier"; //ng-model
			public static final String MCSPI_PaymentHistory_CustomerID_List = "paymentHistory.customerId"; //ng-model
			public static final String MCSPI_PaymentHistory_Notes_Edit = "//*[@name='form.paymentHtForm']//*[@name='notes']";			
			public static final String MCSPI_PaymentHistory_Add_Button = "//*[@name='form.paymentHtForm']//button[text()='Add' or 'Update']";
			public static final String MCSPI_PaymentHistory_Table = "//*[@ng-table='phTable']";
			public static final String MCSPI_PaymentHistory_Remove_Button = "//*[@name='form.paymentHtForm']//*[contains(text(),'Remove')]";
			public static final String MCSPI_PaymentHistory_Update_Button = "//*[@name='form.paymentHtForm']//*[contains(text(),'Update')]";
			public static final String MCSPI_Save_Button = "//*[@id='paymentInformationSelection']//*[text()='Save']";
			public static final String MCSPI_Cancel_Button = "//*[@id='paymentInformationSelection']//*[text()='Cancel']";
		}
        
		
		
}
