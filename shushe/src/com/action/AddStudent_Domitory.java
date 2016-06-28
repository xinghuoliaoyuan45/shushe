package com.action;

import com.bean.StudentBean;
import com.dao.StudentDao;

public class AddStudent_Domitory {
	private Long stu_id;
	private String stu_shushe;
	private String stu_name;
	private Long stu_tel;



	public void setStu_id(Long stu_id) {
		this.stu_id = stu_id;
	}

	public void setStu_shushe(String stu_shushe) {
		this.stu_shushe = stu_shushe;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public void setStu_tel(Long stu_tel) {
		this.stu_tel = stu_tel;
	}
	public String execute(){
		StudentDao studao=new  StudentDao();
		StudentBean stu=new StudentBean();
		stu.setStudent_DomitoryID(stu_shushe);
		stu.setStudent_ID(stu_id);
		stu.setStudent_Name(stu_name);
		stu.setStudent_Tel(stu_tel);
		try {
			studao.Add(stu);
		} catch (Exception e) {
			return "error";
			
		}
		return "success";

	}
}
