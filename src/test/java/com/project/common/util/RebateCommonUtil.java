package com.project.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.thucydides.core.annotations.Steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class RebateCommonUtil extends BasePage
{
	public static String CONTRACT_ID;
	public static String CONTRACT_NAME;
	
	@Steps
	RxNovaCommonUtil rxnovaCommonUtil;
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	// Method: rebate_clickOnCheckBox
   	// Return Type: boolean
   	// Description: click on check box.
   	// Parameters: BaseElement ObjPath, String strOperation 
   	// Example:
   	// Author:
   	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	public boolean rebate_clickOnCheckBox(BaseElement ObjPath, String strOperation) throws Throwable 
   	{				
   		Boolean boolClickOnCheckBox = false;
   		int attempts = 0;
   		while(attempts < 3)
   		{
   			try
   			{
   				if(ObjPath.exists(1000))
   				{
   					switch(strOperation.toUpperCase())
   					{
   						case "CHECK":				
   							if (!ObjPath.isSelected())
   							{
   								ObjPath.click();
   								rxnovaCommonUtil.waitForAngularPageRefresh();
   								Log.info("The checkbox for "+ObjPath+" is checked");
   								boolClickOnCheckBox = true;
   							}
   							else
   							{
   								Log.info("The checkbox for "+ObjPath+" is already checked");
   								boolClickOnCheckBox = true;
   							}
   							break;
   						case "UNCHECK":
   							if (ObjPath.isSelected())
   							{
   								
   								ObjPath.click();
   								rxnovaCommonUtil.waitForAngularPageRefresh();
   								Log.info("The checkbox for "+ObjPath+" is unchecked");
   								boolClickOnCheckBox = true;
   							}
   							else
   							{
   								Log.info("The checkbox for "+ObjPath+" is already unchecked");
   								boolClickOnCheckBox = true;
   							}
   					}
   				}
   				if(boolClickOnCheckBox == true) {break; }
   			}
   			catch(Exception e)
   			{   				
   				Log.info("rebate_clickOnCheckBox: = "+e.getMessage());
   			}
   			attempts++;
   		}
   		if(boolClickOnCheckBox==false)
   		{
   			Log.info("WebElement: " + ObjPath+" was not found");
   		}		
       return boolClickOnCheckBox;
     }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: rebate_ClickOnRadioButton
    // Return Type: boolean
 	// Description: Given the Text for a Radio button, this method attempts to click on it.
    // It tries a maximum of three times. If the Radio button does not exist,then the radio button is not found and not clicked.
    // Parameters: Radio button text
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 	public boolean rebate_ClickOnRadioButton(BaseElement element, String strRadioText) throws Throwable
 	{
 		boolean radioButtonClick = false;
 		int attempts = 0;
 		while (attempts < 3)
 		{
 			try
 			{						
 				if(element.exists(1000)) 
 				{
 					List<WebElement> radiosList = element.findElements(By.xpath("//label[@class='radio-inline']"));
 					for(int i=0;i<radiosList.size();i++)
 					{						
 						if(radiosList.get(i).getText().equalsIgnoreCase(strRadioText))
 						{
 							if(!radiosList.get(i).isSelected())
 							{
 								radiosList.get(i).click();
 								rxnovaCommonUtil.waitForAngularPageRefresh();
 								Log.info("Clicked on the Radio Button with text : "+strRadioText );
 								radioButtonClick = true;
 								break;
 							}
 						}
 					}
 				}
 			}
 			catch(Exception e)
 			{
 				Log.info("rebate_ClickOnRadioButton: = "+e.getMessage());
 			}
 			attempts++;
 		}
 		if(radioButtonClick==false)
 		{
 			Log.info("Radio Button with text: "+ strRadioText + " was not found");
 		}
 		return radioButtonClick;
 	}
	
 	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	// Method: rebate_expand_View_Panel
   	// Return Type: boolean
   	// Description: Expand the panel in Rebate View Page
   	// Parameters: BaseElement ObjPath, String strOperation 
   	// Example:
   	// Author:
   	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 	public boolean rebate_expand_View_Panel(BaseElement element, String strPanelName) throws Throwable
  	{
  		boolean isPanelExpanded = false;
  		int attempts = 0;
  		while(attempts<3)
  		{
  			try 
  			{	
					if(element.exists(2000))
					{
						if(Boolean.parseBoolean(element.getAttribute("aria-expanded").trim()))
						{  								
							Log.info(strPanelName + "  Panel already Expanded hence no need to expand");
							isPanelExpanded = true;
							break;
						}
						else
						{
							if(element.getText().trim().equalsIgnoreCase(strPanelName))
							{
								element.click();
								rxnovaCommonUtil.waitForAngularPageRefresh();								
								isPanelExpanded = true;
								break;
							}
					    }
					}	
			}
  			catch(Exception e) 
  			{ 
  				Log.info("Exception exist in rebate_expand_View_Panel method: = "+e.getMessage()); 
  			}
			attempts++;
  		}
  		return isPanelExpanded;
  	}
 	 //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	// Method: rebate_expandThePanel
   	// Return Type: boolean
   	// Description: Expand the panel in Rebate View Page
   	// Parameters: BaseElement ObjPath, String strOperation 
   	// Example:
   	// Author:
   	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	public boolean rebate_expandThePanel(BaseElement objPath,String strPanelName)
   	{
   		boolean rebate_expandThePanel = false;
   		int attempts = 3;
   		int itr = 0;
   		if(objPath.exists(1000)) 
   		{
	   		while(itr<attempts)
	   		{
	   			try {
	   			WebElement panel = objPath.findElement(By.xpath("//*[@class='collapsePanel']"));
	   			if(panel.getAttribute("aria-expanded").equalsIgnoreCase("false"))
	   					
	   			{
	   				String panelPath = "//*[text()='"+strPanelName+"']";
	   				WebElement panelTitle = panel.findElement(By.xpath(panelPath));
	   				panelTitle.click();
	   				Log.info(strPanelName+"  Panel Expanded");
	   				rebate_expandThePanel = true;
	   				break;
	   			}
	   			else
	   			{
	   				Log.info(strPanelName+"  Panel is already expanded");
	   			}
	   			}catch(Exception e)
	   			{
	   				Log.info("Exception Occured in method 'rebate_expandThePanel' ");
	   			}
	   			itr++;
	   		}
   		}
   		if(rebate_expandThePanel==false) { Log.info("The element "+objPath+" is not displaying");}
   		return rebate_expandThePanel;
   	}
	
  	 
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	// Method: rebate_GetTextFromEdit
   	// Return Type: String
   	// Description: get the Text from the field.
   	// Parameters: BaseElement ObjPath
   	// Example:
   	// Author:
   	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	 public String rebate_GetTextFromEdit(BaseElement element) 
   	 {
   		boolean getTextFromEdit = false;
   		String strText = null;
 		int attempts = 0;
 		while (attempts < 3)
 		{
 			try
 			{
 				if(element.exists(1000))
 				{
 					strText = element.getFill();
 										
 					rxnovaCommonUtil.waitForAngularPageRefresh();
 					Log.info("Get Text from Edit :"+strText);
 					getTextFromEdit = true;
 					break;
 				}
 			}
 			catch(Exception e){	 }
 			attempts++;
   		}
 		if(getTextFromEdit==false)
 		{
 			Log.info("Web Edit  :"+ element +":  was not found");
 		}
 		return strText;
   	 }
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: rebate_SelectFromDropdownUsingText
  	// Return Type: void
  	// Description: Selects from dropdown using text attribute.
  	// Parameters: BaseElement ObjPath, String text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public boolean rebate_SelectFromDropdownUsingText(BaseElement element, String toSelect) throws Throwable 
  	 {
  	 	 boolean itemSelection = false;
  	 	 int attempts = 0;
  	 	 while(attempts < 3)
  	 	 {
  	 		 try
  	 		 {
  	 			 if(element.exists(1000))
  	 			 {
  	 				 String strValue = element.getSelectedValue();
  	 				 if(!strValue.equalsIgnoreCase(toSelect))
  	 				 {
  	 					element.selectByVisibleText(toSelect);
  	 					rxnovaCommonUtil.waitForAngularPageRefresh();
  	 					Log.info("Selected the item:  "+ toSelect +" from the List box : "+element.getAttribute("name"));
  	 					itemSelection = true;
  	 					break;
  	 				 }
  	 			 }
  	 		 }
  	 		 catch(Exception e) { System.out.println(e.getMessage());}
  	 		 attempts++;
  	 	 }
  	 	 if(itemSelection==false) { Log.info("Web List: "+element+" was not found");}
         return itemSelection;
  	 }
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	// Method: rebate_SetTextOnEdit
   	// Return Type: void
   	// Description: Send keys to be entered to the field.
   	// Parameters: BaseElement ObjPath, String toEnter -- keys desired to be sent to text edit field
   	// Example:
   	// Author:
   	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   	 public boolean rebate_SetTextOnEdit(BaseElement element, String toEnter) 
   	 {
   		boolean setTextOnEdit = false;
 		int attempts = 0;
 		while (attempts < 3)
 		{
 			try
 			{
 				if(element.exists(1000))
 				{
 					element.typeAndTab(toEnter); 					
 					Log.info("Set Text into Edit :"+toEnter);
 					setTextOnEdit = true;
 					break;
 				}
 				rxnovaCommonUtil.waitForAngularPageRefresh();
 			}
 			catch(Exception e)
 			{	
 				Log.info("rebate_SetTextOnEdit: = "+e.getMessage());
 			}
 			attempts++;
   		}
 		if(setTextOnEdit==false)
 		{
 			Log.info("Web Edit  :"+ element +":  was not found");
 		}
 		return setTextOnEdit;
   	 }
	 
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: rebate_Webtable_ClickOnCheckBox
  	// Return Type: boolean
  	// Description: click on check box in web table based on text.
  	// Parameters: BaseElement element, String Text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	/*
   	 public boolean rebate_Webtable_ClickOnCheckBox(BaseElement element, String strValue) throws Throwable 
  	 {  			
	    Boolean rebate_Webtable_ClickOnCheckBox = false;
  		
  		int exceptionCount = 0;
  		  		
  		if(element.exists(1000))
  		{
  			A:
  			do
  			{
  				int attempts = 0;		
  				while (attempts < 3) 
  				{
  					try 
  					{
		  				WebElement objTblBody = element.findElement(By.tagName("tbody"));
		  				List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));  			  				
		  				for(int row=0;row<rows.size();row++)
		  				{
		  					String strActRowValue = "";
		  			  		String strActCellValue = "";
		  					List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
		  					for(int col=0;col<cols.size();col++)
		  					{
		  						strActCellValue = cols.get(col).getText();
	  							if((col == 0)&&(strActCellValue.isEmpty()))
	  							{
	  							}
	  							else if((col == 0)&&(!strActCellValue.isEmpty())) {
	  								strActRowValue = strActCellValue;
	  							}
	  							else //if(col!=cols.size())
	  							{
	  								if(strActRowValue.isEmpty())
	  								{
	  									strActRowValue = strActCellValue;
	  								}
	  								else
	  								{
	  									strActRowValue = strActRowValue+"*"+strActCellValue;
	  								}
	  							}	  							
		  					}			  					
 		  					if(strActRowValue.contains(strValue))
		  					{
		  						System.out.println("The Row has the value: "+strActRowValue);  			  						
		  					    if (!cols.get(0).findElement(By.tagName("input")).isSelected())
		  						  {
		  							  cols.get(0).findElement(By.tagName("input")).click();
		  							  rxnovaCommonUtil.waitForAngularPageRefresh();
		  							  rebate_Webtable_ClickOnCheckBox = true;
		  							  break;
		  						  }
		  						  else
		  						  {
		  							Log.info("The check box for "+strValue+" is already checked");
		  							  rebate_Webtable_ClickOnCheckBox = true;
		  							  break;
		  						  }
		  					 }	  					
		  				}  			  				
  			  			if(rebate_Webtable_ClickOnCheckBox == true)
  			  			{
  			  				break A;
  			  			}
					break;
				}
				catch(Exception e) 
  				{
					Log.info("rebate_Webtable_ClickOnCheckBox: = "+e.getMessage());
				}
				attempts++;
			}  				
  			if(rebate_Webtable_ClickOnCheckBox==false)
  			{
  				try
  			    {
  			    	String elmnt = element.getAttribute("ng-table");
  			    	if(getDriver().findElements(By.xpath("//*[@ng-table='"+elmnt+"']/following-sibling::*//*[@ng-switch-when='next']")).size()>0)
  			    	{
  	  			    	getDriver().findElement(By.xpath("//*[@ng-table='"+elmnt+"']/following-sibling::*//*[@ng-switch-when='next']")).click();
  	  			        rxnovaCommonUtil.waitForAngularPageRefresh();
  			    	}
  			    	else
  			    	{
  			    		break A;
  			    	}
  			    }
  			    catch(Exception e) {
  			    	Log.info("Exception while clicking Next in rebate_Webtable_ClickOnCheckBox: = "+e.getMessage());
  			    	exceptionCount++;
			    	if(exceptionCount>3)
			    	{
			    		break A;
			    	}
  			    }
  			}
		}while(rebate_Webtable_ClickOnCheckBox==false);
	  }  				
  	  else 
  	  {
  		Log.info("Webelement: "+element+" was not found");
  	  }
	
      return rebate_Webtable_ClickOnCheckBox;
  	}
  	
  	*/
   //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     // Method: rebate_Webtable_ClickOnCheckBox
     // Return Type: boolean
     // Description: click on check box in web table based on text.
     // Parameters: BaseElement element, String Text 
     // Example:
     // Author:
       //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     public boolean rebate_Webtable_ClickOnCheckBox(BaseElement element, String strValue) throws Throwable 
     {
                   
         Boolean rebate_Webtable_ClickOnCheckBox = false;
         
            String strActRowValue = "";
            String strActCellValue = "";
            
            String[] arrRowValue = strValue.split("\\*",-1);
            
            if(element.isDisplayed())
            {
                   A:
                   do
                   {
                         int attempts = 0;          
                         while (attempts < 3) 
                         {
                                try 
                                {
                                       WebElement objTblBody = element.findElement(By.tagName("tbody"));
                                       List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));                                              
                                       for(int row=0;row<rows.size();row++)
                                       {
                                    	   List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
                                    	   for(int col=0;col<arrRowValue.length;col++)
                                    	   {
                                    	       strActCellValue = cols.get(col+1).getText();                                                       
                                    		   if(col == 0)
                                    		   {
                                    			   strActRowValue = strActCellValue;
                                    		   }
                                    		   else if(col!=cols.size()-1)
                                    		   {
                                    			   strActRowValue = strActRowValue+"*"+strActCellValue;
                                    		   }
                                    		   else
                                    		   {
                                    			   break;
                                    	     }
                                          }                                                     
                                    	  if(strActRowValue.trim().equalsIgnoreCase(strValue.trim()))
                                    	  {
                                    		  System.out.println("The Row has the value: "+strActRowValue);                                                            
                                    		  if (!cols.get(0).findElement(By.tagName("input")).isSelected())
                                    		  {
                                    			  cols.get(0).findElement(By.tagName("input")).click();
                                    			  getNgDriver().waitForAngularRequestsToFinish();
                                    			  rebate_Webtable_ClickOnCheckBox = true;
                                    			  break;
                                             }
                                    		 else
                                    		 {
                                    			 Log.info("The check box for "+strValue+" is already checked");
                                    			 rebate_Webtable_ClickOnCheckBox = true;
                                    			 break;
                                    		 }
                                    	  }                                       
                                       	}                                              
                                        if(rebate_Webtable_ClickOnCheckBox == true)
                                        {
                                              break A;
                                        }
    
                                break;
                         }
                         catch(Exception e) {}
                         attempts++;
                   }
                         
                         if(rebate_Webtable_ClickOnCheckBox==false)
                         {
                        	String strElement = element.getWrappedElement().toString();
             		    	String[] arrElement = strElement.split("xpath:",-1);
             		    	
             		    	String strElement1 = arrElement[1].trim();
             		    	
             		    	int intLength = strElement1.length();
             		    	
             		    	if(strElement1.substring(intLength-3).contains("]]]"))
             		    	{
             		    		strElement1 = strElement1.replace("]]]", "]");
             		    	}
             		    	else if(strElement1.substring(intLength-2).contains("]]"))
             		    	{
             		    		strElement1 = strElement1.replace("]]", "]");
             		    	}
             		    	else if(strElement1.substring(intLength-1).contains("]"))
             		    	{
             		    		strElement1 = strElement1.substring(0,intLength-1);
             		    	}	             		    	  			    	
             		    	if(getDriver().findElements(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).size()>0)
             		    	{
             		    		getDriver().findElement(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).click();  			    		
               			    	getNgDriver().waitForAngularRequestsToFinish();
             		    	}
             		    	else
             		    	{
             		    		break A;
             		    	}
                        }
            }while(rebate_Webtable_ClickOnCheckBox==false);
            
            if(rebate_Webtable_ClickOnCheckBox == false)
         {
            Log.info("The Row has the value: "+strActRowValue+"is not matched with the provided value: "+strValue);
         }
       }           
       else 
       {
            Log.info("Webelement: "+element+" was not found");
       }
    return rebate_Webtable_ClickOnCheckBox;
     }
 
  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: rebate_Webtable_VerifyRowData
  	// Return Type: boolean
  	// Description: verify row data in web table based on text.
  	// Parameters: BaseElement element, String Text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean rebate_Webtable_VerifyRowData(BaseElement element, String strValue) throws Throwable 
  	{	
	    Boolean rebate_Webtable_VerifyRowData = false;
	    
  		String strActRowValue = "";
  		String strActCellValue = "";	
  		if(element.isDisplayed())
  		{
  			A:
  	  	  	do
  	  	  	{
	  			int attempts = 0;		
	  			while (attempts < 3) 
	  			{
	  				try 
	  				{
			  			WebElement objTblBody = element.findElement(By.tagName("tbody"));
			  			List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));	  			  				
			  			for(int row=0;row<rows.size();row++)
			  			{
			  				List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
			  				for(int col=0;col<cols.size();col++)
			  				{
			  					strActCellValue = cols.get(col).getText();			  					
			  					if(cols.size() == 1)
			  					{
			  						if(strActCellValue.equalsIgnoreCase(strValue))
			  						{
			  							Log.info("The Row has the value "+strActCellValue);
			  							rebate_Webtable_VerifyRowData = true;
			  							break A;
			  						}
			  					}	  			 					  
			  					if(col == 0)
			  					{
			  						if(cols.get(0).findElements(By.tagName("input")).size() == 0)
			  						{
			  							strActRowValue = strActCellValue;
			  						}
			  						else
			  						{
			  							strActRowValue = cols.get(col+1).getText();
			  							col = col+1;
			  						}		  							  						
			  					}
			  					else if(col!=cols.size())
			  					{
			  						strActRowValue = strActRowValue+"*"+strActCellValue;
			  					}
			  					else
			  					{
			  						break;
			  					}
			  				}				  					
			  				if(strActRowValue.contains(strValue))
							{
								Log.info("The Row has the value "+strActRowValue);
								rebate_Webtable_VerifyRowData = true;
								break;
							}	  					
			  			}			  			
		  				if(rebate_Webtable_VerifyRowData == true)
		  				{
		  					break A;
		  				}
			  				
		  				break;
					}
					catch(Exception e) { Log.info("rebate_Webtable_VerifyRowData: = "+e.getMessage()); }
					attempts++;
				}	  			
	  			 if(rebate_Webtable_VerifyRowData==false)
                 {
	  				String strElement = element.getWrappedElement().toString();
			    	String[] arrElement = strElement.split("xpath:",-1);			    	
			    	String strElement1 = arrElement[1].trim();
			    	
			    	int intLength = strElement1.length();
			    	
			    	if(strElement1.substring(intLength-3).contains("]]]"))
			    	{
			    		strElement1 = strElement1.replace("]]]", "]");
			    	}
			    	else if(strElement1.substring(intLength-2).contains("]]"))
			    	{
			    		strElement1 = strElement1.replace("]]", "]");
			    	}
			    	else if(strElement1.substring(intLength-1).contains("]"))
			    	{
			    		strElement1 = strElement1.substring(0,intLength-1);
			    	}	
			    	  			    	
			    	if(getDriver().findElements(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).size()>0)
			    	{
			    		getDriver().findElement(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).click();  			    		
	  			    	getNgDriver().waitForAngularRequestsToFinish();
			    	}
			    	else
			    	{
			    		break A;
			    	}
                }
  	  	  	}while(rebate_Webtable_VerifyRowData==false);
  		}  		
	    if(rebate_Webtable_VerifyRowData == false)
	    {
	    	Log.info("The Row does not match with the provided value "+strValue);
	    }	    
	    return rebate_Webtable_VerifyRowData;
  	}  	
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Method: rebate_view_and_VerifyContractInformationScreenValues
  // Return Type: boolean
  // Description: View and verify the contract information screen values.
  // Parameters: BaseElement objElement, String strTableValues, String strTableNameForReporting 
  // Example:
  // Author:
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	   
  public boolean rebate_view_and_VerifyContractInformationScreenValues(BaseElement objElement, String strTableValues, String strTableNameForReporting) throws Throwable
  {
	  boolean isValuesMatched = false;
	  String strValue = null;
	  String[] searchValues = null;
	  BaseElement objPath = objElement;
	  
	  searchValues = strTableValues.split("\\*",-1);
	
	  List<String> ExpectedSearchValuesList = Arrays.asList(searchValues);
	  List<WebElement> searchValueList = null;
	  ArrayList<String> appActualSearchValueList = new ArrayList<String>();		
	  if(objPath.exists(1000))
	  {
		  int searchAttempts = 0;
		  while (searchAttempts < 3)
		  {
			  try
			  {
				  switch(strTableNameForReporting.toLowerCase())
				  {
				  case "vendordetails":
					  searchValueList = objPath.findElements(By.xpath("//span[@class='col-md-2 ng-binding']"));
					  break;
				  case "reclassifyclaims":
					  searchValueList = objPath.findElements(By.xpath("//div[@class='checkbox ng-scope' and contains(@ng-repeat,'reclassifyClaims')]//span"));
					  break;
				  case "reclassifyonly":
					  searchValueList = objPath.findElements(By.xpath("//div[@class='checkbox ng-scope' and contains(@ng-repeat,'reclassifyOnly')]//span"));
					  break;
				  case "penalty":
					  searchValueList = objPath.findElements(By.xpath("//span[@class='col-md-3 ng-binding']"));
					  break;
				  }					
				  for(int m=0;m<searchValueList.size();m++)
				  {
					  strValue = searchValueList.get(m).getText().trim(); 
					  if(strValue.toLowerCase().equals(searchValues[m].toLowerCase()))
					  {
						  appActualSearchValueList.add(strValue);
					  }
				  }
			  }
			  catch(Exception e)
			  {
				  Log.info("Exception in rebate_view_and_VerifyContractInformationScreenValues method");
				  Log.info("The number of search attempts is: " + searchAttempts);
				  searchAttempts++;
				  if (searchAttempts == 3) 
				  {
					  Log.info("Exception is still exist...");
				  }
			  }
			  if(ExpectedSearchValuesList.equals(appActualSearchValueList))
			  {
				  Log.info("Expected  "+ strTableNameForReporting + " "+ExpectedSearchValuesList);
				  Log.info("Actual      "+ strTableNameForReporting + " "+appActualSearchValueList);
				  Log.info(strTableNameForReporting + " Table Values matched");
				  isValuesMatched = true;
				  break;
			  }
			  else
			  {
				  Log.info("Expected  "+ strTableNameForReporting + " "+ExpectedSearchValuesList);
				  Log.info("Actual      "+ strTableNameForReporting + " "+appActualSearchValueList);
				  Log.info(strTableNameForReporting + " Table Values not matched");
				  isValuesMatched = false;
				  break;
			  }
		  }
		  if (isValuesMatched == false && !appActualSearchValueList.equals(ExpectedSearchValuesList)) 
		  {
			  Log.info("Search Values found but data does not match");
		  }
		  else if (isValuesMatched == false )
		  {
			  Log.info("Search Values not found");
		  }
	  }
	  return isValuesMatched;
  }
  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Method: getContractID
  // Return Type: void
  // Description: get the contract id from the screen.
  // Parameters:  
  // Example:
  // Author:
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public void getContractID()
  { 
	  try {
	  WebElement customerContract = $(By.xpath("//span[@ng-bind='title' and text()='Customer Contract']"));	  
	  new WebDriverWait(getDriver(),60).until(ExpectedConditions.visibilityOf(customerContract));	  
	  String strContractID = $(By.xpath("//span[@class='col-md-2 ng-binding' and  @ng-bind='contract.contractId']")).getText();
	  Log.info("The Contract Id = "+strContractID);
	  CONTRACT_ID =  strContractID;
	  Log.info("CONTRACT ID = "+CONTRACT_ID);
	  }
	  catch(Exception e)
	  {
		  Log.info("Exception exist in ' getContractID ' method ");
	  }
  }
  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Method: getContractName
  // Return Type: void
  // Description: get the contract id from the screen.
  // Parameters:  
  // Example:
  // Author:
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public void getContractName()
  {
	  try
	  {
	  WebElement customerContract = $(By.xpath("//span[@ng-bind='title' and text()='Customer Contract']"));	  
	  new WebDriverWait(getDriver(),60).until(ExpectedConditions.visibilityOf(customerContract));
	  String strContractName = $(By.xpath("//span[@class='col-md-2 ng-binding' and @ng-bind='contract.contractName']")).getText();
	  CONTRACT_NAME = strContractName;
	  Log.info("CONTRACT NAME = "+CONTRACT_NAME);
	  }
	  catch(Exception e)
	  {
		  Log.info("Exception exist in ' getContractName ' method");
	  }
  }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Method: rebate_Webtable_ClickOnLink
// Return Type: boolean
// Description: click on link in web table based on text.
// Parameters: BaseElement element, String Text 
// Example:
// Author:
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public boolean rebate_Webtable_ClickOnLink(BaseElement element, String strValue) throws Throwable 
{		
	Boolean rebate_Webtable_ClickOnLink = false;
	int expCount = 0;
	int linkCell = 0;
	String strActRowValue = "";
	String strActCellValue = "";
	String[] arrRowValue = strValue.split("\\*",-1);
	if(element.isDisplayed())
	{
		A:
		do
		{
			int attempts = 0;		
			while (attempts < 3) 
			{
				try 
				{
					WebElement objTblBody = element.findElement(By.tagName("tbody"));
					List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));	  				
					for(int row=0;row<rows.size();row++)
					{
						List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
						for(int col=0;col<arrRowValue.length;col++)
						{
							if(cols.get(0).findElements(By.tagName("input")).size()>0)
							{
								strActCellValue = cols.get(col+1).getText();
								linkCell = arrRowValue.length+1;
							}
							else
							{
								strActCellValue = cols.get(col).getText();
								linkCell = arrRowValue.length-1;
							}	  					  
							if(col == 0)
							{
								strActRowValue = strActCellValue;
							}
							else if(col!=cols.size())  // need to think with the logic ( col!=cols.size()-1 )
							{
								strActRowValue = strActRowValue+"*"+strActCellValue;
							}
							else
							{
								break;
							}
						}  					
						if(strActRowValue.equalsIgnoreCase(strValue))
						{
							Log.info("The Row has the value: "+strActRowValue);		  						
							cols.get(linkCell).findElement(By.tagName("a")).click();
							rxnovaCommonUtil.waitForAngularPageRefresh();
							rebate_Webtable_ClickOnLink = true;
							break;
						}	  					
					}	  				
					if(rebate_Webtable_ClickOnLink == true)
					{
						break A;
					}
					break;
				}
				catch(Exception e) {Log.info("Exception exist in ' rebate_Webtable_ClickOnLink' method"+e.getMessage());}
				attempts++;
			}		
			if(rebate_Webtable_ClickOnLink==false)
			{
				try
				{
					if(getDriver().findElements(By.xpath("//*[@ng-switch-when='next']")).size()>0)
					{
						getDriver().findElement(By.xpath("//*[@ng-switch-when='next']")).click();
						rxnovaCommonUtil.waitForAngularPageRefresh();
					}
					else
					{
						break A;
					}
				}
				catch(Exception e) 
				{
					System.out.println("Exception exist while clicking on Next in method 'rebate_Webtable_ClickOnLink' ");
			    	expCount++;
			    	if(expCount>3)
			    	{
			    		break A;
			    	}
			    }
			}
	}while(rebate_Webtable_ClickOnLink==false);
  }  			
  else 
  {
		Log.info("Webelement: "+element+" was not found");
  }
  return rebate_Webtable_ClickOnLink;
}

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Method: rebate_Error_Details_Webtable_VerifyRowData
	// Return Type: boolean
	// Description: verify row data in web table.
	// Parameters: BaseElement element, String Text 
	// Example:
	// Author:
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public boolean rebate_Error_Details_Webtable_VerifyRowData(BaseElement element, String strValue) throws Throwable 
	{
			
    Boolean rebate_Error_Details_Webtable_VerifyRowData = false;
    int exceptionCount =0;
		String strActRowValue = "";
		String strActCellValue = "";
		
		if(element.isDisplayed())
		{
			A:
	  		do
	  		{
  			int attempts = 0;		
			while (attempts < 3) 
			{
				try 
				{
	  				WebElement objTblBody = element.findElement(By.tagName("tbody"));
	  				List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));
		  				
	  				for(int row=0;row<rows.size();row++)
	  				{
	  					List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
	  					for(int col=0;col<cols.size();col++)
	  					{
  							strActCellValue = cols.get(col).getText();
  							
  							if(cols.size() == 1)
		  					{
		  						if(strActCellValue.equalsIgnoreCase(strValue))
		  						{
		  							Log.info(strValue+" message dislayed in the table");
		  							break A;
		  						}
		  					}
	  					  
	  						if(col == 0)
	  						{
	  							strActRowValue = strActCellValue;
	  						}
	  						else if(col!=cols.size())
	  						{
	  							strActRowValue = strActRowValue+"^"+strActCellValue;
	  						}
	  						else
	  						{
	  							break;
	  						}
	  					}
		  					
		  				if(strActRowValue.equalsIgnoreCase(strValue))
						  {
							Log.info("The Row has the value "+strActRowValue);
							rebate_Error_Details_Webtable_VerifyRowData = true;
							break;
						  }		  					
	  				}
	  				
	  				if(rebate_Error_Details_Webtable_VerifyRowData == true)
	  				{
	  					break A;
	  				}
		  				
	  				break;
			}
			catch(Exception e) { Log.info("Exception exist in method 'rebate_Error_Details_Webtable_VerifyRowData'"+e.getMessage());}
			attempts++;
		}
			
		if(rebate_Error_Details_Webtable_VerifyRowData==false)
		{
			try
		    {
		    	if(getDriver().findElements(By.xpath("//*[@class='error-details']//*[@ng-switch-when='next']")).size()>0)
		    	{
		    		getDriver().findElement(By.xpath("//*[@class='error-details']//*[@ng-switch-when='next']")).click();
		    		rxnovaCommonUtil.waitForAngularPageRefresh();
		    	}
		    	else
		    	{
		    		break A;
		    	}
		    }
		    catch(Exception e) {
		    	Log.info("Exception exist while clicking next in method 'rebate_Error_Details_Webtable_VerifyRowData'"+e.getMessage());
		    	exceptionCount++;
		    	if(exceptionCount>3)
		    	{
		    		break A;
		    	}
		    }
		}
	}while(rebate_Error_Details_Webtable_VerifyRowData==false);
  }  		
	
	  else 
	  {
		Log.info("Webelement: "+element+" was not found");
	  }

  return rebate_Error_Details_Webtable_VerifyRowData;
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Method: rebate_Error_Details_VerifyMCSDetails
	// Return Type: boolean
	// Description: verify label name and its value.
	// Parameters: BaseElement element, String Text 
	// Example:
	// Author:
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public boolean rebate_Error_Details_VerifyMCSDetails(BaseElement element, String strValue) throws Throwable 
	{			
		Boolean rebate_Error_Details_VerifyMCSDetails = false;		
		String[] arrRowValue = strValue.split("\\^",-1);
		String strExpLabelName = arrRowValue[0];
		String strExpLabelValue = arrRowValue[1];		
		if(element.isDisplayed())
		{
			int attempts = 0;		
			while (attempts < 3) 
			{
				try 
				{
					List<WebElement> labels = element.findElements(By.tagName("label"));		  		
					for(int i=0;i<labels.size();i++)
  	  			 	{
  	  			  		String strActLabelName = labels.get(i).getText();
  	  			  		if(strActLabelName.equalsIgnoreCase(strExpLabelName))
  	  			  		{
  	  			  			List<WebElement> labelValues = element.findElements(By.tagName("p"));
  	  			  			String strActLabelValue = labelValues.get(i).getText();
  	  			  			if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
  	  			  			{  			    	
  	  			  				Log.info("The Field "+strActLabelName+" has the value "+strActLabelValue);
  	  			  				rebate_Error_Details_VerifyMCSDetails = true;
  	  			  				break;
  	  			  			}
  	  			  		}
  	  			 	}
					break;
				}
				catch(Exception e) { Log.info("Exception exist in method 'rebate_Error_Details_VerifyMCSDetails' "+e.getMessage()); }
				attempts++;
			}
		}
		else 
		{
			Log.info("Webelement: "+element+" was not found");
		}
		return rebate_Error_Details_VerifyMCSDetails;
	}
	
	/*
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: rebate_fileAdmin_Webtable_VerifyRowData
  	// Return Type: boolean
  	// Description: verify row data in web table based on text.
  	// Parameters: BaseElement element, String Text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean rebate_fileAdmin_Webtable_VerifyRowData(BaseElement element, String strValue) throws Throwable 
  	{	
	    Boolean rebate_fileAdmin_Webtable_VerifyRowData = false;
	    int exceptionCount =0;
  		String strActRowValue = "";
  		String strActCellValue = "";	
  		if(element.isDisplayed())
  		{
  			A:
  	  	  	do
  	  	  	{
	  			int attempts = 0;		
	  			while (attempts < 3) 
	  			{
	  				try 
	  				{
			  			WebElement objTblBody = element.findElement(By.tagName("tbody"));
			  			List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));	  			  				
			  			for(int row=0;row<rows.size();row++)
			  			{
			  				List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
			  				for(int col=0;col<cols.size();col++)
			  				{
			  					strActCellValue = cols.get(col).getText();			  					
			  					if(cols.size() == 1)
			  					{
			  						if(strActCellValue.equalsIgnoreCase(strValue))
			  						{
			  							Log.info(strValue+" message dislayed in the table");
			  							break A;
			  						}
			  					}	  			 					  
			  					if(col == 0)
			  					{
			  							strActRowValue = strActCellValue;		  							  						
			  					}
			  					else if(col!=cols.size())
			  					{
			  						strActRowValue = strActRowValue+"*"+strActCellValue;
			  					}
			  					else
			  					{
			  						break;
			  					}
			  				}				  					
			  				if(strActRowValue.equalsIgnoreCase(strValue))
							{
								Log.info("The Row has the value "+strActRowValue);
								rebate_fileAdmin_Webtable_VerifyRowData = true;
								break;
							}
			  				else if(strActRowValue.contains(strValue))
			  				{
			  					Log.info("The Row has the value "+strActRowValue);
								rebate_fileAdmin_Webtable_VerifyRowData = true;
								break;
			  				}
			  			}			  			
		  				if(rebate_fileAdmin_Webtable_VerifyRowData == true)
		  				{
		  					break A;
		  				}			  				
		  				break;
					}
					catch(Exception e) { Log.info("Exception exist in method 'rebate_fileAdmin_Webtable_VerifyRowData'"+e.getMessage()); }
					attempts++;
				}	  			
	  			if(rebate_fileAdmin_Webtable_VerifyRowData==false)
				{
					try
				    {
				    	if(getDriver().findElements(By.xpath("//*[@ng-switch-when='next']")).size()>0)
				    	{
				    		getDriver().findElement(By.xpath("//*[@ng-switch-when='next']")).click();
				    		rxnovaCommonUtil.waitForAngularPageRefresh();
				    	}
				    	else
				    	{
				    		break;
				    	}
				    }
				    catch(Exception e) 
					{
				    	Log.info("Exception exist while clicking next in method 'rebate_fileAdmin_Webtable_VerifyRowData'"+e.getMessage());
				    	exceptionCount++;
				    	if(exceptionCount>3)
				    	{
				    		break A;
				    	}
				    }
				}
  	  	  	}while(rebate_fileAdmin_Webtable_VerifyRowData==false);
  		}  		
	    if(rebate_fileAdmin_Webtable_VerifyRowData == false)
	    {
	    	Log.info("The Row does not match with the provided value "+strValue);
	    }	    
	    return rebate_fileAdmin_Webtable_VerifyRowData;
  	}
  	*/
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: rebate_View_Webtable_VerifyRowData
  	// Return Type: boolean
  	// Description: verify row data in web table based on text.
  	// Parameters: BaseElement element, String Text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean rebate_View_Webtable_VerifyRowData(BaseElement element, String strValue) throws Throwable 
  	{	
	    Boolean rebate_View_Webtable_VerifyRowData = false;
	    
  		String strActRowValue = "";
  		String strActCellValue = "";
  		
  		if(element.isDisplayed())
  		{
  			A:
  	  	  	do
  	  	  	{
	  			int attempts = 0;		
	  			while (attempts < 3) 
	  			{
	  				try 
	  				{
			  			WebElement objTblBody = element.findElement(By.tagName("tbody"));
			  			List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));
			  			for(int row=0;row<rows.size();row++)
			  			{
			  				List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
			  				for(int col=0;col<cols.size();col++)
			  				{
			  					strActCellValue = cols.get(col).getText();
			  					if(cols.size() == 1)
			  					{
			  						if(strActCellValue.equalsIgnoreCase(strValue))
			  						{			  							
			  							Log.info("The Row has the value "+strActCellValue);
			  							rebate_View_Webtable_VerifyRowData = true;
			  							break A;
			  						}
			  					}  
			  					if(col == 0)
			  					{
		  							strActRowValue = strActCellValue;  							  						
			  					}
			  					else if(col!=cols.size())
			  					{
			  						strActRowValue = strActRowValue+"*"+strActCellValue;
			  					}
			  					else
			  					{
			  						break;
			  					}
			  				}
			  				if(strActRowValue.equalsIgnoreCase(strValue))
							{
								Log.info("The Row has the value "+strActRowValue);
								rebate_View_Webtable_VerifyRowData = true;
								break;
							}
//							else if(strActRowValue.contains(strValue))
//			  				{
//			  					Log.info("The Row has the value "+strActRowValue);
//			  					rebate_View_Webtable_VerifyRowData = true;
//								break;
//			  				}
			  			}
		  				if(rebate_View_Webtable_VerifyRowData == true)
		  				{
		  					break A;
		  				}
			  				
		  				break;
					}
					catch(Exception e) {}
					attempts++;
				}
	  			 if(rebate_View_Webtable_VerifyRowData==false)
                 {
	  				String strElement = element.getWrappedElement().toString();
			    	String[] arrElement = strElement.split("xpath:",-1);			    	
			    	String strElement1 = arrElement[1].trim();			    	
			    	int intLength = strElement1.length();			    	
			    	if(strElement1.substring(intLength-3).contains("]]]"))
			    	{
			    		strElement1 = strElement1.replace("]]]", "]");
			    	}
			    	else if(strElement1.substring(intLength-2).contains("]]"))
			    	{
			    		strElement1 = strElement1.replace("]]", "]");
			    	}
			    	else if(strElement1.substring(intLength-1).contains("]"))
			    	{
			    		strElement1 = strElement1.substring(0,intLength-1);
			    	}				    	  			    	
			    	if(getDriver().findElements(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).size()>0)
			    	{
			    		getDriver().findElement(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).click();  			    		
	  			    	getNgDriver().waitForAngularRequestsToFinish();
			    	}
			    	else
			    	{
			    		break A;
			    	}
                }
  	  	  	}while(rebate_View_Webtable_VerifyRowData==false);
  		}
	    if(rebate_View_Webtable_VerifyRowData == false)
	    {
	    	Log.info("The Row has the value: "+strActRowValue+"is not matched with the provided value: "+strValue);
	    }
	    return rebate_View_Webtable_VerifyRowData;
  	}
  	
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 // Method: rebate_fileAdmin_Webtable_ClickOnLink
 // Return Type: boolean
 // Description: click on link in web table based on text.
 // Parameters: BaseElement element, String Text 
 // Example:
 // Author:
 //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 public boolean rebate_fileAdmin_Webtable_ClickOnLink(BaseElement element, String strValue) throws Throwable 
 {		
 	Boolean rebate_Webtable_ClickOnLink = false;
 	int expCount = 0;
 	int linkCell = 0;
 	String strActRowValue = "";
 	String strActCellValue = "";
 	String[] arrRowValue = strValue.split("\\*",-1);
 	if(element.isDisplayed())
 	{
 		A:
 		do
 		{
 			int attempts = 0;		
 			while (attempts < 3) 
 			{
 				try 
 				{
 					WebElement objTblBody = element.findElement(By.tagName("tbody"));
 					List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));	  				
 					for(int row=0;row<rows.size();row++)
 					{
 						List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
 						for(int col=0;col<arrRowValue.length;col++)
 						{ 							
 							strActCellValue = cols.get(col).getText();
 							linkCell = arrRowValue.length-1;	  					  
 							if(col == 0)
 							{
 								strActRowValue = strActCellValue;
 							}
 							else if(col!=cols.size())  // need to think with the logic ( col!=cols.size()-1 )
 							{
 								strActRowValue = strActRowValue+"*"+strActCellValue;
 							}
 							else
 							{
 								break;
 							}
 						}  					
 						if(strActRowValue.equalsIgnoreCase(strValue))
 						{
 							Log.info("The Row has the value: "+strActRowValue);		  						
 							cols.get(linkCell).findElement(By.tagName("a")).click();
 							rxnovaCommonUtil.waitForAngularPageRefresh();
 							rebate_Webtable_ClickOnLink = true;
 							break;
 						}	  					
 					}	  				
 					if(rebate_Webtable_ClickOnLink == true)
 					{
 						break A;
 					}
 					break;
 				}
 				catch(Exception e) {Log.info("Exception exist in method 'rebate_fileAdmin_Webtable_ClickOnLink'"+e.getMessage());}
 				attempts++;
 			}		
 			if(rebate_Webtable_ClickOnLink==false)
 			{
 				try
 				{
 					if(getDriver().findElements(By.xpath("//*[@ng-switch-when='next']")).size()>0)
 					{
 						getDriver().findElement(By.xpath("//*[@ng-switch-when='next']")).click();
 						rxnovaCommonUtil.waitForAngularPageRefresh();
 					}
 					else
 					{
 						break A;
 					}
 				}
 				catch(Exception e) 
 				{
 					Log.info("Exception exist while clicking next in method 'rebate_fileAdmin_Webtable_ClickOnLink'"+e.getMessage());
 			    	expCount++;
 			    	if(expCount>3)
 			    	{
 			    		break A;
 			    	}
 			    }
 			}
 	}while(rebate_Webtable_ClickOnLink==false);
   }  			
   else 
   {
 		Log.info("Webelement: "+element+" was not found");
   }
   return rebate_Webtable_ClickOnLink;
 }
 //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Method - rebate_clickOnLink_in_ContractSearchResultsTable
//Return Type: boolean
//Description: verify row data in web table based on text.
//and Click on the Error Details Link
//Parameters: BaseElement element, String Text 
//Example:
//Author:
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public boolean rebate_clickOnLink_in_ContractSearchResultsTable(BaseElement element, String strSearchValue)
{
	boolean rebate_clickOnLink_in_ContractSearchResultsTable = false;
	int exceptionCount =0;	
	if(element.exists(1000))
	{
		A:
	  	do
	  	{
			int attempts = 0;
			while (attempts < 3) 
	  		{
	  			try 
	  			{
					WebElement objTblBody = element.findElement(By.tagName("tbody"));
			  		List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));
					for(int row=0;row<rows.size();row++)
			  		{
			  			List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
			  			for(int col=0;col<cols.size();col++)
			  			{
							if(cols.get(col).getText().trim().equalsIgnoreCase(strSearchValue))
							{
								getDriver().findElements(By.xpath("//span[@class='glyphicon glyphicon-log-in ng-scope']")).get(row).click();
								rxnovaCommonUtil.waitForAngularPageRefresh();
								rebate_clickOnLink_in_ContractSearchResultsTable = true;
								break;
							}
						}
						if(rebate_clickOnLink_in_ContractSearchResultsTable==true){ break A; }										
					}
				}
				catch(Exception e) { Log.info("Exception occurred in method ' rebate_clickOnLink_in_ContractSearchResultsTable ' :"+e.getMessage());	attempts++;	 }
	  			if(rebate_clickOnLink_in_ContractSearchResultsTable==false)
				{
					try
					{
					   	if(getDriver().findElements(By.xpath("//*[@ng-switch-when='next']")).size()>0)
					   	{
					   		getDriver().findElement(By.xpath("//*[@ng-switch-when='next']")).click();
					   		rxnovaCommonUtil.waitForAngularPageRefresh();
					   	}
					   	else
					   	{
							break A;
					    }
					}
					catch(Exception e) 
					{
						Log.info("Exception exist while clicking next in method 'rebate_clickOnLink_in_ContractSearchResultsTable'"+e.getMessage());
				    	exceptionCount++;
				    	if(exceptionCount>3)	{	break A;	}
				    }
				}
			}			
		}while(rebate_clickOnLink_in_ContractSearchResultsTable==false);
	}
	if(rebate_clickOnLink_in_ContractSearchResultsTable == false)	{	Log.info("The Row does not match with the provided value "+strSearchValue);	}	    
	return rebate_clickOnLink_in_ContractSearchResultsTable;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Method - rebate_ClaimFileSummary_PrilimExtractionStatusVerification
//Return Type: boolean
//Description: click on the refresh button and the verify the prelim extraction status.
//Parameters: BaseElement element, String Text 
//Example:
//Author:
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public boolean rebate_ClaimFileSummary_PrilimExtractionStatusVerification(BaseElement element, String prilimExtractionStatus) 
{
	boolean rebate_ClaimFileSummary_PrilimExtractionStatusVerification = false;	
	int refreshCount = 0;
	String strActStatus = null;
	if(element.exists(1000))
	{
		A:
		  	do
		  	{
		  		int attempts = 0;
				while (attempts < 3) 
		  		{
					try
					{
						//element.click();
						//rxnovaCommonUtil.waitForAngularPageRefresh();						
						while(true)
						{
							try 
							{
								element.click();
								getNgDriver().waitForAngularRequestsToFinish();
								strActStatus = getDriver().findElement(By.xpath("//form[@name='prelimClaimExtractionForm']//label[@class='mt12 ng-binding']")).getText().trim();
								if(strActStatus.equalsIgnoreCase(prilimExtractionStatus))
								{								
									Log.info("Expected status "+" ' "+prilimExtractionStatus+" '"+ " has matched with Actual status "+" ' "+strActStatus+" '");
									rebate_ClaimFileSummary_PrilimExtractionStatusVerification = true;
									break;								
								}
								else
								{
									refreshCount = refreshCount + 1;
									sleep(1000);
								}
								if(refreshCount==120)
								{
									break A;
								}
								strActStatus = getDriver().findElement(By.xpath("//form[@name='prelimClaimExtractionForm']//label[@class='mt12 ng-binding']")).getText().trim();
								if(strActStatus.equalsIgnoreCase("failed")) { break A;}
							}catch(Exception e1) { Log.info("Exception Occured in rebate_ClaimFileSummary_PrilimExtractionStatusVerification"+e1.getMessage());}
						}						
					}catch(Exception e) { Log.info(" Exception Occured in ' rebate_ClaimFileSummary_PrilimExtractionStatusVerification ' "+ e.getMessage()); }
					if(rebate_ClaimFileSummary_PrilimExtractionStatusVerification == true) { break A; }
					attempts++;
		  		}
		  	}while(rebate_ClaimFileSummary_PrilimExtractionStatusVerification = false);
	}
	if(rebate_ClaimFileSummary_PrilimExtractionStatusVerification==false)
	{
		Log.info("Both the Expected and actual status are not matched in claimfile summary tab");
	}
	return rebate_ClaimFileSummary_PrilimExtractionStatusVerification;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Method - rebate_BenefitFileSummary_PrilimExtractionStatusVerification
//Return Type: boolean
//Description: click on the refresh button and the verify the prelim extraction status.
//Parameters: BaseElement element, String Text 
//Example:
//Author:
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public boolean rebate_BenefitFileSummary_PrilimExtractionStatusVerification(BaseElement element, String prilimExtractionStatus) 
{
     boolean rebate_BenefitFileSummary_PrilimExtractionStatusVerification = false;     
     int refreshCount = 0;
     String strActStatus = null;
     if(element.exists(1000))
     {
            A:
                   do
                   {
                          int attempts = 0;
                         while (attempts < 3) 
                          {
                                try
                                {
                                       //element.click();
                                       //rxnovaCommonUtil.waitForAngularPageRefresh();                                   
                                       while(true)
                                       {
                                              try 
                                              {
                                                     element.click();
                                                     rxnovaCommonUtil.waitForAngularPageRefresh();
                                                     strActStatus = getDriver().findElement(By.xpath("//form[@name='prelimBenefitFileForm']//label[@class='mt12 ng-binding']")).getText().trim();
                                                     if(strActStatus.equalsIgnoreCase(prilimExtractionStatus))
                                                     {                                                      
                                                            rebate_BenefitFileSummary_PrilimExtractionStatusVerification = true;
                                                            break;                                                
                                                     }
                                                     else
                                                     {
                                                            refreshCount = refreshCount + 1;
                                                            sleep(1000);
                                                     }
                                                    if(refreshCount==180)
                                                     {
                                                            break;
                                                     }
                                                     strActStatus = getDriver().findElement(By.xpath("//form[@name='prelimBenefitFileForm']//label[@class='mt12 ng-binding']")).getText().trim();
                                                     if(strActStatus.equalsIgnoreCase("failed")) { break A;}
                                              }catch(Exception e1) { Log.info("Exception Occured in rebate_BenefitFileSummary_PrilimExtractionStatusVerification"+e1.getMessage());}
                                       }                                        
                                }catch(Exception e) { Log.info(" Exception Occured in ' rebate_BenefitFileSummary_PrilimExtractionStatusVerification ' "+ e.getMessage()); }
                                if(rebate_BenefitFileSummary_PrilimExtractionStatusVerification == true) { break A; }
                                attempts++;
                          }
                   }while(rebate_BenefitFileSummary_PrilimExtractionStatusVerification = false);
     }
     if(rebate_BenefitFileSummary_PrilimExtractionStatusVerification==false)
     {
            Log.info("Both the Expected and actual status are not matched in benefitfile summary tab");
     }
     return rebate_BenefitFileSummary_PrilimExtractionStatusVerification;
}


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Method - rebate_VerifyPreliminaryFileDetails
// return type - boolean
// Description - Verify Claim File Summary Priliminary Extraction Results
//Parameters: WebElement element, String 
//Example:
//Author:
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public boolean rebate_VerifyPreliminaryFileDetails(WebElement element, String strValue) throws Throwable 
{   
      Boolean rebate_VerifyPreliminaryFileDetails = false;
      String[] arrRowValue = strValue.split("\\^",-1);
      String strExpLabelName = arrRowValue[0];
      String strExpLabelValue = arrRowValue[1];
      if(element.isDisplayed())
      {
          int attempts = 0;          
          while (attempts < 3) 
          {
              try 
              {
                    List<WebElement> labels = element.findElements(By.tagName("label"));                              
                     for(int i=0;i<labels.size();i++)
                       {
                             String strActLabelName = labels.get(i).getText();
                            if(strActLabelName.equalsIgnoreCase(strExpLabelName))
                            {
                                 String strActLabelValue = labels.get(i+1).getText();
                                 if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))                                 
                                 {                                                               
                                	 Log.info("The Field "+"'"+strActLabelName+"'"+" has the value "+"'"+strActLabelValue+"'");
                                    rebate_VerifyPreliminaryFileDetails = true;
                                    break;
                                     }
                              }
                       }
                      break;
              }
              catch(Exception e) { Log.info("Exception Occured in ' rebate_VerifyPreliminaryFileDetails ' :"+e.getMessage());}
              attempts++;
           }
         }
         else 
         {
        	 Log.info("Webelement: "+element+" was not found");
         }  
       return rebate_VerifyPreliminaryFileDetails;
  }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Method - rebate_VerifyPreliminaryClaimFileDetails
//return type - boolean
//Description - Verify Claim File Summary Priliminary Extraction Results
//Parameters: WebElement element, String 
//Example:
//Author:
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public boolean rebate_VerifyPreliminaryClaimFileDetails(WebElement element, String strValue) throws Throwable 
{      
	Boolean rebate_VerifyPreliminaryFileDetails = false;
   String[] arrRowValue = strValue.split("\\^",-1);
   String strExpLabelName = arrRowValue[0];
   String strExpLabelValue = arrRowValue[1];
   if(element.isDisplayed())
   {
       int attempts = 0;          
       while (attempts < 3) 
       {
           try 
           {
                 List<WebElement> labels = element.findElements(By.tagName("label"));                              
                  for(int i=0;i<labels.size();i++)
                    {
                          String strActLabelName = labels.get(i).getText();
                         if(strActLabelName.equalsIgnoreCase(strExpLabelName))
                         {
                              String strActLabelValue = labels.get(i+1).getText();
                              //if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
                              if(Integer.parseInt(strActLabelValue)>0) // && Integer.parseInt(strExpLabelValue)>0
                              {                                                               
                             	 Log.info("The Field "+"'"+strActLabelName+"'"+" has the value "+"'"+strActLabelValue+"'");
                                 rebate_VerifyPreliminaryFileDetails = true;
                                 break;
                              }
                         break;
                         }
                    }
                   break;
           }
           catch(Exception e) { Log.info("Exception Occured in ' rebate_VerifyPreliminaryClaimFileDetails ' :"+e.getMessage());}
           attempts++;
        }
      }
      else 
      {
     	 Log.info("Webelement: "+element+" was not found");
      }  
    return rebate_VerifyPreliminaryFileDetails;
}

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//Method - rebate_VerifyPreliminaryClaimFileDateFormat
//return type - boolean
//Description - Verify Claim File Summary Priliminary Extraction Results
//Parameters: WebElement element, String 
//Example:
//Author:
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
public boolean rebate_VerifyPreliminaryClaimFileDateFormat(WebElement element, String strValue) throws Throwable 
{      
	Boolean rebate_VerifyPreliminaryFileDetails = false;
 String[] arrRowValue = strValue.split("\\^",-1);
 String strExpLabelName = arrRowValue[0];
 String strExpLabelValue = arrRowValue[1];
 if(element.isDisplayed())
 {
     int attempts = 0;          
     while (attempts < 3) 
     {
         try 
         {
               List<WebElement> labels = element.findElements(By.tagName("label"));                              
                for(int i=0;i<labels.size();i++)
                {
                        String strActLabelName = labels.get(i).getText();
                       if(strActLabelName.equalsIgnoreCase(strExpLabelName))
                       {
                            String strActLabelValue = labels.get(i+1).getText();
                            if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))                            
                            {                                                               
                           	 Log.info("The Field "+"'"+strActLabelName+"'"+" has the value "+"'"+strActLabelValue+"'");
                               rebate_VerifyPreliminaryFileDetails = true;
                               break;
                            }
                       }
                }
          break;
         }
         catch(Exception e) { Log.info("Exception Occured in ' rebate_VerifyPreliminaryClaimFileDateFormat ' :"+e.getMessage());}
         attempts++;
      }
    }
    else 
    {
   	 Log.info("Webelement: "+element+" was not found");
    }  
  return rebate_VerifyPreliminaryFileDetails;
}

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Method: rebate_fileAdmin_Webtable_UploadedFileStatusVerification
	// Return Type: boolean
	// Description: verify row data in web table based on text and also verify the status.
	// Parameters: BaseElement tableElement, BaseElement buttonElement,String strSearchRecord,String strExpStatus 
	// Example:
	// Author:
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public boolean rebate_fileAdmin_Webtable_UploadedFileStatusVerification(BaseElement tableElement, BaseElement buttonElement,String strSearchRecord,String strExpStatus) throws Throwable 
	{	
		Boolean rebate_fileAdmin_Webtable_UploadedFileStatusVrification = false;
		int exceptionCount =0;
		String strActRowValue = "";
		String strActCellValue = "";	
		int searchCount = 0;
		
		if(tableElement.isDisplayed())
		{
			A:
	  	  	do
	  	  	{
  			int attempts = 0;		
  			while (attempts < 3) 
  			{
  				try 
  				{
		  			WebElement objTblBody = tableElement.findElement(By.tagName("tbody"));
		  			List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));	  			  				
		  			for(int row=0;row<rows.size();row++)
		  			{
		  				List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
		  				for(int col=0;col<cols.size();col++)
		  				{
		  					strActCellValue = cols.get(col).getText();			  							  						  			 					  
		  					if(col == 0)
		  					{		  						
		  						strActRowValue = strActCellValue;		  								  							  						
		  					}
		  					else if(col!=cols.size())
		  					{
		  						strActRowValue = strActRowValue+"*"+strActCellValue;
		  					}
		  					else
		  					{
		  						break;
		  					}
		  				}				  					
		  				if(strActRowValue.equalsIgnoreCase(strSearchRecord))
						{
							Log.info("The Row has the value "+strActRowValue);
							String strActStatus = cols.get(9).getText().trim();
							while(!strActStatus.equalsIgnoreCase(strExpStatus))
							{
								if(buttonElement.exists(1000))
								{
									buttonElement.click();
									rxnovaCommonUtil.waitForAngularPageRefresh();
									if(searchCount>60)
									{
										break;
									}
								}
								searchCount++;
								strActStatus = cols.get(9).getText().trim();
							}
							rebate_fileAdmin_Webtable_UploadedFileStatusVrification = true;
							break;
						}	  					
		  			}			  			
	  				if(rebate_fileAdmin_Webtable_UploadedFileStatusVrification == true)
	  				{
	  					break A;
	  				}
		  				
	  				break;
				}
				catch(Exception e) { Log.info("Exception exist in method 'rebate_fileAdmin_Webtable_VerifyRowData'"+e.getMessage()); }
				attempts++;
			}	  			
  			if(rebate_fileAdmin_Webtable_UploadedFileStatusVrification==false)
			{
				try
			    {
			    	if(getDriver().findElements(By.xpath("//*[@ng-switch-when='next']")).size()>0)
			    	{
			    		getDriver().findElement(By.xpath("//*[@ng-switch-when='next']")).click();
			    		rxnovaCommonUtil.waitForAngularPageRefresh();
			    	}
			    	else
			    	{
			    		break A;
			    	}
			    }
			    catch(Exception e) 
				{
			    	Log.info("Exception exist while clicking next in method 'rebate_fileAdmin_Webtable_VerifyRowData'"+e.getMessage());
			    	exceptionCount++;
			    	if(exceptionCount>3)
			    	{
			    		break A;
			    	}
			    }
			}
	  	  	}while(rebate_fileAdmin_Webtable_UploadedFileStatusVrification==false);
		}  		
    if(rebate_fileAdmin_Webtable_UploadedFileStatusVrification == false)
    {
    	Log.info("The Row does not match with the provided value "+strSearchRecord);
    }	    
    return rebate_fileAdmin_Webtable_UploadedFileStatusVrification;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: rebate_ImportFile
    // Return Type: boolean
    // Description: import the required file.
    // Parameters: BaseElement element1, BaseElement element2, String Text 
    // Example:
    // Author:
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~             
    public boolean rebate_ImportFile(BaseElement element1,BaseElement element2,String strFilePath) throws Throwable
    {
      boolean importFile = false;
            
      if(element1.exists(2000))
      {
           element1.click();
           getNgDriver().waitForAngularRequestsToFinish();
           
           try
           {
                  String strExecutable = System.getProperty("user.dir")+"\\AutoIT\\Rebate_Import_File.exe "+strFilePath;
                  Runtime.getRuntime().exec(strExecutable);
                  element2.click();
                  getNgDriver().waitForAngularRequestsToFinish();
                  importFile = true;                
           }
           catch(Exception e) {}
      }
      
      if(importFile==false)
      {
           Log.info("Webelement: "+element1+" was not found");
      }
      
      return importFile;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: rebate_adjustmentClaims_VeerifyFieldData
    
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public boolean rebate_adjustmentClaims_VerifyFieldData(BaseElement element, String elementTextToVerify) throws Throwable
    {
    	boolean rebate_adjustmentClaims_VerifyFieldData = false;
    	int itr = 0;
    	if(element.exists(1000))
    	{
    		A:
    		while(itr<3)
    		{
    			try
    			{
    				List<WebElement> pClassElements = element.findElements(By.xpath("//p[@class='col-md-4']"));
		    		if(pClassElements.size() > 0)
		    		{
		    			for(int i=0;i<pClassElements.size();i++)
		    			{
		    				String strLabelTitle = pClassElements.get(i).findElement(By.tagName("label")).getText().trim();
		    				String strSpanTitle = pClassElements.get(i).findElement(By.tagName("span")).getText().trim();
		    				String strActElementText = strLabelTitle + "^" + strSpanTitle;
		    				if(strActElementText.equalsIgnoreCase(elementTextToVerify)) 
		    				{
		    					Log.info("The Label "+strLabelTitle+"  have the text  "+strSpanTitle);
		    					rebate_adjustmentClaims_VerifyFieldData = true;
		    					break;
		    				}
		    			}
		    		}
    			}
    			catch(Exception e)
    			{
    				Log.info("Exception occured in 'rebate_adjustmentClaims_VeerifyFieldData' ");;
    			}
    			itr++;
    			if(rebate_adjustmentClaims_VerifyFieldData == true) { break A; }
    		}
    	}
    	else
    	{
    		Log.info("The element: "+element+" is not found");
    	}
    	return rebate_adjustmentClaims_VerifyFieldData;
    }
    
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: rebate_CopyAndRenameRebateFile
    // Return Type: String
    // Description: Copy and rename the file.
    // Parameters: BaseElement ObjPath, String text 
    // Example:
    // Author:
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    public String rebate_CopyAndRenameRebateFile(String strLineOfBusiness, String strTypeOfFile)
    {
    	String strNewFileName = null;
    	
    	File directoryPath = new File(System.getProperty("user.dir")+"\\TestData\\"+strLineOfBusiness);
           
        File filesList[] = directoryPath.listFiles();
           
        for(File file : filesList) 
        {
             System.out.println("File name: "+file.getName());
  
             String strFileName = file.getName();
             
             System.out.println(file.getName().toUpperCase());
             
             System.out.println(strLineOfBusiness.toUpperCase());
             
             
             if(file.getName().toUpperCase().contains(strLineOfBusiness.toUpperCase()) && file.getName().toUpperCase().contains(strTypeOfFile.toUpperCase()))
             {
                   
            	 String fromFile = System.getProperty("user.dir")+"\\TestData\\"+strLineOfBusiness+"\\"+strFileName;
                 String toFile = System.getProperty("user.dir")+"\\target\\";
                   
                 File sourceFile = new File(fromFile);
                 String name = sourceFile.getName();
                 
                 String[] arrFileName = name.split("\\.",-1);
                    
                 System.out.println(arrFileName[0]);
                    
                 DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");
                 
                 Date dateobj = new Date();
                 System.out.println(df.format(dateobj));
                    
                 String newFileName = arrFileName[0]+"_"+df.format(dateobj)+"."+arrFileName[1];
                 
                 File targetFile = new File(toFile+newFileName);
                 
                 System.out.println("Copying file : " + sourceFile.getName());

                 try
                 {
                   FileUtils.copyFile(sourceFile, targetFile);
                   strNewFileName = newFileName;
                 }
                 catch(Exception e) {}                 
                 
                 System.out.println("copying of file is completed");
                 
                 break;
             }
             else if(file.getName().toUpperCase().contains(strTypeOfFile.toUpperCase()))
             {
            	 String fromFile = System.getProperty("user.dir")+"\\TestData\\"+strLineOfBusiness+"\\"+strFileName;
                 String toFile = System.getProperty("user.dir")+"\\target\\";
                   
                 File sourceFile = new File(fromFile);
                 String name = sourceFile.getName();
                 
                 String[] arrFileName = name.split("\\.",-1);
                    
                 System.out.println(arrFileName[0]);
                    
                 //DateFormat df = new SimpleDateFormat("ddMMyyyyHHmmss");
                 DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
                 Date dateobj = new Date();
                 System.out.println(df.format(dateobj));
                    
                 String newFileName = arrFileName[0]+df.format(dateobj)+"."+arrFileName[1];
                 //String newFileName = fromFile+df.format(dateobj)+"."+".txt";
                 File targetFile = new File(toFile+newFileName);
                 
                 System.out.println("Copying file : " + sourceFile.getName());

                 try
                 {
                   FileUtils.copyFile(sourceFile, targetFile);
                   strNewFileName = newFileName;
                 }
                 catch(Exception e) {}                 
                 
                 System.out.println("copying of file is completed");
                 
                 break;
             }
          }
        
        return strNewFileName;
    }
    
 // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //  Method:getTheStartAndEndDates
	//  Return Type: String
	//  Description: Get the start date and End date
	//  Parameters: String strFeatureFilePath, String strDateTypeText
    //  Example:
	//  Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String getTheStartAndEndDates(String strFeatureFilePath, String strDateTypeText)
    {    	    	
    	String strResult = null;
    	
		String[] arrFeatureFilePath = strFeatureFilePath.split("/");
		String strFeature = arrFeatureFilePath[4];
		String[] arrFeature = strFeature.split(".feature");
		String strFeatureFileName = arrFeature[0];
		
    	File strPropertiesFilePath = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\application.properties");
    	
    	if(!strFeatureFileName.isEmpty())
    	{
    		strResult = rxnovaCommonUtil.getDatesFromPropertiesFile(strPropertiesFilePath, strFeatureFileName+"_"+strDateTypeText);    		
    	}
    	
    	return strResult;
    }
    
     //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: rebate_ExternalFiles_GetSubmitDate
    // Return Type: String
    // Description: Get the current system date.
    // Parameters: 
    // Example:
    // Author:
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String rebate_ExternalFiles_GetSubmitDate()
    {
       String strSubmitDate = null;
       
        DateFormat df = new SimpleDateFormat("MM/yyyy");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        strSubmitDate = df.format(dateobj);
        
        return strSubmitDate;
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //  Method:rebate_getCurrentDate
	//  Return Type: String
	//  Description: Get the current date
	//  Parameters: 
    //  Example:
	//  Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String rebate_getCurrentDate()
    {
       String strSubmitDate = null;
       
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));
        strSubmitDate = df.format(dateobj);
        
        return strSubmitDate;
    }
    
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //  rebate_getSubmitDate
	//  Return Type: String
	//  Description: Get the submit date
	//  Parameters: 
    //  Example:
	//  Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String rebate_getSubmitDate(String strLineOfBusiness)
    {
    	String strResult = null;
    	
    	File strPropertiesFilePath = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\application.properties");
    	
    	strResult = rxnovaCommonUtil.getDatesFromPropertiesFile(strPropertiesFilePath, strLineOfBusiness+"_PaymentDetails_PaymentAdjustments_ClaimDetail_Submit_Date");
    	
    	return strResult;
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: rebate_UI_Webtable_ClickOnCheckBox
  	// Return Type: boolean
  	// Description: click on check box in web table based on operation and text.
  	// Parameters: BaseElement element, String strOperation, String strValue  
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean rebate_UI_Webtable_ClickOnCheckBox(BaseElement element, String strOperation, String strValue) throws Throwable 
  	{
  			
  		Boolean rebate_UI_Webtable_ClickOnCheckBox = false;
  		String strActRowValue = "";
  		String strActCellValue = "";
  		
  		String[] arrRowValue = strValue.split("\\*",-1);
  		
  		if(element.isDisplayed())
  		{
  			A:
  			do
  			{
  				int attempts = 0;		
  				while (attempts < 3) 
  				{
  					try 
  					{
  						WebElement objTblBody = element.findElement(By.tagName("tbody"));
  						List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));
  							
  						for(int row=0;row<rows.size();row++)
  						{
  							List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
  							for(int col=0;col<arrRowValue.length;col++)
  							{
  								strActCellValue = cols.get(col+1).getText();
  								  
  								if(col == 0)
  								{
  									strActRowValue = strActCellValue;
  								}
  								else if(col!=cols.size()-1)
  								{
  									strActRowValue = strActRowValue+"*"+strActCellValue;
  								}
  								else
  								{
  									break;
  								}
  							}
  								
  							if(strActRowValue.equalsIgnoreCase(strValue))
  							{
  								System.out.println("The Row has the value: "+strActRowValue);
  									
  								if (!cols.get(0).findElement(By.tagName("input")).isSelected() && strOperation.equalsIgnoreCase("check"))
  								  {
  									  cols.get(0).findElement(By.tagName("input")).click();
  									  getNgDriver().waitForAngularRequestsToFinish();
  									  rebate_UI_Webtable_ClickOnCheckBox = true;
  									  break;
  								  }
  								else if (cols.get(0).findElement(By.tagName("input")).isSelected() && strOperation.equalsIgnoreCase("uncheck"))
  								  {
  									  cols.get(0).findElement(By.tagName("input")).click();
  									  getNgDriver().waitForAngularRequestsToFinish();
  									  rebate_UI_Webtable_ClickOnCheckBox = true;
  									  break;
  								  }
  							 }	  					
  						}
  							
  						if(rebate_UI_Webtable_ClickOnCheckBox == true)
  						{
  							break A;
  						}
  	
  					break;
  				}
  				catch(Exception e) {}
  				attempts++;
  			}
  				
  			if(rebate_UI_Webtable_ClickOnCheckBox==false)
  			{
  							
  				String strElement = element.getWrappedElement().toString();
  				String[] arrElement = strElement.split("xpath:",-1);
  				
  				String strElement1 = arrElement[1].trim();
  				
  				int intLength = strElement1.length();
  				
  				if(strElement1.substring(intLength-3).contains("]]]"))
  				{
  					strElement1 = strElement1.replace("]]]", "]");
  				}
  				else if(strElement1.substring(intLength-2).contains("]]"))
  				{
  					strElement1 = strElement1.replace("]]", "]");
  				}
  				else if(strElement1.substring(intLength-1).contains("]"))
  				{
  					strElement1 = strElement1.substring(0,intLength-1);
  				}	
  									
  				if(getDriver().findElements(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).size()>0)
  				{
  					getDriver().findElement(By.xpath(strElement1+"/following-sibling::*//*[@ng-switch-when='next']")).click();  			    		
  					getNgDriver().waitForAngularRequestsToFinish();
  				}
  				else
  				{
  					break A;
  				}
  			}
  		}while(rebate_UI_Webtable_ClickOnCheckBox==false);
  		
  		if(rebate_UI_Webtable_ClickOnCheckBox == false)
  		{
  			Log.info("The Row has the value: "+strActRowValue+"is not matched with the provided value: "+strValue);
  		}
  	  }		
  	  else 
  	  {
  		Log.info("Webelement: "+element+" was not found");
  	  }
  	  return rebate_UI_Webtable_ClickOnCheckBox;
  	}
  	
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method        : rebateGenerateClaimFileSummaryDateFormat
  	// Return Type : String
  	// Description   : generate the preliminary claim file summary date format 
  	// Parameters   :   
  	// Example       :
  	// Author         :
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public String rebateGenerateClaimFileSummaryDateFormat()
    {
           String strOriginalDateFormat = null;           
           String strCurrentDate = null;           
           DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
           Date dateobj = new Date();     
           strCurrentDate = df.format(dateobj);     
           String[] arrDates = strCurrentDate.split("/");
           String currentMonthPortion = arrDates[0];
           String yearPortion = arrDates[2];    
           int previousmonthPortion = Integer.parseInt(currentMonthPortion)-1;
           String previousMonthPortion = String.valueOf(previousmonthPortion);
           if(previousMonthPortion.length()==1)
           {
        	   previousMonthPortion = "0"+previousMonthPortion;
           }             
           String strPreviousMonthFormat = previousMonthPortion+"/"+17+"/"+yearPortion; 
           String strCurrentMonthFormat = currentMonthPortion+"/"+"16"+"/"+yearPortion;
           strOriginalDateFormat = strPreviousMonthFormat+" - "+strCurrentMonthFormat;
           return strOriginalDateFormat; 
    }
  	
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method        : rebateGenerateBenefitFileSummaryDateFormat
  	// Return Type : String
  	// Description   : generate the preliminary benefit file summary date format 
  	// Parameters   :   
  	// Example       :
  	// Author         :
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public String rebate_GenerateBenefitFileSummaryTabDateFormat()
    {
           String strOriginalDateFormat = null;           
           String strCurrentDate = null;
           int monthNumber,date=0,year;
           
           String[] monthString = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
           
           DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
           Date dateobj = new Date();     
           strCurrentDate = df.format(dateobj);     
           String[] arrDates = strCurrentDate.split("/");
           String strMonth = arrDates[0];
           String stryear = arrDates[2];    
           
           if(strMonth.length()<2)
  	       {
        	   strMonth = strMonth.substring(1);
  	     	   monthNumber = Integer.parseInt(strMonth);
  	       }
  	       else
  	       {
  	    	   monthNumber = Integer.parseInt(strMonth);
  	       }  
           year = Integer.parseInt(stryear);
           switch (monthString[monthNumber-1])
  	       {
  	       		case "January":
  	       		case "March":
  	       		case "May":
  	       		case "July":
  	       		case "August":
  	       		case "October":            	       			  	     	    
  	       		case "December":
  	       			date = 31;        	   
  	       			break;  	     	    
  	       		case "April":
  	       		case "June":
  	       		case "September":
  	       		case "November":
  		      	    date = 30;
  		      	    break;
  		      	    
  	       		case "February":  	     	   
  	     	    	if(year % 4 == 0)
  	     	    	{
  	     	    		date = 29;
  	     	    		System.out.println("The provided year is leap year");
  	     	    	}
  	     	    	else
  	       	    	{
  	       	    		date = 28;
  	       	    	}	
  	       	    	break;        	      
  	       }
           strMonth = Integer.toString(monthNumber);
  	       if(strMonth.length()<2)
  	       {
  	    	   strMonth = "0"+strMonth;
  	       }
  	       
  	       String strDate = Integer.toString(date);
  	       
  	       String strYear = Integer.toString(year);
           String strmonthStartDateFormat = strMonth+"/"+"01"+"/"+strYear; 
           String strMonthEndDateFormat = strMonth+"/"+strDate+"/"+strYear;
           strOriginalDateFormat = strmonthStartDateFormat+" - "+strMonthEndDateFormat;
           
           return strOriginalDateFormat; 
    }

    
    
  	
  	
}