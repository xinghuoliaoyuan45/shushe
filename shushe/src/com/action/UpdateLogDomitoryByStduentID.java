package com.action;


import com.bean.LogBean;

import com.dao.LogDao;

import com.opensymphony.xwork2.ActionSupport;



public class UpdateLogDomitoryByStduentID extends ActionSupport{
	//private LogDao logdao;
	private String Student_DomitoryID;
	private Long Student_ID;
	public void setStudent_DomitoryID(String student_DomitoryID) {
		Student_DomitoryID = student_DomitoryID;
	}
	public void setStudent_ID(Long student_ID) {
		Student_ID = student_ID;
	}


	public String  execute(){
		try {
			LogBean logbean=new LogBean();
			logbean.setStudentID(Student_ID);
			logbean.setStudent_DomitoryID(Student_DomitoryID);
			LogDao logdao=new LogDao();
			logdao.Update(logbean);
			return "success";
			
		} catch (Exception e) {
			return "error";			
		}
	
	
	
	}
}
