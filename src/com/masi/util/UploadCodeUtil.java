package com.masi.util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class UploadCodeUtil {

public static final String fileName = "uploadCode.txt";
	
	public static String uploadCode() throws Exception{
		
		Reader fs = null;
		Writer fos = null;
		String filepath="E://masi/tmp";
		File filetmp =new File(filepath);
		if(!filetmp.exists()){
			filetmp.mkdirs();
		}
		try{
			File file = new File(filepath+"/"+fileName);
			if(!file.exists()){
				file.createNewFile();
			}
			fs = new FileReader(file);
			char[] chars = new char[4];
			fs.read(chars);
			String oldCode = new String(chars);
			if(chars[0]==0)
				oldCode = "1001";
			int code = Integer.parseInt(oldCode);
			String newCode = "";
			if(code == 9999){
				code = 1001;
			}
			else{
				code += 1;
			}
			newCode += code;
			fos = new FileWriter(filepath+"/"+fileName,false);
			fos.write(newCode);
			fos.flush();
			return oldCode;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fs != null)
					fs.close();
				if(fos != null)
					fos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		return null;
	}
	
}
