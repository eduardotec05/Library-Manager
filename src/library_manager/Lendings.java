package library_manager;

/**
 * Class: LendingsClass
 * This class serves as a model for managing lending records in a library system. 
 * It encapsulates the details of a lending transaction, providing getter and setter methods 
 * for accessing and modifying these details.
 */
public class Lendings {

    // Attributes
    private String id;        // Unique identifier for the lending transaction
    private String user_id;   // ID of the user who borrowed the book
    private String book_id;   // ID of the book being borrowed
    private String date_out;  // Date when the book was lent out

    /**
     * Sets the unique ID for the lending transaction.
     * @param id The lending ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets the user ID for the lending transaction.
     * @param user_id The ID of the user who borrowed the book.
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * Sets the book ID for the lending transaction.
     * @param book_id The ID of the book being borrowed.
     */
    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    /**
     * Sets the date when the book was lent out.
     * @param date_out The date of lending, formatted as a string.
     */
    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }

    /**
     * Gets the unique ID for the lending transaction.
     * @return The lending ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the user ID for the lending transaction.
     * @return The ID of the user who borrowed the book.
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * Gets the book ID for the lending transaction.
     * @return The ID of the book being borrowed.
     */
    public String getBook_id() {
        return book_id;
    }

    /**
     * Gets the date when the book was lent out.
     * @return The date of lending as a string.
     */
    public String getDate_out() {
        return date_out;
    }
}
