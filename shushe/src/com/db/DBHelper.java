package com.db;

import java.sql.*;

public class DBHelper {	
	String driver="org.hsqldb.jdbcDriver";
	String url="jdbc:hsqldb:hsql://localhost/";//hsqldbĬ��server ����Ҫд���ݿ����֣����дҪд������
	String user="sa";
	String pass="";
	
	//�������ݿ�
	public Connection getConn() throws SQLException, ClassNotFoundException{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,pass);
		return con;
	}
	

	
}
