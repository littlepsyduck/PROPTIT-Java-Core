public class Books {
    private String title, author, category, publicationDate;
    Books (String title, String author, String category, String publicationDate){
        this.title = title;
        this.author = author;
        this.category = category;
        this.publicationDate = publicationDate;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }
    public String getPublicationDate() {
        return publicationDate;
    }
}
