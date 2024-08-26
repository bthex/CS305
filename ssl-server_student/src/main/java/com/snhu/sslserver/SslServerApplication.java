package com.snhu.sslserver;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController{   
    private StringBuilder myHash(String data) throws NoSuchAlgorithmException {
    	
    	
        /**
         * Creates a new instance of the MessageDigest class with the SHA-256 algorithm.
         *
         * @return the MessageDigest object with the SHA-256 algorithm
         * @throws NoSuchAlgorithmException if the SHA-256 algorithm is not available
         */
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashArray = md.digest(data.getBytes(StandardCharsets.UTF_8));
        return ArrayToHex(hashArray);         
    }
    
    /**
     * Converts an array of bytes to a hexadecimal representation.
     * 
     * @param arrayOfBytes the array of bytes to be converted
     * @return a StringBuilder object representing the hexadecimal representation of the input array
     */
    private StringBuilder ArrayToHex(byte[] arrayOfBytes) {

        
        BigInteger number = new BigInteger(1, arrayOfBytes);
        StringBuilder hashString = new StringBuilder(number.toString(16));
        
        while (hashString.length() < 64)
        {
            hashString.insert(0, '0');
        }
        return hashString;
    }
        
    /**
     * Calculates the SHA256 hash of a given string.
     *
     * @return The SHA256 hash of the string.
     * @throws NoSuchAlgorithmException If the SHA256 algorithm is not available.
     */
    @RequestMapping("/hash")
    public String showMyHash() throws NoSuchAlgorithmException {
        String data = "Bret Thex Check Sum!";
        StringBuilder hashOut = myHash(data);
        return "<p>data : " + data + "<br>" + "<br>" + "SHA256 " + " : " + hashOut;
    }
}