package com.project.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.StringUtil;
import com.project.pages.LandingPage.Apps;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import com.psqframework.core.util.BaseStepListener;
import com.psqframework.core.util.Project;

public class RxNovaCommonUtil extends BasePage {

    public enum Regions {
	DR1, DR2, DR3, RX2, QR1, QR2, QR3, UR1, UR2, RX6, QRF, UP1, UP2, UA1, UA2, UA3, UA4, UR3, UR4, UP3, UN1, UP6,
	UP7, PRODUCTION, JBOSS_DR1, JBOSS_QR1, JBOSS_QR2, JBOSS_QR3, JBOSS_DR2, JBOSS_RX1, JBOSS_UR1, JBOSS_UR2,
	JBOSS_UR3, JBOSS_UR4, JBOSS_UA1, JBOSS_UA2, JBOSS_UA3, JBOSS_UA4, JBOSS_RXH, JBOSS_PRODUCTION
    };

    public Properties pf = new Properties();
    
    public static String InputRegion = null;

    private String RxNova_URL;
    public static boolean isProduction;
    
    // public static boolean isLaunched=false;
    // public static boolean isLoggedIn=false;
    // public static boolean isNavigationToAppDone=false
    // Logger logger = LoggerFactory.getLogger(RxNovaCommonUtil.class);
    // logger.info("Clicked on Element" + element);
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: NavigateApplicationMenu
    // Return Type: void
    // Description: Using a specified path string, this method navigates to the
    // desired Application within RxNova.
    // Parameters: String strAppMenu
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void navigateApplicationMenu(String strAppMenu) throws InterruptedException {
	
	BaseStepListener.isNavigationToAppDone=true;
	// try
	// {	
	sleep(3000);
	/*
	 * if(!driver.findElement(By.className("argusLogoRebrand")).isDisplayed()) {
	 * Log.
	 * info("**************************** In refresh mode ****************************"
	 * + strAppMenu); driver.navigate().refresh(); Thread.sleep(10000); }
	 * }catch(NoSuchFrameException s) { Log.
	 * info("**************************** NoSuchFrameException - In refresh mode ****************************"
	 * + strAppMenu); driver.navigate().refresh(); Thread.sleep(10000); }
	 * catch(Exception e) { Log.
	 * info("**************************** Exception - In refresh mode ****************************"
	 * + strAppMenu); driver.navigate().refresh(); Thread.sleep(10000); }
	 */

	Set<String> handles = getDriver().getWindowHandles();
	// Sreenu Added Recovery for Application Error
	for (String s : handles) {
	    if (getDriver().switchTo().window(s).getTitle().contains("Application Error")) {
		Log.info("Page selected with title " + strAppMenu
			+ ": Application Error - Refershing the page - Recovery from NavigateApplicationMenu method");
		getDriver().navigate().refresh();
		sleep(8000);
	    }
	}
	
//	// Sreenu Added - Checking to get hold or Landing page (JBOSS) or RxNova Login Page( WAS)
//	for (String s : handles) {
//	    if (!getDriver().switchTo().window(s).getTitle().contains("Landing Page") || !getDriver().switchTo().window(s).getTitle().contains("RxNova Login")) {
//			Log.info(" Closing Page with title " + getDriver().getTitle());			
//			getDriver().close();
//	    }
//	}
		

	Boolean boolNavigateApplicationMenu = false;
	int intCounter = 0;
	String[] arrApplication = null;
	arrApplication = strAppMenu.split("\\|");
	if (RxNovaCommonUtil.isProduction) {
	    if (!strAppMenu.trim().isEmpty()) {
		//arrApplication = strAppMenu.split("\\|");
		WebDriverWait wt = new WebDriverWait(getDriver(), 20);
//		try {
		    // @Sreenu - New code for RxNova screen updates as on 04/08/2019
		    String apptobeclicked = arrApplication[arrApplication.length - 1].replace(" / ", "/");
		    WebElement SelectThisApp;
		    if (apptobeclicked.equals("Data Dictionary")) {
			// here help clicking takes place
			WebElement appsElement = wt.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//md-icon[contains(text(),'help_outline')]")));
			appsElement.click();
			sleep(2000);
			SelectThisApp = wt.until(ExpectedConditions.elementToBeClickable(
				getDriver().findElement(By.xpath("//div[contains(text(),'Data Dictionary')]"))));
		    } else {
			WebElement appsElement = wt.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//md-icon[contains(text(),'apps')]")));
			appsElement.click();
			sleep(3000);
			SelectThisApp = wt.until(ExpectedConditions
				.elementToBeClickable(getDriver().findElement(By.linkText(apptobeclicked))));
		    }
		    SelectThisApp.click();
		    // LOGGER.info("*********** Selected application **************" +
		    // SelectThisApp.getText());
		    sleep(8000);
		    intCounter = arrApplication.length;
		    boolNavigateApplicationMenu = true;
//		} catch (Exception e) {
//		    for (int i = 0; i <= arrApplication.length - 1; i++) {
//			List<WebElement> listofMenuItems = getDriver().findElements(By.tagName("li"));
//			for (WebElement v : listofMenuItems) {
//			    if (v.getText().equals(arrApplication[i])) {
//				v.click();
//				// Log.info("Clicked on link -" + v.getText());
//				// LOGGER.info("***********Clicked on link **************" + v.getText());
//				Thread.sleep(500);
//				intCounter++;
//				boolNavigateApplicationMenu = true;
//				break;
//			    }
//			}
//		    }
//		}
	    } 
	}

	    if (RxNovaCommonUtil.isProduction==false) { // handling non-jboss code for page selection
		for (int i = 0; i <= arrApplication.length - 1; i++) {
		    List<WebElement> listofMenuItems = getDriver().findElements(By.tagName("li"));
		    for (WebElement v : listofMenuItems) {
			if (v.getText().equals(arrApplication[i])) {
			    v.click();
			    // Log.info("Clicked on link -" + v.getText());
			    // LOGGER.info("***********Clicked on link **************" + v.getText());
			    sleep(500);
			    intCounter++;
			    boolNavigateApplicationMenu = true;
			    break;
			}
		    }
		}

	    }
	

	if (boolNavigateApplicationMenu == false | intCounter != arrApplication.length) {
	    Log.info("Unable to Navigate to application menu with details : " + strAppMenu);
	    // throw new RxNova_CustomException("Please check "+ strAppMenu +" Application
	    // and Access availablity for your Login ID");
	}
	// Thread.sleep(5000);
    }

//	public void NavigateApplicationMenu(String strAppMenu) throws InterruptedException
//	{
//		
//		Thread.sleep(2000);
//		
//		Set<String> handles = getDriver().getWindowHandles();
//		for(String s: handles)
//		{						
//			if(getDriver().switchTo().window(s).getTitle().contains("Application Error"))
//			{
//				Log.info("Page selected with title " + strAppMenu +": Application Error - Refershing the page - Recovery from NavigateApplicationMenu method" );
//				getDriver().navigate().refresh();
//				getDriver().manage().window().maximize();
//				Thread.sleep(8000);
//			}			
//		}
//		
//		
//		Boolean boolNavigateApplicationMenu=false;
//		int intCounter= 0;
//		String[] arrApplication=null;
//		if(!strAppMenu.trim().isEmpty())
//		{
//			arrApplication = strAppMenu.split("\\|");
//			for(int i=0; i<=arrApplication.length-1; i++)
//			{
//				List<WebElement> listofMenuItems=getDriver().findElements(By.tagName("li"));				
//			    for(WebElement v:listofMenuItems)
//			    {			    	
//			    	if (v.getText().equals(arrApplication[i]))
//			    	{
//			    		v.click();
//			    		getDriver().manage().window().maximize();
//			    		Thread.sleep(500);
//			    		intCounter++;
//			    		boolNavigateApplicationMenu= true;
//			    		break;	    		
//			    	}
//			    }
//			}
//		}
//		
//		if(boolNavigateApplicationMenu==false | intCounter != arrApplication.length )
//		{
//			Log.info("Unable to Navigate to application menu with details : " + strAppMenu);			
//		}
//	}
//	

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: RxNova_PageSelection
    // Return Type: void
    // Description: This method loads the correct application based on the name of
    // the application. Refreshes page until the app loads properly.
    // Parameters: String strAppName
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void rxNova_PageSelection(String strAppName) throws Throwable {
	String SelectApp;
	Boolean boolRxNova_PageSelection = false;
	Set<String> handles = getDriver().getWindowHandles();
	if (strAppName.toString().contains("|")) {
	    String[] arrSelectApp = strAppName.split("\\|");
	    SelectApp = arrSelectApp[arrSelectApp.length - 1];
	} else {
	    SelectApp = strAppName.trim();
	}
	for (String s : handles) {
	    if (getDriver().switchTo().window(s).getTitle().contains("Application Error")) {
		Log.info(
			"Page selected with title : Application Error - Refershing the page - Recovery from RxNova_PageSelection method");
		getDriver().navigate().refresh();
		getDriver().manage().window().maximize();
		sleep(8000);
	    }
	}

	for (String s : handles) {
	    if (getDriver().switchTo().window(s).getTitle().contains(SelectApp)) {
		Log.info("Page selected with title : " + getDriver().getTitle());
		boolRxNova_PageSelection = true;
		break;
	    }
	}

	if (boolRxNova_PageSelection == false) {
	    Log.info("No Application page with name : '" + SelectApp + "' was found");
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: ClickOnButton
    // Return Type: void
    // Description: Given a By WebElement, this method clicks on it. If the object
    // does not exist, then the object is not found and not clicked.
    // Parameters: By objElementName -- marker for desired WebElement
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void clickOnButton(By objElementName) {
	Boolean boolClickOnButton = false;
	if (getDriver().findElements(objElementName).size() != 0) {
	    String strName = getDriver().findElement(objElementName).getAttribute("name");
	    getDriver().findElement(objElementName).click();
	    boolClickOnButton = true;
	    Log.info("Clicked on webelement : " + strName);
	}

	if (boolClickOnButton == false) {
	    Log.info("Webelement with name  : '" + getDriver().findElement(objElementName).getAttribute("name")
		    + "' was found");
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: ClickOnButton
    // Return Type: void
    // Description: Given the string of text on a button, this method clicks on the
    // corresponding button. If the text cannot be found on any button in the page,
    // then the object is not found and not clicked.
    // Parameters: String strBtnName -- string label on button
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void clickOnButton(String strBtnName) {
	Boolean boolClickOnButton = false;
	List<WebElement> allButt = getDriver().findElements(By.tagName("button"));
	for (WebElement w : allButt) {
	    if (w.getText().equals(strBtnName)) {
		w.click();
		boolClickOnButton = true;
		break;
	    }
	}
	if (boolClickOnButton == false) {
	    Log.info("Webelement with name  : '" + strBtnName + "' was not found");
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: ClickOnLink
    // Return Type: void
    // Description: Given a By WebElement for a link, this method attempts to click
    // on it. It tries a maximum of three times. If the link does not exist, then
    // the link is not found and not clicked.
    // Parameters: By objElementName -- name of link
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void clickOnLink(By objElementName) throws Throwable {
	Boolean boolClickOnLink = false;
	int attempts = 0;
	while (attempts < 3) {
	    try {
		waitUntilWebElementExist(objElementName);
		if (getDriver().findElements(objElementName).size() != 0) {
		    String strName = getDriver().findElement(objElementName).getAttribute("name");
		    getDriver().findElement(objElementName).click();
		    boolClickOnLink = true;
		    Log.info("Clicked on webelement : " + strName);
		}
		break;
	    } catch (StaleElementReferenceException e) {
	    }
	    attempts++;
	}

	if (boolClickOnLink == false) {
	    Log.info("Webelement with name  : '" + getDriver().findElement(objElementName).getAttribute("name")
		    + "' was not found");
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: GetBusyStatus
    // Return Type: void
    // Description: This method waits until the loading icon is no longer shown on
    // the page.
    // Parameters: void
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void getBusyStatus() throws Throwable {
	try {
	    WebDriverWait wt = new WebDriverWait(getDriver(), 60);
	    WebElement busyElement = getDriver().findElement(By.id("loading"));
	    /*
	     * Log.info("Start Debugging the Busy element");
	     * Log.info(busyElement.getAttribute("style").equals(null));
	     * Log.info(busyElement.getAttribute("style").isEmpty());
	     * Log.info(busyElement.getAttribute("style").equals(""));
	     * Log.info("End Debugging the Busy element");
	     */

	    if (busyElement.getAttribute("style").equals(null) || busyElement.getAttribute("style").isEmpty()
		    || busyElement.getAttribute("style").equals("")) {
		return;
	    } else {
		if (pf.getProperty("BrowserName").equalsIgnoreCase("IE")
			|| pf.getProperty("BrowserName").equalsIgnoreCase("InternetExplorer")) {
		    wt.until(ExpectedConditions.attributeToBe(busyElement, "style", "DISPLAY: none"));
		} else if (pf.getProperty("BrowserName").equalsIgnoreCase("FF")
			|| pf.getProperty("BrowserName").equalsIgnoreCase("firefox")) {
		    wt.until(ExpectedConditions.attributeToBe(busyElement, "style", "display: none;"));
		} else {
		    wt.until(ExpectedConditions.attributeToBe(busyElement, "style", "display: none;"));
		}
		Log.info("Performed Wait");
	    }
	} catch (Exception e) {
		sleep(5000);
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: WaitUnitWebListisLoaded
    // Return Type: void
    // Description: Given a WebElement referring to a WebList, this method waits
    // until the list has loaded.
    // Parameters: WebElement objlist
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void waitUnitWebListisLoaded(WebElement objlist) throws InterruptedException {
	WebDriverWait waitDriver = new WebDriverWait(getDriver(), 60);
	waitDriver.until(ExpectedConditions.attributeToBeNotEmpty(objlist, "innerHTML"));
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: WaitUntilWebElementExist
    // Return Type: void
    // Description: Given a By WebElement referring to an object, this method waits
    // until that element exists on the page. Simply uses WebDriverWait (not a
    // try-catch implementation).
    // Parameters: By strItem
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void waitUntilWebElementExist(By strItem) throws Throwable {
	/*
	 * try {
	 */
	Log.info("Searching for element - Started");
	WebDriverWait wb = new WebDriverWait(getDriver(), 20);
	wb.until(ExpectedConditions.presenceOfElementLocated(strItem));
	Log.info("Searching for element - Ended");
	// }
	/*
	 * catch(StaleElementReferenceException e) { driver.navigate().refresh();
	 * Thread.sleep(6000); WebDriverWait wb=new WebDriverWait(driver,20);
	 * wb.until(ExpectedConditions.presenceOfElementLocated(strItem)); }
	 */

    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: WaitUntilWebButtonIsEnabled
    // Return Type: void
    // Description: Given a By WebElement referring to an object, this method waits
    // until that element becomes enabled on the page.
    // Parameters: By objElementName)
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void waitUntilWebButtonIsEnabled(By objElementName) throws Throwable {
	int cnt = 0;
	while (getDriver().findElement(objElementName).getAttribute("aria-disabled").contains("true")) {
		sleep(1000);
	    cnt = cnt + 1;
	    if (cnt == 10) {
		Log.info("WebButton " + objElementName + "is disabled");
		break;
	    }
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: CheckElementPresenceByLocator
    // Return Type: boolean
    // Description: Given a locator, this method simply checks if the element exists
    // on the page.
    // Parameters: By LocatorValue
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public boolean checkElementPresenceByLocator(By LocatorValue) throws Throwable {
	waitUntilWebElementExist(LocatorValue);
	return getDriver().findElements(LocatorValue).size() != 0;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: SwithToMostRecentWindow
    // Return Type: void
    // Description: Goes to newest tab opened.
    // Parameters: void
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void swithToMostRecentWindow() throws InterruptedException {
	for (String WHandles : getDriver().getWindowHandles()) {
	    getDriver().switchTo().window(WHandles);
	    Log.info("SwithToMostRecentWindow -" + getDriver().getTitle());
	    getDriver().manage().window().maximize();
	}

    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: SelectItemFromWebListByNameAndHyphen
    // Return Type: void
    // Description:
    // Parameters:
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void selectItemFromWebListByNameAndHyphen(By objElementName, String strValue) throws InterruptedException {
	Boolean boolSelectItemFromWebListByNameAndHyphen = false;

	int attempts = 0;
	while (attempts < 3) {
	    try {

		String ItemFound = "";
		String strListItem = "";
		if (getDriver().findElements(objElementName).size() != 0) {
		    WebElement strItem = getDriver().findElement(objElementName);
		    List<WebElement> strItems = strItem.findElements(By.tagName("option"));
		    for (int i2 = 1; i2 < strItems.size(); i2++) {
			strListItem = strItems.get(i2).getText();
			if (strListItem.trim().equalsIgnoreCase(strValue.trim())) {
			    ItemFound = "Found";
			    Select itemstoSelect = new Select(getDriver().findElement(objElementName));
			    String strName = getDriver().findElement(objElementName).getAttribute("name");
			    itemstoSelect.selectByVisibleText(strListItem);
			    boolSelectItemFromWebListByNameAndHyphen = true;
			    Log.info("Selected item in webelement : " + strName + " Value :" + strValue);
			    break;
			}
		    }
		    if (!ItemFound.equals("Found")) {
			for (int i3 = 1; i3 < strItems.size(); i3++) {
			    strListItem = strItems.get(i3).getText();
			    String[] arrItemSplited = strListItem.split("-");
			    if (arrItemSplited[0].trim().equalsIgnoreCase(strValue.trim())) {
				Select itemstoSelect = new Select(getDriver().findElement(objElementName));
				String strName = getDriver().findElement(objElementName).getAttribute("name");
				itemstoSelect.selectByVisibleText(strListItem);
				boolSelectItemFromWebListByNameAndHyphen = true;
				Log.info("Selected item in webelement : " + strName + " Value :" + strValue);
				break;
			    }
			}
		    }

		}

	    } catch (StaleElementReferenceException e) {
	    }
	    attempts++;
	}

	if (boolSelectItemFromWebListByNameAndHyphen == false) {
	    Log.info("Webelement with name  : '" + getDriver().findElement(objElementName).getAttribute("name")
		    + "' was not found");
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: SelectItemFromWebListByPartialDisplayName
    // Return Type: void
    // Description:
    // Parameters:
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void selectItemFromWebListByPartialDisplayName(By objElementName, String strValue)
	    throws InterruptedException {
	Boolean boolSelectItemFromWebListByPartialDisplayName = false;

	int attempts = 0;
	while (attempts < 3) {
	    try {
		//String ItemFound = "";
		String strListItem = "";
		if (getDriver().findElements(objElementName).size() != 0) {
		    Log.info("inside SelectItemFromWebListByPartialDisplayName");
		    WebElement objWebList = getDriver().findElement(objElementName);
		    List<WebElement> strItems = objWebList.findElements(By.tagName("option"));
		    for (int i2 = 1; i2 < strItems.size(); i2++) {
			strListItem = strItems.get(i2).getText();
			if (strListItem.toLowerCase().trim().contains(strValue.toLowerCase().trim())) {
			   // ItemFound = "Found";
			    Select itemstoSelect = new Select(getDriver().findElement(objElementName));
			    String strName = getDriver().findElement(objElementName).getAttribute("name");
			    itemstoSelect.selectByVisibleText(strListItem);
			    boolSelectItemFromWebListByPartialDisplayName = true;
			    Log.info("Selected item in webelement : " + strName + " Value :" + strValue);
			    checkBusyState();
			    break;
			}
		    }
		}
	    } catch (StaleElementReferenceException e) {
	    }
	    attempts++;
	}

	if (boolSelectItemFromWebListByPartialDisplayName == false) {
	    Log.info("Webelement with name  : '" + getDriver().findElement(objElementName).getAttribute("name")
		    + "' was not found - Data value provided is  " + strValue);
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: SelectItemFromWebListByPartialDisplayName
    // Return Type: void
    // Description: This method types in a string into a text edit field that has
    // Intellisense functionality, and clicks the required text for the field.
    // Parameters: By objElementName -- text edit field object, String strValue --
    // the string that we want typed in the text edit field.
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void selectValueFromFieldIntellisence(By objElementName, String strValue) throws Throwable {
	Boolean boolSelectValueFromFieldIntellisence = false;

	if (getDriver().findElements(objElementName).size() != 0 && StringUtil.isNotBlank(strValue)) {
	    String strName = getDriver().findElement(objElementName).getAttribute("name");
	    getDriver().findElement(objElementName).sendKeys(strValue);
	    sleep(2000);

	    int value = getDriver().findElements(By.linkText(strValue)).size();
	    if (value > 0) {
	    	sleep(500);
		getDriver().findElement(By.linkText(strValue)).click();
	    } else {
	    	sleep(500);
		getDriver().findElement(By.partialLinkText(strValue)).click();
	    }
	    boolSelectValueFromFieldIntellisence = true;
	    getDriver().findElement(objElementName).sendKeys(Keys.TAB);
	    getDriver().findElement(objElementName).click();
	    Log.info("Set text on webelement : " + strName + " Value :" + strValue);
	    sleep(2000);
	}

	if (boolSelectValueFromFieldIntellisence == false) {
	    Log.info("Webelement with name  : '" + getDriver().findElement(objElementName).getAttribute("name")
		    + "' was not found");
	}

    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: CheckPageLoad
    // Return Type: void
    // Description: This method waits until the contentFrame of a page is loaded.
    // Parameters: void
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void checkPageLoad() throws InterruptedException {
	if (!getDriver().findElement(By.id("contentFrame")).isDisplayed()) {
	    getDriver().navigate().refresh();
	    sleep(5000);
	}
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: startTime
    // Return Type: long
    // Description: Returns current time as a long using (new Date();)
    // Parameters: void
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public long startTime() {
	Date d1 = new Date();
	System.out.println(d1.getTime());
	return d1.getTime();
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: TimeDifference
    // Return Type: void
    // Description: Prints difference between previously saved input time and
    // current time using (new Date();)
    // Parameters: long inputTime -- previously saved time
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void timeDifference(long inputTime) {
	Date d2 = new Date();
	long timedifference = d2.getTime() - inputTime;
	Log.info("time difference is " + timedifference / 1000);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: CheckBusyState
    // Return Type: String
    // Description: Waits until loading icon is no longer displayed and returns
    // "style" attricute of loading icon.
    // Parameters: void
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String checkBusyState() throws InterruptedException 
    {
    	sleep(1000);
    	WebElement BusyElement = getDriver().findElement(By.id("loading"));
	    int cnt = 0;
	    int MaxSecond = 120;
	    try 
	    {
	    	Log.info("Busy element style details : - " + BusyElement.getAttribute("style"));	 	    
	    	if (BusyElement.getAttribute("style").equals("")) 
	    	{
	    		return "";
	    	}
	    	while (!(BusyElement.getAttribute("style").contains("display: none;")))
	    	{
	    		try 
	    		{
	    			sleep(500);
	    			int v1 = cnt++;
	    			if (cnt > MaxSecond) 
	    			{
	    				return "";
	    			}
	    			Log.info("waiting ... : " + v1 + " Seconds");
	    		} 
	    		catch (Exception e)
	    		{
	    			e.printStackTrace();
	    		}
	    	}
	    	return (BusyElement.getAttribute("style"));
	    } 
	    catch (Exception e1)
	    {	    
	    	return "";
	     }
    }

    public void waitForBusyIcon() {
	WebDriverWait wt = new WebDriverWait(getDriver(), 60);
	WebElement busyElement = getDriver().findElement(By.id("loading"));
	wt.until(ExpectedConditions.invisibilityOf(busyElement));
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: NavigateApplication
    // Return Type: void
    // Description: Given the name of the desired application, this method generates
    // the path required to navigate from the landing page to the desired
    // application; subsequently calls the NavigateApplicationMenu function with the
    // generated application path.
    // Parameters: String ApplicationPath
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void navigateApplication(String ApplicationPath) throws Throwable 
    {
    	selectAppRegion();
    	String APPPath = "";
    	if (ApplicationPath != "") 
    	{
    		String enumValue = null;
    		if (ApplicationPath.contains(" ")) 
    		{
    			enumValue = ApplicationPath.replace(" ", "_").toUpperCase();
    		} 
    		else 
    		{
    			enumValue = ApplicationPath.toUpperCase();
    		}
    		switch (Apps.valueOf(enumValue)) 
    		{
    			case GROUP: 
    			{
    				APPPath = "Customer Setup|Hierarchy|Group";
    				Log.info("Group was selected");
    				break;
    			}
    			case MEMBER: 
    			{
    				APPPath = "Customer Setup|Hierarchy|Member";
    				Log.info("MEMBER was selected");
    				break;
    			}
    			case AUTH: 
    			{
    				APPPath = "Auth|Auth";
    				Log.info("Auth was selected");
    				break;
    			}
    			case CLAIM: 
    			{
    				APPPath = "Claim|Claim";
    				Log.info("Claim was selected");
    				break;
    			}
    			case CUSTOMER_SET: 
    			{
    				APPPath = "Customer Setup|Hierarchy|Customer Set";
    				Log.info("Customer Set was selected");
    				break;
    			}
    			case CUSTOMER_CLIENT: {
    				APPPath = "Customer Setup|Hierarchy|Customer / Client";
    				Log.info("Customer/Client was selected");
    				break;
    			}
    			case ASSIGN_OPTIONS: {
    				APPPath = "Customer Setup|Processing Options|Assign Options";
    				Log.info("Assign Options was selected");
    				break;
    			}
    			case PRICING: {
    				APPPath = "Plan Setup|Pricing";
    				Log.info("Pricing was selected");
    				break;
    			}
    			case ACCUMULATOR: {
    				APPPath = "Plan Setup|Accumulator";
    				Log.info("Accumulator was selected");
    				break;
    			}
    			case BENEFITS: {
    				APPPath = "Plan Setup|Benefits";
    				Log.info("Benefits was selected");
    				break;
    			}
    			case CONDITION: {
    				APPPath = "Plan Setup|Conditions";
    				Log.info("Conditions was selected");
    				break;
    			}
    			case COVERAGE_CODE: {
    				APPPath = "Plan Setup|Coverage Code";
    				Log.info("Coverage Code was selected");
    				break;
    			}
    			case DUR_PROTOCOLS: {
    				APPPath = "Plan Setup|DUR Protocols";
    				Log.info("DUR Protocols was selected");
    				break;
    			}
    			case DUR_SAFETY: {
    				APPPath = "Plan Setup|DUR Safety";
    				Log.info("DUR Safety was selected");
    				break;
    			}
    			case MESSAGES: {
    				APPPath = "Plan Setup|Messages";
    				Log.info("Messages was selected");
    				break;
    			}
    			case DRUG_LIST: {
    				APPPath = "Lists|Drug List";
    				Log.info("Drug List was selected");
    				break;
    			}
    			case PHARMACY_LIST: {
    				APPPath = "Lists|Pharmacy List";
    				Log.info("Pharmacy List was selected");
    				break;
    			}
    			case PRESCRIBER_LIST: {
    				APPPath = "Lists|Prescriber List";
    				Log.info("Prescriber List was selected");
    				break;
    			}
    			case MAINTENANCE_HISTORY: {
    				APPPath = "History|Maintenance History";
    				Log.info("Maintenance History was selected");
    				break;
    			}
    			case PRESCRIBER: {
    				APPPath = "Provider|Prescriber";
    				Log.info("Prescriber was selected");
    				break;
    			}
    			case DRUG: {
    				APPPath = "Drug|Drug";
    				Log.info("Drug was selected");
    				break;
    			}
    			case DRUG_FILE_CHANGE_REPORTS: {
    				APPPath = "Drug|Drug File Change Reports";
    				Log.info("Drug File Change Reports was selected");
    				break;
    			}
    			case DATA_DICTIONARY: {
    				APPPath = "Help|Data Dictionary";
    				Log.info("Data Dictionary was selected");
    				break;
    			}
    			case NETWORK_MAINTENANCE: {
    				APPPath = "Provider|Network Maintenance";
    				Log.info("Network Maintenance was selected");
    				break;
    			}
    			case PHARMACY_MAINTENANCE: {
    				APPPath = "Provider|Pharmacy Maintenance";
    				Log.info("Pharmacy Maintenance was selected");
    				break;
    			}
    			case PHARMACY_SERVICE_FEES: {
    				APPPath = "Provider|Pharmacy Service Fees";
    				Log.info("Pharmacy Service Fees was selected");
    				break;
    			}
    			case FINANCIAL: {
    				APPPath = "Provider|Financial";
    				Log.info("Financial was selected");
    				break;
    			}
    			case TAGS: {
    				APPPath = "Plan Setup|Tags";
    				Log.info("Tags was selected");
    				break;
    			}
    			case RXNOVA_INTEL: {
    				APPPath = "RxNova Intel|RxNova Intel";
    				Log.info("RxNova Intel was selected");
    				break;
    			}
    			case REBATE:{
    				APPPath = "Miscellaneous|Rebate";
    				Log.info("RxNova Rebate was selected");
    				break;	
    			}
    			default: {
    				Log.info("Invalid Application selection - please check the application name");
    				break;
    			}
    		}
    		navigateApplicationMenu(APPPath);
	    rxNova_PageSelection(APPPath);
	    int cnt = 0;
	    while (cnt < 600) {
		try {
		    getDriver().switchTo().defaultContent();
		    getDriver().switchTo().frame(0);
		    break;
		} catch (NoSuchFrameException e) {
		    cnt += 200;
		    Log.info("Waiting for page to load ...");
		    sleep(2000);
		    continue;
		}
	    }
	}
    }

    public void selectAppRegion() {
	if (RxNovaCommonUtil.isProduction) {
	    System.out.println("in JBOSS ENVironment");
	    return;
	}
	sleep(1000);
	getDriver().findElement(By.linkText(RxNovaCommonUtil.InputRegion)).click();
	sleep(3000);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: renameFile
    // Return Type: String (returns new file name)
    // Description: Renames a file with the current date. Prints success/failure of
    // rename to console.
    // Parameters: String fileToRename -- file handle for file that needs to be
    // renamed
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public String renameFile(String fileToRename) throws InterruptedException {
    	sleep(8000);

	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	Date date = new Date();
	String ThisDATE = dateFormat.format(date);

	File oldfile = new File(fileToRename);
	String newFileName = fileToRename.replace(" ", "_").replace(".txt", "_" + ThisDATE + ".txt");

	Log.info(" this is the new file name - " + newFileName);
	File newfile = new File(newFileName);
	if (oldfile.renameTo(newfile)) {
	    Log.info("Rename succesful - " + newfile);
	} else {

	    Log.info("Rename failed");
	}
	return newFileName;

    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: switchToContentFrame
    // Return Type: void
    // Description: Switches to contenFrame on current page.
    // Parameters: void
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void switchToContentFrame() {
	getDriver().switchTo().defaultContent();
	getDriver().switchTo().frame(0);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: LaunchRandomizerInt
    // Return Type: int
    // Description: Uses a public static int to randomize login actions when
    // multiple browsers are running in parallel.
    // Parameters: String fileToRename -- file handle for file that needs to be
    // renamed
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static int numBrowsers = 0;

    public int launchRandomizerInt() {
	// function used to randomize login actions when multiple browsers are run in
	// parallel.
	return (++numBrowsers);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: navigateToRxNovaApplication
    // Return Type: void
    // Description: Uses property file or Maven Region to determine the correct
    // RxNova link that needs to be tested for the desired application/region under
    // test.
    // Parameters: void
    // Example:
    // Author:
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public void navigateToRxNovaApplication() {
	
	BaseStepListener.isLaunched=true;
	
	Log.info("-----------Open firefox and start RxNova Application-------------");
	try {
	    InputRegion = System.getProperty("Region");
	    Log.info("InputRegion from jenkins : " + InputRegion);
	    Log.info("ERROR: ***********************Region parameter is empty*******************");
	} catch (Exception e) {
	    // InputRegion = utils.pf.getProperty("Region");
	    InputRegion = Project.Env.region();
	    Log.info("InputRegion from properties file : " + InputRegion);
	}

	if (System.getProperty("MavenRegion") == null) {
	    // InputRegion = utils.pf.getProperty("Region");
	    InputRegion = Project.Env.region();
	    Log.info("Working on Region - Project.Env.region() " + Project.Env.region().toString());
	} else {
	    InputRegion = System.getProperty("MavenRegion");
	    Log.info("Working on Region - InputRegion " + InputRegion);
	    Log.info("In MAVEN PARAMETERS region");
	}

	switch (Regions.valueOf(InputRegion.toUpperCase())) {
	case QR1:
	case QR2:
	case QR3:
	case QRF:
	case RX6: {
	    RxNova_URL = "https://qc-web/sso-web/login.jsf";
	    isProduction = false;
	    break;
	}
	case DR1:
	case DR2:
	case DR3:
	case RX2: {
	    RxNova_URL = "https://dev-web/sso-web/login.jsf";
	    isProduction = false;
	    break;
	}
	case UP1:
	case UP3:
	case UP6:
	case UP7:
	case UN1:
	case UA1:
	case UA2:
	case UA3:
	case UA4:
	case UR1:
	case UR2:
	case UR3:
	case UR4: {
	    RxNova_URL = "https://argusbeta-int.dstcorp.net/sso-web/login.jsf?";
	    isProduction = false;
	    break;
	}
	case JBOSS_UA1: {
	    RxNova_URL = "https://ua1-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_UA2: {
	    RxNova_URL = "https://ua2-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_UA3: {
	    RxNova_URL = "https://ua3-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_UA4: {
	    RxNova_URL = "https://ua4-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_UR1: {
	    RxNova_URL = "https://ur1-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_UR2: {
	    RxNova_URL = "https://ur2-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_UR3: {
	    RxNova_URL = "https://ur3-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_UR4: {
	    // RxNova_URL = "https://beta.argushealth.com/sso-web/login.jsf?";
	    RxNova_URL = "https://ur4-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = false;
	    break;
	}
	case PRODUCTION: {
	    // RxNova_URL = "https://www.argushealth.com/sso-web/login.jsf?";
	    RxNova_URL = "https://argusprod-int.dstcorp.net/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_DR1: {
	    RxNova_URL = "https://dr1-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_QR1: {
	    RxNova_URL = "https://qr1-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_QR2: {
	    RxNova_URL = "https://qr2-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_QR3: {
	    RxNova_URL = "https://qr3-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_DR2: {
	    RxNova_URL = "https://dr2-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_RX1: {
	    RxNova_URL = "https://rx1-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_RXH: {
	    RxNova_URL = "https://rxh-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	case JBOSS_PRODUCTION: {
	    RxNova_URL = "https://rx1-int.rxtransaction.com/sso-web/login.jsf?";
	    isProduction = true;
	    break;
	}
	default: {
	    Log.info("Invalid Region - please check the Region name");
	    break;
	}
	}
	Log.info("-----------" + RxNova_URL + "-------------");
	// driver.get(RxNova_URL);
	// invoke(Project.Env.url());
	invoke(RxNova_URL);
	try
	{
		if($(By.xpath("//span[text()='This site can???t be reached']")).isDisplayed())
		{
			getDriver().navigate().refresh();
			getBusyStatus();
		}
	}
	catch(Exception e)
	{
		//e.printStackTrace();
	} catch (Throwable e) 
	{		
		//e.printStackTrace();
	}
	BaseStepListener.isLaunched=true;
	Log.info("-----------Completed Open firefox and start RxNova Application-------------");
    }

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: ObjectIsDisplayed
  	// Return Type: boolean
  	// Description: Determines whether the object is currently displayed. 
  	// Parameters: BaseElement ObjPath
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public boolean objectIsDisplayed(BaseElement ObjPath) {
  	      return ObjPath.exists(10000);
  		}
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: sendKeysToObject
  	// Return Type: void
  	// Description: Send keys to be entered to the field.
  	// Parameters: BaseElement ObjPath, String toEnter -- keys desired to be sent to text edit field
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public void sendKeysToObject(BaseElement ObjPath, String toEnter) {
  			ObjPath.clear();
  			ObjPath.sendKeys(toEnter);
  		}
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: selectFromDropdownUsingText
  	// Return Type: void
  	// Description: Selects from dropdown using text attribute.
  	// Parameters: BaseElement ObjPath, String text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public void selectFromDropdownUsingText(BaseElement ObjPath, String toSelect) throws Throwable {
              WebElement objElmnt = ObjPath;
              Select itemToSelect = new Select(objElmnt);
              itemToSelect.selectByVisibleText(toSelect);
              checkBusyState();
              sleep(1000);
  		}
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: performClick
  	// Return Type: void
  	// Description: Clicks on the object. 
  	// Parameters: BaseElement ObjPath
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public void performClick(BaseElement ObjPath) {
  			ObjPath.click();
  		}	
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: waitForDropdownItem
  	// Return Type: boolean
  	// Description: Checks whether the dropdown is loaded with items.
  	// Parameters: BaseElement ObjPath
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public boolean waitForDropdownItem(BaseElement ObjPath) throws Throwable {		
  			int cnt = 0;
  			boolean waitForDropdownItem = false;
  			
  			while(!waitForDropdownItem && cnt < 10) {
  				List<String> options = ObjPath.getSelectOptions();
  				if(options.size() > 1)
  				  {
  					Log.info("Dropdown list is loaded with items...");
  					waitForDropdownItem = true;
  					break;
  				  }
  				cnt++;
  				sleep(2000);
  				}
  			  return waitForDropdownItem;
  			}
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: SelectItemFromWebListByPartialDisplayName
  	// Return Type: boolean 
  	// Description: This method types in a string into a text edit field that has Intellisense functionality, and clicks the required text for the field.
  	// Parameters: BaseElement ObjPath -- text edit field object, String strValue -- the string that we want typed in the text edit field.
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public boolean selectValueFromFieldIntellisence(BaseElement ObjPath, String strValue) throws Throwable
  		{
  			Boolean boolSelectValueFromFieldIntellisence=false;
  			
  			if(ObjPath.exists(20000) && StringUtil.isNotBlank(strValue))
  			 {
  				String strName = ObjPath.getAttribute("name");
  				ObjPath.clear();
  				ObjPath.sendKeys(strValue);
  				sleep(1000);
  				
  				int value = getDriver().findElements(By.linkText(strValue)).size();
  				if (value > 0) {
  					getDriver().findElement(By.linkText(strValue)).click();
  					sleep(2000);
  					boolSelectValueFromFieldIntellisence=true;
  				}
  				else {
  					getDriver().findElement(By.partialLinkText(strValue)).click();
  					sleep(2000);
  					boolSelectValueFromFieldIntellisence=true;
  				}
  				Log.info("Set text on webelement : " + strName + " Value :" + strValue );
  			}
  			
  			if(boolSelectValueFromFieldIntellisence==false)
  			{
  				Log.info("Webelement with name  : '" + ObjPath.getAttribute("name") + "' was not found");
  			}
  			
  			return boolSelectValueFromFieldIntellisence;
  			
  		}	
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: webtable_ClickOnCheckBox
  	// Return Type: void
  	// Description: click on check box in web table.
  	// Parameters: BaseElement ObjPath, String Text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public boolean webtable_ClickOnCheckBox(BaseElement ObjPath, String toSelect) throws Throwable {
  			
  			Boolean boolWebtable_ClickOnCheckBox = false;
  			
  			if(ObjPath.isDisplayed() && StringUtil.isNotBlank(toSelect))
  			{
  				WebElement objTblBody = ObjPath.findElement(By.tagName("tbody"));
  				List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));
  				A:
  				for(int i=0;i<rows.size();i++)
  				{
  					List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
  					for(int j=0;j<cols.size();j++)
  					{
  					  String strActText = cols.get(j).getText();
  					  if(strActText.equalsIgnoreCase(toSelect))
  					  {
  						  if (!cols.get(j-1).findElement(By.tagName("input")).isSelected())
  						  {
  							  cols.get(j-1).findElement(By.tagName("input")).click();
  							  checkBusyState();
  							  boolWebtable_ClickOnCheckBox = true;
  							  break A;
  						  }
  						  else
  						  {
  							  Log.info("The check box for "+toSelect+" is already checked");
  							  boolWebtable_ClickOnCheckBox = true;
  							  break A;
  						  }
  					   }
  					}
  				}	
  	
  			}
  			
  	       return boolWebtable_ClickOnCheckBox;
  		}
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: ObjectContainsExpectedText
  	// Return Type: boolean
  	// Description: Determines whether an object contains the correct expected Message. 
  	// Parameters: BaseElement ObjPath, String Message
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	 public boolean objectContainsExpectedText(BaseElement ObjPath, String strMessage) {
  			boolean containsExpected = ObjPath.getText().contains(strMessage);
  			return(containsExpected);
  		}
  		
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: WebTable_VerifyRowData
  	// Return Type: boolean
  	// Description: verify row data in web table. 
  	// Parameters: BaseElement ObjPath, String strRowValue
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  		
  	 public boolean webTable_VerifyRowData(BaseElement ObjPath,String strRowValue) throws InterruptedException
  		{
  			Boolean boolWebTable_VerifyRowData = false;
  			
  			String[] arrRowValue = strRowValue.split("\\^",-1);
  			String strExpLabelName = arrRowValue[0];
  			String strExpLabelValue = arrRowValue[1];		
  			
  			List<WebElement> strRows = ObjPath.findElements(By.tagName("tr"));
  			for(int i=0;i<strRows.size();i++)
  			{
  				List<WebElement> strCols = strRows.get(i).findElements(By.tagName("td"));
  				for(int j=0;j<strCols.size();j++)
  				{
  					String strActLabelName = strCols.get(j).getText();
  					if(strActLabelName.equalsIgnoreCase(strExpLabelName))
  					{
  						String strActLabelValue = strCols.get(j+1).getText();
  						if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
  						{
  							Log.info("The Field "+strActLabelName+" has the value "+strActLabelValue);
  							boolWebTable_VerifyRowData = true;
  							break;
  						}
  					}
  				}
  				if(boolWebTable_VerifyRowData == true)
  				{
  					break;
  				}
  			}
  					
  			if(boolWebTable_VerifyRowData==false)
  			{
  				Log.info("Webtable  : '" + ObjPath +"' with "+strRowValue+" was not found");
  			}
  			
  			return boolWebTable_VerifyRowData;		
  		}
  	   
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: WebTable_VerifyColumnData
  	// Return Type: boolean
  	// Description: verify column data in web table. 
  	// Parameters: BaseElement ObjPath, String strColumnValue
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  		
  	  public boolean webTable_VerifyColumnData(BaseElement ObjPath,String strColumnValue) throws InterruptedException
  		{
  			Boolean boolWebTable_VerifyColumnData = false;
  			
  			String[] arrRowValue = strColumnValue.split("\\^",-1);
  			String strExpLabelName = arrRowValue[0];
  			String strExpLabelValue = arrRowValue[1];		
  			
  			List<WebElement> strRows = ObjPath.findElements(By.tagName("tr"));
  			List<WebElement> strColName = strRows.get(0).findElements(By.tagName("td"));
  			List<WebElement> strColValue = strRows.get(1).findElements(By.tagName("td"));
  			for(int i=0;i<strColName.size();i++)
  			 {
  			    String strActLabelName = strColName.get(i).getText();
  				if(strActLabelName.equalsIgnoreCase(strExpLabelName))
  				   {
  					  String strActLabelValue = strColValue.get(i).getText();
  	  			      if(strActLabelValue.equalsIgnoreCase(strExpLabelValue))
  					    {  			    	
  	  			    	Log.info("The Field "+strActLabelName+" has the value "+strActLabelValue);
  						  boolWebTable_VerifyColumnData = true;
  						  break;
  					    }
  					}
  				}
  			
  			if(boolWebTable_VerifyColumnData==false)
  			{
  				Log.info("Webtable  : '" + ObjPath +"' with "+strColumnValue+" was not found");		
  			}
  			
  			return boolWebTable_VerifyColumnData;		
  		}
  	  
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: WebTable_VerifyCellData
  	// Return Type: boolean
  	// Description: verify cell data in web table. 
  	// Parameters: BaseElement ObjPath, String strColValue
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	
  	 public boolean webTable_VerifyCellData(BaseElement ObjPath,String strColValue) throws InterruptedException
  	 {
  		Boolean boolWebTable_VerifyCellData = false;
  		
  		String strActColHeaderName="";
  		String strActColHeaderValue="";
  		
  		String[] arrRowValue = strColValue.split("\\^",-1);
  			
  		String strExpColHeaderName = arrRowValue[0];
  		String strExpColHeaderValue = arrRowValue[1];
  		
  		WebElement strColHeader = ObjPath.findElement(By.tagName("thead"));
  		
  		List<WebElement> strColHeaderRows = strColHeader.findElements(By.tagName("tr"));
  		A:
  		for(int i=0;i<strColHeaderRows.size();i++)
  		{
  			
  			List<WebElement> strColHeaderVal = strColHeaderRows.get(i).findElements(By.tagName("th"));
  			for(int j=0;j<strColHeaderVal.size();j++)
  			{
  				strActColHeaderName = strColHeaderVal.get(j).getText();   
  				if(strActColHeaderName.equalsIgnoreCase(strExpColHeaderName))
  				{
  					WebElement strColHeaderValues = ObjPath.findElement(By.tagName("tbody"));
  			
  					List<WebElement> strColHeaderValueRows = strColHeaderValues.findElements(By.tagName("tr"));
  			
  					for(int k=0;k<strColHeaderValueRows.size();k++)
  					{
  						List<WebElement> strColHeaderValue = strColHeaderValueRows.get(k).findElements(By.tagName("td"));
  			
  						if(strColHeaderValue.get(0).getText().contains("No records"))
  						{
  							Log.info("There were no records available in the table");
  							break A;
  						}
  						strActColHeaderValue = strColHeaderValue.get(j).getText();
  						if(strActColHeaderValue.equalsIgnoreCase(strExpColHeaderValue))	
  						{
  							Log.info("The Column "+strActColHeaderName+" has the value "+strActColHeaderValue);
  							boolWebTable_VerifyCellData = true;
  							break A;
  						}
  					}
  				}
  			}
  		}
  		
  		if(boolWebTable_VerifyCellData==false)
  		{
  			Log.info("Webtable  : '" + ObjPath + "' with "+strColValue+" was not found");
  		}
  		
  		return boolWebTable_VerifyCellData;
  	}	 
  		 
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: generateRandomID
  	// Return Type: String
  	// Description: Generate Random Number. 
  	// Parameters: String Prefix, int lengthWithoutPrefix
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  		 
  	 public String generateRandomID(String prefix,int lengthWithoutPrefix) 
  	  {
  			
  			String GenerateRandomDataWithPrefix=null;
  			
  			DateFormat dateFormat = new SimpleDateFormat("hmmssyyyyMd");

  			Date date = new Date();

  			String strDateTime=dateFormat.format(date);
  			
  			String strRndNumber = strDateTime;
  	                
  			int strRndLength= strRndNumber.length();  
  			
  			if(lengthWithoutPrefix>0) {
  				if(lengthWithoutPrefix > strRndLength) {
  					
  					GenerateRandomDataWithPrefix = prefix+strRndNumber;
  				}else if(lengthWithoutPrefix <= strRndLength) {
  					
  					GenerateRandomDataWithPrefix = prefix+strRndNumber.substring(0,lengthWithoutPrefix);
  				}
  			}
  			
  			return GenerateRandomDataWithPrefix;
  		}
  	 
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: isElementClickable
  	// Return Type: boolean
  	// Description: Given the locator for a text edit field or button, determines whether it is clickable.
  	// Parameters: BaseElement ObjPath
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean isElementClickable(BaseElement ObjPath) throws InterruptedException {
  			
  	int cnt = 0;
  	boolean clickable = false;
  	while(!clickable && cnt < 10) {
  		try {
  			ObjPath.isClickable();
  			clickable = true;
  			break;
  		}
  		catch (Exception e) {
  			clickable = false;
  			Log.info("Element not found yet, waiting and trying again to see if clickable ..." + cnt);
  			cnt++;
  			sleep(300);
  		}
  	}
  	return(clickable);
     }
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: isElementPresent
  	// Return Type: boolean
  	// Description: Given the locator for a text edit field or button, determines whether it is clickable.
  	// Parameters: BaseElement ObjPath
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean isElementPresent(BaseElement ObjPath) throws InterruptedException {
  				
  	int cnt = 0;
  	boolean elemntPresent = false;
  	while(!elemntPresent && cnt < 10) {
  		try {
  			ObjPath.isPresent();
  			elemntPresent = true;
  			Log.info("The Element "+ ObjPath + "  is Displayed");
  			break;
  		}
  		catch (Exception e) {
  			elemntPresent = false;
  			Log.info("Element not found yet, waiting and trying again to see if available ..." + cnt);
  			cnt++;
  			sleep(300);
  		}
  	 }
  	 return(elemntPresent);
     }
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: objectHasExpectedText
  	// Return Type: boolean
  	// Description: Get the text for the given locator.
  	// Parameters: BaseElement ObjPath, String Text
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	
  	public boolean objectHasExpectedText(BaseElement ObjPath,String strText) throws Throwable{
  		return ObjPath.getText().equalsIgnoreCase(strText);	
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: webtable_ClickOnRadioButton
  	// Return Type: boolean
  	// Description: click on radio button in web table.
  	// Parameters: BaseElement ObjPath, String Text 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean webtable_ClickOnRadioButton(BaseElement ObjPath, String toSelect) throws Throwable {
  				
  	Boolean boolWebtable_ClickOnRadioButton = false;
  	
  	if(ObjPath.isDisplayed() && StringUtil.isNotBlank(toSelect))
  	{
  		WebElement objTblBody = ObjPath.findElement(By.tagName("tbody"));
  		List<WebElement> rows = objTblBody.findElements(By.tagName("tr"));
  		A:
  		for(int i=0;i<rows.size();i++)
  		{
  			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
  			for(int j=0;j<cols.size();j++)
  			{
  			  String strActText = cols.get(j).getText();
  			  if(strActText.equalsIgnoreCase(toSelect))
  			  {
  			    if (!cols.get(j).findElement(By.tagName("input")).isSelected())
  				  {
  		    		cols.get(j).findElement(By.tagName("input")).click();
  					checkBusyState();  					
  					Log.info("The radio button for "+toSelect+" is selected");
  					boolWebtable_ClickOnRadioButton = true;
  					break A;
  				  }
  				  else
  				  {
  					  Log.info("The radio button for "+toSelect+" is already selected");
  					  boolWebtable_ClickOnRadioButton = true;
  					  break A;
  				  }
  			   }
  			}
  		 }
  	  }

  	  if(boolWebtable_ClickOnRadioButton==false)
  		 {
  			Log.info("Webtable: " + ObjPath+" was not found");
  		 }		
        return boolWebtable_ClickOnRadioButton;
      }
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: clickOnCheckBox
  	// Return Type: boolean
  	// Description: click on check box.
  	// Parameters: BaseElement ObjPath, String strOperation 
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean clickOnCheckBox(BaseElement ObjPath, String strOperation) throws Throwable {
  					
  	Boolean boolClickOnCheckBox = false;
  	
  	if(ObjPath.isDisplayed() && StringUtil.isNotBlank(strOperation))
  	{
  		switch(strOperation.toUpperCase())
  		{
  		case "CHECK":				
  		     if (!ObjPath.isSelected())
  			  {
  		     	ObjPath.click();
  		     	checkBusyState();
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
  		     	checkBusyState();
  				Log.info("The checkbox for "+ObjPath+" is unchecked");
  				boolClickOnCheckBox = true;
  			  }
  			 else
  			  {
  				Log.info("The checkbox for "+ObjPath+" is already unchecked");
  				boolClickOnCheckBox = true;
  			  }
  		     break;
  		}
  	}

  	if(boolClickOnCheckBox==false)
  		{
  			Log.info("WebElement: " + ObjPath+" was not found");
  		}		
      return boolClickOnCheckBox;
    }
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: clickOnLink
  	// Return Type: boolean
  	// Description: Given a BaseElement for a link, this method attempts to click
  	// on it. It tries a maximum of three times. If the link does not exist, then
  	// the link is not found and not clicked.
  	// Parameters: BaseElement -- element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean clickOnLink(BaseElement element) throws Throwable 
  	{
  		boolean clickOnLink = false;
  		int attempts = 0;
  		while (attempts < 3)
  		{
  			try
  			{
  				if (element.exists(2000))
  				{
  					element.click();
  					waitForAngularPageRefresh();
  					clickOnLink = true;
  					Log.info("Clicked on the link : "+element.getTextValue() );
  					break;
  				}
  			} 
  			catch (Exception e)
  			{
  				Log.info("Exception occured in clickOnLink = "+e.getMessage());
  				sleep(1000);
  			}
  			attempts++;
  		}
  		if (clickOnLink == false) { 	Log.info("Webelement with name  : '" + element + "' was not found"); }
  		return clickOnLink;
  	}
 
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: clickOnButton
  	// Return Type: boolean
  	// Description: Given a BaseElement for a button, this method attempts to click on it
  	// It tries a maximum of three times. If the link does not exist, then the link is not found and not clicked.
  	// Parameters: BaseElement -- element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean clickOnButton(BaseElement element) throws Throwable {
  		boolean clickOnButton = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.exists(1000)){
  					element.waitUntilEnabled();
  					element.click();
  					waitForAngularPageRefresh();
  					clickOnButton = true;
  					Log.info("Clicked on the button : "+element);
  					break;
  				}
  			} 
  			catch (Exception e)
  			{ 
  				Log.info("Exception got occured in 'clickOnButton' method ");
  				Log.info(e.getMessage());
  				sleep(2000);
  			}
  			attempts++;
  		}
  		if (clickOnButton == false){  	Log.info("Web button : '" + element + "' was not found");  	}
  		return clickOnButton;
  	}	 
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: setTextOnEdit
  	// Return Type: void
  	// Description: Send keys to be entered to the field.
  	// Parameters: BaseElement ObjPath, String toEnter -- keys desired to be sent to text edit field
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean setTextOnEdit(BaseElement element, String toEnter) 
  	{
  		boolean setTextOnEdit = false;
  		int attempts = 0;
  		while (attempts < 3)
  		{
  			try
  			{
  				if(element.exists(2000))
  				{
  					element.type(toEnter);											
  					waitForAngularPageRefresh();
  					Log.info("Set Text into Edit :"+toEnter);
  					setTextOnEdit = true;
  					break;
  				}
  			}
  			catch(Exception e)
  			{	
  				Log.info("Exception exist in ' setTextOnEdit ' method");
  				Log.info(e.getMessage());
  			}
  			attempts++;
  		}
  		if(setTextOnEdit==false) { Log.info("Web Edit  :"+ element +":  was not found"); }
  		return setTextOnEdit;
  	}
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public void waitForAngularPageRefresh()
  {  
	  int counter = 0;
	  int refreshCount = 0;
	  while(counter<2)
	  {
		  try
		  {
			  getNgDriver().waitForAngularRequestsToFinish();
			  break;
		  }
		  catch(ScriptTimeoutException s)
		  {
			  refreshCount++;
			  Log.info("ScriptTimeoutException exist in ' waitForAngularPageRefresh ' method");
			  if(refreshCount==2) { break; }
		  }
		  counter++;
	  }
  }
  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // method : getDatesFromPropertiesFile
  
  
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  public String getDatesFromPropertiesFile(File strFilePath,String strPropertiesKeyForDate)
  {
	  String strReturnValue = null;
	  try
	  {
		 if(strFilePath.exists()) 
		 {
		  //FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
		  FileInputStream objfile = new FileInputStream(strFilePath);
		  pf.load(objfile);
		  strReturnValue = pf.getProperty(strPropertiesKeyForDate);
		  }
	  }
	  catch(FileNotFoundException fnfe)
	  {
		  Log.info("Exception exist in ' getDatesFromPropertiesFile ' method");
	  }
	  catch(IOException fnfe)
	  {
		  Log.info("Exception exist in ' getDatesFromPropertiesFile ' method");
	  }
	  return strReturnValue;
  }
  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
  //******************************* UI Validations ******************************************
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyEditBoxPresence
  	// Return Type: boolean
  	// Description: Verify the presence of edit field.
  	// Parameters: BaseElement element
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyEditBoxPresence(BaseElement element) 
  	{
  		boolean verifyEditBoxPresence = false;
  		int attempts = 0;
  		while (attempts < 3)
  		{
  			try
  			{
  				if(element.isVisible())
  				{
  					Log.info("Web Edit Box: "+element+" is available");
  					verifyEditBoxPresence = true;
  					break;
  				}
  			}
  			catch(Exception e){	}
  			attempts++;
  		}
  		
  		if(verifyEditBoxPresence == false)
  		{
  			Log.info("Web Edit  :"+ element +":  was not found");
  		}
  		return verifyEditBoxPresence;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyLengthOfEditBox
  	// Return Type: boolean
  	// Description: Verify length of the edit field.
  	// Parameters: BaseElement element
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyLengthOfEditBox(BaseElement element, String strLength) 
  	{
  		boolean verifyLengthOfEditBox = false;
  		boolean verifyLengthOfEditBoxIsNotMatched = false;
  		int attempts = 0;
  		String strEditBoxLength = "";
  		while (attempts < 3)
  		{
  			try
  			{
  				if(element.isVisible())
  				{
  					strEditBoxLength = element.getAttribute("maxlength");
  					
  					if(strEditBoxLength.equalsIgnoreCase(strLength))
  					{
  						Log.info("The Length of the Web Edit: '"+element+"' is: "+strEditBoxLength+" matched with the provided length value "+strLength);
  	  					verifyLengthOfEditBox = true;
  	  					break;
  					}
  					else
  					{
  						Log.info("The Length of the Web Edit: '"+element+"' is: "+strEditBoxLength+" not matched with the provided length value "+strLength);
  						verifyLengthOfEditBoxIsNotMatched = true;
  						break;
  					}  	
  				}
  			}
  			catch(Exception e){	}
  			attempts++;
  		}
  		if(verifyLengthOfEditBox == false && verifyLengthOfEditBoxIsNotMatched == false)
  		{
  			Log.info("Web Edit: '"+ element +"' was not found");
  		}
  		return verifyLengthOfEditBox;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyEditBoxIsDisabled
  	// Return Type: boolean
  	// Description: Verify the edit box is disabled or not.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyEditBoxIsDisabled(BaseElement element) throws Throwable {
  		boolean verifyEditBoxIsDisabled = false;
  		boolean verifyEditBoxIsNotDisabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					
  					if (!element.isEnabled())
  					{
  						Log.info("Web Edit: '"+element+"' is disabled");
  						verifyEditBoxIsDisabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web Edit: '"+element+"' is not disabled");
  						verifyEditBoxIsNotDisabled = true;
  						break;
  					}
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyEditBoxIsDisabled == false && verifyEditBoxIsNotDisabled == false)
  		{
  			Log.info("Web Edit: '" + element + "' was not found"); 
  		}
  		return verifyEditBoxIsDisabled;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyButtonPresence
  	// Return Type: boolean
  	// Description: Verify the presence of button.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyButtonPresence(BaseElement element) throws Throwable {
  		boolean verifyButtonPresence = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible())
  				{
  					Log.info("Web Button: "+element+"  is available");
  					verifyButtonPresence = true;
  					break;
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyButtonPresence == false)
  		{
  			Log.info("Web Button : '" + element + "' was not found"); 
  		}
  		
  		return verifyButtonPresence;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyButtonIsDisabled
  	// Return Type: boolean
  	// Description: Verify the button is disabled or not.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyButtonIsDisabled(BaseElement element) throws Throwable {
  		boolean verifyButtonIsDisabled = false;
  		boolean verifyButtonIsNotDisabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()) {
  					
  					if (!element.isEnabled())
  					{
  						Log.info("Web Button: '"+element+"' is disabled");
  						verifyButtonIsDisabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web Button: '"+element+"' is not disabled");
  						verifyButtonIsNotDisabled = true;
  						break;
  					}
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyButtonIsDisabled == false && verifyButtonIsNotDisabled == false)
  		{
  			Log.info("Web Button: '" + element + "' was not found"); 
  		}
  		return verifyButtonIsDisabled;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyListBoxPresence
  	// Return Type: boolean
  	// Description: Verify the presence of list box.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyListBoxPresence(BaseElement element) throws Throwable {
  		boolean verifyListBoxPresence = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible())
  				{
  					Log.info("Web List : "+element+" is available");
  					verifyListBoxPresence = true;
  					break;
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyListBoxPresence == false)
  		{
  			Log.info("Web List : '" + element + "' was not found"); 
  		}
  		
  		return verifyListBoxPresence;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: verifyItemsInListBox
    // Return Type: void
    // Description: Verify items available in drop down list.
    // Parameters: BaseElement ObjPath, String text 
    // Example:
    // Author:
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyItemsInListBox(BaseElement element, String strListItems) throws Throwable 
    {
        boolean verifyItemsInListBox = false;
        boolean verifyItemsInListBoxIsNotMatched = false;
        int attempts = 0;
        String[] listItems = strListItems.split("\\*",-1);    	  	
      	List<String> expectedListItems = Arrays.asList(listItems);
      	ArrayList<String> actListItems = new ArrayList<String>();
        while(attempts < 3)
         {
           try
            {
               if(element.isVisible())
                {
                   List<WebElement> list = element.findElements(By.tagName("option"));
                   
                   for(int listVal=0;listVal<list.size();listVal++)
                   {
             		   if(!list.get(listVal).getText().isEmpty())
            		   {
            			   actListItems.add(list.get(listVal).getText()); 
            		   }  
                   }
                   
       			   if(expectedListItems.equals(actListItems))
      			   {
      				  Log.info("The items in the Web List: "+actListItems);
      				  verifyItemsInListBox = true;
      				  break;
      			   }
       			   else
       			   {
       				  Log.info("The items in the Web List: "+actListItems+" is not matched with the provided list items: "+expectedListItems);
       				  verifyItemsInListBoxIsNotMatched = true;
    				  break;  
       			   }
                }
            }
           catch(Exception e) {}
           attempts++;
         }
        
  		if(verifyItemsInListBox == false && verifyItemsInListBoxIsNotMatched == false)
  		{
  			Log.info("Web List: '" + element + "' was not found"); 
  		}

         return verifyItemsInListBox;
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyListBoxIsDisabled
  	// Return Type: boolean
  	// Description: Verify the button is disabled or not.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyListBoxIsDisabled(BaseElement element) throws Throwable {
  		boolean verifyListBoxIsDisabled = false;
  		boolean verifyListBoxIsNotDisabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					
  					if (!element.isEnabled())
  					{
  						Log.info("Web List: '"+element+"' is disabled");
  						verifyListBoxIsDisabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web List: '"+element+"' is not disabled");
  						verifyListBoxIsNotDisabled = true;
  						break;
  					}  					
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyListBoxIsDisabled == false && verifyListBoxIsNotDisabled == false)
  		{
  			Log.info("Web List: '" + element + "' was not found"); 
  		}
  		return verifyListBoxIsDisabled;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyCheckBoxPresence
  	// Return Type: boolean
  	// Description: Verify the presence of check box.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyCheckBoxPresence(BaseElement element) throws Throwable {
  		boolean verifyCheckBoxPresence = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isCurrentlyVisible())
  				{
  					Log.info("List box: "+element+"is available");
  					verifyCheckBoxPresence = true;
  					break;
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyCheckBoxPresence == false)
  		{
  			Log.info("Web Check box : '" + element + "' was not found"); 
  		}
  		
  		return verifyCheckBoxPresence;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyCheckBoxIsDisabled
  	// Return Type: boolean
  	// Description: Verify the check box is disabled or not.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyCheckBoxIsDisabled(BaseElement element) throws Throwable {
  		boolean verifyCheckBoxIsDisabled = false;
  		boolean verifyCheckBoxIsNotDisabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					
  					if (!element.isEnabled())
  					{
  						Log.info("Web Check box: '"+element+"' is disabled");
  						verifyCheckBoxIsDisabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web Check box: '"+element+"' is not disabled");
  						verifyCheckBoxIsNotDisabled = true;
  						break;
  					}
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyCheckBoxIsDisabled == false && verifyCheckBoxIsNotDisabled == false)
  		{
  			Log.info("Web Check box: '" + element + "' was not found"); 
  		}
  		return verifyCheckBoxIsDisabled;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyTablePresence
  	// Return Type: boolean
  	// Description: Verify the presence of table.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyTablePresence(BaseElement element) throws Throwable {
  		boolean verifyTablePresence = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.exists(2000)){
  					Log.info("Table: "+element+"is available");
  					verifyTablePresence = true;
  					break;
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyTablePresence == false)
  		{
  			Log.info("Web Table : '" + element + "' was not found"); 
  		}
  		
  		return verifyTablePresence;
  	}
  	
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: rebate_VerifyItemsInListBox
    // Return Type: boolean
    // Description: Verify items available in drop down list.
    // Parameters: BaseElement ObjPath, String text 
    // Example:
    // Author:
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean rebate_VerifyItemsInListBox(BaseElement element, String strListItems) throws Throwable 
    {
        boolean rebate_VerifyItemsInListBox = false;
        boolean rebate_VerifyItemsInListBoxIsNotMatched = false;
        int attempts = 0;
        String[] listItems = strListItems.split("\\*",-1);    	  	
      	List<String> expectedListItems = Arrays.asList(listItems);
      	ArrayList<String> actListItems = new ArrayList<String>();
      	
        while(attempts < 3)
         {
           try
            {
               if(element.isVisible())
                {
            	   element.click();
            	   getNgDriver().waitForAngularRequestsToFinish();
            	   List<WebElement> list = element.findElements(By.xpath("//*[@class='ui-select-choices-row-inner']/span"));
            	   for(int listVal=0;listVal<list.size();listVal++)
            	   {
            		   if(!list.get(listVal).getText().isEmpty())
            		   {
            			   actListItems.add(list.get(listVal).getText()); 
            		   }            		              		   
            	   }
            	   
            	   if(expectedListItems.equals(actListItems))
      			   {
      				  Log.info("The items in the Web List: "+actListItems);
      				  rebate_VerifyItemsInListBox = true;
      				  break;
      			   }
       			   else
       			   {
       				  Log.info("The items in the Web List: "+actListItems+" is not matched with the provided list items: "+expectedListItems);
       				  rebate_VerifyItemsInListBoxIsNotMatched = true;
    				  break;  
       			   }
                }
            }
           catch(Exception e) {}
           attempts++;
         }
        
         if(rebate_VerifyItemsInListBox==false && rebate_VerifyItemsInListBoxIsNotMatched == false)
         { 
        	 Log.info("Web List: '" + element + "' was not found");
         }
         return rebate_VerifyItemsInListBox;
    }
    
    // ================================================= Temporary =================================================
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyListBoxIsEnabled
  	// Return Type: boolean
  	// Description: Verify the button is disabled or not.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public boolean verifyListBoxIsEnabled(BaseElement element) throws Throwable {
  		boolean verifyListBoxIsEnabled = false;
  		boolean verifyListBoxIsNotEnabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					
  					if (element.isEnabled())
  					{
  						Log.info("Web List: '"+element+"' is enabled");
  						verifyListBoxIsEnabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web List: '"+element+"' is not enabled");
  						verifyListBoxIsNotEnabled = true;
  						break;
  					}  
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyListBoxIsEnabled == false && verifyListBoxIsNotEnabled == false)
  		{
  			Log.info("Web List: '" + element + "' was not found"); 
  		}
  		return verifyListBoxIsEnabled;
  	}
  	
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Method: verifyEditBoxIsEabled
	// Return Type: boolean
	// Description: Verify the edit box is eabled or not.
	// Parameters:  BaseElement element
	// Example:
	// Author:
	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyEditBoxIsEnabled(BaseElement element) throws Throwable {
  		boolean verifyEditBoxIsEnabled = false;
  		boolean verifyEditBoxIsNotEnabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					
  					if (element.isEnabled())
  					{
  						Log.info("Web Edit: '"+element+"' is enabled");
  						verifyEditBoxIsEnabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web Edit: '"+element+"' is not enabled");
  						verifyEditBoxIsNotEnabled = true;
  						break;
  					}
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyEditBoxIsEnabled == false && verifyEditBoxIsNotEnabled == false)
  		{
  			Log.info("Web Edit: '" + element + "' was not found"); 
  		}
  		return verifyEditBoxIsEnabled;
  	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyEditBoxDefaultText
  	// Return Type: boolean
  	// Description: Verify default text in the edit field.
  	// Parameters: BaseElement element, String Default Text
  	// Example:
  	// Author:
  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyEditBoxDefaultText(BaseElement element, String strDefaultText) 
  	{
  		boolean verifyEditBoxDefaultText = false;
  		int attempts = 0;
  		String strEditBoxDefaultText = "";
  		while (attempts < 3)
  		{
  			try
  			{
  				if(element.isVisible())
  				{
  					strEditBoxDefaultText = element.getAttribute("placeholder");
  					
  					if(strEditBoxDefaultText.equalsIgnoreCase(strDefaultText))
  					{
  						Log.info("The Edit Box Default Text is: "+strEditBoxDefaultText+"  is matched with the provided Edit Box Default Text "+strDefaultText);
  						verifyEditBoxDefaultText = true;
  	  					break;
  					}
  					else
  					{
  						Log.info("The Edit Box Default Text: "+strEditBoxDefaultText+" is not matched with the provided Edit Box Default Text "+strDefaultText);
  						break;
  					}  	
  				}
  				else
  				{
  					Log.info("Web Edit  :"+ element +":  was not found");
  				}
  			}
  			catch(Exception e){	}
  			attempts++;
  		}
  		return verifyEditBoxDefaultText;
  	}
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyButtonIsEnabled
  	// Return Type: boolean
  	// Description: Verify the presence of button.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyButtonIsEnabled(BaseElement element) throws Throwable {
  		boolean verifyButtonIsEnabled = false;
  		boolean verifyButtonIsNotEnabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					
  					if (element.isEnabled())
  					{
  						Log.info("Web Button: '"+element+"' is enabled");
  						verifyButtonIsEnabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web Button: '"+element+"' is not enabled");
  						verifyButtonIsNotEnabled = true;
  						break;
  					}
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyButtonIsEnabled == false && verifyButtonIsNotEnabled == false)
  		{
  			Log.info("Web Button: '" + element + "' was not found"); 
  		}
  		return verifyButtonIsEnabled;
  	}
  	
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyCheckBoxIsEnabled
  	// Return Type: boolean
  	// Description: Verify the presence of check box.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyCheckBoxIsEnabled(BaseElement element) throws Throwable {
  		boolean verifyCheckBoxIsEnabled = false;
  		boolean verifyCheckBoxIsNotEnabled = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					
  					if (element.isEnabled())
  					{
  						Log.info("Web Check box: '"+element+"' is enabled");
  						verifyCheckBoxIsEnabled = true;
  						break;
  					}
  					else
  					{
  						Log.info("Web Check box: '"+element+"' is not enabled");
  						verifyCheckBoxIsNotEnabled = true;
  						break;
  					}
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyCheckBoxIsEnabled == false && verifyCheckBoxIsNotEnabled == false)
  		{
  			Log.info("Web Check box: '" + element + "' was not found"); 
  		}
  		return verifyCheckBoxIsEnabled;
  	}

  	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Method: verifyDefaultItemInListBox
    // Return Type: void
    // Description: Verify default item available in drop down list.
    // Parameters: BaseElement ObjPath, String text 
    // Example:
    // Author:
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public boolean verifyDefaultItemInListBox(BaseElement element, String strDefaultItem) throws Throwable 
    {
        boolean verifyDefaultItemInListBox = false;
        int attempts = 0;
        while(attempts < 3)
         {
           try
            {
               if(element.isVisible())
                {
            	   String strValue = element.getSelectedVisibleTextValue();
            	   
            	   if(strValue.equalsIgnoreCase(strDefaultItem))
            	   {
            		   Log.info("Default item: '"+ strDefaultItem +"' is displaying in the Web List: '"+element+"'");
            		   verifyDefaultItemInListBox = true;
                       break;
            	   }
                }
            }
           catch(Exception e) {}
           attempts++;
         }
        
  		if(verifyDefaultItemInListBox == false)
  		{
  			Log.info("Web List: '" + element + "' was not found"); 
  		}

         return verifyDefaultItemInListBox;
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	// Method: verifyPaginationPresence
  	// Return Type: boolean
  	// Description: Verify the presence of pagination in table.
  	// Parameters:  BaseElement element
  	// Example:
  	// Author:
  	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  	public boolean verifyPaginationPresence(BaseElement element) throws Throwable {
  		boolean verifyPaginationPresence = false;
  		int attempts = 0;
  		while (attempts < 3){
  			try{
  				if (element.isVisible()){
  					Log.info("Pagination: '"+element+"' is available");
  					verifyPaginationPresence = true;
  					break;
  				}
  			} 
  			catch (Exception e){ }
  			attempts++;
  		}
  		
  		if(verifyPaginationPresence == false)
  		{
  			Log.info("Pagination: '" + element + "' was not found"); 
  		}
  		
  		return verifyPaginationPresence;
  	}
    
  
  
  
  
  
  
  
  
  
  
  
  
  	
  	
}
