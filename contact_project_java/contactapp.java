package contact_project_java;

import java.util.Scanner;

public class contactapp {
  public static void main(String[] args) {
    contactservice con= new contactservice();
    Scanner scanner = new Scanner(System.in);
     int choice;
        do {
            System.out.println("1. Create Contact.");
            System.out.println("2. Edit Email-ID A1nd Phone-Number.");
            System.out.println("3. Delete Contact.");
            System.out.println("4. Display Contacts Details.");
            System.out.println("5. Exit.");
            System.out.println("----------------------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println("--");
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    con.createContact();
                    break;
                case 2:
                    con.editContact();
                    break;
                case 3:
                    con.deleteContact();
                    break;
                case 4:
                    con.displayContacts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                	System.out.println("----OOPS..!--sorry your not aviable-----------");
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("-------------Thanks for coming visit my project----------------");
        } while (choice != 5);
    }
  	}















