/**
 * 
 */
package edu.ics499.fume.collections;


import java.util.ArrayList;

import edu.ics499.fume.entities.Node;


/**
 * @authors Marselos A. Reed, Qaalib Farah, John Quinlan, Ayden Sinn, Mohamed A. Mohamoud 
 *
 */
public class NodeList{
	private static ArrayList<Node> ledger;
	private Node head;
	private int count;
	/**
	 * @param -  list
	 * @param -  capacity
	 */
	public NodeList() {
		ledger = new ArrayList<>();
		this.setCount(0);
	
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/** 
	 * 
	 * @param dataBlock
	 * Node - is added to the chain
	 * @return 
	 */
	
	public void insert(Node device) {
		if(device != null) {
			ledger.add(device);
			device = head;
			setCount(getCount() + 1);
		}
	
	}
	
	/**
	 * 
	 * @param dataBlock
	 * Node - is removed from the chain
	 * @return 
	 */
	
	public void remove(Node device) {
		for(int i = 0; i <= ledger.size(); i++) {
			if(ledger.contains(device)) {
				ledger.remove(device);
				setCount(getCount() - 1);
			}
		}
	}
	
	public void wipeNodes() {
		ledger.clear();
	}

	
	
	
	
	
	
}
