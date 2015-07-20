package com.masi.util;

public class GetRandom {
	public static int i =0;
	
	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		GetRandom.i = i;
	}

	public String getRandomNumber() {
		try {
			return UploadCodeUtil.uploadCode();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	/* private  String getRandom() 
	 {
		 return ((int) ((Math.random() * 100) % 10))+""; 
	 }*/
}
