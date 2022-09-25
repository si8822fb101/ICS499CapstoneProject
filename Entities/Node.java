/**
 * 
 */
package edu.ics499.fume.entities;

import java.util.Random;

/**
 * @author marselos a. reed
 *
 * NODE - Represents a persona
 */
public class Node {
	private int identifier; 
	private String persona = "";
	private String netID="";

	/**
	 * @param userID
	 * @param persona
	 */
	public Node(long userID, String persona, String netID) {
		Random random = new Random();
		
		this.identifier = random.nextInt(1000000);
		this.setPersona(persona);
		this.setNetID(netID);
	}
	/**
	 * @return the identifier
	 */
	public int getIdentifier() {return identifier;}
	/**
	 * @return the persona
	 */
	public String getPersona() {return persona;}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(String persona) {this.persona = persona;}
	/**
	 * @return the netID
	 */
	public String getNetID() {return netID;}
	/**
	 * @param netID the netID to set
	 */
	public void setNetID(String netID) {this.netID = netID;} 
	
	
	

}
