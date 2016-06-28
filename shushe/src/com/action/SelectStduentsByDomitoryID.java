package com.action;

import java.util.List;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelectStduentsByDomitoryID  extends ActionSupport{
	private StudentDao studentdao;
	private String  domitory_id;
	public void setDomitory_id(String domitory_id) {
		this.domitory_id = domitory_id;
	}
	public String  execute(){
		try {
			studentdao=new StudentDao();
			System.out.println(domitory_id);
			List<StudentBean> stus=studentdao.GetBeanByDomitoryID(domitory_id);
			
			ActionContext.getContext().getContextMap().put("students", stus);
			return "success";
			
		} catch (Exception e) {
			return "error";			
		}
		
		
	}

}
