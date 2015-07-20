package com.masi.test;

import java.security.MessageDigest;

import org.junit.Test;

public class CipherUtil {

//userpwd = CipherUtil.generatePassword(userpwd);
	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
	
	public static String generatePassword(String inputString){
		return encodeByMd5(inputString);
	}
	
	public static boolean validatePassword(String password, String inputString){
		
		if(password.equals(encodeByMd5(inputString))){
			return true;
		}else{
			return false;
		}
		
	}
	
	private static String encodeByMd5(String originString){
		if(originString != null){
			try{
				MessageDigest md = MessageDigest.getInstance("MD5");
				byte[] results = md.digest(originString.getBytes());
				String resultString = byteArrayToHexString(results);
				return resultString.toUpperCase();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private static String byteArrayToHexString(byte[] b){
		StringBuffer resultSb = new StringBuffer();
		for(int i = 0; i < b.length; i++){
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}
	
	private static String byteToHexString(byte b){
		int n = b;
		if(n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}
	@Test
	public void test(){
	System.out.println(generatePassword("stxywangluobu"));
	
	}
	
	
}
