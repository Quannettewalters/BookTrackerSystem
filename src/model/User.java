package model;

import java.util.List;
import java.util.Map;

public class User {
    private String userId;
    private String name;
    private List<String> borrowedBooksId;
    private Map<String, String> feedback; //book ID --> feedback

    public void addFeedback(String bookId, String fb) {
        feedback.put(bookId, fb);
    }

    public User(String userId, String name, List<String> borrowedBooksId, Map<String, String> feedback) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooksId = borrowedBooksId;
        this.feedback = feedback;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBorrowedBooksId() {
        return borrowedBooksId;
    }

    public void setBorrowedBooksId(List<String> borrowedBooksId) {
        this.borrowedBooksId = borrowedBooksId;
    }

    public Map<String, String> getFeedback() {
        return feedback;
    }

    public void setFeedback(Map<String, String> feedback) {
        this.feedback = feedback;
    }
}
