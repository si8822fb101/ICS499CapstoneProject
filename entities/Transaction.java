/**
 * 
 */
package edu.ics499.fume.entities;

/**
 * @author marselos a. reed , qaalib farah, john quinlan, ayden sinn, mohamed mahmoud
 *
 */
public abstract class Transaction {
	private String message, file, userName, pin, networkID, Connection;
	private Node node;
	private int port;


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}
	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	/**
	 * @return the networkID
	 */
	public String getNetworkID() {
		return networkID;
	}
	/**
	 * @param networkID the networkID to set
	 */
	public void setNetworkID(String networkID) {
		this.networkID = networkID;
	}
	/**
	 * @return the connection
	 */
	public String getConnection() {
		return Connection;
	}
	/**
	 * @param connection the connection to set
	 */
	public void setConnection(String connection) {
		Connection = connection;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the node
	 */
	public Node getNode() {
		return node;
	}
	/**
	 * @param node the node to set
	 */
	public void setNode(Node node) {
		this.node = node;
	}
	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
	
	

}
