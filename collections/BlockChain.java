/**
 * 
 */
package edu.ics499.fume.collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import edu.ics499.fume.entities.Node;
import edu.ics499.fume.hash.Hashing;




/**
 * @author marselos a. reed , qaalib farah, john quinlan, ayden sinn, mohamed mahmoud
 * Blockchain Class - Implemented by using a Merkle/Binary Tree
 */
public class BlockChain {
	
	public static Node treeGenerator(ArrayList<String> blocks) {
		ArrayList<Node> leafs = new ArrayList<>();
		
		for(String data : blocks) leafs.add(new Node(null, null, Hashing.hashCreation(data)));
		return treeBuilder(leafs);
	}
	
	private static Node treeBuilder(ArrayList<Node> chain) {
		ArrayList<Node> vertexs = new ArrayList<>();
		
		while(chain.size() != 1) {
			int index = 0, height = chain.size();
			while(index < height) {
				Node left = chain.get(index);
				Node right = null;
				
				if((index + 1) < height) {
					right = chain.get(index + 1);
				} else {
					right = new Node(null, null, left.getHash());
				}
				
				String vertexHash = Hashing.hashCreation(left.getHash() + right.getHash());
				vertexs.add(new Node(left, right, vertexHash));
				index +=2;
				
			}
			chain = vertexs;
			vertexs = new ArrayList<>();
		}
		return chain.get(0);
	}
	
	public static void showBlockchain(Node genesis) {
		if(genesis == null)return;
		if((genesis.getLeft() == null && genesis.getRight() == null)) System.out.println(genesis.getHash());
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(genesis);
		queue.add(null);
		
		while(!queue.isEmpty()) {
			Node cursor = queue.poll();
			if(cursor != null) System.out.println(cursor.getHash());
			else {
				if(!queue.isEmpty()) queue.add(null);
			}
			if(cursor != null && cursor.getLeft() != null) queue.add(cursor.getLeft());
			if(cursor != null && cursor.getRight() != null) queue.add(cursor.getRight());
		}
		
		
		
	}
	

}
