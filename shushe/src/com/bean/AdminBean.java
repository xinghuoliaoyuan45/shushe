package com.bean;
/**
 * 
CREATE TABLE admin (
  Admin_ID int identity primary key,
  Admin_Username varchar(20) DEFAULT NULL,
  Admin_Password varchar(20) DEFAULT NULL,
)
 *
 */
public class AdminBean {

    private int Admin_ID ;
    private String Admin_Username ;
    private String Admin_Password ;
   public AdminBean(){
    	
    }
	public int getAdmin_ID() {
		return Admin_ID;
	}
	public void setAdmin_ID(int admin_ID) {
		Admin_ID = admin_ID;
	}
	public String getAdmin_Username() {
		return Admin_Username;
	}
	public void setAdmin_Username(String admin_Username) {
		Admin_Username = admin_Username;
	}
	public String getAdmin_Password() {
		return Admin_Password;
	}
	public void setAdmin_Password(String admin_Password) {
		Admin_Password = admin_Password;
	}
    
}