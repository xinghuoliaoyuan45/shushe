package com.bean;
/**
 *
DROP TABLE IF EXISTS domitory;
CREATE TABLE domitory(
  Domitory_ID  varchar(10)  primary key,
  Domitory_Desc varchar(20) DEFAULT NULL, 
)
 *
 */
public class DomitoryBean {
    private String Domitory_ID ;
    private String Domitory_Desc ;
    public DomitoryBean(){
    	
    }
	public String getDomitory_ID() {
		return Domitory_ID;
	}
	public void setDomitory_ID(String domitory_ID) {
		Domitory_ID = domitory_ID;
	}
	public String getDomitory_Desc() {
		return Domitory_Desc;
	}
	public void setDomitory_Desc(String domitory_Desc) {
		Domitory_Desc = domitory_Desc;
	}
	
	
	

	
}
