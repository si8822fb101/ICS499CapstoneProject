/**
 * 
 */
package edu.ics499.fume.hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


/**
 * @author marselos a. reed, qaalib farah, john quinlan, ayden sinn, mohamed mahmoud
 * CLASS implements a single method that generates a nodes hash value
 */
public class Hashing {

	public static String hashCreation(String input) {
		String encodedData = "";
		try {
			MessageDigest digest = MessageDigest.getInstance("Sha-256");
			byte[] hashArray = digest.digest(input.getBytes(StandardCharsets.UTF_8));
			encodedData = Base64.getEncoder().encodeToString(hashArray);
		} catch (NoSuchAlgorithmException e) {
		}
	
		return new String(encodedData);
	
	}

}
