package model;

import java.util.*;

public class LibraryManager {
    Set<String> userIdSet = new HashSet<>();
    List<User> users = new ArrayList<>();
    Set<String> bookTitleSet = new HashSet<>();
    List<Book> books = new ArrayList<>();
    Set<String> uniqueBookTitles = new HashSet<>()

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
                int wordCount = feedback.trim().split("\\s+").length;
                if (wordCount >= 3) {
                    user.addFeedback(bookId, feedback);
                    System.out.println("Feedback recorded for" + user.getName());
                }else {
                    System.out.println("Feedback isn't long enough");
                }
                return;
            }
        }
        System.out.println("User not found");
    }

    //method to display all books borrowed by a user
    public void displayAllBooksBorrowed(String userId) {
        for (User user : users) {
            if (userId.equals(user.getUserId())){
                System.out.println("Books borrowed by: " + user.getName());
                for (String bookId : user.getBorrowedBooksId()){
                    System.out.println("Book Id: " + bookId);
                    for (Book book : books) {
                        if (book.getBookId().equals(bookId)) {
                            System.out.println("Book Title: " + book.getTitle());
                        }
                    }
                }
                return;
            }
        }
        System.out.println("User not found");
    }

    //method to analyze the existing feedbacks
    public void analyzeFeedback() {
        for (User user : users){
            Map<String, String> usersFeedback = user.getFeedback();
            for (String feedback : usersFeedback.values()) {
                String fb = feedback.toLowerCase();
                int wordCount = fb.trim().split("\\s+").length;
                if (fb.contains("Good") || fb.contains("Excellent")){
                    System.out.println("Feedback by this user " + user.getName() + " has commented positive.");
                    System.out.println("This person's feedback has " + wordCount + " words.");
                }
            }
        }
    }

    public void showAllUniqueBookTitles() {
        for (User user : users){

        }
    }
}
