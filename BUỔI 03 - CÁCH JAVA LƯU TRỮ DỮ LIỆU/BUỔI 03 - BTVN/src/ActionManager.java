import java.util.Scanner;

public class ActionManager {
    static Books[] books = new Books[99];
    static int number = 0;

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Enter author: ");
        String author = sc.nextLine();
        System.out.println("Enter category: ");
        String category = sc.nextLine();
        System.out.println("Enter publication date: ");
        String publicationDate = sc.nextLine();
        Books newBook = new Books(title, author, category, publicationDate);
        books[++number] = newBook;
        System.out.println("New book(s) #" + number + " have been added successfully!");
        System.out.println("Select the next option: ");
    }

    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book's identification number: ");
        int idNumber = sc.nextInt();
        if (idNumber < 0 || idNumber > number) {
            System.out.println("Invalid identification number. Please enter again!");
            idNumber = sc.nextInt();
        }
        for (int i = idNumber; i <= number; i++) {
            books[i] = books[i + 1];
        }
        number--;
        System.out.println("Book(s) #" + idNumber + " have been deleted successfully!");
        System.out.println("Select the next option: ");

    }

    public static void adjust() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter book's identification number: ");
        int idNumber = sc.nextInt();
        if (idNumber < 0 || idNumber > number) {
            System.out.println("Invalid identification number. Please enter again!");
            idNumber = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Enter author: ");
        String author = sc.nextLine();
        System.out.println("Enter category: ");
        String category = sc.nextLine();
        System.out.println("Enter publication date: ");
        String publicationDate = sc.nextLine();
        books[idNumber].setTitle(title);
        books[idNumber].setAuthor(author);
        books[idNumber].setCategory(category);
        books[idNumber].setPublicationDate(publicationDate);
        System.out.println("Book(s) #" + idNumber + " have been updated successfully!");
        System.out.println("Select the next option: ");

    }

    public static void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Enter author: ");
        String author = sc.nextLine();
        System.out.println("Enter category: ");
        String category = sc.nextLine();
        System.out.println("Enter publication date: ");
        String publicationDate = sc.nextLine();
        boolean found = false;
        for (int i = 1; i <= number; i++) {
            if (books[i].getCategory().equals(category) && books[i].getPublicationDate().equals(publicationDate) && books[i].getAuthor().equals(author) && books[i].getTitle().equals(title)) {
                found = true;
                break;
            }
        }
        System.out.println("Searching...");
        if (!found) System.out.println("This book is not available in the library");
        else {
            System.out.println("This book is available in the library");
        }
        System.out.println("Select the next option: ");
    }

    public static void list() {
        for (int i = 1; i <= number; i++) {
            System.out.println("#" + i + " " + books[i].getTitle() + " " + books[i].getAuthor() + " " + books[i].getCategory() + " " + books[i].getPublicationDate());
        }
    }
}
