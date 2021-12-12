package com.project.common.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.psqframework.core.page.BasePage;

public class ExcelReadWriteUtil extends BasePage 
{
	public static String START_DATE, END_DATE;
	
	 public  static void getStartAndEndDateValuesFromExcel()
	 {
		 try
		 {			
			FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"//TestData//Rebate_TestData.xlsx");
	        XSSFWorkbook wb1=new XSSFWorkbook(f);
	        XSSFSheet ws=wb1.getSheet("Sheet1");
	        	        	        
	        String strCurrentRowNumValue = ws.getRow(1).getCell(1).getStringCellValue();	        
	        int iCurrentRowNumber = Integer.parseInt(strCurrentRowNumValue);
	        
	        String strSNO =  ws.getRow(iCurrentRowNumber).getCell(0).getStringCellValue();
	        String strStartDate = ws.getRow(iCurrentRowNumber).getCell(2).getStringCellValue();
	        String strEndDate = ws.getRow(iCurrentRowNumber).getCell(3).getStringCellValue();
	        
	        START_DATE = strStartDate;
			  
			END_DATE = strEndDate;
	        
	        int iNextCurrentRow = iCurrentRowNumber + 1;
	        String strNextCurrentRow = String.valueOf(iNextCurrentRow);
	        ws.getRow(1).getCell(1).setCellValue(strNextCurrentRow);
	        
	        int strNewSNO = Integer.parseInt(strSNO)+1;
		     String strNewStartDate = addNewDate(strStartDate);
		     String strNewEndDate = addNewDate(strEndDate);
	        
	        String strLastRowNumValue = ws.getRow(1).getCell(4).getStringCellValue();	        
	        int iLastRowNumber = Integer.parseInt(strLastRowNumValue);
	        
	        ws.createRow(iLastRowNumber).createCell(0).setCellValue(String.valueOf(strNewSNO));
		    ws.getRow(iLastRowNumber).createCell(2).setCellValue(strNewStartDate);
		    ws.getRow(iLastRowNumber).createCell(3).setCellValue(strNewEndDate);
	        	        
	        int iNextLastRow = iLastRowNumber + 1;
	        String strNextLastRow = String.valueOf(iNextLastRow);
	        ws.getRow(1).getCell(4).setCellValue(strNextLastRow);
	        	        						 			 		     		     		     		     		    	       
	        FileOutputStream outputStream = new FileOutputStream(System.getProperty("user.dir")+"//TestData//Rebate_TestData.xlsx");
	        
	        wb1.write(outputStream);
	        
	        wb1.close();
			
		 }
		 catch(Exception e)
		 {
			System.out.println("Exception message = "+e.getMessage()); 
		 }
				 
	 }
	 
	 public static String addNewDate(String strInputDate)
	 {		
		int monthNumber,date,year;
	    String[] monthString = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			
	     String[] arrDate = strInputDate.split("/",-1);
	     
	     String strMonth = arrDate[0];
	     System.out.println(strMonth);
	     
	     if(strMonth.length()<2)
	     {
	     	strMonth = strMonth.substring(1);
	     	monthNumber = Integer.parseInt(strMonth);
	     }
	     else
	     {
	     	monthNumber = Integer.parseInt(strMonth);
	     }    

	     
	     System.out.println("The provided month is :"+monthString[monthNumber-1]);
	     
	     String strDate = arrDate[1];
	     System.out.println(strDate);
	     
	     date = Integer.parseInt(strDate);
	     
	     String strYear = arrDate[2];
	     System.out.println(strYear);
	     
	     year = Integer.parseInt(strYear);
	     
	     switch (monthString[monthNumber-1])
	     {
	       case "January":
	       case "March":
	       case "May":
	       case "July":
	       case "August":
	       case "October":          
	     	    if(date<=30)
	     	    {
	     	    	date = date+1;        	    	
	     	    }
	     	    else if(date == 31)
	     	    {
	     	    	System.out.println("The date reached the end date for the corresponding month");
	     	    	monthNumber++;
	     	    	date = 1;
	     	    }
	     	    else
	     	    {
	     	    	System.out.println("Please check the provided date");
	     	    }
	     	    break;
	     	    
	       case "December":
	     	    if(date<=30)
	     	    {
	     	    	date = date+1;        	    	
	     	    }
	     	    else if (date == 31)
	     	    {
	     	    	System.out.println("The date reached the end date for the corresponding month");
	     	    	date = 1;
	     	    	monthNumber = 1;
	     	    	year = year+1;
	     	    }
	     	    else
	     	    {
	     	    	System.out.println("Please check the provided date");
	     	    }        	   
	     	    break;
	     	    
	       case "April":
	       case "June":
	       case "September":
	       case "November":
		      	    if(date<=29)
		      	    {
		      	    	date = date+1;
		      	    	System.out.println("The Date Exceeds for the corresponding month");
		      	    	monthNumber++;
		      	    	date = 1;
		      	    }
		      	    else if(date == 30)
		      	    {
		      	    	System.out.println("The date reached the end date for the corresponding month");
	     	    	monthNumber++;
	     	    	date = 1;
		      	    }
		      	  else
		      	    {
		      		  	System.out.println("Please check the provided date");
		      	    }
		      	    break;
		      	    
	       case "February":
	     	    if(date<=27)
	     	    {
	     	    	date = date+1;
	     	    }
	     	    else if(date == 28)
	     	    {
	     	    	if(year % 4 == 0)
	     	    	{
	     	    		date = date+1;
	     	    		System.out.println("The provided year is leap year");
	     	    	}
	     	    	else
	     	    	{
	     	    		System.out.println("The date reached the end date for the corresponding month");
	             	    monthNumber++;
	             	    date = 1;
	     	    	}
	     	    }
	     	    else if(date == 29)
	     	    {
	    	    		System.out.println("The date reached the end date for the corresponding month");
	         	    monthNumber++;
	         	    date = 1;
	     	   	}
	     	    else
	     	    {
	     	    	System.out.println("Please check the provided date");
	     	    }	    	
	     	    	
	     	    break;        	  
	     	    
	     }
	     
	     strMonth = Integer.toString(monthNumber);
	     
	     if(strMonth.length()<2)
	     {
	     	strMonth = "0"+strMonth;
	     }
	     
	     strDate = Integer.toString(date);
	     
	     if(strDate.length()<2)
	     {
	     	strDate = "0"+strDate;
	     }
	     
	     strYear = Integer.toString(year);
	     
	     String newDate = strMonth+"/"+strDate+"/"+strYear;
	     
	     System.out.println("The newly created date is: "+newDate);
	     
	     return newDate;
		}
}
