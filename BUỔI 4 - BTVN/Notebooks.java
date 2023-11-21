public class Notebooks {
    private String pages, type, cover, color, size, price, productName, brand;
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setPages(String pages) {
        this.pages = pages;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setCover(String cover) {
        this.cover = cover;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
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
    public String getPages() {
        return pages;
    }
    public String getType() {
        return type;
    }
    public String getCover() {
        return cover;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }

    public String toString() {
        return "Product name: "+this.getProductName()+"\nPrice: "+this.getPrice()+"\nBrand: "+this.getBrand()+"\nType: "+this.getType()+"\nSize: "+this.getSize()+"\nPages: "+this.getPages()+"\nColor: "+this.getColor()+"\nCover: "+this.getCover();
    }

    public void show() {
        System.out.printf("| %-20s | %-22s | %-22s | %-60s |",this.productName,this.price,this.brand,("- Type: "+ this.type));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |",("- Size: "+ this.size));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |",("- Pages: "+ this.pages));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |",("- Cover: "+ this.cover));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |",("- Color: "+ this.color));
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}
