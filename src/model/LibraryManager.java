package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryManager {
    Set<String> userIdSet = new HashSet<>();
    List<User> users = new ArrayList<>();
    Set<String> bookTitleSet = new HashSet<>();
    List<Book> books = new ArrayList<>();

    //method to add user
    public void addUser(User user){

        if (!userIdSet.contains(user.getUserId())){
            users.add(user);
            userIdSet.add(user.getUserId());
        } else {
            System.out.println("Duplicate user ID cannot be added" + user.getUserId());
        }
    }

    //Method to add book
    public void addBook(Book book){
        if (!bookTitleSet.contains(book.getTitle())){
            books.add(book);
            bookTitleSet.add(book.getTitle());
        }else {
            System.out.println("Book not added, title already exist" + book.getTitle());
        }
    }

    //Method  to
    public void recordFeedback (String userId, String bookId, String feedback){
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                int wordCount = feedback.trim().split()
            }
        }
    }
}
