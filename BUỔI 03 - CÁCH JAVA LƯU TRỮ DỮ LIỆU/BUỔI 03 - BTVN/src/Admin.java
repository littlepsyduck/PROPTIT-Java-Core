import java.util.Scanner;
public class Admin {
    public static void adminOptionList() {
        System.out.println("1. Add book(s)");
        System.out.println("2. Delete book(s)");
        System.out.println("3. Adjust book(s)");
        System.out.println("4. Guest mode");
        System.out.println("5. Logout");
    }
    public static void adminOption(){
        byte option;
        Scanner sc = new Scanner(System.in);
        while(true){
            adminOptionList();
            option = sc.nextByte();
            switch (option) {
                case 1:
                    ActionManager.add();
                    break;
                case 2:
                    ActionManager.delete();
                    break;
                case 3:
                    ActionManager.adjust();
                    break;
                case 4:
                    Guest.guestOption();
                    break;
                case 5:
                    System.out.println("You have been successfully logged out!");
                    return;
            }
        }
    }
}
