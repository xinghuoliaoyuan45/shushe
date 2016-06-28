package com.dao;
import com.db.DBHelper;
import com.bean.DomitoryBean;

import java.util.*;
import java.sql.*;

public class DomitoryDao {


	public List<DomitoryBean> GetList(String strwhere,String strorder) throws Exception{
		String sql="select * from domitory";

		Statement stat = null;
		ResultSet rs = null;
		Connection conn = new DBHelper().getConn();
		List<DomitoryBean> list=new ArrayList<DomitoryBean>();

		stat = conn.createStatement();
		rs = stat.executeQuery(sql);
		while(rs.next()){
			DomitoryBean cnbean=new DomitoryBean();
			cnbean.setDomitory_ID(rs.getString("Domitory_ID"));
			cnbean.setDomitory_Desc(rs.getString("Domitory_Desc"));				
			list.add(cnbean);
		}
		conn.close();stat.close();
		rs.close();
		return list;
	}
	public boolean add(DomitoryBean cnbean) throws Exception{
		Connection conn = new DBHelper().getConn();
		int row = 0;
		String sql="insert into domitory(Domitory_ID,Domitory_Desc)values (?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,cnbean.getDomitory_ID());
		pstmt.setString(2,cnbean.getDomitory_Desc());
		row=pstmt.executeUpdate();
		pstmt.close();conn.close();
		return row>0;	
	}


	//ÐÞ¸Ä
	public void Update(DomitoryBean cnbean)  throws Exception{
		Connection conn = new DBHelper().getConn();
		String sql="update domitory set Domitory_Desc=? where Domitory_ID=?"; 
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(2,cnbean.getDomitory_ID());
		pstmt.setString(1,cnbean.getDomitory_Desc());
		pstmt.executeUpdate();
		pstmt.close();conn.close();

	}
	//É¾³ý
	public void Delete(String strwhere) throws Exception{
		String sql="delete domitory where ";
		sql=sql+"'"+strwhere+"'";
		Connection conn = new DBHelper().getConn();
		Statement state=conn.createStatement();
		state.executeUpdate(sql);
		conn.close();state.close();
	}


}

