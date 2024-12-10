package libraryManagementSystems;

import java.util.ArrayList;
import java.util.Scanner;

public class BookAdmins {
    private String BookAdminName;
    private String BookAdminAddress;
    private String BookAdminEmail;


    public String getLibraryName() {
        return BookAdminName;
    }

    public void setLibraryName(String BookAdminName) {
        this.BookAdminName = BookAdminName;
    }

    public String getLibraryBooks() {
        return BookAdminAddress;
    }

    public void setLibraryBooks(String BookAdminAddress) {
        this.BookAdminAddress = BookAdminAddress;
    }

    public String getLibraryEmail() {
        return BookAdminEmail;
    }

    public void setLibraryEmail(String BookAdminEmail) {

        this.BookAdminEmail = BookAdminEmail;
    }
    public BookAdmins(String BookAdminName, String BookAdminAddress, String BookAdminEmail) {
        this.BookAdminName = BookAdminName;
        this.BookAdminAddress = BookAdminAddress;
        this.BookAdminEmail = BookAdminEmail;
    }
    public static void addBookAdminInfo(ArrayList<BookAdmins> library) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book admin Name: ");
        String bookAdmin = input.nextLine();

        System.out.print("Enter book admin Address: ");
        String bookAdminAddress = input.nextLine();

        System.out.print("Enter book admin Email: ");
        String bookAdminEmail = input.nextLine();

        BookAdmins libraryBookAdmin = new BookAdmins(bookAdmin, bookAdminAddress, bookAdminEmail);
        library.add(libraryBookAdmin);

        System.out.println("Book Admin Added Successfully");
    }
   // public static void
}
