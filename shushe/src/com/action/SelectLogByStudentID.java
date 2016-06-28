package com.action;

import java.util.List;

import com.bean.LogBean;
import com.dao.LogDao;
import com.opensymphony.xwork2.ActionContext;

public class SelectLogByStudentID {
	private Long id;
	public void setId(Long id) {
		this.id = id;
	}
	public String  execute(){
		LogDao logdao=new LogDao();
		System.out.println(id);
		try{
			List<LogBean> logs=logdao.GetListByStduentID(id);
			ActionContext.getContext().getContextMap().put("Logs", logs);
			return "success";		
		} catch (Exception e) {
			return "error";			
		}

	}
}
