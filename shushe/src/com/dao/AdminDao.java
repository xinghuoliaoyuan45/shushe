package com.dao;

import com.db.DBHelper;
import com.bean.AdminBean;

import java.util.*;
import java.sql.*;
/**
 * 
 * Admin表的curd
 *
 */
public class AdminDao {

	/**
	 * 
	 * @param username
	 * @param password
	 * @return Admin_ID
	 */
	public int CheckLogin(String username, String password) throws Exception{
		int id = 0;
		String sql="select * from Admin where Admin_Username='"+username+"' and Admin_Password='"+password+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		stat = conn.createStatement();
		rs = stat.executeQuery(sql);
		while (rs.next()) {
			id = rs.getInt("Admin_ID");
		}

		return id;
	}
	/***
	 * 验证是否有密码 和ID是否正确
	 * @param id
	 * @param password
	 * @return boolean
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public boolean CheckPassword(String id, String password) throws ClassNotFoundException, SQLException{
		boolean ps = false;
		String sql="select * from Admin where Admin_ID='"+id+"' and Admin_Password='"+password+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		stat = conn.createStatement();
		rs = stat.executeQuery(sql);
		while (rs.next()) {
			ps=true;
		}
		stat.close();rs.close();conn.close();
		return ps;
	}



	//添加
	public void Add(AdminBean cnbean) throws ClassNotFoundException, SQLException{
		String sql="insert into admin (";
		sql+="Admin_Username,Admin_Password";
		sql+=") values(";
		sql+="'"+cnbean.getAdmin_Username()+"','"+cnbean.getAdmin_Password()+"'";
		sql+=")";
		Statement stat = null;
		Connection conn = new DBHelper().getConn();
		stat = conn.createStatement();
		stat.executeUpdate(sql);
		stat.close();conn.close();
	}
	//修改
	public void Update(AdminBean cnbean) throws ClassNotFoundException, SQLException{
		String sql="update Admin set ";
		sql+="Admin_Username='"+cnbean.getAdmin_Username()+"',";
		sql+="Admin_Password='"+cnbean.getAdmin_Password()+"',";
		sql+=" where Admin_ID='"+cnbean.getAdmin_ID()+"'";
		Statement stat = null;
		Connection conn = new DBHelper().getConn();
		stat = conn.createStatement();
		stat.executeUpdate(sql);
		stat.close();conn.close();
	}
	//删除
	public void Delete(String strwhere) throws ClassNotFoundException, SQLException{
		String sql="delete Admin where ";
		sql=sql+"'"+strwhere+"'";
		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		stat = conn.createStatement();
		stat.executeUpdate(sql);
		stat.close();conn.close();
	}
}

