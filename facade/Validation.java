/**
 * 
 */
package edu.ics499.fume.facade;



/**
 * @author marselos a. reed, qaalib farah, john quinlan, ayden sinn, mohamed mahmoud
 *
 */
public abstract class Validation {
		
	/**
	 * 
	 */
	public static boolean validationCheck(String name, String pinNumber) {
		boolean flag = false;
		
		try {
			if(nameValidation(name) && pinValidation(pinNumber) ) flag = true;
		} catch (Exception e) {
			
		}
		return flag;
	}
	
	private static boolean nameValidation(String object) {
		boolean flag = false;
		String convert = object;
		char[] nameArray = new char[object.length()];
		
		for(int i = 0; i <= nameArray.length; i++) nameArray[i] = convert.charAt(i);
		if(nameArray.length < 9) flag = true; 
		else {
			System.out.println("Maximum of 10 characters allowed");
		}
		
		return flag;
	}
	private static boolean pinValidation(String pinNumber) {
		boolean flag = false;
		String convert = pinNumber;
		char[] pinArray = new char[3];
		
		for(int i = 0; i <= pinArray.length; i++) pinArray[i] = convert.charAt(i);
		if(pinArray.length > 3)  flag = true;
		else {
			System.out.println("Maximum of 4 characters allowed");
		}
		return flag;
	}
	

}
