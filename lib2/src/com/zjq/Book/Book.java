package com.zjq.Book;

public class Book {
    private String ISBN;
    private String Title;
    private String AuthorId;
    private String Publisher;
    private String PublishDate;
    private double Price;
    
    public Book(String ISBN,String Title,String AuthorId,String Publisher,
    		String PublishDate,double Price){
    	this.ISBN=ISBN;
    	this.AuthorId=AuthorId;
    	this.Price=Price;
    	this.PublishDate=PublishDate;
    	this.Publisher=Publisher;
    	this.Title=Title;
    }
    public Book(){
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
