package com.action;
import com.bean.DomitoryBean;
import com.dao.DomitoryDao;
import com.opensymphony.xwork2.ActionSupport;
public class UpdateDomitoryDesc  extends ActionSupport {
	private String Domitory_ID;	
	private String desc;
	private DomitoryDao domitory;
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setDomitory_ID(String domitory_ID) {
		Domitory_ID = domitory_ID;
	}

	public String  execute(){
		try {
			DomitoryDao doms=new DomitoryDao();
			DomitoryBean cnbean=new DomitoryBean();
			cnbean.setDomitory_Desc(desc);
			cnbean.setDomitory_ID(Domitory_ID);
			doms.Update(cnbean);			
			return "success";		
		} catch (Exception e) {
			return "error";			
		}
		
		
	}
	

}
