package com.zjq.action;
import java.sql.Connection;

import com.zjq.Book.*;
import com.zjq.util.DBPool;
import com.zjq.DAO.*;
import com.opensymphony.xwork2.ActionSupport;
public class addBookAction extends ActionSupport{
	    private String ISBN;
	    private String Title;
	    private String AuthorId;
	    private String Publisher;
	    private String PublishDate;
	    private double Price;
	    
	    public String execute() {
	    	Book book = new Book(ISBN,Title,AuthorId,Publisher,PublishDate,Price);
			System.out.println("addBookAction:"+ISBN+Title+Publisher
					+AuthorId+PublishDate+Price);
	    	BookDAO bookdao = new BookDAO();
	    	boolean f=bookdao.addbook(book);
	    	if(f == true) System.out.println("addBookSuccess!");
	    	System.out.println("BookDAO addBook finished");
	    	System.out.println("AuthorId="+AuthorId);
	    	AuthorDAO authordao = new AuthorDAO();
	    	Author author=authordao.queryAuthorById(AuthorId);
	    	if(author!=null) return SUCCESS;
	    	else return ERROR;
	     }
	    
	    public String getISBN(){
	    	return ISBN;
	    }
	    
	    public String getTitle(){
	    	return Title;
	    }
	    
	    public String getAuthorId(){
	    	return AuthorId;
	    }
	    
	    public String getPublisher(){
	    	return Publisher;
	    }
	    
	    public String getPublishDate(){
	    	return PublishDate;
	    }
	    
	    public double getPrice(){
	    	return Price;
	    }
	    
	    public void setISBN(String ISBN){
	    	this.ISBN=ISBN;
	    }
	    
	    public void setAuthorId(String AuthorId){
	    	this.AuthorId=AuthorId;
	    }
	    
	    public void setTitle(String Title){
	    	this.Title=Title;
	    }
	    
	    public void setPublisher(String Publisher){
	    	this.Publisher=Publisher;
	    }
	    
	    public void setPublishDate(String PublishDate){
	    	this.PublishDate=PublishDate;
	    }
	    
	    public void setPrice(double Price){
	    	this.Price=Price;
	    }
}
