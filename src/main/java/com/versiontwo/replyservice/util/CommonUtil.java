package com.versiontwo.replyservice.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CommonUtil {

    public static String reverseString(String input){
        if (input.length() <= 1) {
            return input;
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    public static String encoderMD5(String input) throws com.versiontwo.replyservice.exception.NoSuchAlgorithmException {
        String hashtext = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
                return hashtext;
            }
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new com.versiontwo.replyservice.exception.NoSuchAlgorithmException("Invalid algorithm");
        }
        return hashtext;
    }
}
