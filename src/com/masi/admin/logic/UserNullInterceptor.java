package com.masi.admin.logic;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class UserNullInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("进入拦截器！");
		 Map<String, Object>  session=invocation.getInvocationContext().getSession();
		if(session.get("user")== null){
			return Action.LOGIN;
		}
		return invocation.invoke();
	}

	

}
