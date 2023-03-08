package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bookname, float price, int quantity, String authorName) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.quantity = quantity;
		this.authorName = authorName;
	}
	private String bookname;
	private float price;
	private int quantity;
	private String authorName;

}
