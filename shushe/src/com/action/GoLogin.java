package com.action;

import java.util.ResourceBundle;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.*;
import com.bean.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GoLogin extends ActionSupport {

	//������Action�����ڷ�װ�û��������������
	private String Admin_Username;
	private String Admin_Password;


	public void setAdmin_Username(String admin_Username) {
		Admin_Username = admin_Username;
	}


	public void setAdmin_Password(String admin_Password) {
		Admin_Password = admin_Password;
	}


	//�����û������execute����
	public String execute(){

		ResourceBundle rb = ResourceBundle.getBundle("Root");
		String mastername = rb.getString("master");
		String matserpassword = rb.getString("masterpassword");
		if(Admin_Username.toString().equals(mastername)&&Admin_Password.equals(matserpassword))
		{
			return "success1";//������Adminҳ��		
		}
		AdminDao admindao=new AdminDao();
		try {
			int id=admindao.CheckLogin(Admin_Username, Admin_Password);
			ActionContext.getContext().getContextMap().put("AdminId", id);
		} catch (Exception e) {
			return "error";
		}
		return "success";		
	}
}
