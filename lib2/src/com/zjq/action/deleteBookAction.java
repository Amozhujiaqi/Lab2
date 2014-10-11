package com.zjq.action;

import java.sql.Connection;
import com.zjq.Book.*;
import com.zjq.util.DBPool;
import com.zjq.DAO.*;
import com.opensymphony.xwork2.ActionSupport;
public class deleteBookAction extends ActionSupport{
    private String ISBN;
    public String execute(){
    	BookDAO bookdao = new BookDAO();
    	System.out.println(ISBN);
    	boolean f=bookdao.deletebook(ISBN);
    	if(f==true)
    		return SUCCESS;
    	else return ERROR;
    }
    public void setISBN(String ISBN){
    	this.ISBN=ISBN;
    }
    
    public String getISBN(){
    	return this.ISBN;
    }
}
