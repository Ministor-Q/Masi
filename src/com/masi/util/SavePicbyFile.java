package com.masi.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

import javax.imageio.ImageIO;

public class SavePicbyFile {

	public String save(File filepic, String filename) {
		// TODO Auto-generated method stub
		String path = "E://masi/pic/sy";
		File file =new File(path+"/"+filename);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		 
		  FileInputStream is=null;
		  FileOutputStream os=null;
		try {
			is = new FileInputStream(filepic);
			 byte []b=new byte[1024];
			  int i=is.read(b); 
			 os=new FileOutputStream(file);
			  while(i!=-1){
			   os.write(b, 0, b.length);
			   i=is.read(b, 0, b.length);
			  }
			  is.close();
				 os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		 
		
		return path+"/"+filename;
	}
	
	
}
