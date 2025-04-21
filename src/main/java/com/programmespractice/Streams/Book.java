package com.programmespractice.Streams;

public class Book {
    private String name;
    private Author author;
    private int price;
    public Book(String name, Author authorname, int price) {
        this.name = name;
        this.author = authorname;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthr() {
        return author;
    }
    public void setAuthor(Author authorname) {
        this.author = authorname;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
