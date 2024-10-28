import java.util.Scanner; 
import java.util.ArrayList;
public class PhoneBookApp{
	public static void main(String[] args){
		ArrayList<Phonebook> phonebook = new ArrayList<>();

		System.out.println(" Welcome to your PhoneBookApp\n Here are the list of what you can do\n 1-> Add contact\n 2-> Remove or block contact\n 3-> Search for contact\n 4-> Edit contacts\n 5-> exit ");
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your choice");
		int response = input.nextInt();
	
		if(response == 1){
			PhoneBook.addContact();
		}

		if(response == 2){ 
			System.out.print("Not available at the moment");
		}

 		if(response == 3){
			System.out.print("Not available at the moment");
		}

		if(response == 4){
			System.out.print("Not available at the moment");
		}

		if(response == 5){
			System.out.print("Thank you very much");
		}
	}
	
}