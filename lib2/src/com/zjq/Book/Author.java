package com.zjq.Book;

public class Author {
	   private int Age;
	   private String AuthorId;
	   private String Name;
	   private String Country;
	   
	   public Author(){
	   }
	   public Author(String AuthorId,String Name,String Country,int Age){
		   this.AuthorId=AuthorId;
		   this.Name=Name;
		   this.Country=Country;
		   this.Age=Age;
	   }
	   public int getAge(){
		   return Age;
	   }
	   
	   public String getAuthorId(){
		   return AuthorId;
	   }
	   
	   public String getName(){
		   return Name;
	   }
	   
	   public String getCountry(){
		   return Country;
	   }
	   
	   public void setAge(int Age){
		   this.Age=Age;
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
	}