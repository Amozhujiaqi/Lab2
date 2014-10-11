package com.zjq.util;


import java.sql.*;

public class DBPool {
	public DBPool(){}
	public Connection getConnection() {


		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_zhujiaqi";
		String username="y05no50mmz";
		String password="0xj40z0m551ilk401zly4imllljyjmjljywyj42i";

		try{
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("DBPool");
			return DriverManager.getConnection(url,username,password);//建立数据库连接
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
	

}
