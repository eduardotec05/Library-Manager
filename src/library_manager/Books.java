package library_manager;

public class Books {

    private String title;
    private String author;
    private String editorial;
    private String ejemplares;
    private String id;
    private int stock;
    private int available;
//constructors

    public void setID(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAutor(String author) {
        this.author = author;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setEjemplares(String ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEjemplares() {
        return ejemplares;
    }

    public String getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public int getAvailable() {
        return available;
    }
}
