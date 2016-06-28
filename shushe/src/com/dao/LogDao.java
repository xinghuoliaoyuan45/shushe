package com.dao;

import com.db.DBHelper;
import com.bean.LogBean;

import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.*;
import java.sql.Date;

public class LogDao {

	//获取列表
	public List<LogBean> GetList() throws Exception{
		String sql="select * from log";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<LogBean> list=new ArrayList<LogBean>();
		stat = conn.createStatement();
		rs = stat.executeQuery(sql);
		while(rs.next()){
			LogBean cnbean=new LogBean();
			cnbean.setLog_ID(rs.getLong("Log_ID"));
			cnbean.setStudentID(rs.getLong("Student_ID"));
			cnbean.setTime(rs.getString("Time"));
			cnbean.setStudent_DomitoryID(rs.getString("Student_DomitoryID"));
			cnbean.setStudent_Name(rs.getString("Student_Name"));
			list.add(cnbean);
		}
		conn.close();stat.close();
		rs.close();
		return list;
	}
	/**
	 * 某个学生的不归宿信息
	 * @return
	 * @throws Exception
	 */
	public List<LogBean> GetListByStduentID(Long id) throws Exception{
		String sql="select * from log where Student_ID=?";
		PreparedStatement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<LogBean> list=new ArrayList<LogBean>();
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		System.out.println("qwrhqiwfuh");
		pstmt.setLong(1,id);
		rs=pstmt.executeQuery();
		while(rs.next()){
			LogBean cnbean=new LogBean();
			cnbean.setLog_ID(rs.getLong("Log_ID"));
			cnbean.setStudentID(rs.getLong("Student_ID"));
			cnbean.setTime(rs.getString("Time"));
			cnbean.setStudent_DomitoryID(rs.getString("Student_DomitoryID"));
			cnbean.setStudent_Name(rs.getString("Student_Name"));
			list.add(cnbean);
		}
		pstmt.close();conn.close();rs.close();
		return list;
	}

	//添加
	public boolean Add(LogBean cnbean)  throws Exception{
		String sql="insert into log(Student_ID,Student_DomitoryID,Student_Name,Time)values (?,?,?,?)";
		Connection conn = new DBHelper().getConn();
		int row = 0;
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		System.out.println("QWEQR");
		pstmt.setLong(1,cnbean.getStudentID());
		pstmt.setString(2,cnbean.getStudent_DomitoryID());		
		pstmt.setString(3,cnbean.getStudent_Name());
		System.out.println("QWEQR");
		pstmt.setString(4,cnbean.getTime());
		
		row=pstmt.executeUpdate();
		pstmt.close();conn.close();
		return row>0;
	}
	//修改
	public boolean Update(LogBean cnbean)throws Exception{
		String sql="update log set Student_DomitoryID=?,Student_Name=?,Time=? where StudentID=?";
		int row = 0;
		Connection conn = new DBHelper().getConn();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setLong(4,cnbean.getStudentID());
		pstmt.setString(1,cnbean.getStudent_DomitoryID());
		pstmt.setString(2,cnbean.getStudent_Name());
		pstmt.setString(3, cnbean.getTime());
		row=pstmt.executeUpdate();
		pstmt.close();conn.close();
		return row>0;

	}
	//删除
	public void Delete(String strwhere)throws Exception{
		String sql="delete log where ";
		sql=sql+"'"+strwhere+"'";
		Connection conn = new DBHelper().getConn();
		Statement state=conn.createStatement();
		state.executeUpdate(sql);
		conn.close();state.close();
	}	
}

