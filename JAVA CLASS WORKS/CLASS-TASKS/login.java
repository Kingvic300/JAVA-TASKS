import java.util.Scanner;
public class login{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter your password:");
	String str = input.next();
	int length = str.length();
	if (length==10){
		System.out.println("number of letters are " + length);
	 }else{
		System.out.println("INVALID PASSWORD\nenter ten characters for your number:"); 
	}

	}
}