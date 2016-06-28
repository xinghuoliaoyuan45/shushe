package com.action;

import com.dao.LogDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteLog extends ActionSupport{
	//private LogDao logdao;
	private String stuname;

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String execute(){
		LogDao logdao= new LogDao();
		try {
			String strwhere="Student_Name="+stuname;
			logdao.Delete(strwhere);
			return "success";
		} catch (Exception e) {
		   return "error";
		}		
	}
	
}
