/**
 * 
 */
package edu.ics499.fume.collections;


import java.util.ArrayList;
import java.util.List;

import edu.ics499.fume.entities.Node;



/**
 * @authors Marselos A. Reed, Qaalib Farah, John Quinlan, Ayden Sinn, Mohamed A. Mohamoud 
 *
 */
public class NodeList{
	private static NodeList userList;
	private List <Node> ledger = new ArrayList<Node>();
	private Node head;
	private int count;
	/**
	 * @param -  list
	 * @param -  capacity
	 */
	


	public static NodeList getInstance() {
		try {
			if (userList == null) {
				return userList = new NodeList();
			}
		} catch (Exception e) {
			return null;
		}
		return userList;
	}
	
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
	
	public boolean insert(Node device) {
		if(device != null) {
			ledger.add(device);
			device = head;
			setCount(getCount() + 1);
		}
		return(ledger.add(device));
	}
	
	/**
	 * 
	 * @param dataBlock
	 * Node - is removed from the chain
	 * @return 
	 */
	
	public boolean remove(Node device) {
		for(int i = 0; i <= ledger.size(); i++) {
			if(ledger.contains(device)) {
				ledger.remove(device);
				setCount(getCount() - 1);
				return ledger.remove(device);
			}
		}
		return false;
	}
	
	public void wipeNodes() {
		ledger.clear();
	}

	
	
	
	
	
	
}
