/**
 * 
 */
package edu.ics499.fume.entities;

import java.util.Random;

import edu.ics499.fume.facade.Block;

/**
 * @author marselos a. reed
 * 
 *
 */
public class Message extends Block {
	private String digest = "";
	private String messageID;
	private String networkID ="";
	/**
	 * @param digest
	 * @param messageID
	 */
	public Message(String digest, int messageID) {
		super(top, messageID, temporal);
		Random random = new Random();
		this.digest = digest;
		this.messageID = networkID + random.nextInt(10000);
	}
	
	
	

}
