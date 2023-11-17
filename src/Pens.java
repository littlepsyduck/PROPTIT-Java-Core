public class Pens {
    private String color, type, ink, tip, price, productName, brand;
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setInk(String ink) {
        this.ink = ink;
    }
    public void setTip(String tip) {
        this.tip = tip;
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
    public String getColor() {
        return color;
    }
    public String getInk() {
        return ink;
    }
    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Product name: "+this.getProductName()+"\nPrice: "+this.getPrice()+"\nBrand: "+this.getBrand()+"\nTip: "+this.getTip()+"\nInk: "+this.getInk()+"\nColor: "+this.getColor()+"\nType: "+this.getType();
    }

    public void show() {
        System.out.printf("| %-20s | %-22s | %-22s | %-60s |",this.productName,this.price,this.brand,("- Color: "+ this.color));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |",("- Type: "+ this.type));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |",("- Ink: "+ this.ink));
        System.out.println();
        System.out.printf("|                      |                        |                        | %-60s |",("- Tip: "+ this.tip));
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
    }
}
