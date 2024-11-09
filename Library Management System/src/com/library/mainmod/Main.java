package com.library.mainmod;
import com.library.entity.Book;
import com.library.entity.User;
import com.library.service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1= new Book(1,"Java Progeramming","John Doe");
        Book book2 = new Book(2, "Data Structures", "Jane Smith");
        Book book3 = new Book(3, "To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        User user1 = new User(1, "Alice");
        User user2 = new User(2, "Bob");

        library.addUser(user1);
        library.addUser(user2);

        library.displayallusers();
        library.displayallBooks();

        library.issueBook(1,1);
        library.issueBook(2,2);


        library.displayallBooks();
        library.displayallusers();
        System.out.println();

        library.returnBook(1);
        System.out.println();
        library.issueBook(4,2);


    }
}
