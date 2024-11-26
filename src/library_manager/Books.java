package library_manager;

/**
 * Class: Books
 * Represents a book in the library system with attributes such as title, author, editorial, 
 * number of copies, and stock management.
 * 
 * This class provides getter and setter methods for each attribute and overrides the toString 
 * method to format the book's data for file saving.
 */
public class Books {

    private String title;        // The title of the book
    private String author;       // The author of the book
    private String editorial;    // The editorial or publisher of the book
    private String copies;       // Total number of copies of the book
    private String id;           // Unique identifier for the book
    private int stock;           // Total stock of the book
    private int available;       // Number of available copies for lending

    // Constructors (not shown here for simplicity but can be added as needed)

    /**
     * Sets the unique identifier for the book.
     * 
     * @param id The unique ID of the book.
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title The title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets the author of the book.
     * 
     * @param author The author's name.
     */
    public void setAutor(String author) {
        this.author = author;
    }

    /**
     * Sets the editorial or publisher of the book.
     * 
     * @param editorial The name of the editorial.
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Sets the number of copies of the book.
     * 
     * @param copies The total number of copies.
     */
    public void setCopies(String copies) {
        this.copies = copies;
    }

    /**
     * Sets the stock for the book.
     * 
     * @param stock The total stock count.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Sets the number of available copies of the book.
     * 
     * @param available The number of copies available for lending.
     */
    public void setAvailable(int available) {
        this.available = available;
    }

    // Getters
    /**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return The author's name.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the editorial or publisher of the book.
     * 
     * @return The name of the editorial.
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Gets the number of copies of the book.
     * 
     * @return The total number of copies.
     */
    public String getCopies() {
        return copies;
    }

    /**
     * Gets the unique identifier of the book.
     * 
     * @return The unique ID of the book.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the total stock of the book.
     * 
     * @return The total stock count.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Gets the number of available copies of the book.
     * 
     * @return The number of available copies.
     */
    public int getAvailable() {
        return available;
    }

    /**
     * Formats the book's data into a string for saving to a file or displaying.
     * 
     * @return A string representation of the book's attributes.
     */
    @Override
    public String toString() {
        return id + ", " + title + ", " + author + ", " + editorial + ", " + copies + ", " + stock + ", " + available;
    }
}

