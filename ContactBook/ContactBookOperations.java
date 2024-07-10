package ContactBook;
import java.util.*;
public class ContactBookOperations {
    static void main_menu(){
        System.out.println("\nOptions:");
        System.out.println("1. Add a new contact");
        System.out.println("2. Search for a contact");
        System.out.println("3. View all contacts");
        System.out.println("4. Quit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact c[] = new Contact[10];
        int contactCount=0;



        int choice = 100;
        main_menu();
        choice = sc.nextInt();
        sc.nextLine();

        while( choice!=10){
            switch (choice) {
                case 0:
                    main_menu();
                    choice = sc.nextInt();
                    sc.nextLine();
                    break;
                case 1:
                    if (contactCount < 10) {
                        System.out.print("Enter contact name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter contact number: ");
                        String number = sc.nextLine();
                        c[contactCount] = new Contact(name, number);
                        contactCount++;
                        System.out.println("Contact added successfully!");
                    } else {
                        System.out.println("Address book is full. Cannot add more contacts.");
                    }

                    System.out.println();
                    System.out.println("1.Add a new contact");
                    System.out.println("0.Go back to  MAIN MENU");
                    choice = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Enter contact name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < contactCount; i++) {
                        if (c[i].getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Contact found - " + c[i].getName() + ": " + c[i].getNumber());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Contact not found.");
                    }
                    System.out.println("0.Go back to  MAIN MENU");

                    System.out.println("4. Quit");
                    choice = sc.nextInt();
                    break;
                case 3:
                    System.out.println("List of contacts:");
                    for (int i = 0; i < contactCount; i++) {
                        System.out.println(c[i].getName() + ": " + c[i].getNumber());
                    }
                    System.out.println();
                    System.out.println("0.Go back to  MAIN MENU");

                    System.out.println("4. Quit");
                    choice = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    choice=10;
                    break;
                default:
                    System.out.println("ENTER VALID CHOICE: ");
                    break;
            }
        }


    }
}
