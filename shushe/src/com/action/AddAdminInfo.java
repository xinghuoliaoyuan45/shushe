package com.action;

import java.util.List;

import com.bean.AdminBean;
import com.bean.StudentBean;
import com.dao.AdminDao;
import com.dao.StudentDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddAdminInfo extends ActionSupport{
	    private String Admin_Username ;
	    private String Admin_Password ;

		public void setAdmin_Username(String admin_Username) {
			Admin_Username = admin_Username;
		}
		public void setAdmin_Password(String admin_Password) {
			Admin_Password = admin_Password;
		}
		public String  execute(){
			try {
				AdminDao admindao=new AdminDao();
				AdminBean cnbean=new AdminBean();
				cnbean.setAdmin_Password(Admin_Password);
				cnbean.setAdmin_Username(Admin_Username);
				admindao.Add(cnbean);
				return "success";				
			} catch (Exception e) {
				return "error";			
			}
			
			
		}
	

}
