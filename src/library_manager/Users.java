package library_manager;

public class Users {

    private String name;
    private String last_name_p;
    private String last_name_m;
    private String id;
    private String borrow_books;
    private boolean discharged;


    //Constrcutor
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

    //Ordenamos los datos para mandarlo a la clase SaveToTxt
    @Override
    public String toString() {
        return "ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Last Name (P): " + last_name_p + "\n"
                + "Last Name (M): " + last_name_m + "\n"
                + "Discharged: " + discharged + "\n"
                + "Borrowed Books: " + borrow_books + "\n";
    }

}
