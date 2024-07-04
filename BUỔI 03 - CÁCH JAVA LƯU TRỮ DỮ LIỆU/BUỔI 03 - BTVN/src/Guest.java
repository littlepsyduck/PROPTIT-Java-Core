import java.util.Scanner;

public class Guest {
    public static void guestOptionList() {
        System.out.println("Hello guest!");
        System.out.println("1. Find book(s)");
        System.out.println("2. List of books");
        System.out.println("3. Logout");
    }
    public static void guestOption(){
        byte option;
        Scanner sc = new Scanner(System.in);
        while(true){
            guestOptionList();
            option = sc.nextByte();
            switch (option) {
                case 1:
                    ActionManager.find();
                    break;
                case 2:
                    ActionManager.list();
                    break;
                case 3:
                    System.out.println("You have been successfully logged out!");
                    return;
            }
        }
    }
}
