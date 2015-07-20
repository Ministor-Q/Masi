package com.masi.admin.logic;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.xmlbeans.impl.common.IOUtil;


import com.masi.admin.service.UploadService;
import com.masi.hibernate.Admin;
import com.masi.hibernate.Djgz;
import com.masi.hibernate.Jxgz;
import com.masi.hibernate.Kygz;
import com.masi.hibernate.Rcpy;
import com.masi.hibernate.Sy;
import com.masi.hibernate.Szdw;
import com.masi.hibernate.Xsgz;
import com.masi.hibernate.Xwgg;
import com.masi.hibernate.Xygk;
import com.masi.hibernate.Zyxz;
import com.masi.util.DataSource;
import com.masi.util.Doc2Html;
import com.masi.util.GetRandom;
import com.masi.util.HandlePicture;
import com.masi.util.SavePicbyFile;
import com.masi.util.Time;
import com.masi.util.getPinyinHeadChar;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Ministor_X
 * 
 */
public class UploadLogic extends ActionSupport {

	/**
	 * 第一级标题
	 */
	private String firstTitle;
	/**
	 * 第二级标题
	 */
	private String secondTitle;
	private String firstTitle1;
	private String secondTitle1;
	public String getFirstTitle1() {
		return firstTitle1;
	}

	public void setFirstTitle1(String firstTitle1) {
		this.firstTitle1 = firstTitle1;
	}

	public String getSecondTitle1() {
		return secondTitle1;
	}

	public void setSecondTitle1(String secondTitle1) {
		this.secondTitle1 = secondTitle1;
	}

	/**
	 * 上传文件
	 */
	private File upload;
	/**
	 * 上传文件名字（封装了名字加类型）
	 */
	private String uploadFileName;
	/**
	 * 上传文件类型（流式）
	 */
	private String uploadContentType;
	/**
	 * 关键词
	 */
	private String keyword;
	/**
	 * 首页上传图片
	 */
	private File uploadpic;
	/**
	 * 图片名字
	 */
	private String uploadpicFileName;
	/**
	 * 上传图片文件类型
	 */
	private String uploadpicContentType;
	
	private String nowtime;

	public String getNowtime() {
		return nowtime;
	}

	public void setNowtime(String nowtime) {
		this.nowtime = nowtime;
	}

	public File getUploadpic() {
		return uploadpic;
	}

	public void setUploadpic(File uploadpic) {
		this.uploadpic = uploadpic;
	}

	public String getUploadpicFileName() {
		return uploadpicFileName;
	}

	public void setUploadpicFileName(String uploadpicFileName) {
		this.uploadpicFileName = uploadpicFileName;
	}

	public String getUploadpicContentType() {
		return uploadpicContentType;
	}

	public void setUploadpicContentType(String uploadpicContentType) {
		this.uploadpicContentType = uploadpicContentType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	private UploadService uploadService;

	public String getFirstTitle() {
		return firstTitle;
	}

	public void setFirstTitle(String firstTitle) {
		this.firstTitle = firstTitle;
	}

	public String getSecondTitle() {
		return secondTitle;
	}

	public void setSecondTitle(String secondTitle) {
		this.secondTitle = secondTitle;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public UploadService getUploadService() {
		return uploadService;
	}

	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}

	@Override
	public String execute()  {
		try {
			save();
		} catch (IOException e) {
			e.printStackTrace();	
		} // 可直接在struts中直接映射到这个方法
		return "upload";
	}

	private Object save() throws IOException {
		String path ="";
		if(!firstTitle.equals("首页")){
			uploadpic=null;
		}
		if(uploadpic!=null){
		  //path = new HandlePicture().handlePic(uploadpic, uploadpicFileName);
			path =new SavePicbyFile().save(uploadpic, uploadpicFileName);
		}
		String loadName = uploadFileName.split("\\.")[0];
		String loadType = uploadFileName.split("\\.")[1];
		Timestamp loadtime = new Timestamp(System.currentTimeMillis());
		String user ="qwer"/*((Admin)((HttpSession)ServletActionContext.getRequest().getSession()).getAttribute("user")).getUsername()*/;
		long sjc = System.currentTimeMillis();
		String attri = firstTitle + "_" + secondTitle;
		String attri1 = firstTitle1 + "_" + secondTitle1;
		String secondContent = new getPinyinHeadChar()
				.getPinYinHeadChar(secondTitle);
		String addr = "";
		String addrtemp = "";
		String code1 = new DataSource().getCodeByTitle(attri);
		String code2 =new GetRandom().getRandomNumber();
		String addrtemp2 =loadName+".html";
		Timestamp nowTime =null;
		try{
			nowTime= new Timestamp(System.currentTimeMillis()).valueOf(nowtime+" 00:00:00");
		}catch (Exception e) {
			nowTime = loadtime;
		}
		
		if (compareFirstName("首页")) {
			addr = "E://masi/doc/sy/" + secondContent;
			String addrtemp1 ="E://masi/html/sy/" + secondContent;
			create(addrtemp1, addrtemp2);
			addrtemp = addrtemp1 + "/" +addrtemp2;
			String addrpic = "E://masi/pic/sy";
			code1 =new DataSource().getCodeByTitle(attri1);//重置
			Sy sy = new Sy(Integer.parseInt((String.valueOf(sjc)).substring(5,
					(String.valueOf(sjc)).length())), loadName, loadType,
					attri1, addr, addrtemp, nowTime, loadtime, keyword, path,
					null, 0, user, "00"+code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(sy);
			FileUtils
					.copyFile(upload, new File(sy.getSyaddr(), uploadFileName));
		} else if (compareFirstName("学院概况")) {
			addr = "E://masi/doc/xygk/" + secondContent;
			String addrtemp1 = "E://masi/html/xygk/" + secondContent;
			create(addrtemp1, addrtemp2);
			addrtemp = addrtemp1 + "/" +addrtemp2;
			Xygk xygk = new Xygk(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp,  nowTime, loadtime, 0, user,
					code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(xygk);
			FileUtils.copyFile(upload, new File(xygk.getXygkaddr(),
					uploadFileName));

		} else if (compareFirstName("教学工作")) {
			addr = "E://masi/doc/jxgz/" + secondContent;
			addrtemp = "E://masi/html/jxgz/" + secondContent + "/" + loadName
					+ ".html";
			Jxgz jxgz = new Jxgz(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp, nowTime, loadtime, keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(jxgz);

			FileUtils.copyFile(upload, new File(jxgz.getJxgzaddr(),
					uploadFileName));

		} else if (compareFirstName("科研工作")) {
			addr = "E://masi/doc/kygz/" + secondContent;
			String addrtemp1 = "E://masi/html/kygz/" + secondContent ;
			create(addrtemp1, addrtemp2);
			addrtemp =addrtemp1+"/"+addrtemp2;
			Kygz kygz = new Kygz(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp,  nowTime, loadtime, keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(kygz);
			FileUtils.copyFile(upload, new File(kygz.getKygzaddr(),
					uploadFileName));
		} else if (compareFirstName("人才培养")) {
			addr = "E://masi/doc/rcpy/" + secondContent;
			String addrtemp1 = "E://masi/html/rcpy/" + secondContent;
			create(addrtemp1, addrtemp2);
			addrtemp =addrtemp1+"/"+addrtemp2;
			Rcpy rcpy = new Rcpy(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp,  nowTime, loadtime, keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(rcpy);

			FileUtils.copyFile(upload, new File(rcpy.getRcpyaddr(),
					uploadFileName));

		} else if (compareFirstName("学生工作")) {
			addr = "E://masi/doc/xsgz/" + secondContent;
			String addrtemp1="E://masi/html/xsgz/" + secondContent;
			create(addrtemp1, addrtemp2);
			addrtemp = addrtemp1+"/"+addrtemp2;
			Xsgz xsgz = new Xsgz(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp,  nowTime, loadtime,keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(xsgz);

			FileUtils.copyFile(upload, new File(xsgz.getXsgzaddr(),
					uploadFileName));

		} else if (compareFirstName("新闻公告")) {
			addr = "E://masi/doc/xwgg/" + secondContent;
			String addrtemp1 = "E://masi/html/xwgg/" + secondContent;
			create(addrtemp1,addrtemp2);
			addrtemp =addrtemp1+"/"+addrtemp2;
			Xwgg xwgg = new Xwgg(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp, nowTime, loadtime, keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(xwgg);

			FileUtils.copyFile(upload, new File(xwgg.getXwggaddr(),
					uploadFileName));

		} else if (compareFirstName("党建工作")) {
			addr = "E://masi/doc/djgz/" + secondContent;
			String addrtemp1 = "E://masi/html/djgz/" + secondContent ;
			create(addrtemp1, addrtemp2);
			addrtemp =addrtemp1+"/"+addrtemp2;
			Djgz djgz = new Djgz(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp, nowTime, loadtime,keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(djgz);

			FileUtils.copyFile(upload, new File(djgz.getDjgzaddr(),
					uploadFileName));

		} /*else if (compareFirstName("师资队伍")) {
			addr = "E://masi/doc/szdw/" + secondContent;
			String addrtemp1 = "E://masi/html/szdw/" + secondContent ;
			create(addrtemp1, addrtemp2);
			addrtemp =addrtemp1+"/"+addrtemp2;
			Szdw szdw = new Szdw(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp,  nowTime, loadtime, keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(szdw);
			FileUtils.copyFile(upload, new File(szdw.getSzdwaddr(),
					uploadFileName));

		}*/ else if (compareFirstName("资源下载")) {
			addr = "E://masi/doc/zyxz/" + secondContent;
			String addrtemp1 = "E://masi/html/zyxz/" + secondContent ;
			create(addrtemp1, addrtemp2);
			addrtemp =addrtemp1+"/"+addrtemp2;
			Zyxz zyxz = new Zyxz(Integer.parseInt((String.valueOf(sjc))
					.substring(5, (String.valueOf(sjc)).length())), loadName,
					loadType, attri, addr, addrtemp,  nowTime, loadtime, keyword,
					0, user, code1+new Time().getYMDTime().replace("/", "")+code2);
			uploadService.setFile2Db(zyxz);
			FileUtils.copyFile(upload, new File(zyxz.getZyxzaddr(),
					uploadFileName));

		}
		try {
			if("doc".equals(loadType)){
			new Doc2Html().convert2Html(addr + "/" + loadName + "." + loadType,
					addrtemp,code1,code2);}
			else{
				return null;
			}
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

	private void create(String addrtemp1, String addrtemp2) {
		// TODO Auto-generated method stub
		File file =new File(addrtemp1);
		if(!file.exists()){
			file.mkdirs();
			file =new File(addrtemp1+"/"+addrtemp2);
			Boolean bool=false;
			try {
				bool = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(bool){
				System.out.println("创建成功");
			}else{
				System.out.println("创建失败");
			}
		}
	}

	

	private boolean compareFirstName(String name) {
		if (name.equals(firstTitle)) {
			return true;
		}
		return false;
	}

}
