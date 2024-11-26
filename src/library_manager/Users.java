package library_manager;

/**
 * Class: Users
 *
 * This class models a user in a library system. It stores the user's personal
 * information, the number of books they have borrowed, and whether they have
 * been discharged from borrowing more books. It provides the necessary setters
 * and getters for these attributes, and includes a method to format the user's
 * data as a string for saving purposes.
 */
public class Users {
    //atributtes
    private String name;
    private String last_name_p;
    private String last_name_m;
    private String id;
    private int borrow_books;
    private boolean discharged;

    /**
     * Constructor: Users
     *
     * Initializes a new user with the specified data.
     *
     * @param id The ID of the user.
     * @param name The first name of the user.
     * @param last_name_p The paternal last name of the user.
     * @param last_name_m The maternal last name of the user.
     * @param discharged Indicates whether the user is discharged (no longer
     * borrowing books).
     * @param borrow_books The number of books the user has borrowed.
     */
    public Users(String id, String name, String last_name_p, String last_name_m, boolean discharged, int borrow_books) {
        this.id = id;
        this.name = name;
        this.last_name_p = last_name_p;
        this.last_name_m = last_name_m;
        this.discharged = discharged;
        this.borrow_books = borrow_books;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name_p(String last_name_p) {
        this.last_name_p = last_name_p;
    }

    public void setLast_name_m(String last_name_m) {
        this.last_name_m = last_name_m;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBorrowBooks(int borrow_books) {
        this.borrow_books = borrow_books;
    }

    public void setDischarged(boolean discharged) {
        this.discharged = discharged;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name_p() {
        return last_name_p;
    }

    public String getLast_name_m() {
        return last_name_m;
    }

    public int getBorrowBooks() {
        return borrow_books;
    }

    public boolean getDischarged() {
        return discharged;
    }

    /**
     * Method: toString
     *
     * Formats the user data as a string to be used when saving to a text file.
     * It returns a string with user details in a comma-separated format.
     *
     * @return A string representing the user's data, formatted as: id, name,
     * last_name_p, last_name_m, discharged, borrow_books
     */
    @Override
    public String toString() {
        return id + ", " + name + ", " + last_name_p + ", " + last_name_m + ", " + discharged + ", " + borrow_books;
    }

}
