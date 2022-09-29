/**
 * 
 */
package edu.ics499.fume.collections;


import java.util.LinkedList;

import edu.ics499.fume.facade.Block;

/**
 * @authors Marselos A. Reed, Qaalib Farah, John Quinlan, Ayden Sinn, Mohamed A. Mohamoud 
 *
 */
public class NodeList{
	private static LinkedList<Block> nodeList;
	private Block top, tip;
	private int capacity;
	/**
	 * @param list
	 * @param capacity
	 */
	public NodeList(LinkedList<Block> nodeList, int capacity) {
		NodeList.nodeList = nodeList;
		this.setCapacity(capacity);
	}
	/**
	 * @return the list
	 */
	/**
	 * @return the top
	 */
	public Block getTop() {return top;}
	/**
	 * @param top the top to set
	 */
	public void setTop(Block top) {this.top = top;}
	/**
	 * @return the tip
	 */
	public Block getTip() {return tip;}
	/**
	 * @param tip the tip to set
	 */
	public void setTip(Block tip) {this.tip = tip;}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {return capacity;}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {this.capacity = capacity;}
	
	/** 
	 * 
	 * @param node
	 * Node - is added to the chain
	 * @return 
	 */
	
	public boolean insert(Block node) {
		boolean flag = false;
		if(node != null) {
			nodeList.add(node);
			node = top;
			++capacity;
			flag = true;
		}
		flag = false;
		return flag;
		

	}
	
	/**
	 * 
	 * @param node
	 * Node - is removed from the chain
	 * @return 
	 */
	
	public boolean remove(Block node) {
		return nodeList.remove(node);
	}
	
	
	
	
	
	
	
}
