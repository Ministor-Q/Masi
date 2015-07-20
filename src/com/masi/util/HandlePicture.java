package com.masi.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class HandlePicture {
	public String handlePic(File filepic,String filename) throws IOException{
		String path = "E://masi/pic/sy";
		File file =new File(path+"/"+filename);
		if(!file.exists()){
			file.mkdirs();
		}
		InputStream is =new FileInputStream(filepic);
		BufferedImage bi =new CompressPic().compressPic(is, 200, 200, true);
		//BufferedImage bi = ImageIO.read(is);
		//bi = bi.getSubimage(x, y, w, h);
		ImageIO.write(bi, "JPEG", file); 
		is.close();
		return path+"/"+filename;
		
		
	}

}
