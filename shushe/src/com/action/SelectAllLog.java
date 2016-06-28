package com.action;

import java.util.List;

import com.bean.LogBean;
import com.dao.LogDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelectAllLog extends ActionSupport {
	public String  execute(){
		LogDao logdao=new LogDao();
		try{
			List<LogBean> logs=logdao.GetList();
			ActionContext.getContext().getContextMap().put("Logs", logs);
			return "success";		
		} catch (Exception e) {
			return "error";			
		}
	}
}
