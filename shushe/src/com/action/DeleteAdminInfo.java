package com.action;
import com.bean.AdminBean;
import com.dao.AdminDao;

public class DeleteAdminInfo {
	private String  Admin_Username ;
	public void setAdmin_Username(String admin_Username) {
		Admin_Username = admin_Username;
	}

	public String  execute(){
		try {
			AdminDao admindao=new AdminDao();
			String strwhere="Admin_Username="+Admin_Username;
			admindao.Delete(strwhere);
			return "success";				
		} catch (Exception e) {
			return "error";			
		}
	}
}

