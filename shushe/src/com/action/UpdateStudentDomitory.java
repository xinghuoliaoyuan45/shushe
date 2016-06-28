package com.action;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateStudentDomitory extends ActionSupport{
	public Long stu_id;
	public String stu_shushe;
	public void setStu_id(Long stu_id) {
		this.stu_id = stu_id;
	}
	public void setStu_shushe(String stu_shushe) {
		this.stu_shushe = stu_shushe;
	}
	public String execute(){
		StudentDao studentdao=new StudentDao();
		StudentBean stu=new StudentBean();
		stu.setStudent_DomitoryID(stu_shushe);
		stu.setStudent_ID(stu_id);
		try {
			studentdao.Update(stu);
		} catch (Exception e) {
		   return "error";
		}
		return "success";
	}
}
