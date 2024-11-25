package libraryManagementSystems;

public class BookAdmins {
    private String libraryName;
    private String libraryAddress;
    private String libraryEmail;
    private String libraryBooks;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(String libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public String getLibraryEmail() {
        return libraryEmail;
    }

    public void setLibraryEmail(String libraryEmail) {
        this.libraryEmail = libraryEmail;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public BookAdmins(String libraryName, String libraryAddress, String libraryEmail, String libraryBooks) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.libraryEmail = libraryEmail;
        this.libraryBooks = libraryBooks;
    }

//    public static void addLibrary(String libraryName, String libraryAddress, String libraryEmail, String libraryBooks) {
//
//    }
}
