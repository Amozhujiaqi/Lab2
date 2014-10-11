package com.zjq.DAO;

import com.zjq.Book.*;
import com.zjq.util.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    Statement stmt=null;
    ResultSet rs=null;
    DBPool dbpool = new DBPool();
    public boolean deletebook(String ISBN) {//删除图书
    	boolean flag=false;
    	String sql_delete="delete from Book where ISBN='"+ISBN+"'";
		Connection conn=dbpool.getConnection();
		try {
			Statement stmt=conn.createStatement();
			int value=stmt.executeUpdate(sql_delete);
			if(value>0){
				flag=true;	
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
    
	public boolean addbook(Book book) {//增加一本图书
		Connection conn  = dbpool.getConnection();
		if(conn==null) System.out.println("BookDAO addBook conn==null");
		boolean flag=false;
		System.out.println("BookDAO addBook:"+book.getISBN()+book.getTitle()+book.getPublisher()
				+book.getAuthorId()+book.getPublishDate()+book.getPrice());
		String sql_insert="insert into Book (ISBN,Title,AuthorID,Publisher,PublishDate,Price) values('"+book.getISBN()+"','"+book.getTitle()+"','"+book.getAuthorId()+"','"
				+book.getPublisher()+"','"+book.getPublishDate()+"','"+book.getPrice()+"')";
		System.out.println(sql_insert);
		try {
			stmt=conn.createStatement();
			int count=stmt.executeUpdate(sql_insert);
			System.out.println("count="+count);
			if(count!=0){
				flag=true;
			}
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}	
		return flag;
	}
	
	public boolean updatebook(Book book) {//更新图书的作者，出版社，出版日期，价格
		Connection conn  = dbpool.getConnection();
		boolean flag=false;
		try{
			String update_str="UPDATE Book SET AuthorID='"+
			book.getAuthorId()+"',Publisher='"+
			book.getPublisher()+"',PublishDate='"+
			book.getPublishDate()+"' WHERE ISBN='"+
			book.getISBN()+"';";
			stmt=conn.createStatement();
			int return_count=stmt.executeUpdate(update_str);
			if(return_count==1){
				flag=true;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	public Book queryBookbyISBN(String ISBN) {//查询该作者的全部书目
		Connection conn  = dbpool.getConnection();
		String sql_query="select * from Book where ISBN='"+ISBN+"'";
		System.out.println(sql_query);
		Book book=new Book();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql_query);
			while(rs.next()){
				System.out.println("BookDAO addBook:"+book.getISBN()+book.getTitle()+book.getPublisher()
						+book.getAuthorId()+book.getPublishDate()+book.getPrice());
				book.setISBN(rs.getString("ISBN"));
				book.setTitle(rs.getString("Title"));
				book.setPublisher(rs.getString("Publisher"));
				book.setAuthorId(rs.getString("AuthorID"));
				book.setPublishDate(rs.getString("PublishDate"));
				book.setPrice(Double.parseDouble(rs.getString("Price")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("BookDAO queryBookByISBN SQLException");
		}
		return book;
		
	}
	public ArrayList<Book> queryBook(String AuthorId) {//查询该作者的全部书目
		Connection conn  = dbpool.getConnection();
	    ArrayList<Book> list= new ArrayList<Book>();
	    if(conn==null) System.out.println("conn==null!");
		String sql_query="select * from Book where AuthorID='"+AuthorId+"'";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql_query);
			while(rs.next()){
				Book book=new Book();
				System.out.println("BookDAO.queryBook102"+rs.getString("ISBN")+rs.getString("Title")+rs.getString("Publisher")
						+rs.getString("AuthorID")+rs.getString("PublishDate")+rs.getString("Price"));
				book.setISBN(rs.getString("ISBN"));
				book.setTitle(rs.getString("Title"));
				book.setPublisher(rs.getString("Publisher"));
				book.setAuthorId(rs.getString("AuthorId"));
				book.setPublishDate(rs.getString("PublishDate"));
				book.setPrice(Double.parseDouble(rs.getString("Price")));
				list.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
}
