package com.masi.homepage.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;

import sun.misc.BASE64Encoder;

import com.masi.hibernate.Sy;
import com.masi.homepage.dao.GetHomepageDataDao;
import com.masi.util.CompressPic;
import com.mysql.fabric.xmlrpc.base.Data;

public class GetHomepageDataService {
	
	private GetHomepageDataDao getHomepageDataDao;

	public GetHomepageDataDao getGetHomepageDataDao() {
		return getHomepageDataDao;
	}

	public void setGetHomepageDataDao(GetHomepageDataDao getHomepageDataDao) {
		this.getHomepageDataDao = getHomepageDataDao;
	}

	public Map<String,List<Object>> queryHomepage() {
		Map<String,List<Object>> msl =new HashMap<String,List<Object>>();
		String sqlXwkx = "from Xwgg xwgg where xwgg.xwggattri ='新闻公告_新闻快讯' order by xwgg.xwggloadtime desc ";
		String sqlBjfc = "from Xsgz xsgz where xsgz.xsgzattri ='学生工作_班级风采' order by xsgz.xsgzloadtime desc ";
		String sqlCywj = "from Zyxz zyxz where zyxz.zyxzattri ='资源下载_常用文件' order by zyxz.zyxzloadtime desc";
		String sqlSy =	 "from Sy sy order by sy.syloadtime desc ";
		String sqlTzgg = "from Xwgg xwgg where xwgg.xwggattri ='新闻公告_通知公告' order by xwgg.xwggloadtime desc ";
		List lsTzgg = getHomepageDataDao.queryHomepage(sqlTzgg,5);
		List lsXwkx = getHomepageDataDao.queryHomepage(sqlXwkx,9);
		List lsSy =  syDataHandler(sqlSy);
		List lsCywj = getHomepageDataDao.queryHomepage(sqlCywj,9);
		List lsBjfc = getHomepageDataDao.queryHomepage(sqlBjfc,5);

		msl.put("tzgg", lsTzgg);
		msl.put("xwkx", lsXwkx);
		msl.put("sy", lsSy);
		msl.put("bjfc",lsBjfc);
		msl.put("cywj",lsCywj);
		return msl;
	}
	
	public List<Object> syDataHandler(String sql){
		 System.out.println(System.currentTimeMillis()+"-----0-----------");
		List<Object> syList = getHomepageDataDao.queryHomepage(sql,6);
		try{
			for(int i = 0; i < syList.size(); i++){
				Sy sy = (Sy)syList.get(i);
				String imageUrl = sy.getSypicaddr();
				StringBuffer sb = new StringBuffer();
				InputStream input = new FileInputStream(new File(imageUrl));
				//System.out.println(input.available());
				  ByteArrayOutputStream bto =new ByteArrayOutputStream();
				  //CompressPic compress =new CompressPic();
				  BufferedImage img = null;
				  System.out.println(System.currentTimeMillis()+"-----1-----------");
				 img = ImageIO.read(input);
				 // img = compress.compressPic(input, 690, 370, false);
				  ImageIO.write(img, "jpeg", bto);
				  byte[] data = null;
				  data =bto.toByteArray();
				  System.out.println(data.length);
				  System.out.println(System.currentTimeMillis()+"-----2-----------");
				  BASE64Encoder base64 =new BASE64Encoder();
				  sy.setSypiccode(base64.encode(data));
				  System.out.println(System.currentTimeMillis()+"-----3-----------");

				/*byte[] imageBytes = new byte[input.available()];
				input.read();
				if(imageBytes.length > 0){
					BASE64Encoder encoder = new BASE64Encoder();
					//sy.setSypiccode(encoder.encode(imageBytes));
					
				}*/
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return syList;
	}

	/* InputStream is = null;
     String ftpcontent = "";
     byte[] data = null;
     ByteArrayOutputStream bto = null;
     InputStream compressIs = null;
     //  将流转化为字符串
     try {
         if (StringUtils.isBlank((String) lm.get(i).get("lj"))) {
             continue;
         }
         is = StoreServiceUtil.getStoreService().getInputStream(
             (String) lm.get(i).get("lj"));
         bto = new ByteArrayOutputStream();
         CompressPic temp = new CompressPic();
         BufferedImage img = null;
         if ("1".equals(lm.get(i).get("type").toString())) {
             img = temp.compressPic(is, 87, 55, false);
         } else if ("2".equals(lm.get(i).get("type").toString())) {
             img = temp.compressPic(is, 40, 55, false);

         }//100,100可不需要，当最后一个变量为true时，图片是等比缩放
         if (img == null) {
             logger.info("缩放图片失败");
             return null;
         }
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ImageIO.write(img, "bmp", baos);
         data = baos.toByteArray();
         ftpcontent = Base64.encode(data);*/
	
}
