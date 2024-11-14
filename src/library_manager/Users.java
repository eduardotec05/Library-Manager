package library_manager;

public class Users {

    private String name;
    private String last_name_p;
    private String last_name_m;
    private String id;
    private String borrow_books;
    private boolean discharged;

    //setters
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

    public void setBorrowBooks(String books) {
        this.borrow_books = books;
    }

    public void setDischarged(boolean discharged) {
        this.discharged = discharged;
    }

    //getters
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

    public String getBorrowBooks() {
        return borrow_books;
    }

    public boolean getDischarged() {
        return discharged;
    }

}
