import java.util.Scanner;
public class ActionManager {
    static int noBook=0, noNotebook=0, noPen=0, noPencil=0;
    void add(){
        System.out.println("Select item:");
        System.out.println("1. Books");
        System.out.println("2. Notebooks");
        System.out.println("3. Pencils");
        System.out.println("4. Pens");
    }
    void addNotebook(Notebooks[] notebooks) {
        Scanner sc = new Scanner(System.in);
        ++noNotebook;
        notebooks[noNotebook] = new Notebooks();
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        notebooks[noNotebook].setProductName(productName);
        System.out.println("Enter cover: ");
        String cover = sc.nextLine();
        notebooks[noNotebook].setCover(cover);
        System.out.println("Enter pages: ");
        String pages = sc.nextLine();
        notebooks[noNotebook].setPages(pages);
        System.out.println("Enter type: ");
        String type = sc.nextLine();
        notebooks[noNotebook].setType(type);
        System.out.println("Enter price: ");
        String price = sc.nextLine();
        notebooks[noNotebook].setPrice(price);
        System.out.println("Enter brand: ");
        String brand = sc.nextLine();
        notebooks[noNotebook].setBrand(brand);
        System.out.println("Enter color: ");
        String color = sc.nextLine();
        notebooks[noNotebook].setColor(color);
        System.out.println("Enter size: ");
        String size = sc.nextLine();
        notebooks[noNotebook].setSize(size);
        System.out.println("New notebook(s) #" + noNotebook + " have been added successfully!");
        System.out.println("Select the next option: ");
    }
    void addBook(Books[] books) {
        Scanner sc = new Scanner(System.in);
        ++noBook;
        books[noBook] = new Books();
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        books[noBook].setProductName(productName);
        System.out.println("Enter author: ");
        String author = sc.nextLine();
        books[noBook].setAuthor(author);
        System.out.println("Enter category: ");
        String category = sc.nextLine();
        books[noBook].setCategory(category);
        System.out.println("Enter publication date: ");
        String publicationDate = sc.nextLine();
        books[noBook].setPublicationDate(publicationDate);
        System.out.println("Enter price: ");
        String price = sc.nextLine();
        books[noBook].setPrice(price);
        System.out.println("Enter publication house: ");
        String brand = sc.nextLine();
        books[noBook].setBrand(brand);
        System.out.println("Enter language: ");
        String language = sc.nextLine();
        books[noBook].setLanguage(language);
        System.out.println("New book(s) #" + noBook + " have been added successfully!");
        System.out.println("Select the next option: ");
    }
    void addPen(Pens[] pens) {
        Scanner sc = new Scanner(System.in);
        ++noPen;
        pens[noPen] = new Pens();
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        pens[noPen].setProductName(productName);
        System.out.println("Enter color: ");
        String color = sc.nextLine();
        pens[noPen].setColor(color);
        System.out.println("Enter type: ");
        String type = sc.nextLine();
        pens[noPen].setType(type);
        System.out.println("Enter price: ");
        String price = sc.nextLine();
        pens[noPen].setPrice(price);
        System.out.println("Enter brand: ");
        String brand = sc.nextLine();
        pens[noPen].setBrand(brand);
        System.out.println("Enter ink: ");
        String ink = sc.nextLine();
        pens[noPen].setInk(ink);
        System.out.println("Enter tip: ");
        String tip = sc.nextLine();
        pens[noPen].setTip(tip);
        System.out.println("New pen(s) #" + noPen + " have been added successfully!");
        System.out.println("Select the next option: ");
    }
    void addPencil(Pencils[] pencils) {
        Scanner sc = new Scanner(System.in);
        ++noPencil;
        pencils[noPencil] = new Pencils();
        System.out.println("Enter product name: ");
        String productName = sc.nextLine();
        pencils[noPencil].setProductName(productName);
        System.out.println("Enter color: ");
        String color = sc.nextLine();
        pencils[noPencil].setColor(color);
        System.out.println("Enter type: ");
        String type = sc.nextLine();
        pencils[noPencil].setType(type);
        System.out.println("Enter hardness: ");
        String hardness = sc.nextLine();
        pencils[noPencil].setHardness(hardness);
        System.out.println("Enter price: ");
        String price = sc.nextLine();
        pencils[noPencil].setPrice(price);
        System.out.println("Enter brand: ");
        String brand = sc.nextLine();
        pencils[noPencil].setBrand(brand);
        System.out.println("New pencil(s) #" + noPencil + " have been added successfully!");
        System.out.println("Select the next option: ");
    }
    void delete(Books[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book's identification number: ");
        int idNumber = sc.nextInt();
        if (idNumber < 0 || idNumber > noBook) {
            System.out.println("Invalid identification number. Please enter again!");
            idNumber = sc.nextInt();
        }
        for (int i = idNumber; i <= noBook; i++) {
            books[i] = books[i + 1];
        }
        noBook--;
        System.out.println("Book(s) #" + idNumber + " have been deleted successfully!");
        System.out.println("Select the next option: ");

    }

    void adjust(Books[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book's identification number: ");
        int idNumber = sc.nextInt();
        if (idNumber < 0 || idNumber > noBook) {
            System.out.println("Invalid identification number. Please enter again!");
            idNumber = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter productName: ");
        String productName = sc.nextLine();
        System.out.println("Enter author: ");
        String author = sc.nextLine();
        System.out.println("Enter category: ");
        String category = sc.nextLine();
        System.out.println("Enter publication date: ");
        String publicationDate = sc.nextLine();
        books[idNumber].setProductName(productName);
        books[idNumber].setAuthor(author);
        books[idNumber].setCategory(category);
        books[idNumber].setPublicationDate(publicationDate);
        System.out.println("Book(s) #" + idNumber + " have been updated successfully!");
        System.out.println("Select the next option: ");

    }

    void find(Books[] books, Notebooks[] notebooks, Pens[] pens, Pencils[] pencils) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter keyword(s): ");
        String keyword = sc.nextLine();
        System.out.println("Select display layout: ");
        System.out.println("1.Table");
        System.out.println("2.List");
        String option = sc.nextLine();
        System.out.println("List of products: ");
        if(option.equals("2"))
        {
            System.out.println("------");
            int bound = noBook;
            for (int i1 = 1; i1 <= bound; i1++) {
                if (books[i1].getBrand().contains(keyword) || books[i1].getPrice().contains(keyword) || books[i1].getProductName().contains(keyword) || books[i1].getCategory().contains(keyword) || books[i1].getPublicationDate().contains(keyword) || books[i1].getAuthor().contains(keyword) || books[i1].getLanguage().contains(keyword)) {
                    System.out.println(books[i1]);
                    System.out.println("------");
                }
            }
            int bound1 = noNotebook;
            for (int i1 = 1; i1 <= bound1; i1++) {
                if (notebooks[i1].getBrand().contains(keyword) || notebooks[i1].getPrice().contains(keyword) || notebooks[i1].getProductName().contains(keyword) || notebooks[i1].getColor().contains(keyword) || notebooks[i1].getPages().contains(keyword) || notebooks[i1].getCover().contains(keyword) || notebooks[i1].getSize().contains(keyword) || notebooks[i1].getType().contains(keyword)) {
                    System.out.println(notebooks[i1]);
                    System.out.println("------");
                }
            }
            int bound2 = noPen;
            for (int i1 = 1; i1 <= bound2; i1++) {
                if (pens[i1].getBrand().contains(keyword) || pens[i1].getPrice().contains(keyword) || pens[i1].getProductName().contains(keyword) || pens[i1].getColor().contains(keyword) || pens[i1].getInk().contains(keyword) || pens[i1].getType().contains(keyword) || keyword.contains(pens[i1].getTip())) {
                    System.out.println(pens[i1]);
                    System.out.println("------");
                }
            }
            int bound3 = noPencil;
            for (int i = 1; i <= bound3; i++) {
                if (pencils[i].getBrand().contains(keyword) || pencils[i].getPrice().contains(keyword) || pencils[i].getProductName().contains(keyword) || pencils[i].getType().contains(keyword) || pencils[i].getHardness().contains(keyword) || pencils[i].getColor().contains(keyword)) {
                    System.out.println(pencils[i]);
                    System.out.println("------");
                }
            }
        }
        else{
            String nname = "Product name", pprice = "Price", bbrand = "Brand", mmore = "Details";
            System.out.printf("| %-20s" + " | " + " %-21s" + " | " + " %-21s" + " | " + " %-59s |", nname, pprice, bbrand, mmore);
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            int bound = noBook;
            for (int i1 = 1; i1 <= bound; i1++) {
                if (books[i1].getBrand().contains(keyword) || books[i1].getPrice().contains(keyword) || books[i1].getProductName().contains(keyword) || books[i1].getCategory().contains(keyword) || books[i1].getPublicationDate().contains(keyword) || books[i1].getAuthor().contains(keyword) || books[i1].getLanguage().contains(keyword)) {
                    books[i1].show();
                }
            }
            int bound1 = noNotebook;
            for (int i1 = 1; i1 <= bound1; i1++) {
                if (notebooks[i1].getBrand().contains(keyword) || notebooks[i1].getPrice().contains(keyword) || notebooks[i1].getProductName().contains(keyword) || notebooks[i1].getColor().contains(keyword) || notebooks[i1].getPages().contains(keyword) || notebooks[i1].getCover().contains(keyword) || notebooks[i1].getSize().contains(keyword) || notebooks[i1].getType().contains(keyword)) {
                    notebooks[i1].show();
                }
            }
            int bound2 = noPen;
            for (int i1 = 1; i1 <= bound2; i1++) {
                if (pens[i1].getBrand().contains(keyword) || pens[i1].getPrice().contains(keyword) || pens[i1].getProductName().contains(keyword) || pens[i1].getColor().contains(keyword) || pens[i1].getInk().contains(keyword) || pens[i1].getType().contains(keyword) || keyword.contains(pens[i1].getTip())) {
                    pens[i1].show();
                }
            }
            int bound3 = noPencil;
            for (int i = 1; i <= bound3; i++) {
                if (pencils[i].getBrand().contains(keyword) || pencils[i].getPrice().contains(keyword) || pencils[i].getProductName().contains(keyword) || pencils[i].getType().contains(keyword) || pencils[i].getHardness().contains(keyword) || pencils[i].getColor().contains(keyword)) {
                    pencils[i].show();
                }
            }
        }
        System.out.println();
        System.out.println("End of results");
        System.out.println("Select the next option: ");
//        System.out.println("Enter author: ");
//        String author = sc.nextLine();
//        System.out.println("Enter category: ");
//        String category = sc.nextLine();
//        System.out.println("Enter publication date: ");
//        String publicationDate = sc.nextLine();
//        boolean found = false;
//        for (int i = 1; i <= number; i++) {
//            if (books[i].getCategory().equals(category) && books[i].getPublicationDate().equals(publicationDate) && books[i].getAuthor().equals(author) && books[i].getProductName().equals(productName)) {
//                found = true;
//                break;
//            }
//        }
//        System.out.println("Searching...");
//        if (!found) System.out.println("This book is not available in the library");
//        else System.out.println("This book is available in the library");
//        System.out.println("Select the next option: ");
    }

    void list(Books[] books, Notebooks[] notebooks, Pens[] pens, Pencils[] pencils) {
        for(int i=1; i<=noBook; i++) {
            System.out.println(books[i]);
            System.out.println("------");
        }
        for(int i=1; i<=noNotebook; i++){
            System.out.println(notebooks[i]);
            System.out.println("------");
        }
        for(int i=1; i<=noPen; i++){
            System.out.println(pens[i]);
            System.out.println("------");
        }
        for(int i=1; i<=noPencil; i++){
            System.out.println(pencils[i]);
            System.out.println("------");
        }
        System.out.println("Select the next option: ");
    }
}
