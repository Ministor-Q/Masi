package com.masi.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;

import sun.misc.BASE64Encoder;

public class GetPicBase64ByPath {
	public  String getPicBase64(String path) {
		
		StringBuffer sb = new StringBuffer();
		InputStream input=null;
		try {
			input = new FileInputStream(new File(path));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println(input.available());
		  ByteArrayOutputStream bto =new ByteArrayOutputStream();
		  //CompressPic compress =new CompressPic();
		  BufferedImage img = null;
		  System.out.println(System.currentTimeMillis()+"-----1-----------");
		 try {
			img = ImageIO.read(input);
			 ImageIO.write(img, "jpeg", bto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 // img = compress.compressPic(input, 690, 370, false);
		 
		  byte[] data = null;
		  data =bto.toByteArray();
		  System.out.println(data.length);
		  System.out.println(System.currentTimeMillis()+"-----2-----------");
		  BASE64Encoder base64 =new BASE64Encoder();
		  
		
		
		//
		return base64.encode(data);
	}
}
