package com.springbootsteps.springboot_in_10Steps;

public class Book {
	public int id;
    public String book_name;
    public String author_name;
	
    public Book(int id, String book_name, String author_name) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.author_name = author_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", author_name=" + author_name + "]";
	}
    
    
    

}
