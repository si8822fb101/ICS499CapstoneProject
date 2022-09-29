/**
 * 
 */
package edu.ics499.fume.facade;

import java.util.Calendar;

/**
 * @author marselos a. reed
 * 
 * BLOCK - Represents a block in a blockchain using a hash tree 
 *
 */
public abstract class Block {
	private Integer hash;
	private static Block top, left, right;
	private static Calendar temporal;
	
	/**
	 * @param hash
	 * @param temporal
	 */
	public Block(Block top,Integer hash, Calendar temporal) {
		this.setTop(top);
		this.hash = hash.hashCode();
		this.setTemporal(Calendar.getInstance());
	}
	/**
	 * @return the hash
	 */
	public Integer getHash() {return hash;}
	/**
	 * @return the top
	 */
	public Block getTop() {return top;}
	/**
	 * @param top the top to set
	 */
	public void setTop(Block top) {Block.top = top;}
	/**
	 * @return the left
	 */
	public static Block getLeft() {return left;}
	/**
	 * @param left the left to set
	 */
	public static void setLeft(Block left) {Block.left = left;}
	/**
	 * @return the right
	 */
	public static Block getRight() {return right;}
	/**
	 * @param right the right to set
	 */
	public static void setRight(Block right) {Block.right = right;}
	/**
	 * @return the temporal
	 */
	public Calendar getTemporal() {return temporal;}
	/**
	 * @param temporal the temporal to set
	 */
	public void setTemporal(Calendar temporal) {Block.temporal = temporal;}
	
	
	

}


