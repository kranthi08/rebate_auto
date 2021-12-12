package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.ViewAuthorizedBrandAlternativesPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateAuthorizedBrandAlternativesPage {
	
	@Steps
	ViewAuthorizedBrandAlternativesPage viewAuthorizedBrandAlternativesPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateAuthorizedBrandAlternativesDetails(DataTable authorizedBrandAlternativesData) throws Throwable {
		
		List<List<String>> authorizedBrandAlternativesDetails = authorizedBrandAlternativesData.raw();
		
		viewAuthorizedBrandAlternativesPage.clickOnUpdateButton();
		updateAuthorizedBrandAlternativesPage.verifyAuthorizedBrandAlternativesPanelIsDisplayed();
		
		for(int iteration=1;iteration<authorizedBrandAlternativesDetails.size();iteration++)
		{
			String strOperation = authorizedBrandAlternativesDetails.get(iteration).get(0);
			String strVerndorFormularyID = authorizedBrandAlternativesDetails.get(iteration).get(1);
			String strAuthorizedBrandAlternatives  = authorizedBrandAlternativesDetails.get(iteration).get(2);

			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateAuthorizedBrandAlternativesPage.selectVendorFormularyID(strVerndorFormularyID);
					if(!strAuthorizedBrandAlternatives.isEmpty())
					{
						String[] arrAvailableAuthorizedBrandAlternatives = strAuthorizedBrandAlternatives.split("\\^",-1);
						
						for(int i=0;i<arrAvailableAuthorizedBrandAlternatives.length;i++)
						{
							updateAuthorizedBrandAlternativesPage.selectAvailableAuthorizedBrandAlternatives(arrAvailableAuthorizedBrandAlternatives[i]);
						}						
					}
					updateAuthorizedBrandAlternativesPage.clickOnAddButton();
					break;
				case "REMOVE":
					if(!strAuthorizedBrandAlternatives.isEmpty())
					{
						String[] arrSelectedAuthorizedBrandAlternatives = strAuthorizedBrandAlternatives.split("\\^",-1);
						
						for(int i=0;i<arrSelectedAuthorizedBrandAlternatives.length;i++)
						{
							updateAuthorizedBrandAlternativesPage.removeSelectedAuthorizedBrandAlternatives(arrSelectedAuthorizedBrandAlternatives[i]);
						}						
					}
					updateAuthorizedBrandAlternativesPage.clickOnRemoveButton();
					break;
			}
		}		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}	
