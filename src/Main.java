import java.util.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books[] books = new Books[99];
        Notebooks[] notebooks = new Notebooks[99];
        Pens[] pens = new Pens[99];
        Pencils[] pencils = new Pencils[99];
        Admin admin = new Admin();
        Guest guest = new Guest();
        while (true) {
            System.out.println("Please enter your username: ");
            String username = sc.nextLine();
            if (username.equals("admin")) {
                String password;
                while (true) {
                    System.out.println("Please enter your password: ");
                    password = sc.nextLine();
                    if (password.equals("admin")) {
                        System.out.println("Hello admin!");
                        break;
                    } else System.out.println("The password you entered is not correct. Please try again!");
                }
                admin.adminOption(books, notebooks, pens, pencils);
                return;
            } else{
                guest.guestOption(books, notebooks, pens, pencils);
            }
        }
    }
}

