import java.util.Scanner; 
import java.util.ArrayList;
public class PhoneBook{

	private String number;
	private String name;
	private String address;
	private String email;


	public PhoneBook(String name, String address, String number, String email) {
		this.name = name;
		this.address = address;
		this.number = number;
	  	this.email = email;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getNumber(){
		return number;
	}
	public String getEmail(){
		return email;
	}
	public static void addContact(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
			String name = input.next();

		System.out.print("Enter your address: "); 
			String address = input.next();

		try{
			System.out.print("Enter your telephone number: ");
				String number = input.next();
		}catch(Exception e){
			System.out.println("Enter a valid telephone number of 11 digits");
		}
		System.out.print("Enter your email: ");
			String email = input.next();
	}
}