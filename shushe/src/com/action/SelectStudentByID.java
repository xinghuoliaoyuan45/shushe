package com.action;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelectStudentByID extends ActionSupport{
	private Long id;
	
	public void setId(Long id) {
		this.id = id;
	}
	private StudentDao studentdao;
	public String  execute(){
		try {
			studentdao=new StudentDao();
//			System.out.println("QWQRewt");
			StudentBean stu=studentdao.GetBeanByStudent_ID(id);
			System.out.println(stu);
			ActionContext.getContext().getContextMap().put("students",stu);
		
			return "success";
			
		} catch (Exception e) {
			return "error";			
		}
		
		
	}

}
