package com.bean;

import java.util.Date;

/**
 * 
 Create table log(
  Log_ID bigint identity  primary key,
  Student_ID bigint DEFAULT NULL ,
  Student_DomitoryID varchar(20) DEFAULT NULL,
  Student_Name varchar(20) DEFAULT NULL,
  Time DATETIME  DEFAULT NULL,
)
 *
 */
public class LogBean {

    private Long Log_ID ;
    private Long StudentID ;
    private String Student_DomitoryID;
    private String  Student_Name;
    private String Time;
    public LogBean(){
    	
    }
	public Long getLog_ID() {
		return Log_ID;
	}
	public void setLog_ID(Long log_ID) {
		Log_ID = log_ID;
	}
	
	public Long getStudentID() {
		return StudentID;
	}
	public void setStudentID(Long studentID) {
		StudentID = studentID;
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
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
    

}
