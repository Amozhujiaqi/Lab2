package com.zjq.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.zjq.Book.*;
import com.zjq.DAO.*;
import com.opensymphony.xwork2.ActionSupport;

public class showDatailsAction extends ActionSupport{
      private String ISBN;
	  private Book book;
	  private Author author;
      public String execute(){
    	  AuthorDAO authordao = new AuthorDAO();
    	  BookDAO bookdao = new BookDAO();
    	  System.out.println("showDatials"+ISBN);
    	  book = bookdao.queryBookbyISBN(ISBN);
    	  String AuthorId=book.getAuthorId();
    	  System.out.println(book.getPublisher());
    	  author=authordao.queryAuthorById(AuthorId);
    	  return SUCCESS;
      }
      
      public Author getAuthor(){
    	  return author;
      }
      public Book getBook(){
    	  return book;
      }
	  public String getISBN(){
	      return ISBN;
	  }
	    
	  public void setISBN(String ISBN){
	      this.ISBN=ISBN;
	  }
	  
	  public void setAuthor(Author author){
		  this.author=author;
	  }
	  public void setBook(Book book){
		  this.book=book;
	  }
}
