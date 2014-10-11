package com.zjq.DAO;

import com.zjq.Book.*;
import com.zjq.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
    Statement stmt=null;
    ResultSet rs=null;
    DBPool dbpool = new DBPool();
    
	public boolean addAuthor(Author author) {
		Connection conn  = dbpool.getConnection();
		boolean flag=false;
		String sql_insert="insert into Author (AuthorID,Name,Age,Country) values('"+author.getAuthorId()+"','"+author.getName()+"','"+author.getAge()+"','"
		+author.getCountry()+"')";
		System.out.println(sql_insert);
		try {
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql_insert);
			if(count!=0){
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return flag;
	}
	public Author queryAuthorById(String AuthorId) {
		Connection conn = dbpool.getConnection();
		String sql_query="select * from Author where AuthorID='"+AuthorId+"'";
		System.out.println("AuthorDAO QueryAuthorById"+AuthorId);
		Author author=null;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql_query);
			while(rs.next()){
				author = new Author();
				author.setAuthorId(rs.getString("AuthorID"));
				author.setName(rs.getString("Name"));
				author.setAge(Integer.parseInt(rs.getString("Age")));
				author.setCountry(rs.getString("Country"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return author;
	}
	public Author queryAuthorByName(String Name) {
		Connection conn = dbpool.getConnection();
		String sql_query="select * from Author where Name='"+Name+"'";
		if(conn==null) System.out.println("conn==null!");
		Author author=null;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql_query);
			while(rs.next()){
				author = new Author();
				author.setAuthorId(rs.getString("AuthorID"));
				author.setName(rs.getString("Name"));
				author.setAge(Integer.parseInt(rs.getString("Age")));
				author.setCountry(rs.getString("Country"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return author;
	}
}
