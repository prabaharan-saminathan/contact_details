package contact_project_java;
import java.util.ArrayList;
import java.util.Scanner;

public class contactservice {
private ArrayList<Contact> contacts = new ArrayList<>();
 private Scanner scanner = new Scanner(System.in);

 public void createContact() {
  System.out.println("Enter First Name: ");
  String firstName = scanner.nextLine();
  System.out.println("Enter Last Name: ");
  String lastName = scanner.nextLine();
  System.out.println("Enter Phone Number: ");
  String phoneNumber = scanner.nextLine();
  System.out.println("Enter Email: ");
  String email = scanner.nextLine();
    contacts.add(new Contact(firstName, lastName, phoneNumber, email));
	    System.out.println("Contact created successfully!");
	    }

	    public void editContact() {
	        System.out.println("Enter the email of the contact you want to edit: ");
	        String Email = scanner.nextLine();

	        Contact contactToEdit = findContactByEmail(Email);
	        if (contactToEdit != null) {
	            System.out.println("What would you like to edit?");
	            System.out.println("1. Email");
	            System.out.println("2. Phone Number");
	            System.out.println("3. Both Email and Phone Number");


	            System.out.println("Enter the option :");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter new Email: ");
	                    String newEmail = scanner.nextLine();
	                    contactToEdit.setEmail(newEmail);
	                    System.out.println("*********Contact email updated successfully!***********");
	                    break;

	                case 2:
	                    System.out.println("Enter new Phone Number: ");
	                    String newphoneNumber = scanner.nextLine();
	                    contactToEdit.phoneNumber(newphoneNumber);
	                    System.out.println("*********Contact phone number updated successfully!***********");
	                    break;
	                case 3:
	                    System.out.println("Enter new Email: ");
	                    String updatedEmail = scanner.nextLine();
	                    contactToEdit.setEmail(updatedEmail);

	                    System.out.println("Enter new Phone Number: ");
	                    String newephoneNumber = scanner.nextLine();
	                    contactToEdit.phoneNumber(newephoneNumber);

	                    System.out.println("*********Contact email and phone number updated successfully!***********");
	                    break;

	                default:
	                    System.out.println("Invalid option. No changes made.");
	                    break;
	            }
	        } else {
	            System.out.println("Contact not found!");
	        }
	    }

	    public void deleteContact() {
	        System.out.println("Enter the email of the contact you want to delete: ");
	        String email = scanner.nextLine();

	        Contact contactToDelete = findContactByEmail(email);
	        if (contactToDelete != null) {
	            contacts.remove(contactToDelete);
	            System.out.println("***********Contact deleted successfully!*************");
	        } else {
	            System.out.println("Contact not found!");
	        }
	    }

	    public void displayContacts() {
	        if (contacts.isEmpty()) {
	            System.out.println("No contacts to display.");
        } else {
	            for (Contact contact : contacts) {
	                System.out.println(contact);
	                System.out.println("------------");
	            }
	        }
	    }

	    private Contact findContactByEmail(String email) {
	        for (Contact contact : contacts) {
	            if (contact.getEmail().equals(email)) {
	                return contact;
	            }
	        }
	        return null;
	    }	
			
		}


