package com.library.service;
import com.library.entity.Book;
import com.library.entity.User;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book>books;
    private List<User>users;

    public Library(){
        books = new ArrayList<>();
        users= new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: "+ book.getTitle());
    }
    public void addUser(User user){
        users.add(user);
        System.out.println("User added "+ user.getname());
    }

    public void issueBook(int bookId, int userId){
        Book book = findBookById(bookId);
        User user= findUserById(userId);
        if(book!= null && user!=null){
            if(!book.isIssued()){
                book.setIssued(true);
                book.setIssuedTo(user.getname());
                System.out.println("Book issued successfully: "+ book.getTitle() + " to " + user.getname() );
            }
            else{
                System.out.println("Sorry, the book \""+ book.getTitle() + "\" is already issued to "+ book.getIssuedTo()+ ".");

            }
        }
        else{
            System.out.println("Book or user not found.");
        }

    }
    public void returnBook(int bookId){
        Book book=findBookById(bookId);
        if(book!=null && book.isIssued()){
            book.setIssued(false);
            String previoususer = book.getIssuedTo();
            book.setIssuedTo(null);
            System.out.println("Book returned successfully: "+ book.getTitle() + " by " + previoususer);
        }
        else{
            System.out.println("The book was not issued or not found");
        }
    }

    private Book findBookById(int bookId){
        for(Book book:books){
            if(book.getBookId()==bookId){
                return book;
            }
        }
        return null;
    }
    private User findUserById(int userId){
        for(User user:users){
            if(user.getUserId()==userId){
                return user;
            }
        }
        return null;
    }
    public void displayallBooks(){
        System.out.println("Books in the library");
        for(Book book:books){
            book.displayBookinfo();
        }

    }
    public void displayallusers(){
        System.out.println("Users of the library");
        for(User user : users){
            user.displayUserInfo();
        }
    }




}
