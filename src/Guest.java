import java.util.Scanner;
public class Guest {
    void guestOptionList() {
        System.out.println("Hello guest!");
        System.out.println("1. Find item(s)");
        System.out.println("2. List of items");
        System.out.println("3. Logout");
    }
    void guestOption(Books[] books, Notebooks[] notebooks, Pens[] pens, Pencils[] pencils){
        byte option;
        Scanner sc = new Scanner(System.in);
        ActionManager action = new ActionManager();
        while(true){
            guestOptionList();
            option = sc.nextByte();
            switch (option) {
                case 1:
                    action.find(books, notebooks, pens, pencils);
                    break;
                case 2:
                    action.list(books, notebooks, pens, pencils);
                    break;
                case 3:
                    System.out.println("You have been successfully logged out!");
                    return;
            }
        }
    }
}
