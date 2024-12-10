package libraryManagementSystems;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryStore {
    public static void main(String[] args) {
        ArrayList<BookAdmins> bookAdmin = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Enter a number to pick from the list below
                1->Add bookAdmin
                2->Choose which books you want to buy
                3->see all books available""");
        int response = input.nextInt();
        if(response == 1){
            BookAdmins.addBookAdminInfo(bookAdmin);
        }
    }
}




