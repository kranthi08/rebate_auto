package com.project.actors;

import java.util.List;

import com.project.pages.AddAuthorizedBrandAlternativesPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddAuthorizedBrandAlternativesPage {
	
	@Steps
	AddAuthorizedBrandAlternativesPage addAuthorizedBrandAlternativesPage;
	
	@Step
	public void verifyAuthorizedBrandAlternatives() throws Throwable {		
		addAuthorizedBrandAlternativesPage.verifyAuthorizedBrandAlternativesPanelIsDisplayed();
	}
	
	@Step
	public void enterAuthorizedBrandAlternativesDetails(DataTable authorizedBrandAlternativesData) throws Throwable {
		
		List<List<String>> authorizedBrandAlternativesDetails = authorizedBrandAlternativesData.raw();
		
		String strOperation = authorizedBrandAlternativesDetails.get(1).get(0);
		String strVerndorFormularyID = authorizedBrandAlternativesDetails.get(1).get(1);
		String strAuthorizedBrandAlternatives  = authorizedBrandAlternativesDetails.get(1).get(2);

		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addAuthorizedBrandAlternativesPage.selectVendorFormularyID(strVerndorFormularyID);
				if(!strAuthorizedBrandAlternatives.isEmpty())
				{
					String[] arrAvailableAuthorizedBrandAlternatives = strAuthorizedBrandAlternatives.split("\\^",-1);
					
					for(int i=0;i<arrAvailableAuthorizedBrandAlternatives.length;i++)
					{
						addAuthorizedBrandAlternativesPage.selectAvailableAuthorizedBrandAlternatives(arrAvailableAuthorizedBrandAlternatives[i]);
					}						
				}
				addAuthorizedBrandAlternativesPage.clickOnAddButton();
				break;
			case "REMOVE":
				if(!strAuthorizedBrandAlternatives.isEmpty())
				{
					String[] arrSelectedAuthorizedBrandAlternatives = strAuthorizedBrandAlternatives.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAuthorizedBrandAlternatives.length;i++)
					{
						addAuthorizedBrandAlternativesPage.selectAvailableAuthorizedBrandAlternatives(arrSelectedAuthorizedBrandAlternatives[i]);
					}						
				}
				addAuthorizedBrandAlternativesPage.clickOnRemoveButton();
				break;
		}					
	}
	
	@Step
	public void clickOnSaveButton() throws Throwable {
		addAuthorizedBrandAlternativesPage.clickOnSaveButton();
		addAuthorizedBrandAlternativesPage.getTheContractID();
		addAuthorizedBrandAlternativesPage.getContractName();
	}
}	
