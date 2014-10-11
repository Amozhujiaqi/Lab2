package com.zjq.action;

import java.sql.Connection;

import com.zjq.Book.*;
import com.zjq.util.DBPool;
import com.zjq.DAO.*;
import com.opensymphony.xwork2.ActionSupport;
public class addAuthorAction extends ActionSupport {
     private String AuthorId;
     private String Name;
     private String Country;
     private int Age;
     
     public String execute(){
    	 System.out.println(AuthorId);
    	 System.out.println(Name);
    	 System.out.println(Country);
    	 System.out.println(Age);
        AuthorDAO authordao = new AuthorDAO();
        Author author= new Author(AuthorId,Name,Country,Age);
        boolean f=authordao.addAuthor(author);
        if(f==true) return SUCCESS;
        else return ERROR;
     }
     
     public String getAuthorId(){
    	 return this.AuthorId;
     }
     
     public String getName(){
    	 return this.Name;
     }
     
     public String getCountry(){
    	 return this.Country;
     }
     
     public int getAge(){
    	 return this.Age;
     }
     
     public void setAuthorId(String AuthorId){
    	 this.AuthorId=AuthorId;
     }
     
     public void setName(String Name){
    	 this.Name=Name;
     }
     
     public void setCountry(String Country){
    	 this.Country=Country;
     }
     
     public void setAge(int Age){
    	 this.Age=Age;
     }
}
