package com.zjq.action;

import java.sql.Connection;
import com.zjq.Book.*;

import com.opensymphony.xwork2.ActionSupport;
public class updateTmpAction extends ActionSupport{
   private String ISBN;
   public String execute(){
	   System.out.println(ISBN);
	   return SUCCESS;
   }
   public String getISBN(){
	   return this.ISBN;
   }
   
   public void setISBN(String ISBN){
	   this.ISBN=ISBN;
   }
}