package library_manager;

public class Users {

    private String name;
    private String last_name_p;
    private String last_name_m;
    private String id;
    private String borrow_books;
    private boolean discharged;


    //constructor
        public Users(String id, String name, String last_name_p, String last_name_m, boolean discharged, String borrow_books){
        this.id = id;
        this.name = name;
        this.last_name_p = last_name_p;
        this.last_name_m = last_name_m;
        this.discharged = discharged;
        this.borrow_books = borrow_books;
    }
    
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

    //We organize the data to send it to the SaveToTxt class
     @Override
    public String toString() {
        return id  + ", " + name + ", " + last_name_p + ", " + last_name_m + ", " + discharged  + ", " + borrow_books;
    }
    
 

}
