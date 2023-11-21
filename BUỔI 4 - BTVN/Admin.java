import java.util.Scanner;
public class Admin {
    void adminOptionList() {
        System.out.println("1. Add item(s)");
        System.out.println("2. Delete book(s)");
        System.out.println("3. Adjust book(s)");
        System.out.println("4. Guest mode");
        System.out.println("5. Logout");
    }
    void adminOption(Books[] books, Notebooks[] notebooks, Pens[] pens, Pencils[] pencils){
        byte option;
        Scanner sc = new Scanner(System.in);
        ActionManager action = new ActionManager();
        Guest guest = new Guest();
        while(true){
            adminOptionList();
            option = sc.nextByte();
            switch (option) {
                case 1:
                    action.add();
                    byte option2 = sc.nextByte();
                    switch (option2) {
                        case 1:
                            action.addBook(books);
                            break;
                        case 2:
                            action.addNotebook(notebooks);
                            break;
                        case 3:
                            action.addPencil(pencils);
                            break;
                        case 4:
                            action.addPen(pens);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + option);
                    }
                    break;
                case 2:
                    action.delete(books);
                    break;
                case 3:
                    action.adjust(books);
                    break;
                case 4:
                    guest.guestOption(books, notebooks, pens, pencils);
                    break;
                case 5:
                    System.out.println("You have been successfully logged out!");
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
    }
}
