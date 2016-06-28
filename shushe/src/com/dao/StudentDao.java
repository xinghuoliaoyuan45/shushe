package com.dao;

import com.db.DBHelper;
import com.bean.StudentBean;


import java.util.*;
import java.sql.*;

public class StudentDao {
	/**
	 * 查询所有学生封装成List<StudentBean>
	 * @return
	 * @throws Exception
	 */

	public List<StudentBean> GetAllList() throws Exception{
		String sql="select * from student";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<StudentBean> list=new ArrayList<StudentBean>();
		stat = conn.createStatement();
		rs = stat.executeQuery(sql);
		while(rs.next()){
			StudentBean cnbean=new StudentBean();
			cnbean.setStudent_ID(rs.getLong("Student_ID"));
			cnbean.setStudent_DomitoryID(rs.getString("Student_DomitoryID"));
			cnbean.setStudent_Name(rs.getString("Student_Name"));
			cnbean.setStudent_Tel(rs.getLong("Student_Tel"));
			list.add(cnbean);
		}
		conn.close();stat.close();
		rs.close();
		return list;
	}

	/**
	 * 通过stduent_id查询学生信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public StudentBean GetBeanByStudent_ID(Long id) throws Exception{
		String sql="select * from student where Student_ID="+id;
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		StudentBean cnbean=new StudentBean();
		stat = conn.createStatement();
		rs = stat.executeQuery(sql);
		if(rs.next()){
			cnbean.setStudent_ID(rs.getLong("Student_ID"));
			cnbean.setStudent_DomitoryID(rs.getString("Student_DomitoryID"));
			cnbean.setStudent_Name(rs.getString("Student_Name"));
			cnbean.setStudent_Tel(rs.getLong("Student_Tel"));
		}
		conn.close();stat.close();
		rs.close();
		return cnbean;
	}
	/**
	 * 获取某个宿舍的学生
	 * @param DomitoryID
	 * @return
	 * @throws Exception
	 */
	public List<StudentBean> GetBeanByDomitoryID(String DomitoryID)throws Exception{
		String sql="select * from student where Student_DomitoryID=";
			sql=sql+"'"+DomitoryID+"'";
			System.out.println(sql);
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<StudentBean> list=new ArrayList<StudentBean>();
		stat = conn.createStatement();
		rs = stat.executeQuery(sql);
		while(rs.next()){
			StudentBean cnbean=new StudentBean();
			cnbean.setStudent_ID(rs.getLong("Student_ID"));
			cnbean.setStudent_DomitoryID(rs.getString("Student_DomitoryID"));
			cnbean.setStudent_Name(rs.getString("Student_Name"));
			cnbean.setStudent_Tel(rs.getLong("Student_Tel"));
			list.add(cnbean);
		}
		conn.close();stat.close();
		rs.close();
		return list;
	}
	/**
	 * 根据学生名字模糊查询学生信息
	 * @param likename
	 * @return
	 * @throws Exception
	 */
	public List<StudentBean> GetBeanByStduentNameLike(String likename)throws Exception{
		Connection conn = new DBHelper().getConn();
		List<StudentBean> list=new ArrayList<StudentBean>();		
		String sql="select * from student where Student_Name like ?";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		System.out.println("qweqteqwrete");
		pstmt.setString(1,"%"+likename+"%");
		ResultSet rs=pstmt.executeQuery();	
		while(rs.next()){
			StudentBean cnbean=new StudentBean();
			cnbean.setStudent_ID(rs.getLong("Student_ID"));
			cnbean.setStudent_DomitoryID(rs.getString("Student_DomitoryID"));
			cnbean.setStudent_Name(rs.getString("Student_Name"));
			cnbean.setStudent_Tel(rs.getLong("Student_Tel"));
			list.add(cnbean);
		}
		conn.close();pstmt.close();
		rs.close();
		return list;
	}

	/**
	 * 添加学生
	 * @param cnbean
	 * @return
	 */
	//添加
	public Boolean Add(StudentBean cnbean)throws Exception{
		int row=0;
		String sql="insert into student (Student_ID,Student_DomitoryID,Student_Name,Student_Tel) values(?,?,?,?)";
		Connection conn = new DBHelper().getConn();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setLong(1,cnbean.getStudent_ID());
		pstmt.setString(2, cnbean.getStudent_DomitoryID());
		pstmt.setString(3, cnbean.getStudent_Name());
		pstmt.setLong(4,cnbean.getStudent_Tel());
		row=pstmt.executeUpdate();
		pstmt.close();conn.close();
		return row>0;		
	}
	//修改
	public void Update(StudentBean cnbean)throws Exception{
		int row=0;
		String sql="update student set Student_DomitoryID=? where Student_ID=?";
		Connection conn = new DBHelper().getConn();
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setLong(2,cnbean.getStudent_ID());
		pstmt.setString(1, cnbean.getStudent_DomitoryID());
		row=pstmt.executeUpdate();
		pstmt.close();conn.close();
	}
	//删除
	public void Delete(String strwhere)throws Exception{
		String sql="delete Student where ";
		sql=sql+"'"+strwhere+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		stat = conn.createStatement();
		stat.executeUpdate(sql);
		stat.close();conn.close();
	}

}

