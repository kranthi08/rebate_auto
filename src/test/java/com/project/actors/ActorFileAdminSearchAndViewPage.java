package com.project.actors;

import java.util.List;

import org.seleniumhq.jetty9.util.StringUtil;

import com.project.pages.FileAdminSearchAndViewPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorFileAdminSearchAndViewPage 
{
	
	@Steps
	FileAdminSearchAndViewPage fileadminPage;
	
	
	@Step
	public void verifyPageNavigatedToFileAdmin()	throws Throwable
	{
		fileadminPage.verifyPageNavigatedToFileAdminTab();
	}
	
	@Step
	public void performSearchWithFileTypeAndStatus(DataTable searchValues)	throws Throwable
	{
		List<List<String>> searchDetails = searchValues.raw();
		
		String strMasterCustomerSet = searchDetails.get(1).get(0);
		String strFileType = searchDetails.get(1).get(1);
		String strStatus = searchDetails.get(1).get(2);
		String strFromDate = searchDetails.get(1).get(3);
		String strToDate = searchDetails.get(1).get(4);
		
		fileadminPage.selectValueFromMasterCustomerSetList(strMasterCustomerSet);
		fileadminPage.selectValueFromFileTypeList(strFileType);
		fileadminPage.selectValueFromStatusList(strStatus);
		fileadminPage.setTextIntoFromDateEdit(strFromDate);
		fileadminPage.setTextIntoToDateEdit(strToDate);
		
		fileadminPage.clickOnSearchButton();		
	}
	
	@Step
	public void verifyFileAdminSearchResultsTableData(DataTable fileAdminSearchResultsTableData)	throws Throwable
	{
		List<List<String>> searchResultsTableDetails = fileAdminSearchResultsTableData.raw();
		
		for(int i=1;i<searchResultsTableDetails.size();i++)
		{
			String strMasterCustomerSet = searchResultsTableDetails.get(i).get(0);
			String strFileType = searchResultsTableDetails.get(i).get(1);
			String strFileName = searchResultsTableDetails.get(i).get(2);
			String strVersion = searchResultsTableDetails.get(i).get(3);
			String strReceivedDate = searchResultsTableDetails.get(i).get(4);
			String strProcessedDate = searchResultsTableDetails.get(i).get(5);
			String strTotalClaims = searchResultsTableDetails.get(i).get(6);
			String strValidClaims = searchResultsTableDetails.get(i).get(7);
			String strInvalidClaims = searchResultsTableDetails.get(i).get(8);
			String strStatus = searchResultsTableDetails.get(i).get(9);
			String strNoRecordsMessage = searchResultsTableDetails.get(i).get(10);
		
			String strValue1 = strMasterCustomerSet+"*"+strFileType+"*"+strFileName;
		    String strValue2 = strVersion+"*"+strReceivedDate+"*"+strProcessedDate;			
			String strValue3 = strTotalClaims+"*"+strValidClaims+"*"+strInvalidClaims+"*"+strStatus;
		
			String strValue = strValue1 +"*"+ strValue2+"*"+strValue3;
			if(!strMasterCustomerSet.isEmpty() &&strNoRecordsMessage.isEmpty())
			{
				fileadminPage.verifyFileAdminSearchResultsTableData(strValue);
			}
			else
			{
				fileadminPage.verifyFileAdminSearchResultsTableData(strNoRecordsMessage);
			}			
		}
	}
	
	@Step
	public void verifyFileAdminSearchResultsAndBrowseErrorDetails(DataTable fileAdminSearchBrowseErrorDetails)	throws Throwable
	{
		List<List<String>> searchResultsTableDetails = fileAdminSearchBrowseErrorDetails.raw();
		
		for(int i=1;i<searchResultsTableDetails.size();i++)
		{
			String strMasterCustomerSet = searchResultsTableDetails.get(i).get(0);
			String strFileType = searchResultsTableDetails.get(i).get(1);
			String strFileName = searchResultsTableDetails.get(i).get(2);
			String strVersion = searchResultsTableDetails.get(i).get(3);
			String strReceivedDate = searchResultsTableDetails.get(i).get(4);
			String strProcessedDate = searchResultsTableDetails.get(i).get(5);
			String strTotalClaims = searchResultsTableDetails.get(i).get(6);
			String strValidClaims = searchResultsTableDetails.get(i).get(7);
			String strInvalidClaims = searchResultsTableDetails.get(i).get(8);
			String strStatus = searchResultsTableDetails.get(i).get(9);
			String strBrowseErrorDialogMCSdetails = searchResultsTableDetails.get(i).get(10);
			String strBrowseErrorDialogClaimTableData = searchResultsTableDetails.get(i).get(11); 
			
	
			String strValue1 = strMasterCustomerSet+"*"+strFileType+"*"+strFileName;
		    String strValue2 = strVersion+"*"+strReceivedDate+"*"+strProcessedDate;			
			String strValue3 = strTotalClaims+"*"+strValidClaims+"*"+strInvalidClaims+"*"+strStatus;
			String strValue = strValue1 +"*"+ strValue2+"*"+strValue3;
		
			if(!strMasterCustomerSet.isEmpty())
			{
				fileadminPage.verifyFileAdminSearchResultsTableData(strValue);
			}
			else
			{
				String strNoRecordsMessage = searchResultsTableDetails.get(i).get(12);
				fileadminPage.verifyFileAdminSearchResultsTableData(strNoRecordsMessage);
			}
						
			if(strStatus.equalsIgnoreCase("Failed - Error Details")&&StringUtil.isNotBlank(strStatus))
			{
				fileadminPage.verifyAndClickOnFailedAndErrorDetailsLink(strValue);	
				if(!strBrowseErrorDialogMCSdetails.isEmpty())
				{
					if(strBrowseErrorDialogMCSdetails.contains("*"))
					{
						String[] arrMCSDetails = strBrowseErrorDialogMCSdetails.split("\\*",-1);
						for(int itr=0;itr<arrMCSDetails.length;itr++)
						{
							fileadminPage.verifyFileAdminBrowseErrorDetailsDialogMCSData(arrMCSDetails[itr]);
						}
					}
				}
				// =================================================================				
				if(!strBrowseErrorDialogClaimTableData.isEmpty())
				{
					if(strBrowseErrorDialogClaimTableData.contains("*"))
					{
						String[] arrClaimDetails = strBrowseErrorDialogClaimTableData.split("\\*",-1);
						for(int i0=0;i0<arrClaimDetails.length;i0++)
						{
							fileadminPage.verifyFileAdminBrowseErrorDetailsDialogClaimsTableData(arrClaimDetails[i0]);
						}
					}
					else
					{
						fileadminPage.verifyFileAdminBrowseErrorDetailsDialogClaimsTableData(strBrowseErrorDialogClaimTableData);
					}
				}
				fileadminPage.clickOn_FileAdmin_BrowseErrorDetails_Dialog_CloseButton();
			}
			// ======================================================================================
		}
	}
	
	@Step
	public void verifyClaimDetailsFileStatus(DataTable claimFileData) throws Throwable
	{
		List<List<String>> claimFileDetails = claimFileData.raw();
		
		String strMasterCustomerSet = claimFileDetails.get(1).get(0);
		String strFileType = claimFileDetails.get(1).get(0); 
		String strFileName = claimFileDetails.get(1).get(0);
		String strVersion = claimFileDetails.get(1).get(0);
		String strStatus = claimFileDetails.get(1).get(0);
		
		String strMatchingRecord = strMasterCustomerSet +"*"+ strFileType +"*"+ strFileName +"*"+ strVersion;
		fileadminPage.uploadFileStatusVerification(strMatchingRecord, strStatus);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
