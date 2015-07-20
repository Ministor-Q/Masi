package com.masi.homepage.logic;

import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.codehaus.jackson.map.JsonSerializable;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONBuilder;
import net.sf.json.util.JSONUtils;

import com.masi.hibernate.Xwgg;
import com.masi.homepage.service.GetHomepageDataService;
import com.opensymphony.xwork2.ActionSupport;

public class GetHomepageDataLogic extends ActionSupport{
	private GetHomepageDataService getHomepageDataService;

	public GetHomepageDataService getGetHomepageDataService() {
		return getHomepageDataService;
	}

	public void setGetHomepageDataService(
			GetHomepageDataService getHomepageDataService) {
		this.getHomepageDataService = getHomepageDataService;
	}
	@Override
	public String execute() throws Exception {
		Map<String,List<Object>> msl = getHomepageDataService.queryHomepage();
		//StringWriter sw = new StringWriter();
		//JSONBuilder json =new JSONBuilder(sw);
		String str = packagemsl(msl);
		System.out.println(msl);
		HttpServletResponse resp =ServletActionContext.getResponse();
		 resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print(str);
		
		return null;
	}
	
	/**
	 * 将list打包成json
	 */
	private String  packagemsl(Map<String, List<Object>> msl) {
		/*List<Object> ltzgg = msl.get("tzgg");
		List<Object> lsy =msl.get("sy");
		List<Object> lcywj =msl.get("cywj");
		List<Object> lbjfc =msl.get("bjfc");
		List<Object> lxwkx =msl.get("xwkx");*/
		JSONObject json =new JSONObject();
		json.put("tzgg","\""+packageObject(msl.get("tzgg"))+"\"");
		json.put("sy","\""+packageObject(msl.get("sy"))+"\"");
		json.put("cywj","\""+packageObject(msl.get("cywj"))+"\"");
		json.put("bjfc","\""+packageObject(msl.get("bjfc"))+"\"");
		json.put("xwkx","\""+packageObject(msl.get("xwkx"))+"\"");
		System.out.println(System.currentTimeMillis()+"-----4-----------");
		//System.out.println(json.toString());
	
	return json.toString();
		
	}
	private JSONObject packageObject(List<Object> lo) {
		StringBuffer strbBuffer =new StringBuffer();
		JSONObject json =new JSONObject();
		JSONObject jsonObject =new JSONObject();
		try{
		for(int i=0;i<lo.size();i++){
			
			 jsonObject = JSONObject.fromObject(lo.get(i));
			 json.put(""+i, "\""+jsonObject.toString()+"\"");
			/*strbBuffer.append(jsonObject.toString());
			System.out.println(strbBuffer.toString());
			if(i==lo.size()-1){
				
			}else{
				strbBuffer.append(";");
			}*/
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return json;
		//System.out.println(strbBuffer.toString());
		//return strbBuffer.toString();
	}
	
	
}
