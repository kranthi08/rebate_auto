package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewHospiceFacility;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewHospiceFacilityAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewHospiceFacility.AssignmentCriteria_View_HospiceFacility_Table)
	private BaseElement AssignmentCriteria_View_HospiceFacility_Table;
	
	public boolean verifyHospiceFacilityDetails(String strHospiceFacilityData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_HospiceFacility_Table, strHospiceFacilityData);
	}	
}
