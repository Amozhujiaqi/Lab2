package com.zjq.action;

import java.sql.Connection;
import java.util.ArrayList;

import com.zjq.Book.*;
import com.zjq.util.DBPool;
import com.zjq.DAO.*;
import com.opensymphony.xwork2.ActionSupport;

public class queryByName extends ActionSupport{
     private String Name;
     private ArrayList<Book> list;
     public String execute(){
         AuthorDAO authordao = new AuthorDAO();
         BookDAO bookdao = new BookDAO();
         Author author=authordao.queryAuthorByName(Name);
         if(author==null) return ERROR;
         String AuthorId=author.getAuthorId();
         System.out.println("queryByName  AuthorId"+AuthorId);
         list=bookdao.queryBook(AuthorId);        
    	 return SUCCESS;
     }
     public void setName(String Name){
    	 this.Name=Name;
     }
     public void setList(ArrayList<Book> list){
    	 this.list=list;
     }
     public String getName(){
    	 return Name;
     }
     public ArrayList<Book> getList(){
    	 return this.list;
     }
}
