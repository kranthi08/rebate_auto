package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddGuaranteePanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class UIAddGuaranteePage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_StartDate_Edit)
	private BaseElement Guarantee_Add_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_EndDate_Edit)
	private BaseElement Guarantee_Add_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_VendorFormularyID_Edit)
	private BaseElement Guarantee_Add_VendorFormularyID_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_VendorFormularyType_List)
	private BaseElement Guarantee_Add_VendorFormularyType_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_DSTFormularyType_List)
	private BaseElement Guarantee_Add_DSTFormularyType_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_TierType_Edit)
	private BaseElement Guarantee_Add_TierType_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_Channel_List)
	private BaseElement Guarantee_Add_Channel_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_LineOfBusiness_List)
	private BaseElement Guarantee_Add_LineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_VendorBrandGuarantee_Edit)
	private BaseElement Guarantee_Add_VendorBrandGuarantee_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_CustomerBrandGuarantee_Edit)
	private BaseElement Guarantee_Add_CustomerBrandGuarantee_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_BenefitDesign_List)
	private BaseElement Guarantee_Add_BenefitDesign_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_UMOption_List)
	private BaseElement Guarantee_Add_UMOption_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_BenefitDesignDescriptionNotes_Edit)
	private BaseElement Guarantee_Add_BenefitDesignDescriptionNotes_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_PlanDesignNotes_Edit)
	private BaseElement Guarantee_Add_PlanDesignNotes_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_UMOptionNotes_Edit)
	private BaseElement Guarantee_Add_UMOptionNotes_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_FormularyDesignNotes_Edit)
	private BaseElement Guarantee_Add_FormularyDesignNotes_Edit;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Add_Button)
	private BaseElement Guarantee_Add_Add_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Next_Button)
	private BaseElement Guarantee_Add_Next_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Previous_Button)
	private BaseElement Guarantee_Add_Previous_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_BrowseNotes_Button)
	private BaseElement Guarantee_Add_BrowseNotes_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_GuaranteePanel_Table)
	private BaseElement Guarantee_Add_GuaranteePanel_Table;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Update_Button)
	private BaseElement Guarantee_Add_Update_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Remove_Button)
	private BaseElement Guarantee_Add_Remove_Button;
	
	
	// Methods
	
	// Start Date
	public boolean verify_Start_Date_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_StartDate_Edit);
	}
	
	public boolean verify_Start_Date_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_StartDate_Edit);
	}
	
	public boolean verify_Start_Date_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_StartDate_Edit, Edit_Box_Max_Length);
	}
	
	public boolean verify_Start_Date_Edit_Default_Text(String strDefaultText)throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(Guarantee_Add_StartDate_Edit, strDefaultText);
	}
	
	// End Date
	public boolean verify_End_Date_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_EndDate_Edit);
	}
	
	public boolean verify_End_Date_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_EndDate_Edit);
	}
	
	public boolean verify_End_Date_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_EndDate_Edit, Edit_Box_Max_Length);
	}
	
	public boolean verify_End_Date_Edit_Default_Text(String strDefaultText)throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(Guarantee_Add_EndDate_Edit, strDefaultText);
	}
	
	//  Vendor formulary ID
	public boolean verify_VendorFormulary_ID_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_VendorFormularyID_Edit);
	}
	
	public boolean verify_VendorFormulary_ID_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_VendorFormularyID_Edit);
	}
	
	public boolean verify_VendorFormulary_ID_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_VendorFormularyID_Edit, Edit_Box_Max_Length);
	}
	
	// Vendor formulary type
	public boolean verify_Vendor_Formulary_Type_List_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Guarantee_Add_VendorFormularyType_List);
	}
	
	public boolean verify_Vendor_Formulary_Type_List_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Guarantee_Add_VendorFormularyType_List);
	}
	
	public boolean verify_Vendor_Formulary_Type_List_Box_Items(String Vendor_Formulary_Type_List_Box_Items ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Guarantee_Add_VendorFormularyType_List, Vendor_Formulary_Type_List_Box_Items);
	}
	
	// DST formulary type
	public boolean verify_DST_Formulary_Type_List_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Guarantee_Add_DSTFormularyType_List);
	}
	
	public boolean verify_DST_Formulary_Type_List_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Guarantee_Add_DSTFormularyType_List);
	}
	
	public boolean verify_DST_Formulary_Type_List_Box_Items(String DST_Formulary_Type_List_Box_Items ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Guarantee_Add_DSTFormularyType_List, DST_Formulary_Type_List_Box_Items);
	}
	
	// Tier type
	public boolean verify_Tier_Type_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_TierType_Edit);
	}
	
	public boolean verify_Tier_Type_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_TierType_Edit);
	}
	
	public boolean verify_Tier_Type_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_TierType_Edit, Edit_Box_Max_Length);
	}
	
	//  ----- Channel
	public boolean verify_Channel_List_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Guarantee_Add_Channel_List);
	}
	
	public boolean verify_Channel_List_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Guarantee_Add_Channel_List);
	}
	
	public boolean verify_Channel_List_Box_Items(String Channel_List_Box_Items ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Guarantee_Add_Channel_List, Channel_List_Box_Items);
	}
	
	//  ----  Guarantee Line of business
	public boolean verify_Guarantee_Line_Of_Business_List_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Guarantee_Add_LineOfBusiness_List);
	}
	
	public boolean verify_Guarantee_Line_Of_Business_List_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Guarantee_Add_LineOfBusiness_List);
	}
	
	public boolean verify_Guarantee_Line_Of_Business_List_Box_Items(String Guarantee_Line_Of_Business_List_Box_Items ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Guarantee_Add_LineOfBusiness_List, Guarantee_Line_Of_Business_List_Box_Items);
	}
	
	// ---  Vendor brand guarantee
	public boolean verify_Vendor_Brand_Guarantee_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_VendorBrandGuarantee_Edit);
	}
	
	public boolean verify_Vendor_Brand_Guarantee_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_VendorBrandGuarantee_Edit);
	}
	
	public boolean verify_Vendor_Brand_Guarantee_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_VendorBrandGuarantee_Edit, Edit_Box_Max_Length);
	}
	
	// Customer brand guarantee
	public boolean verify_Customer_Brand_Guarantee_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_CustomerBrandGuarantee_Edit);
	}
	
	public boolean verify_Customer_Brand_Guarantee_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_CustomerBrandGuarantee_Edit);
	}
	
	public boolean verify_Customer_Brand_Guarantee_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_CustomerBrandGuarantee_Edit, Edit_Box_Max_Length);
	}
	
	// Benefit design
	public boolean verify_Benefit_Design_List_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Guarantee_Add_BenefitDesign_List);
	}
	
	public boolean verify_Benefit_Design_List_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Guarantee_Add_BenefitDesign_List);
	}
	
	public boolean verify_Benefit_Design_List_Box_Items(String Benefit_Design_List_Box_Items ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Guarantee_Add_BenefitDesign_List, Benefit_Design_List_Box_Items);
	}
	
	// UM option
	
	public boolean verify_UM_Option_List_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Guarantee_Add_UMOption_List);
	}
	
	public boolean verify_UM_Option_List_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Guarantee_Add_UMOption_List);
	}
	
	public boolean verify_UM_Option_List_Box_Items(String UM_Option_List_Box_Items ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Guarantee_Add_UMOption_List, UM_Option_List_Box_Items);
	}
	
	// Benefit design description notes
	public boolean verify_BenefitDesignDescriptionNotes_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_BenefitDesignDescriptionNotes_Edit);
	}
	
	public boolean verify_BenefitDesignDescriptionNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_BenefitDesignDescriptionNotes_Edit);
	}
	
	public boolean verify_BenefitDesignDescriptionNotes_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_BenefitDesignDescriptionNotes_Edit, Edit_Box_Max_Length);
	}
	
	//Plan design notes
	public boolean verify_PlanDesignNotes_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_PlanDesignNotes_Edit);
	}
	
	public boolean verify_PlanDesignNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_PlanDesignNotes_Edit);
	}
	
	public boolean verify_PlanDesignNotes_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_PlanDesignNotes_Edit, Edit_Box_Max_Length);
	}
	
	//UM option notes 
	public boolean verify_UMOptionNotes_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_UMOptionNotes_Edit);
	}
	
	public boolean verify_UMOptionNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_UMOptionNotes_Edit);
	}
	
	public boolean verify_UMOptionNotes_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_UMOptionNotes_Edit, Edit_Box_Max_Length);
	}
	
	// Formulary design notes
	public boolean verify_FormularyDesignNotes_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Guarantee_Add_FormularyDesignNotes_Edit);
	}
	
	public boolean verify_FormularyDesignNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Guarantee_Add_FormularyDesignNotes_Edit);
	}
	
	public boolean verify_FormularyDesignNotes_Edit_Box_Max_Length(String Edit_Box_Max_Length)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Guarantee_Add_FormularyDesignNotes_Edit, Edit_Box_Max_Length);
	}
	
	// Add Button
	public boolean verify_Add_Button_Presence()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Guarantee_Add_Add_Button);
	}
	
	public boolean verify_Add_Button_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Guarantee_Add_Add_Button);
	}
	
	public boolean verify_Add_Button_Disabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Guarantee_Add_Add_Button);
	}
	
	// Next Button
	public boolean verify_Next_Button_Presence()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Guarantee_Add_Next_Button);
	}
	
	public boolean verify_Next_Button_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Guarantee_Add_Next_Button);
	}
	
	public boolean verify_Next_Button_Disabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Guarantee_Add_Next_Button);
	}
	
	// Previous Button
	public boolean verify_Previous_Button_Presence()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Guarantee_Add_Previous_Button);
	}
	
	public boolean verify_Previous_Button_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Guarantee_Add_Previous_Button);
	}
	
	// Remove Button
	public boolean verify_Remove_Button_Presence()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Guarantee_Add_Remove_Button);
	}
	
	public boolean verify_Remove_Button_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Guarantee_Add_Remove_Button);
	}
	
	public boolean verify_Remove_Button_Disabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Guarantee_Add_Remove_Button);
	}
	
	// Update Button
	public boolean verify_Update_Button_Presence()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Guarantee_Add_Update_Button);
	}
	
	public boolean verify_Update_Button_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Guarantee_Add_Update_Button);
	}
	
	public boolean verify_Update_Button_Disabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Guarantee_Add_Update_Button);
	}
	
	// Browse Notes Button
	public boolean verify_BrowseNotes_Button_Presence()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Guarantee_Add_BrowseNotes_Button);
	}
	
	public boolean verify_BrowseNotes_Button_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Guarantee_Add_BrowseNotes_Button);
	}
	
	public boolean verify_BrowseNotes_Button_Disabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Guarantee_Add_BrowseNotes_Button);
	}
	
	public boolean verifyGuaranteePanel_Table_Presence()throws Throwable
	{
		return rxNovaCommonUtil.verifyTablePresence(Guarantee_Add_GuaranteePanel_Table);
	}
	
	
}
