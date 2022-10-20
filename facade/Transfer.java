package edu.ics499.fume.facade;

import java.io.File;

import edu.ics499.fume.entities.*;

public abstract class Transfer {
	private String message, userName, pin, networkId, connection, filePath,
	ipAddress, macAddress, transactionDate;
	private File file;
	private Node node;
	private int port;
	/**
	 * @return the message
	 */
	public String getMessage() {return message;}
	/**
	 * @param message the message to set
	 */
	public String setMessage(String message) {return this.message = message;}
	/**
	 * @return the userName
	 */
	public String getUserName() {return userName;}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {this.userName = userName;}
	/**
	 * @return the pin
	 */
	public String getPin() {return pin;}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {this.pin = pin;}
	/**
	 * @return the networkID
	 */
	public String getNetworkID() {return networkId;}
	/**
	 * @param networkID the networkID to set
	 */
	public void setNetworkID(String networkID) {this.networkId = networkID;}
	/**
	 * @return the connection
	 */
	public String getConnection() {return connection;}
	/**
	 * @param connection the connection to set
	 */
	public void setConnection(String connection) {this.connection = connection;}
	/**
	 * @return the filePath
	 */
	public String getFilePath() {return filePath;}
	/**
	 * @param filePath the filePath to set
	 */
	public String setFilePath(String filePath) { return this.filePath = filePath;}
	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {return ipAddress;}
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {this.ipAddress = ipAddress;}
	/**
	 * @return the macAddress
	 */
	public String getMacAddress() {return macAddress;}
	/**
	 * @param macAddress the macAddress to set
	 */
	public void setMacAddress(String macAddress) {this.macAddress = macAddress;}
	/**
	 * @return the transactionDate
	 */
	public String getTransactionDate() {return transactionDate;}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {this.transactionDate = transactionDate;}
	/**
	 * @return the file
	 */
	public File getFile() {return file;}
	/**
	 * @param file the file to set
	 */
	public File setFile(File file) { return this.file = file;}
	/**
	 * @return the node
	 */
	public Node getNode() {return node;}
	/**
	 * @param node the node to set
	 */
	public void setNode(Node node) {this.node = node;}
	/**
	 * @return the port
	 */
	public int getPort() {return port;}
	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {this.port = port;}
	
	public void setNodeInformation(Node node) {
		setIpAddress(node.getIpAddress());
		setMacAddress(node.getMacAddress());
	}
	
	public void setUserInformation(User user) {
		userName = user.getUserName();
		pin = user.getPin();
		networkId = user.getNetworkID();
	}
	
	
	public void setTransactionFields(Transaction transaction) {
		userName = getUserName();
		connection = transaction.getConnection();
		port = transaction.getPort();
		transactionDate = transaction.getDate();
		
	}
	
	


}
