package com.bean;
/**
 * 
 * 
 CREATE TABLE student(
  Student_ID bigint  identity primary key,
  Student_DomitoryID varchar(20) DEFAULT NULL,
  Student_Name varchar(20) DEFAULT NULL,
  Student_Tel bigint DEFAULT NULL,
)
 *
 */
public class StudentBean {
	  private Long Student_ID; 
	  private String Student_DomitoryID;
	  private String Student_Name;
	  private Long Student_Tel;

	public StudentBean(){
		  
	  }
	public Long getStudent_ID() {
		return Student_ID;
	}
	public void setStudent_ID(Long student_ID) {
		Student_ID = student_ID;
	}
	public String getStudent_DomitoryID() {
		return Student_DomitoryID;
	}
	public void setStudent_DomitoryID(String student_DomitoryID) {
		Student_DomitoryID = student_DomitoryID;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public Long getStudent_Tel() {
		return Student_Tel;
	}
	public void setStudent_Tel(Long student_Tel) {
		Student_Tel = student_Tel;
	}
	  @Override
	public String toString() {
		return "StudentBean [Student_ID=" + Student_ID
				+ ", Student_DomitoryID=" + Student_DomitoryID
				+ ", Student_Name=" + Student_Name + ", Student_Tel="
				+ Student_Tel + "]";
	}
	  
	
}
