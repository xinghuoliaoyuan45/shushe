package com.action;

import java.util.List;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.opensymphony.xwork2.ActionContext;

public class SelectStudentByNameLike {
	private String namelike;
	
	public void setNamelike(String namelike) {
		this.namelike = namelike;
	}

	private StudentDao studentdao;
	public String  execute(){
		try {
			studentdao=new StudentDao();
			List<StudentBean> stu=studentdao.GetBeanByStduentNameLike(namelike);
			ActionContext.getContext().getContextMap().put("students", stu);
			return "success";
			
		} catch (Exception e) {
			return "error";			
		}
		
		
	}

}
