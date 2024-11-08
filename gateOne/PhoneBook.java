import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBook {
    private String name;
    private String address;
    private String number;
    private String email;

    public PhoneBook(String name, String address, String number, String email) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    public static void addContact(ArrayList<PhoneBook> phoneBook) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
            String name = input.nextLine();

        System.out.print("Enter your address: ");
            String address = input.nextLine();

        System.out.print("Enter your telephone number (11 digits): ");
            String number = input.nextLine();
            
        System.out.print("Enter your email: ");
            String email = input.nextLine();

        PhoneBook contact = new PhoneBook(name, address, number, email);
            phoneBook.add(contact);

        System.out.println("Contact added successfully!");
    }
    public static void removeContact(ArrayList<PhoneBook> phoneBook) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the contact to remove: ");
        String name = input.nextLine();
        
        boolean found = false;
        for (int index = 0; index < phoneBook.size(); index++) {
            if (phoneBook.get(index).name.equalsIgnoreCase(name)) {
                phoneBook.remove(index);
                System.out.println("Contact removed successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
    public static void searchContact(ArrayList<PhoneBook> phoneBook) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the contact to search: ");
        String name = input.nextLine();
        
        boolean found = false;
        for (PhoneBook contact : phoneBook) {
            if (contact.name.equalsIgnoreCase(name)) {
                System.out.println("Contact found:");
                System.out.println("Name: " + contact.name);
                System.out.println("Address: " + contact.address);
                System.out.println("Telephone: " + contact.number);
                System.out.println("Email: " + contact.email);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
    public static void editContact(ArrayList<PhoneBook> phoneBook) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the contact to edit: ");
        String name = input.nextLine();
        
        boolean found = false;
        for (PhoneBook contact : phoneBook) {
            if (contact.name.equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Editing contact...");
                System.out.print("Enter new name: ");
                    contact.name = input.nextLine();

                System.out.print("Enter new address: ");
                    contact.address = input.nextLine();

                System.out.print("Enter new telephone number (11 digits): ");
                    contact.number = input.nextLine();

                System.out.print("Enter new email: ");
                    contact.email = input.nextLine();

                System.out.println("Contact updated successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
    public static void displayContact(ArrayList<PhoneBook> phoneBook){
        for (PhoneBook contact : phoneBook) {
            System.out.println("Name: " + contact.name);
            System.out.println("Address: " + contact.address);
            System.out.println("Telephone: " + contact.number);
            System.out.println("Email: " + contact.email);
        }
    }
}