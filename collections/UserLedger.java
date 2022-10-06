/**
 * 
 */
package edu.ics499.fume.collections;


import java.util.ArrayList;
import edu.ics499.fume.facade.Block;

/**
 * @authors Marselos A. Reed, Qaalib Farah, John Quinlan, Ayden Sinn, Mohamed A. Mohamoud 
 *
 */
public class UserLedger{
	private static ArrayList<Block> ledger;
	private Block top;
	private int count;
	/**
	 * @param -  list
	 * @param -  capacity
	 */
	public UserLedger() {
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
	
	public void insert(Block dataBlock) {
		if(dataBlock != null) {
			ledger.add(dataBlock);
			dataBlock = top;
			setCount(getCount() + 1);
		}
	
	}
	
	/**
	 * 
	 * @param dataBlock
	 * Node - is removed from the chain
	 * @return 
	 */
	
	public void remove(Block dataBlock) {
		for(int i = 0; i <= ledger.size(); i++) {
			if(ledger.contains(dataBlock)) {
				ledger.remove(dataBlock);
				setCount(getCount() - 1);
			}
		}
	}
	
	public void wipeNodes() {
		ledger.clear();
	}

	
	
	
	
	
	
}
