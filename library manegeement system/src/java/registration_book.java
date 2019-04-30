public class registration_book {
private String name_of_book;
private String author;
private String short_description;
private String status;

    public registration_book(String name_of_book, String author, String short_description, String status) {
        this.name_of_book = name_of_book;
        this.author = author;
        this.short_description = short_description;
        this.status = status;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

}
