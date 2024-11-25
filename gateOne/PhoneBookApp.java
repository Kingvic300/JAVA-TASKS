<<<<<<< HEAD
=======
import com.sun.nio.sctp.SctpChannel;
>>>>>>> be67abf0c4f921afdfa2c61fabb9e921e0b17b05
import java.util.ArrayList;
import java.util.Scanner; 
public class PhoneBookApp{

	public static void main(String[] args){
        ArrayList<PhoneBook> phoneBook = new ArrayList<>();
        try{
		    System.out.println(" Welcome to your PhoneBookApp\n Here are the list of what you can do\n 1-> Add contact\n 2-> Remove or block contact\n 3-> Search for contact\n 4-> Edit contacts\n 5-> display contact\n 6-> exit ");
            Scanner input = new Scanner(System.in);
            while(true){
	            System.out.println("Enter your choice");
		            int response = input.nextInt();
	
		        if(response == 1){
		            PhoneBook.addContact(phoneBook);

		        }else if(response == 2){
                    PhoneBook.removeContact(phoneBook);

		        }else if(response == 3){
                    PhoneBook.searchContact(phoneBook);

		        }else if(response == 4){
                    PhoneBook.editContact(phoneBook);

                }else if(response == 5){
                    PhoneBook.displayContact(phoneBook);
                    
		        }else if(response == 6){
			        System.out.println("Thank you");
                    break;
		        }
	        }          
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }   
}