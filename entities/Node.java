/**
 * 
 */
package edu.ics499.fume.entities;


/**
 * @author marselos a. reed, qaalib farah, john quinlan, ayden sinn, mohamed mahmoud
 *
 * NODE - Represents a user/device on the network
 * 
 */
public class Node extends User{
	private Node left, right;
	private String hash;
	/**
	 * @param left
	 * @param right
	 * @param hash
	 */
	public Node(Node left, Node right, String hash) {
		super("","");
		this.left = left;
		this.right = right;
		this.hash = hash;
	}
	/**
	 * @return the left
	 */
	public Node getLeft() {return left;}
	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {this.left = left;}
	/**
	 * @return the right
	 */
	public Node getRight() {return right;}
	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {this.right = right;}
	/**
	 * @return the hash
	 */
	public String getHash() {return hash;}
	/**
	 * @param hash the hash to set
	 */
	public void setHash(String hash) {this.hash = hash;}
	
	
 
	
	
	

}
