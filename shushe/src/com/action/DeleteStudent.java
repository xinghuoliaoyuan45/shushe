package com.action;

import com.dao.StudentDao;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteStudent extends ActionSupport{
	private StudentDao stduentdao;
	private Long stu_id;
	public void setStu_id(Long stu_id) {
		this.stu_id = stu_id;
	}
	public String execute(){
		stduentdao=new StudentDao();
		String strwhere="Student_ID="+stu_id;
		try {
			stduentdao.Delete(strwhere);
		} catch (Exception e) {
			return "error";		
		
		}
		return "success";
		
	}
	

}
