/**
 * 
 */
package edu.ics499.fume.cucumber;

import java.io.IOException;


import edu.ics499.fume.entities.Transaction;
import edu.ics499.fume.facade.Request;
import edu.ics499.fume.facade.Result;

/**
 * @author marselos a. reed
 *
 */
public class AutomatedTesting {
	
	
	private String[] userNames = {"funny-gecko", "stupid-human", "ugly-alien", "sad-dinosaur"};
	private String[] pinCodes = {"5241", "6585", "3278", "8849"};
	private String[] netId = {"spider_grid", "spider_grid", "spider_grid", "spider_grid"};
	private String[] users = new String[4];
	
	
	
	
	//testing adding users 
	public void testAddUserNode() throws IOException {
		for(int count = 0; count <= users.length; count++) {
			Request.getInstance().setUserName(userNames[count]);
			Request.getInstance().setPin(pinCodes[count]);
			Request.getInstance().setNetworkID(netId[count]);
			Result result = Transaction.getInstance().createUser(Request.getInstance());
			
			
			assert result.getResultCode() == Result.USER_REGISTRATION_COMPLETED;
			assert result.getUserName().equals(userNames[count]);
			assert result.getPin().equals(pinCodes[count]);
		}
	}
	
	public void testAll() throws IOException {
		testAddUserNode();
	}

	
	public static void main(String[] args) throws IOException {
		AutomatedTesting test = new AutomatedTesting();
		
		test.testAll();
	}
	
	
}
