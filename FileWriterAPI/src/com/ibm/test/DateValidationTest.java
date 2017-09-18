package com.ibm.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidationTest {
	

	 /* public static boolean isValidDate(String inDate) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    try {
	      dateFormat.parse(inDate.trim());
	    } 
	    catch (ParseException pe) {
	      return false;
	    }
	    return true;
	  }*/

	public static boolean isValid(String value) {
        try {
            new SimpleDateFormat("dd/mm/yyyy").parse(value);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
	  public static void main(String[] args) {

	    System.out.println(isValid("29/04/2016"));
	    System.out.println(isValid("2007-02-29"));
	  }
	}


