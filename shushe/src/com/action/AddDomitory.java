package com.action;


import com.bean.DomitoryBean;
import com.dao.DomitoryDao;
import com.opensymphony.xwork2.ActionSupport;

public class AddDomitory extends ActionSupport{
	private String Domitory_ID ;
	private String Domitory_Desc ;
	public void setDomitory_ID(String domitory_ID) {
		Domitory_ID = domitory_ID;
	}
	public void setDomitory_Desc(String domitory_Desc) {
		Domitory_Desc = domitory_Desc;
	} 
	public String execute(){
		try {
			DomitoryBean domitory=new DomitoryBean();
			domitory.setDomitory_Desc(Domitory_Desc);
			domitory.setDomitory_ID(Domitory_ID);
			DomitoryDao donmdao=new DomitoryDao();
			donmdao.add(domitory);
			return "success";
		} catch (Exception e) {
			return "error";
		}
	}


}
