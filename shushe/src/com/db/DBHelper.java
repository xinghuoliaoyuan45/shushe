package com.db;

import java.sql.*;

public class DBHelper {	
	String driver="org.hsqldb.jdbcDriver";
	String url="jdbc:hsqldb:hsql://localhost/";//hsqldb默认server 不需要写数据库名字，如果写要写别名！
	String user="sa";
	String pass="";
	
	//连接数据库
	public Connection getConn() throws SQLException, ClassNotFoundException{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,pass);
		return con;
	}
	

	
}
