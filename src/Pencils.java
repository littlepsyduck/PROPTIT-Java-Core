public class Pencils {
    private String color, type, hardness, price, productName, brand;
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Product name: " + this.getProductName() + "\nPrice: " + this.getPrice() + "\nBrand: " + this.getBrand() + "\nType: " + this.getType() + "\nHardness: " + this.getHardness() + "\nColor: " + this.getColor();
    }
    public void show() {
        System.out.printf("| %-20s | %-22s | %-22s | %-60s |", this.productName, this.price, this.brand, ("- Type: " + this.color));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |", ("- Hardness: " + this.hardness));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |", ("- Color: " + this.color));
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}
