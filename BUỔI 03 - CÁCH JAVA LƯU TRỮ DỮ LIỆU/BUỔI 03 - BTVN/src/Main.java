import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    } else {
                        System.out.println("The password you entered is not correct. Please try again!");
                    }
                }
                Admin.adminOption();
                return;
            } else {
                Guest.guestOption();
            }

        }
    }
}

