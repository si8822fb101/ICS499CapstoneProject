/**
 * 
 */
package edu.ics499.fume.collections;


import java.util.LinkedList;




/**
 * @author marselos a. reed
 *
 */
public abstract class BlockChain<T> {
	private LinkedList<T> blockchain;
	private int height;  // refers to the size of the blockchain
	/**
	 * @param blockchain
	 * @param height
	 */
	
	
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean insert(T block) {
		return blockchain.add(block);
		
	}
	
	public boolean remove(T block) {
		return blockchain.remove(block);
		
	}
	
	public boolean retireveBlock(T block) {
		return false;
		
	}
	
	public T find(T block) {
		for(T object : blockchain) {
			if(object.equals(block)) return block;
		}
		return null;
		
	}
	
	public int height() {
		return blockchain.size();
		
	}
	
	
	

}
