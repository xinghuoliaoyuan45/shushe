package com.action;

import java.util.Date;

import com.bean.AdminBean;
import com.bean.LogBean;
import com.dao.AdminDao;
import com.dao.LogDao;

public class AddLogInfo {
	//private LogDao logdao;
	private Long Log_StudentID;
	private String Student_DomitoryID;
	private String  Student_Name;
	private String Time;

	public void setLog_StudentID(Long log_StudentID) {
		Log_StudentID = log_StudentID;
	}
	public void setStudent_DomitoryID(String student_DomitoryID) {
		Student_DomitoryID = student_DomitoryID;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public void setTime(String time) {
		Time = time;
	}

	public String  execute(){
		try {
			
			LogDao logdao=new LogDao();
			LogBean log=new LogBean();
			System.out.println(Log_StudentID+Student_DomitoryID+Student_Name+Time);
			log.setStudentID(Log_StudentID);
			log.setStudent_DomitoryID(Student_DomitoryID);
			log.setStudent_Name(Student_Name);
			log.setTime(Time);
			//System.out.println("QWTRQ");
			logdao.Add(log);
			return "success";				
		} catch (Exception e) {
			return "error";			
		}


	}

}
