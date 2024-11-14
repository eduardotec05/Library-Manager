
package library_manager;

public class Lendings {
    private String id;
    private String user_id;
    private String book_id;
    private String date_out;
    private String date_return;

    public void setId(String id) {
        this.id = id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }

    public void setDate_return(String date_return) {
        this.date_return = date_return;
    }

    public String getId() {
        return id;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getBook_id() {
        return book_id;
    }

    public String getDate_out() {
        return date_out;
    }

    public String getDate_return() {
        return date_return;
    }
}
