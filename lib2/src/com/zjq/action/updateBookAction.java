package com.zjq.action;
import java.sql.Connection;

import com.zjq.Book.*;
import com.zjq.util.DBPool;
import com.zjq.DAO.*;
import com.opensymphony.xwork2.ActionSupport;
public class updateBookAction extends ActionSupport{
   private String ISBN;
   private String Title;
   private String AuthorId;
   private String Publisher;
   private String PublishDate;
   private double Price;
   private Book book;
   public String execute(){
	   BookDAO bookdao = new BookDAO();
	   System.out.println(ISBN);
	   System.out.println(AuthorId);
	   System.out.println(Price);
	   book=new Book();
	   book.setAuthorId(AuthorId);
	   book.setISBN(ISBN);
	   book.setPrice(Price);
	   book.setPublishDate(PublishDate);
	   book.setPublisher(Publisher);
	   book.setTitle(Title);
	   boolean f=bookdao.updatebook(book);
	   if(f==true) return SUCCESS;
	   else return ERROR;
   }
   public String getISBN(){
	   return this.ISBN;
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
   
   public Book getBook(){
	   return this.book;
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
   
   public void setBook(Book book){
	   this.book=book;
   }
}
