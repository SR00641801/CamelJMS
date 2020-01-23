/*
 * package com.mycompany;
 * 
 * import java.text.SimpleDateFormat; import java.util.Date;
 * 
 * public class AnotherDate {
 * 
 * public static void main(String[] args) {
 * 
 * String dateToValdate= "1-1-20123"; Boolean result=true; SimpleDateFormat
 * formatter= new SimpleDateFormat("dd-MM-yyyy"); formatter.setLenient(true);
 * 
 * Date parsedDate = null; try {
 * 
 * Date newDate=formatter.parse(dateToValdate);
 * System.out.println("Date after parsing : "+newDate); } catch(Exception e) {
 * result=false; } System.out.print("Date is matching:"+result); }
 * 
 * }
 */
package com.mycompany;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AnotherDate {

	public boolean isThisDateValid(String dateToValidate){
		
		
		DateTimeFormatter sdf =  
			      DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		
		
		try {
			
			//if not valid, it will throw ParseException
			sdf.parse(dateToValidate);
			
			//System.out.println(date);
		
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		AnotherDate anotherdate= new AnotherDate();
		
		Boolean result = anotherdate.isThisDateValid("12-12-2559");
		System.out.println(" ::: "+ result);
	}
	
}