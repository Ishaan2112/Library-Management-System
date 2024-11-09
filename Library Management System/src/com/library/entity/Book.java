package com.library.entity;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;
    private String issuedTo;

    public Book(int bookId, String title, String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isIssued=false;
        this.issuedTo=null;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isIssued(){
        return isIssued;
    }
    public void setIssued(boolean issued) {
        isIssued = issued;
    }
    public String getIssuedTo(){
        return issuedTo;
    }
    public void setIssuedTo(String issuedTo){
        this.issuedTo=issuedTo;

    }
    public void displayBookinfo(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + (isIssued ? "Yes, to " + issuedTo : "No"));
        System.out.println();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued +
                ", issuedTo='" + issuedTo + '\'' +
                '}';
    }
}
