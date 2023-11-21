public class Books {
    private String author, category, publicationDate, language, productName, price, brand;
    public void setProductName(String productName) {
        this.productName = productName;
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
    public void setPrice(String price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getProductName() {
        return productName;
    }
    public String getPrice() {
        return price;
    }
    public String getBrand() {
        return brand;
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
    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Product name: "+this.getProductName()+"\nPrice: "+this.getPrice()+"\nBrand: "+this.getBrand()+"\nCategory: "+this.getCategory()+"\nAuthor: "+this.getAuthor()+"\nPublication date: "+this.getPublicationDate()+"\nLanguage: "+this.getLanguage();
    }
    public void show() {
        System.out.printf("| %-20s | %-22s | %-22s | %-60s |", this.productName, this.price, this.brand, ("- Type: " + this.category));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |", ("- Author: " + this.author));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |", ("- Publication Date: " + this.publicationDate));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |", ("- Language: " + this.language));
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}
