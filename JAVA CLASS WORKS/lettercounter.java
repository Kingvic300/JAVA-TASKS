import java.util.Scanner;
public class lettercounter{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter your name");
	String str = input.next();
	int length = str.length();
	System.out.println("number of letters are " + length); 
	
	} 
} 